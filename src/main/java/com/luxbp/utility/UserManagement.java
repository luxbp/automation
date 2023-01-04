package com.luxbp.utility;

import com.opencsv.exceptions.CsvException;
import org.apache.hc.client5.http.classic.methods.HttpDelete;
import org.apache.hc.client5.http.classic.methods.HttpPost;
import org.apache.hc.client5.http.classic.methods.HttpPut;
import org.apache.hc.client5.http.impl.classic.CloseableHttpClient;
import org.apache.hc.client5.http.impl.classic.CloseableHttpResponse;
import org.apache.hc.client5.http.impl.classic.HttpClients;
import org.apache.hc.core5.http.ContentType;
import org.apache.hc.core5.http.ParseException;
import org.apache.hc.core5.http.io.entity.EntityUtils;
import org.apache.hc.core5.http.io.entity.StringEntity;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.io.IOException;
import java.net.URL;
import java.util.Objects;

public class UserManagement {

    class UserModel {
        public String firstname;
        public String lastname;
        public String email;

        public String password;

        public String brands;
    }
    private static final Logger log = LoggerFactory.getLogger(UserManagement.class);

    public static final String[] baseUrls = {
            "https://magento-upgrade.luxbp.com",
            "https://magentodev.luxbp.com",
            "https://magento.luxbp.com"
    };
    public final String createEndpoint = "/rest/lbppro/V1/customers/";
    public final String authEndpoint = "/rest/lbppro/V1/integration/customer/token";
    public static final String updateEndpoint = "/rest/lbppro/V1/customers/me";
    public static final String deleteEndpoint = "/rest/lbppro/V1/testsuite/customers?email=";

    public void execute() throws IOException, CsvException, ParseException {
        for(Object[] info : Objects.requireNonNull(LuxBPDataProvider.readUserfromCSV())) {
            UserModel userInfo = this.userDetails(info);
            for (String url : baseUrls) {
                log.info("Processing users for {}", url);
                this.create(url, userInfo.email, userInfo.firstname, userInfo.lastname, userInfo.password, userInfo.brands);
            }
        }
    }

    public UserModel userDetails (Object[] data) {
        UserModel user = new UserModel();
        user.email = (String) data[0];
        user.password = (String) data[1];
        user.firstname = user.email.split("\\@")[0].toUpperCase();
        user.lastname = "TEST";
        user.brands = "1,2";
        log.info(user.firstname);
        return user;
    }

    public void create(String baseUrl, String email, String firstname, String lastname, String password, String brands) throws IOException, ParseException {
        URL cEndpoint = new URL(String.format("%s%s", baseUrl, createEndpoint));
        URL aEndpoint = new URL(String.format("%s%s", baseUrl, authEndpoint));
        URL uEndpoint = new URL(String.format("%s%s", baseUrl, updateEndpoint));

        String authToken;

        String createRequestJson = String.format(
                "{ \"customer\": { \"store_id\": 1, \"website_id\": 1, \"email\": \"%s\", \"firstname\": \"%s\", \"lastname\": \"%s\" }, \"password\": \"%s\" }",
                email,
                firstname,
                lastname,
                password
        );

        String authRequestJson = String.format(
                "{ \"username\": \"%s\", \"password\": \"%s\" }",
                email,
                password
        );

        String updateRequestJson = String.format(
                "{ \"customer\": { \"email\": \"%s\", \"firstname\": \"%s\", \"lastname\": \"%s\", \"website_id\": 1, \"store_id\": 1, \"extension_attributes\": { \"test_data\": \"{\\\"brands\\\":[%s]}\" } } }",
                email, firstname, lastname, brands
        );


        // Create account
        try (CloseableHttpClient client = HttpClients.createDefault()) {
            HttpPost createRequest = new HttpPost(cEndpoint.toString());
            createRequest.setEntity(new StringEntity(createRequestJson, ContentType.APPLICATION_JSON));
            CloseableHttpResponse response = client.execute(createRequest);
            String result = EntityUtils.toString(response.getEntity());
            log.info(result);
            log.info("Created account for {} on {}", email, baseUrl);
        }

        // Authenticate and update account
        try (CloseableHttpClient client = HttpClients.createDefault()) {
            HttpPost authRequest = new HttpPost(aEndpoint.toString());
            authRequest.setEntity(new StringEntity(authRequestJson, ContentType.APPLICATION_JSON));
            CloseableHttpResponse response = client.execute(authRequest);
            authToken = EntityUtils.toString(response.getEntity()).replace("\"","");

            log.info(authToken);
            log.info("Authenticated account for {} on {}", email, baseUrl);

            try (CloseableHttpClient uClient = HttpClients.createDefault()) {
                HttpPut updateRequest = new HttpPut(uEndpoint.toString());
                updateRequest.setEntity(new StringEntity(updateRequestJson, ContentType.APPLICATION_JSON));
                updateRequest.addHeader("Authorization" , String.format("Bearer %s", authToken));
                CloseableHttpResponse uResponse = uClient.execute(updateRequest);
                String result = EntityUtils.toString(uResponse.getEntity());
                log.info(result);
                log.info("Updated account for {} on {}", email, baseUrl);
            }
        }
    }

    public void cleanup() throws IOException, CsvException {
        for(Object[] info : Objects.requireNonNull(LuxBPDataProvider.readUserfromCSV())) {
            UserModel userInfo = this.userDetails(info);
            for (String url : baseUrls) {
                log.info(url);
                URL dEndpoint = new URL(String.format("%s%s%s", url, deleteEndpoint, userInfo.email));
                try (CloseableHttpClient client = HttpClients.createDefault()) {
                    HttpDelete createRequest = new HttpDelete(dEndpoint.toString());
                    client.execute(createRequest);
                    log.info("Deleted account for {} on {}", userInfo.email, url);
                }
            }
        }
    }
}
