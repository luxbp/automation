package com.luxbp.brands.RcoTest;

import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.luxbp.base.BaseClass;
import com.luxbp.pageobjects.AddToCartPage.Rco.AddToCartPageRcoSameItemBoth;
import com.luxbp.pageobjects.LoginPage;
import org.testng.Assert;
import org.testng.annotations.Test;

public class AddToCartPageRcoSameItemBothTest extends BaseClass {
    @Test(dataProvider = "logincredentials", dataProviderClass = com.luxbp.utility.LuxBPDataProvider.class)
    public void addToCartPageRcoSameItemBothTest(String username, String password) throws Throwable {
        LoginPage login = new LoginPage();
        login.loginTest(username, password);

        ExtentTest AddToCartPageRcoSameItemBothTestReport = extent.createTest("Add to cart same item buy from both NFR Point as well as Retail $","This is to test if an item is added to cart");

        AddToCartPageRcoSameItemBoth RcoBoth = new AddToCartPageRcoSameItemBoth();
        RcoBoth.clickProductRcoItem();
        String itemNameRco = RcoBoth.getItemNameRplusCoItem();
        RcoBoth.prodClick();
        RcoBoth.addViaPoint();

        AddToCartPageRcoSameItemBothTestReport.log(Status.INFO, "Getting an item in cart");

        RcoBoth.addViaDollar();

    try {
        String expectedItemName = RcoBoth.validateAddProductItem();
        Assert.assertEquals(itemNameRco, expectedItemName);
        System.out.println(itemNameRco + " verified Successfully");
        AddToCartPageRcoSameItemBothTestReport.pass("Item verified successfully");
    } catch (AssertionError prodClickException) {
        System.out.println(itemNameRco + " add failed due to " + prodClickException);
        AddToCartPageRcoSameItemBothTestReport.fail("Item failed to add");
    }
        AddToCartPageRcoSameItemBothTestReport.info("Add to cart page test ends");
    }

}