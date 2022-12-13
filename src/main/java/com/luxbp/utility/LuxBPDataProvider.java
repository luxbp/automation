package com.luxbp.utility;

import java.io.FileReader;
import java.io.IOException;
import java.util.List;

import org.testng.annotations.DataProvider;

import com.opencsv.CSVReader;
import com.opencsv.exceptions.CsvException;

public class LuxBPDataProvider {
    @DataProvider(name = "logincredentials")
    public static Object[][] readUserfromCSV() throws IOException, CsvException {
        String CSV_file = "src/main/resources/UserData.csv";
        try {
            CSVReader reader = new CSVReader(new FileReader(CSV_file));
            List<String[]> csvData = reader.readAll();
            Object[][] csvDataObject = new Object[csvData.size()][2];
            for (int i = 0; i < csvData.size(); i++) {
                csvDataObject[i] = csvData.get(i);
            }
            return csvDataObject;
        }
        catch (Exception e)
        {

        }
      return null;
    }
}
