package com.mystore.testcases;

import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.mystore.base.BaseClass;
import com.mystore.pageobjects.ShippingInformation;
import org.testng.Assert;
import org.testng.annotations.Test;

public class ShippingInformationPageTest extends BaseClass {
    @Test
    public void ShippingInformationTest() throws Throwable {

        ExtentTest shippingInfoReport = extent.createTest("Shipping Information Module","This is to test the Shipping Information module");

        AddToCartPageTest addCart = new AddToCartPageTest();

        addCart.addToCartTest();            //This function logins, navigate to a brand, click on a product & buy

        ShippingInformation confirm = new ShippingInformation();

        shippingInfoReport.log(Status.INFO,"Shipping Information status");
        confirm.clickCart();                //Click on cart button

        confirm.clickCheckoutBtn();         //Click on "Checkout" button
        try {
            String shippingInfo = confirm.validateShippingInformation();
            Assert.assertEquals(shippingInfo, "SHIPPING INFORMATION");
            System.out.println("Shipping info tab executed Successfully");
            shippingInfoReport.pass("Shipping information module executed successfully");
        } catch (AssertionError shipInfoException) {
            System.out.println("Shipping info tab failed due to " + shipInfoException);
            shippingInfoReport.fail("Shipping information module failed to execute "+ shipInfoException);
        }
        shippingInfoReport.info("Shipping Information page test ends");
    }
}
