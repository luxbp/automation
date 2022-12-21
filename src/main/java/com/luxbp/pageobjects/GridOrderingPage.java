package com.luxbp.pageobjects;

import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.luxbp.actiondriver.Action;
import com.luxbp.base.BaseClass;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class GridOrderingPage extends BaseClass {

    @FindBy(xpath = "//*[@data-testid='accountButton']")
    WebElement profile;

    @FindBy(xpath = "//a[@href=\"/bulk-ordering\"]")
    WebElement gridOrdering;

    ExtentTest gridOrderingReport = extent.createTest("Grid Ordering");
    Actions action = new Actions(driver);

    public GridOrderingPage() {
        PageFactory.initElements(driver, this);
    }

    public void profile() throws InterruptedException {
        gridOrderingReport.log(Status.INFO, "Checking profile dropdown");
        Thread.sleep(5000);
        action.moveToElement(profile).perform();


        /*WebDriverWait profileWait = new WebDriverWait(driver, 5);
        profileWait.until(ExpectedConditions.visibilityOf(profile));*/
     /*   profile.click();*/

        gridOrderingReport. log(Status.INFO, "Navigating to Grid Ordering module");
       /* WebDriverWait gridOrderingWait = new WebDriverWait(driver, 5);
        gridOrderingWait.until(ExpectedConditions.visibilityOf(gridOrdering));*/
        gridOrdering.click();

    }

}
