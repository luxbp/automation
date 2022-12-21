package com.luxbp.testcases;

import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.luxbp.base.BaseClass;
import com.luxbp.pageobjects.GridOrderingPage;
import com.luxbp.pageobjects.LoginPage;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

@Test(dataProvider = "logincredentials", dataProviderClass = com.luxbp.utility.LuxBPDataProvider.class, description = "Grid Ordering", groups = {"GridOrdering"})
public class GridOrderingPageTest extends BaseClass {

    public void gridOrdering(String username, String password) throws Throwable {
        ExtentTest gridOrderingTestReport = extent.createTest("Grid Ordering Test Page", "This is to test Grid Ordering module");

        LoginPage login = new LoginPage();
        login.loginTest(username, password);

        gridOrderingTestReport.log(Status.INFO,"Navigated to Profile module");
        GridOrderingPage gridOrdering = new GridOrderingPage();
        gridOrdering.profile();
    }

}
