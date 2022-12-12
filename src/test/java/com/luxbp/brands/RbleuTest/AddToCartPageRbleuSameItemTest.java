package com.luxbp.brands.RbleuTest;

import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.luxbp.base.BaseClass;
import com.luxbp.pageobjects.AddToCartPage.Rbleu.AddToCartPageRbleuSameItemBoth;
import com.luxbp.testcases.LoginPageTest;
import org.testng.Assert;
import org.testng.annotations.Test;

@Test
public class AddToCartPageRbleuSameItemTest extends BaseClass {
    public void addToCartPageRbleuSameItemBothTest() throws Throwable {
        LoginPageTest login = new LoginPageTest();
        login.loginTest();

        ExtentTest AddToCartPageRbleuSameItemBothTestReport = extent.createTest("Add to cart same item buy from both NFR Point as well as Retail $","This is to test if an item is added to cart");

        AddToCartPageRbleuSameItemBoth RbleuBoth = new AddToCartPageRbleuSameItemBoth();
        RbleuBoth.clickProductRbleuItem();
        String itemName = RbleuBoth.getItemNameRbleuItem();
        RbleuBoth.addViaPoint();

        AddToCartPageRbleuSameItemBothTestReport.log(Status.INFO, "Getting an item in cart");

        try {
            String expectedItemName = RbleuBoth.validateAddProductItem();
            Assert.assertEquals(itemName, expectedItemName);
            System.out.println(itemName + " verified Successfully");
            AddToCartPageRbleuSameItemBothTestReport.pass("Item verified successfully");
        } catch (AssertionError prodClickException) {
            System.out.println(itemName + " add failed due to " + prodClickException);
            AddToCartPageRbleuSameItemBothTestReport.fail("Item failed to add");
        }
        RbleuBoth.addViaDollar();

        AddToCartPageRbleuSameItemBothTestReport.info("Add to cart page test ends");
    }

}