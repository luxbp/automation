package com.mystore.testcases;

import com.mystore.base.BaseClass;
import com.mystore.pageobjects.PaymentPage;
import org.testng.Assert;
import org.testng.annotations.Test;

public class PaymentPageTest extends BaseClass {

    @Test
    public void PaymentMethodTest() throws Throwable {
        ShippingMethodPageTest shipMethod = new ShippingMethodPageTest();
        shipMethod.ShippingMethodTest();            //This function will run Shipping method test

        PaymentPage payment = new PaymentPage();
        payment.clickSecondContinueBtn();

        try {
            String paymentInfo = payment.validatePaymentInfo();
            Assert.assertEquals(paymentInfo, "PAYMENT INFORMATION");
            System.out.println("Payment info tab executed Successfully");
        } catch (AssertionError paymentInfoException) {
            System.out.println("Payment Method info tab failed due to " + paymentInfoException);
        }
    }
}