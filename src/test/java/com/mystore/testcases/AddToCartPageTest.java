package com.mystore.testcases;

import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import org.testng.Assert;
import org.testng.annotations.Test;
import com.mystore.base.BaseClass;
import com.mystore.pageobjects.AddToCartPage;

public class AddToCartPageTest extends BaseClass {


    @Test
    public void addToCartTest() throws Throwable {
       LoginPageTest login = new LoginPageTest();
        login.loginTest();

        ExtentTest addToCartReport = extent.createTest("Add to cart","This is to test if an item is added to cart");

        AddToCartPage AddToCartPage = new AddToCartPage();
        AddToCartPage.clickProduct();

        String itemName = AddToCartPage.getItemName();
        AddToCartPage.clickFirstProduct();

        addToCartReport.log(Status.INFO, "Getting an item in cart");

        try {
            String expectedItemName = AddToCartPage.validateAddProduct();
            Assert.assertEquals(itemName, expectedItemName);
            System.out.println(itemName + "added Successfully");
            addToCartReport.pass("Item added successfully");
        } catch (AssertionError prodClickException) {
            System.out.println(itemName + "add failed due to " + prodClickException);
            addToCartReport.fail("Item failed to add");
        }

        addToCartReport.info("Add to cart page test ends");
    }
}
    