package com.mystore.brands.V76Test;

import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.mystore.pageobjects.AddToCartPage.V76.AddToCartPageV76Both;
import com.mystore.testcases.LoginPageTest;
import org.testng.Assert;
import com.mystore.base.BaseClass;


public class AddToCartPageV76BothTest extends BaseClass {

    public void addToCartPageV76TestBoth() throws Throwable {
        LoginPageTest login = new LoginPageTest();
        login.loginTest();

        ExtentTest AddToCartPageV76BothReport = extent.createTest("Add to cart","This is to test if an item is added to cart");

        AddToCartPageV76Both AddToCartPageV76Both = new AddToCartPageV76Both();
        AddToCartPageV76Both.clickProductV76();
        String itemNameV76 = AddToCartPageV76Both.getItemNameV76Both();
        AddToCartPageV76Both.buyFirstProdBoth();

        AddToCartPageV76BothReport.log(Status.INFO, "Getting an item in cart");

        try {
            String expectedItemName = AddToCartPageV76Both.validateAddProductBoth();
            Assert.assertEquals(itemNameV76, expectedItemName);
            System.out.println(itemNameV76 + "added Successfully");
            AddToCartPageV76BothReport.pass("Item added successfully");
        } catch (AssertionError prodClickException) {
            System.out.println(itemNameV76 + "add failed due to " + prodClickException);
            AddToCartPageV76BothReport.fail("Item failed to add");
        }

        AddToCartPageV76Both.backToRedeem();

        AddToCartPageV76BothReport.info("Add to cart page test ends");
    }

}
