package com.luxbp.brands.V76Test;

import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.luxbp.base.BaseClass;
import com.luxbp.pageobjects.AddToCartPage.V76.AddToCartPageV76SameItemBoth;
import com.luxbp.pageobjects.LoginPage;
import org.testng.Assert;
import org.testng.annotations.Test;

public class AddToCartPageV76SameItemTest extends BaseClass {
    @Test(dataProvider = "logincredentials", dataProviderClass = com.luxbp.utility.LuxBPDataProvider.class)
    public void addToCartPageV76SameItemBothTest(String username, String password) throws Throwable {
        LoginPage login = new LoginPage();
        login.loginTest(username, password);

        ExtentTest AddToCartPageV76SameItemBothTestReport = extent.createTest("Add to cart same item buy from both NFR Point as well as Retail $","This is to test if an item is added to cart");

        AddToCartPageV76SameItemBoth v76Both = new AddToCartPageV76SameItemBoth();
        v76Both.clickProductV76Item();
        String itemName = v76Both.getItemNameV76Item();
        v76Both.prodPoint();
        v76Both.addViaPoint();

        AddToCartPageV76SameItemBothTestReport.log(Status.INFO, "Getting an item in cart");

        try {
            String expectedItemName = v76Both.validateAddProductItem();
            Assert.assertEquals(itemName, expectedItemName);
            System.out.println(itemName + " verified Successfully");
            AddToCartPageV76SameItemBothTestReport.pass("Item verified successfully");
        } catch (AssertionError prodClickException) {
            System.out.println(itemName + " add failed due to " + prodClickException);
            AddToCartPageV76SameItemBothTestReport.fail("Item failed to add");
        }

        v76Both.addViaDollar();


        AddToCartPageV76SameItemBothTestReport.info("Add to cart page test ends");
    }

}