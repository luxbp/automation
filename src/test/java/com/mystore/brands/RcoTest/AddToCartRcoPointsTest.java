package com.mystore.brands.RcoTest;

import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.mystore.base.BaseClass;
import com.mystore.pageobjects.AddToCartPage.Rco.AddToCartPageRcoPoints;
import com.mystore.testcases.LoginPageTest;
import org.testng.Assert;
import org.testng.annotations.Test;

public class AddToCartRcoPointsTest extends BaseClass {

    @Test
    public void addToCartPageRplusCoTestPoints() throws Throwable {
        LoginPageTest login = new LoginPageTest();
        login.loginTest();

        ExtentTest addToCartPointReport = extent.createTest("Add to cart for Points","This is to test if an item from R-Co is added to cart from points");

        AddToCartPageRcoPoints clickProd = new AddToCartPageRcoPoints();
        clickProd.clickProductRplusCoPoint();

        clickProd.clickRedeemRco();
        String pointItemName = clickProd.getItemNameRplusCoPoints();

        clickProd.buyProdPoint();
        System.out.println(pointItemName);

        addToCartPointReport.log(Status.INFO, "Getting an redeemable item in cart");

        try {
            String expectedItemName = clickProd.validateAddProduct();
            Assert.assertEquals(pointItemName, expectedItemName);
            System.out.println(pointItemName + "added Successfully");
            addToCartPointReport.pass("Item added successfully");
        } catch (AssertionError prodClickException) {
            System.out.println(pointItemName + "add failed due to " + prodClickException);
            addToCartPointReport.fail("Item failed to add");
        }

        addToCartPointReport.info("Add to cart page test ends");
    }
}
