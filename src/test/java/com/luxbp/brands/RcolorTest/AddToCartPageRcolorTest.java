package com.luxbp.brands.RcolorTest;

import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.luxbp.pageobjects.AddToCartPage.Rcolor.AddToCartPageRcolor;
import com.luxbp.pageobjects.LoginPage;
import org.testng.Assert;
import com.luxbp.base.BaseClass;
import org.testng.annotations.Test;

public class AddToCartPageRcolorTest extends BaseClass {
    @Test(dataProvider = "logincredentials", dataProviderClass = com.luxbp.utility.LuxBPDataProvider.class)
    public void addToCartPageRcolorTestDollar(String username, String password) throws Throwable {
        LoginPage login = new LoginPage();
        login.loginTest(username, password);
        ExtentTest addToCartRcolorReport = extent.createTest("Add to cart R + Color","This is to test if an item is added to cart in R + Color store");

        AddToCartPageRcolor rColorPage = new AddToCartPageRcolor();
        rColorPage.clickProductRcolor();
        String itemNameRcolor = rColorPage.getItemNameRcolor();
        rColorPage.prodPoint();
        rColorPage.clickFirstProductRcolor();

        addToCartRcolorReport.log(Status.INFO, "Getting an item in cart R-Color");

        try {
            String expectedItemName = rColorPage.validateAddProduct();
            Assert.assertEquals(itemNameRcolor, expectedItemName);
            System.out.println(itemNameRcolor + " verified Successfully");
            addToCartRcolorReport.pass("Item verified successfully");
        } catch (AssertionError prodClickException) {
            System.out.println(itemNameRcolor + "add failed due to " + prodClickException);
            addToCartRcolorReport.fail("Item failed to add");
        }

        addToCartRcolorReport.info("Add to cart of R-Color test ends");
        System.out.println("Add to cart of R-bleu test ends");
    }
}
