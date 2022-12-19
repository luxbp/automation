package com.luxbp.brands.V76Test;

import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.luxbp.base.BaseClass;
import com.luxbp.pageobjects.AddToCartPage.V76.AddToCartPageV76Points;
import com.luxbp.pageobjects.LoginPage;
import org.testng.Assert;
import org.testng.annotations.Test;

public class AddToCartPageV76PointsTest extends BaseClass {
@Test(dataProvider = "logincredentials", dataProviderClass = com.luxbp.utility.LuxBPDataProvider.class)
    public void addToCartPageV76TestPoints(String username, String password) throws Throwable {
        LoginPage login = new LoginPage();
        login.loginTest(username, password);

        ExtentTest addToCartPointReport = extent.createTest("Add to cart for Points","This is to test if an item from V76 is added to cart from points");

        AddToCartPageV76Points clickProd = new AddToCartPageV76Points();
        clickProd.clickProductV76Point();

        clickProd.clickRedeemV76Points();
        String pointItemName = clickProd.getItemNameV76Points();
        clickProd.prodPoint();
        clickProd.buyProdPoint();
        System.out.println(pointItemName);

        addToCartPointReport.log(Status.INFO, "Getting an redeemable item in cart");

        try {
            String expectedItemName = clickProd.validateAddProductPoints();
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
