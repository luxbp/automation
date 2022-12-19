package com.luxbp.brands.V76Test;

import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.luxbp.pageobjects.AddToCartPage.V76.AddToCartPageV76Both;
import com.luxbp.pageobjects.LoginPage;
import org.testng.Assert;
import com.luxbp.base.BaseClass;
import org.testng.annotations.Test;


public class AddToCartPageV76BothTest extends BaseClass {
    @Test(dataProvider = "logincredentials", dataProviderClass = com.luxbp.utility.LuxBPDataProvider.class)
    public void addToCartPageV76TestBoth(String username, String password) throws Throwable {
        LoginPage login = new LoginPage();
        login.loginTest(username, password);

        ExtentTest AddToCartPageV76BothReport = extent.createTest("Add to cart", "This is to test if an item is added to cart");

        AddToCartPageV76Both AddToCartPageV76Both = new AddToCartPageV76Both();
        AddToCartPageV76Both.clickProductV76();
        String itemNameV76 = AddToCartPageV76Both.getItemNameV76Both();
        AddToCartPageV76Both.prodPoint();
        AddToCartPageV76Both.buyFirstProdBoth();

        AddToCartPageV76BothReport.log(Status.INFO, "Getting an item in cart");

        try {
            String expectedItemName = AddToCartPageV76Both.validateAddProductBoth();
            Assert.assertEquals(itemNameV76, expectedItemName);
            System.out.println(itemNameV76 + " verified Successfully");
            AddToCartPageV76BothReport.pass("Item verified successfully");
        } catch (AssertionError prodClickException) {
            System.out.println(itemNameV76 + "add failed due to " + prodClickException);
            AddToCartPageV76BothReport.fail("Item failed to add");
        }

        AddToCartPageV76Both.backToRedeem();

        AddToCartPageV76BothReport.info("Add to cart page test ends");
    }

}
