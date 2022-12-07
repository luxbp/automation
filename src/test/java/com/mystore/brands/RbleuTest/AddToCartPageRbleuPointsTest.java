package com.mystore.brands.RcoTest;

import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.mystore.base.BaseClass;
import com.mystore.pageobjects.AddToCartPage.Rbleu.AddToCartPageRbleuPoints;
import com.mystore.pageobjects.AddToCartPage.Rco.AddToCartPageRcoPoints;
import com.mystore.testcases.LoginPageTest;
import org.testng.Assert;
import org.testng.annotations.Test;

public class AddToCartPageRbleuPointsTest extends BaseClass {

    @Test
    public void AddToCartPageRbleuPointsTest() throws Throwable {
        LoginPageTest login = new LoginPageTest();
        login.loginTest();

        ExtentTest addToCartPointReport = extent.createTest("Add to cart for Points","This is to test if an item from Rbleu is added to cart from points");

        AddToCartPageRbleuPoints clickProd = new AddToCartPageRbleuPoints();
        clickProd.clickProductRbluePoints();

        clickProd.clickRedeemRbleu();
        String pointItemName = clickProd.getItemNameRbluePoints();

        clickProd.buyProdPoint();
        System.out.println(pointItemName);

        addToCartPointReport.log(Status.INFO, "Getting an redeemable item in cart");

        try {
            String expectedItemName = clickProd.validateAddProductPoints();
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
