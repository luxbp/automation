package com.luxbp.brands.RcoTest;

import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.luxbp.pageobjects.AddToCartPage.Rco.AddToCartPageRcoBoth;
import com.luxbp.testcases.LoginPageTest;
import org.testng.Assert;
import com.luxbp.base.BaseClass;

public class AddToCartPageRcoBothTest extends BaseClass {

    public void addToCartPageRcoTestBoth() throws Throwable {
        LoginPageTest login = new LoginPageTest();
        login.loginTest();

        ExtentTest AddToCartPageRcoBothReport = extent.createTest("Add to cart","This is to test if an item is added to cart");

        AddToCartPageRcoBoth AddToCartPageRcoBoth = new AddToCartPageRcoBoth();
        AddToCartPageRcoBoth.clickProductRcoDollar();
        String itemNameRco = AddToCartPageRcoBoth.getItemNameRcoBoth();
        AddToCartPageRcoBoth.buyFirstProdBoth();

        AddToCartPageRcoBothReport.log(Status.INFO, "Getting an item in cart");

        try {
            String expectedItemName = AddToCartPageRcoBoth.validateAddProductBoth();
            Assert.assertEquals(itemNameRco, expectedItemName);
            System.out.println(itemNameRco + " verified Successfully");
            AddToCartPageRcoBothReport.pass("Item verified successfully");
        } catch (AssertionError prodClickException) {
            System.out.println(itemNameRco + "add failed due to " + prodClickException);
            AddToCartPageRcoBothReport.fail("Item failed to add");
        }

        AddToCartPageRcoBoth.backToRedeem();


        AddToCartPageRcoBothReport.info("Add to cart page test ends");
    }

}
