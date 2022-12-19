package com.luxbp.brands.RbleuTest;

import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.luxbp.pageobjects.AddToCartPage.Rbleu.AddToCartPageRbleuDollar;
import com.luxbp.pageobjects.LoginPage;
import org.testng.Assert;
import com.luxbp.base.BaseClass;
import org.testng.annotations.Test;


public class AddToCartPageRbleuTest extends BaseClass {
@Test(dataProvider = "logincredentials", dataProviderClass = com.luxbp.utility.LuxBPDataProvider.class)
    public void addToCartPageRbleuTestDollar(String username, String password) throws Throwable {
        LoginPage login = new LoginPage();
        login.loginTest(username, password);
        ExtentTest addToCartRbleuReport = extent.createTest("Add to cart R-bleu","This is to test if an item is added to cart in R-bleu store");

        AddToCartPageRbleuDollar rBluePage = new AddToCartPageRbleuDollar();
        rBluePage.clickProductRblue();
        String itemNameRbleu = rBluePage.getItemNameRblue();
        rBluePage.prodPoint();
        rBluePage.clickFirstProductRblue();

        addToCartRbleuReport.log(Status.INFO, "Getting an item in cart R-Bleu");

        try {
            String expectedItemName = rBluePage.validateAddProduct();
            Assert.assertEquals(itemNameRbleu, expectedItemName);
            System.out.println(itemNameRbleu + " verified Successfully");
            addToCartRbleuReport.pass("Item verified successfully");
        } catch (AssertionError prodClickException) {
            System.out.println(itemNameRbleu + "add failed due to " + prodClickException);
            addToCartRbleuReport.fail("Item failed to add");
        }

        addToCartRbleuReport.info("Add to cart of R-bleu test ends");
        System.out.println("Add to cart of R-bleu test ends");
    }
}
