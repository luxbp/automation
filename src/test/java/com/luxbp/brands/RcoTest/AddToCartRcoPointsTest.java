package com.luxbp.brands.RcoTest;

import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.luxbp.base.BaseClass;
import com.luxbp.pageobjects.AddToCartPage.Rco.AddToCartPageRcoPoints;
import com.luxbp.pageobjects.LoginPage;
import org.testng.Assert;
import org.testng.annotations.Test;

public class AddToCartRcoPointsTest extends BaseClass {

    @Test(dataProvider = "logincredentials", dataProviderClass = com.luxbp.utility.LuxBPDataProvider.class)
    public void addToCartPageRplusCoTestPoints(String username, String password) throws Throwable {
        LoginPage login = new LoginPage();
        login.loginTest(username, password);

        ExtentTest addToCartPointReport = extent.createTest("Add to cart for Points","This is to test if an item from R-Co is added to cart from points");

        AddToCartPageRcoPoints clickProd = new AddToCartPageRcoPoints();
        clickProd.clickProductRplusCoPoint();

        clickProd.clickRedeemRco();
        String pointItemName = clickProd.getItemNameRplusCoPoints();
        clickProd.prodPoint();
        clickProd.buyProdPoint();
        System.out.println(pointItemName);
        addToCartPointReport.log(Status.INFO, "Getting an redeemable item in cart");

        try {
            String expectedItemName = clickProd.validateAddProduct();
            Assert.assertEquals(pointItemName, expectedItemName);
            System.out.println(pointItemName + " verified Successfully");
            addToCartPointReport.pass("Item verified successfully");
        } catch (AssertionError prodClickException) {
            System.out.println(pointItemName + "add failed due to " + prodClickException);
            addToCartPointReport.fail("Item failed to add");
        }

        addToCartPointReport.info("Add to cart page test ends");
    }
}
