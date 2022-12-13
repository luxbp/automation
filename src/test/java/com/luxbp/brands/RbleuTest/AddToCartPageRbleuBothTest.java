package com.luxbp.brands.RbleuTest;

import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.luxbp.pageobjects.AddToCartPage.Rbleu.AddToCartPageRbleuBoth;
import com.luxbp.testcases.LoginPageTest;
import org.testng.Assert;
import com.luxbp.base.BaseClass;

public class AddToCartPageRbleuBothTest extends BaseClass {

    public void addToCartPageRbleuTestBoth() throws Throwable {
        LoginPageTest login = new LoginPageTest();
        login.loginTest();

        ExtentTest AddToCartPageRbleuBothReport = extent.createTest("Add to cart","This is to test if an item is added to cart");

        AddToCartPageRbleuBoth AddToCartPageRbleuBoth = new AddToCartPageRbleuBoth();
        AddToCartPageRbleuBoth.clickProductRbleuDollar();
        String itemNameRbleu = AddToCartPageRbleuBoth.getItemNameRbleuBoth();
        AddToCartPageRbleuBoth.buyFirstProdRbleu();

        AddToCartPageRbleuBothReport.log(Status.INFO, "Getting an item in cart");

        try {
            String expectedItemName = AddToCartPageRbleuBoth.validateAddProductBoth();
            Assert.assertEquals(itemNameRbleu, expectedItemName);
            System.out.println(itemNameRbleu + " verified Successfully");
            AddToCartPageRbleuBothReport.pass("Item verified successfully");
        } catch (AssertionError prodClickException) {
            System.out.println(itemNameRbleu + " add failed due to " + prodClickException);
            AddToCartPageRbleuBothReport.fail("Item failed to add");
        }
        AddToCartPageRbleuBoth.backToRedeemBleuBoth();

        AddToCartPageRbleuBothReport.info("Add to cart page test ends");
    }
}
