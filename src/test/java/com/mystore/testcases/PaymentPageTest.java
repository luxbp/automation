package com.mystore.testcases;

import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.mystore.base.BaseClass;
import com.mystore.pageobjects.PaymentPage;
import org.testng.Assert;
import org.testng.annotations.Test;

public class PaymentPageTest extends BaseClass {

    @Test (description = "Payment Method Order(s) with only R+Co brand products (only retail $)", groups={"PaymentMethod"})
    public void PaymentMethodTestRplusCo() throws Throwable {
        ExtentTest paymentReport = extent.createTest("Payment Method Module Order(s) with only R+Co brand products (only retail $)","This is to test payment module");
        ShippingMethodPageTest shipMethod = new ShippingMethodPageTest();
        shipMethod.ShippingMethodTestRplusCo();            //This function will run Shipping method test
        paymentReport.log(Status.INFO,"Shipping Method with Order(s) with only R+Co brand products (only retail $) module executed...");

        PaymentPage payment = new PaymentPage();
        payment.clickSecondContinueBtn();
        paymentReport.log(Status.INFO,"Payment method with Order(s) with only R+Co brand products (only retail $) module executed...");

        try {
            String paymentInfo = payment.validatePaymentInfo();
            Assert.assertEquals(paymentInfo, "PAYMENT INFORMATION");
            System.out.println("Payment info tab executed Successfully " + paymentInfo);
            paymentReport.pass("Payment method with Order(s) with only R+Co brand products (only retail $) executed successfully");
        } catch (AssertionError paymentInfoException) {
            System.out.println("Payment method with Order(s) with only R+Co brand products (only retail $) failed due to " + paymentInfoException);
            paymentReport.fail("Payment method with Order(s) with only R+Co brand products (only retail $) failed to execute " + paymentInfoException);
        }
        paymentReport.info("Payment method with Order(s) with only R+Co brand products (only retail $) test ends");
    }

    @Test (description = "Payment Method Order(s) with only R+Co brand products (only NFR points product)", groups={"PaymentMethod"})
    public void PaymentMethodTestRplusCoPoints() throws Throwable {
        ExtentTest paymentRcoPointReport = extent.createTest("Payment Method Order(s) with only R+Co brand products (only NFR points product)","This is to test payment module");

        ShippingMethodPageTest shipMethod = new ShippingMethodPageTest();
        shipMethod.ShippingMethodTestRplusCoPoints();            //This function will run Shipping method test
        paymentRcoPointReport.log(Status.INFO,"Shipping Method Order(s) with only R+Co brand products (only NFR points product) module executed...");

        PaymentPage payment = new PaymentPage();
        payment.clickSecondContinueBtn();
        paymentRcoPointReport.log(Status.INFO,"Payment Method Order(s) with only R+Co brand products (only NFR points product) executed...");

        try {
            String paymentInfo = payment.validatePaymentInfo();
            Assert.assertEquals(paymentInfo, "PAYMENT INFORMATION");
            System.out.println("Payment Method Order(s) with only R+Co brand products (only NFR points product) executed Successfully " + paymentInfo);
            paymentRcoPointReport.pass("Payment Method Order(s) with only R+Co brand products (only NFR points product) executed successfully");
        } catch (AssertionError paymentInfoException) {
            System.out.println("Payment Method info Method Order(s) with only R+Co brand products (only NFR points product) failed due to " + paymentInfoException);
            paymentRcoPointReport.fail("Payment Method Order(s) with only R+Co brand products (only NFR points product) failed to execute " + paymentInfoException);
        }
        paymentRcoPointReport.info("Payment Method Order(s) with only R+Co brand products (only NFR points product) test ends");
    }

    @Test (description = "Payment Method Order(s) with only R+Co brand products (both $ and points product)", groups={"PaymentMethod"})
    public void PaymentMethodTestRplusCoBoth() throws Throwable {
        ExtentTest paymentRcoBothReport = extent.createTest("Payment Method Order(s) with only R+Co brand products (both $ and points product)","This is to test payment module");

        ShippingMethodPageTest shipMethod = new ShippingMethodPageTest();
        shipMethod.ShippingMethodTestRplusCoBoth();            //This function will run Shipping method test
        paymentRcoBothReport.log(Status.INFO,"Shipping Method Order(s) with only R+Co brand products (both $ and points product) module executed...");

        PaymentPage payment = new PaymentPage();
        paymentRcoBothReport.log(Status.INFO,"Payment Order(s) with only R+Co brand products (both $ and points product) status");
        payment.clickSecondContinueBtn();

        try {
            String paymentInfo = payment.validatePaymentInfo();
            Assert.assertEquals(paymentInfo, "PAYMENT INFORMATION");
            System.out.println("Payment info tab executed Successfully "+ paymentInfo);
            paymentRcoBothReport.pass("Payment Order(s) with only R+Co brand products (both $ and points product) executed successfully");
        } catch (AssertionError paymentInfoException) {
            System.out.println("Payment Method info Order(s) with only R+Co brand products (both $ and points product) failed due to " + paymentInfoException);
            paymentRcoBothReport.fail("Payment Order(s) with only R+Co brand products (both $ and points product) failed to execute " + paymentInfoException);
        }
        paymentRcoBothReport.info("Payment Order(s) with only R+Co brand products (both $ and points product) test ends");
    }

