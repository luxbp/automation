package com.mystore.testcases;

import com.mystore.base.BaseClass;
import com.mystore.pageobjects.ShippingMethod;
import org.testng.Assert;
import org.testng.annotations.Test;

public class ShippingMethodPageTest extends BaseClass {

    @Test
    public void ShippingMethodTest() throws Throwable {
        ShippingInformationPageTest ShippingInfo = new ShippingInformationPageTest();
        ShippingInfo.ShippingInformationTest();         //This function validates Shipping Info module

        ShippingMethod shippingMethod = new ShippingMethod();
        shippingMethod.clickFirstContinueBtn();         //This will click the first continue button.

        try {
            String shippingMethodInfo = shippingMethod.validateShippingMethodInfo() ;
            Assert.assertEquals(shippingMethodInfo, "SHIPPING METHOD");
            System.out.println("Shipping Method info executed Successfully");
        } catch (AssertionError firstContinueBtnException) {
            System.out.println("Shipping Method tab failed due to " + firstContinueBtnException);
        }
    }
}
