package com.mystore.brands.RbleuTest;

import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.mystore.pageobjects.AddToCartPage.Rbleu.AddToCartPageRbleuDollar;
import com.mystore.testcases.LoginPageTest;
import org.testng.Assert;
import com.mystore.base.BaseClass;

public class AddToCartPageRbleuTest extends BaseClass {


    public void addToCartPageRbleuTestDollar() throws Throwable {
        LoginPageTest login = new LoginPageTest();
        login.loginTest();
        ExtentTest addToCartRbleuReport = extent.createTest("Add to cart R-bleu","This is to test if an item is added to cart in R-bleu store");

        AddToCartPageRbleuDollar rBluePage = new AddToCartPageRbleuDollar();
        rBluePage.clickProductRblue();
        String itemNameRbleu = rBluePage.getItemNameRblue();
        rBluePage.clickFirstProductRblue();

        addToCartRbleuReport.log(Status.INFO, "Getting an item in cart R-Bleu");

        try {
            String expectedItemName = rBluePage.validateAddProduct();
            Assert.assertEquals(itemNameRbleu, expectedItemName);
            System.out.println(itemNameRbleu + "added Successfully");
            addToCartRbleuReport.pass("Item added successfully");
        } catch (AssertionError prodClickException) {
            System.out.println(itemNameRbleu + "add failed due to " + prodClickException);
            addToCartRbleuReport.fail("Item failed to add");
        }

        addToCartRbleuReport.info("Add to cart of R-bleu test ends");
        System.out.println("Add to cart of R-bleu test ends");
    }
}
