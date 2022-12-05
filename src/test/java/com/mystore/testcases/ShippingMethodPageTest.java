package com.mystore.testcases;

import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.mystore.base.BaseClass;
import com.mystore.pageobjects.ShippingMethod;
import org.testng.Assert;
import org.testng.annotations.Test;

public class ShippingMethodPageTest extends BaseClass {

    @Test
    public void ShippingMethodTest() throws Throwable {
        ShippingInformationPageTest ShippingInfo = new ShippingInformationPageTest();
        ShippingInfo.ShippingInformationTest();         //This function validates Shipping Info module\

        ExtentTest shippingMethodReport = extent.createTest("Shipping Method","This is to test the shipping method module");
        shippingMethodReport.log(Status.INFO,"Shipping Method Module");

        ShippingMethod shippingMethod = new ShippingMethod();
        shippingMethod.clickFirstContinueBtn();         //This will click the first continue button.

        try {
            String shippingMethodInfo = shippingMethod.validateShippingMethodInfo() ;
            Assert.assertEquals(shippingMethodInfo, "SHIPPING METHOD");
            System.out.println("Shipping Method info executed Successfully");
            shippingMethodReport.pass("Shipping Method module executed successfully");
        } catch (AssertionError firstContinueBtnException) {
            System.out.println("Shipping Method tab failed due to " + firstContinueBtnException);
            shippingMethodReport.fail("Shipping Method module failed to execute"+ firstContinueBtnException);
        }
        shippingMethodReport.info("Shipping Method page test ends");
    }
}
