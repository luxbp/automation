package com.luxbp.brands.RcoTest;

import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.luxbp.pageobjects.LoginPage;
import org.testng.Assert;
import com.luxbp.base.BaseClass;
import com.luxbp.pageobjects.AddToCartPage.Rco.AddToCartPageRplusCo;
import org.testng.annotations.Test;

public class AddToCartPageRplusCoTest extends BaseClass {
    @Test(dataProvider = "logincredentials", dataProviderClass = com.luxbp.utility.LuxBPDataProvider.class)

    public void addToCartPageRplusCoTestDollar(String username, String password) throws Throwable {
        LoginPage login = new LoginPage();
        login.loginTest(username, password);

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
            System.out.println(itemNameRco + " verified Successfully");
            addToCartDollarReport.pass("Item verified successfully");
        } catch (AssertionError prodClickException) {
            System.out.println(itemNameRco + "add failed due to " + prodClickException);
            addToCartDollarReport.fail("Item failed to add");
        }

        addToCartDollarReport.info("Add to Cart Order(s) with only R+Co brand products (only retail $) test ends");
    }

}
    