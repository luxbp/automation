package com.mystore.brands.RcoTest;

import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.mystore.testcases.LoginPageTest;
import org.testng.Assert;
import com.mystore.base.BaseClass;
import com.mystore.pageobjects.AddToCartPage.Rco.AddToCartPageRplusCo;
import org.testng.annotations.Test;

public class AddToCartPageRplusCoTest extends BaseClass {

    public void addToCartPageRplusCoTestDollar() throws Throwable {
       LoginPageTest login = new LoginPageTest();
        login.loginTest();

        ExtentTest addToCartDollarReport = extent.createTest("Add to Cart Order(s) with only R+Co brand products (only retail $)","This is to test if an item is added to cart");

        AddToCartPageRplusCo AddToCartPageRplusCo = new AddToCartPageRplusCo();
        AddToCartPageRplusCo.clickProductRplusCo();
        addToCartDollarReport.log(Status.INFO,"Navigated to items page");

        String itemNameRco = AddToCartPageRplusCo.getItemNameRplusCo();

        AddToCartPageRplusCo.clickFirstProductRplusCo();
        addToCartDollarReport.log(Status.INFO, "Getting an item in cart");

        try {
            String expectedItemName = AddToCartPageRplusCo.validateAddProduct();
            Assert.assertEquals(itemNameRco, expectedItemName);
            System.out.println(itemNameRco + "added Successfully");
            addToCartDollarReport.pass("Item added successfully");
        } catch (AssertionError prodClickException) {
            System.out.println(itemNameRco + "add failed due to " + prodClickException);
            addToCartDollarReport.fail("Item failed to add");
        }

        addToCartDollarReport.info("Add to Cart Order(s) with only R+Co brand products (only retail $) test ends");
    }

}
    