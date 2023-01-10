package com.luxbp.utility;

import com.opencsv.exceptions.CsvException;
import org.apache.hc.core5.http.ParseException;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.io.IOException;

public class MavenPluginUserCreate {
    private static final Logger LOGGER = LoggerFactory.getLogger(MavenPluginUserCreate.class);

    public static void main(String[] args) throws IOException, CsvException, ParseException {
        LOGGER.info("Running user create.");
        (new UserManagement()).execute();
    }
}