    @Test (description = "Payment Method Order(s) with only R+Co Bleu brand products", groups={"PaymentMethod"})
    public void PaymentMethodTestRbleu() throws Throwable {
        ExtentTest paymentRleuReport = extent.createTest("Payment Method Module Order(s) with only R+Co Bleu brand products","This is to test payment module");
        ShippingMethodPageTest shipMethod = new ShippingMethodPageTest();
        shipMethod.ShippingMethodTestRBleu();            //This function will run Shipping method test
        paymentRleuReport.log(Status.INFO,"Shipping Method Order(s) with only R+Co Bleu brand products module executed...");

        PaymentPage payment = new PaymentPage();
        payment.clickSecondContinueBtn();
        paymentRleuReport.log(Status.INFO,"Payment info Order(s) with only R+Co Bleu brand products executed...");

        try {
            String paymentInfo = payment.validatePaymentInfo();
            Assert.assertEquals(paymentInfo, "PAYMENT INFORMATION");
            System.out.println("Payment info tab executed Successfully "+ paymentInfo);
            paymentRleuReport.pass("Payment Order(s) with only R+Co Bleu brand products module executed successfully");
        } catch (AssertionError paymentInfoException) {
            System.out.println("Payment Method Order(s) with only R+Co Bleu brand products failed due to " + paymentInfoException);
            paymentRleuReport.fail("Payment Order(s) with only R+Co Bleu brand products module failed to execute " + paymentInfoException);
        }
        paymentRleuReport.info("Payment Order(s) with only R+Co Bleu brand products module ends");
    }

    @Test (description = "Payment Method Order(s) with only R+Co Bleu brand products (only NFR points product)", groups={"PaymentMethod"})
    public void PaymentMethodTestRbleuPoints() throws Throwable {
        ShippingMethodPageTest shipMethod = new ShippingMethodPageTest();

        ExtentTest paymentReport = extent.createTest("Payment Method Module","This is to test payment module");

        shipMethod.ShippingMethodTestRBleuPoints();            //This function will run Shipping method test

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

    @Test (description = "Payment Method Order(s) with only R+Co Bleu brand products (both $ and points product)", groups={"PaymentMethod"})
    public void PaymentMethodTestRbleuBoth() throws Throwable {
        ShippingMethodPageTest shipMethod = new ShippingMethodPageTest();

        ExtentTest paymentReport = extent.createTest("Payment Method Module","This is to test payment module");

        shipMethod.ShippingInformationTestRbleuBoth();            //This function will run Shipping method test

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

    @Test (description = "Payment Method Order(s) with only R+Color brand products", groups={"PaymentMethod"})
    public void PaymentMethodTestRcolor() throws Throwable {
        ShippingMethodPageTest shipMethod = new ShippingMethodPageTest();

        ExtentTest paymentReport = extent.createTest("Payment Method Module","This is to test payment module");

        shipMethod.ShippingInformationTestRcolor();            //This function will run Shipping method test

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

    @Test (description = "Payment Method Order(s) with only V-76 brand products", groups={"PaymentMethod"})
    public void PaymentMethodTestV76Dollar() throws Throwable {
        ShippingMethodPageTest shipMethod = new ShippingMethodPageTest();

        ExtentTest paymentReport = extent.createTest("Payment Method Module","This is to test payment module");

        shipMethod.ShippingInformationTestV76();            //This function will run Shipping method test

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

    @Test (description = "Payment Method Order(s) with only V-76 brand products POINTS", groups={"PaymentMethod"})
    public void PaymentMethodTestV76Points() throws Throwable {
        ShippingMethodPageTest shipMethod = new ShippingMethodPageTest();

        ExtentTest paymentReport = extent.createTest("Payment Method Module","This is to test payment module");

        shipMethod.ShippingInformationTestV76Points();            //This function will run Shipping method test

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

    @Test (description = "Payment Method Order(s) with only V-76 brand products BOTH", groups={"PaymentMethod"})
    public void PaymentMethodTestV76Both() throws Throwable {
        ShippingMethodPageTest shipMethod = new ShippingMethodPageTest();

        ExtentTest paymentReport = extent.createTest("Payment Method Module","This is to test payment module");

        shipMethod.ShippingInformationTestV76Both();            //This function will run Shipping method test

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