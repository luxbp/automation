package com.luxbp.brands.RcolorTest;

import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.luxbp.pageobjects.AddToCartPage.Rcolor.AddToCartPageRcolor;
import com.luxbp.testcases.LoginPageTest;
import org.testng.Assert;
import com.luxbp.base.BaseClass;

public class AddToCartPageRcolorTest extends BaseClass {

    public void addToCartPageRcolorTestDollar() throws Throwable {
        LoginPageTest login = new LoginPageTest();
        login.loginTest();
        ExtentTest addToCartRcolorReport = extent.createTest("Add to cart R + Color","This is to test if an item is added to cart in R + Color store");

        AddToCartPageRcolor rColorPage = new AddToCartPageRcolor();
        rColorPage.clickProductRcolor();
        String itemNameRcolor = rColorPage.getItemNameRcolor();
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
