package com.mystore.testcases;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.mystore.base.BaseClass;
import com.mystore.pageobjects.PaymentPage;
import org.testng.Assert;
import org.testng.annotations.Test;

public class PaymentPageTest extends BaseClass {

    @Test
    public void PaymentMethodTest() throws Throwable {
        ShippingMethodPageTest shipMethod = new ShippingMethodPageTest();

        ExtentTest paymentReport = extent.createTest("Payment Method Module","This is to test payment module");

        shipMethod.ShippingMethodTest();            //This function will run Shipping method test

        PaymentPage payment = new PaymentPage();
        paymentReport.log(Status.INFO,"Payment info module status");
        payment.clickSecondContinueBtn();

        try {
            String paymentInfo = payment.validatePaymentInfo();
            Assert.assertEquals(paymentInfo, "PAYMENT INFORMATION");
            System.out.println("Payment info tab executed Successfully");
            paymentReport.pass("Payment module executed successfully");
        } catch (AssertionError paymentInfoException) {
            System.out.println("Payment Method info tab failed due to " + paymentInfoException);
            paymentReport.fail("Payment module failed to execute " + paymentInfoException);
        }
        paymentReport.info("Payment Information page test ends");
    }
}