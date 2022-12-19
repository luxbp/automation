package com.luxbp.brands.V76Test;

import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.luxbp.pageobjects.AddToCartPage.V76.AddToCartPageV76Dollar;
import com.luxbp.pageobjects.LoginPage;
import org.testng.Assert;
import com.luxbp.base.BaseClass;
import org.testng.annotations.Test;

public class AddToCartPageV76Test extends BaseClass {
@Test(dataProvider = "logincredentials", dataProviderClass = com.luxbp.utility.LuxBPDataProvider.class)

    public void addToCartPageV76Dollar(String username, String password) throws Throwable {
        LoginPage login = new LoginPage();
        login.loginTest(username, password);


        ExtentTest addToCartV76Report = extent.createTest("Add to cart V-76","This is to test if an item is added to cart in V-76 store");

        AddToCartPageV76Dollar v76 = new AddToCartPageV76Dollar();
        v76.clickProductV76();
        String itemNameV76 = v76.getItemNameV76();
        v76.prodPoint();
        v76.clickFirstProductV76();

        addToCartV76Report.log(Status.INFO, "Getting an item in cart V-76");

        try {
            String expectedItemName = v76.validateAddProduct();
            Assert.assertEquals(itemNameV76, expectedItemName);
            System.out.println(itemNameV76 + " verified Successfully");
            addToCartV76Report.pass("Item verified successfully");
        } catch (AssertionError prodClickException) {
            System.out.println(itemNameV76 + "add failed due to " + prodClickException);
            addToCartV76Report.fail("Item failed to add");
        }

        addToCartV76Report.info("Add to cart of V-76 test ends");
        System.out.println("Add to cart of V-76 test ends");
    }
}
