package com.luxbp.testcases;

import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.luxbp.base.BaseClass;
import com.luxbp.pageobjects.PaymentPage;
import org.testng.Assert;
import org.testng.annotations.Test;

public class PaymentPageTest extends BaseClass {

    @Test (dataProvider = "logincredentials", dataProviderClass = com.luxbp.utility.LuxBPDataProvider.class, description = "Payment Method Order(s) with only R+Co brand products (only retail $)", groups={"PaymentMethod"})
    public void PaymentMethodTestRplusCo(String username, String password) throws Throwable {
        ExtentTest paymentReport = extent.createTest("Payment Method Module Order(s) with only R+Co brand products (only retail $)","This is to test payment module");
        ShippingMethodPageTest shipMethod = new ShippingMethodPageTest();
        shipMethod.ShippingMethodTestRplusCo(username, password);            //This function will run Shipping method test
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

    @Test (dataProvider = "logincredentials",dataProviderClass = com.luxbp.utility.LuxBPDataProvider.class,description = "Payment Method Order(s) with only R+Co brand products (only NFR points product)", groups={"PaymentMethod"})
    public void PaymentMethodTestRplusCoPoints(String username, String password) throws Throwable {
        ExtentTest paymentRcoPointReport = extent.createTest("Payment Method Order(s) with only R+Co brand products (only NFR points product)","This is to test payment module");

        ShippingMethodPageTest shipMethod = new ShippingMethodPageTest();
        shipMethod.ShippingMethodTestRplusCoPoints(username, password);            //This function will run Shipping method test
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

    @Test (dataProvider = "logincredentials", dataProviderClass = com.luxbp.utility.LuxBPDataProvider.class,description = "Payment Method Order(s) with only R+Co brand products (both $ and points product)", groups={"PaymentMethod"})
    public void PaymentMethodTestRplusCoBoth(String username, String password) throws Throwable {
        ExtentTest paymentRcoBothReport = extent.createTest("Payment Method Order(s) with only R+Co brand products (both $ and points product)","This is to test payment module");

        ShippingMethodPageTest shipMethod = new ShippingMethodPageTest();
        shipMethod.ShippingMethodTestRplusCoBoth(username, password);            //This function will run Shipping method test
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

    @Test (dataProvider = "logincredentials", dataProviderClass = com.luxbp.utility.LuxBPDataProvider.class,description = "Payment Method Order(s) with only R+Co brand SAME product (both $ and points SAME product)", groups={"PaymentMethod"})
    public void PaymentMethodTestRplusCoSameItemBoth(String username, String password) throws Throwable {
        ExtentTest paymentRcoSameItemBothReport = extent.createTest("Payment Method Order(s) with only R+Co brand SAME products (both $ and points product)","This is to test payment module");

        ShippingMethodPageTest shipMethod = new ShippingMethodPageTest();
        shipMethod.ShippingMethodTestRplusCoBothSameItem(username, password);            //This function will run Shipping method test
        paymentRcoSameItemBothReport.log(Status.INFO,"Shipping Method Order(s) with only R+Co brand SAME product (both $ and points SAME product) module executed...");

        PaymentPage payment = new PaymentPage();
        paymentRcoSameItemBothReport.log(Status.INFO,"Payment Order(s) with only R+Co brand SAME product (both $ and points SAME product) status");
        payment.clickSecondContinueBtn();

        try {
            String paymentInfo = payment.validatePaymentInfo();
            Assert.assertEquals(paymentInfo, "PAYMENT INFORMATION");
            System.out.println("Payment info tab executed Successfully "+ paymentInfo);
            paymentRcoSameItemBothReport.pass("Payment Order(s) with only R+Co brand products (both $ and points product) executed successfully");
        } catch (AssertionError paymentInfoException) {
            System.out.println("Payment Method info Order(s) with only R+Co brand products (both $ and points SAME product) failed due to " + paymentInfoException);
            paymentRcoSameItemBothReport.fail("Payment Order(s) with only R+Co brand SAME product (both $ and points SAME product) failed to execute " + paymentInfoException);
        }
        paymentRcoSameItemBothReport.info("Payment Order(s) with only R+Co brand SAME products (both $ and points SAME product) test ends");
    }
    @Test (dataProvider = "logincredentials", dataProviderClass = com.luxbp.utility.LuxBPDataProvider.class,description = "Payment Method Order(s) with only R+Co Bleu brand products", groups={"PaymentMethod"})
    public void PaymentMethodTestRbleu(String username ,String password) throws Throwable {
        ExtentTest paymentRleuReport = extent.createTest("Payment Method Module Order(s) with only R+Co Bleu brand products","This is to test payment module");
        ShippingMethodPageTest shipMethod = new ShippingMethodPageTest();
        shipMethod.ShippingMethodTestRBleu(username, password);            //This function will run Shipping method test
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

    @Test (dataProvider = "logincredentials",dataProviderClass = com.luxbp.utility.LuxBPDataProvider.class, description = "Payment Method Order(s) with only R+Co Bleu brand products (only NFR points product)", groups={"PaymentMethod"})
    public void PaymentMethodTestRbleuPoints(String username, String password) throws Throwable {
        ShippingMethodPageTest shipMethod = new ShippingMethodPageTest();

        ExtentTest paymentReport = extent.createTest("Payment Method Module","This is to test payment module");

        shipMethod.ShippingMethodTestRBleuPoints(username, password);            //This function will run Shipping method test

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

    @Test (dataProvider = "logincredentials",dataProviderClass = com.luxbp.utility.LuxBPDataProvider.class, description = "Payment Method Order(s) with only R+Co Bleu brand products (both $ and points product)", groups={"PaymentMethod"})
    public void PaymentMethodTestRbleuBoth(String username, String password) throws Throwable {
        ShippingMethodPageTest shipMethod = new ShippingMethodPageTest();

        ExtentTest paymentReport = extent.createTest("Payment Method Module","This is to test payment module");

        shipMethod.ShippingInformationTestRbleuBoth(username, password);            //This function will run Shipping method test

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

    @Test (dataProvider = "logincredentials", dataProviderClass = com.luxbp.utility.LuxBPDataProvider.class, description = "Payment Method Order(s) with only Rbleu brand SAME product (both $ and points SAME product)", groups={"PaymentMethod"})
    public void PaymentMethodTestRbleuSameItemBoth(String username, String password) throws Throwable {
        ExtentTest paymentRbleuSameItemBothReport = extent.createTest("Payment Method Order(s) with only Rbleu brand SAME products (both $ and points product)","This is to test payment module");

        ShippingMethodPageTest shipMethod = new ShippingMethodPageTest();
        shipMethod.ShippingMethodTestRbleuBothSameItem(username, password);           //This function will run Shipping method test
        paymentRbleuSameItemBothReport.log(Status.INFO,"Shipping Method Order(s) with only Rbleu brand SAME product (both $ and points SAME product) module executed...");

        PaymentPage payment = new PaymentPage();
        paymentRbleuSameItemBothReport.log(Status.INFO,"Payment Order(s) with only Rbleu brand SAME product (both $ and points SAME product) status");
        payment.clickSecondContinueBtn();

        try {
            String paymentInfo = payment.validatePaymentInfo();
            Assert.assertEquals(paymentInfo, "PAYMENT INFORMATION");
            System.out.println("Payment info tab executed Successfully "+ paymentInfo);
            paymentRbleuSameItemBothReport.pass("Payment Order(s) with only Rbleu brand products (both $ and points product) executed successfully");
        } catch (AssertionError paymentInfoException) {
            System.out.println("Payment Method info Order(s) with only Rbleu brand products (both $ and points SAME product) failed due to " + paymentInfoException);
            paymentRbleuSameItemBothReport.fail("Payment Order(s) with only Rbleu brand SAME product (both $ and points SAME product) failed to execute " + paymentInfoException);
        }
        paymentRbleuSameItemBothReport.info("Payment Order(s) with only Rbleu brand SAME products (both $ and points SAME product) test ends");
    }

    @Test (dataProvider = "logincredentials", dataProviderClass = com.luxbp.utility.LuxBPDataProvider.class,description = "Payment Method Order(s) with only R+Color brand products", groups={"PaymentMethod"})
    public void PaymentMethodTestRcolor(String username, String password) throws Throwable {
        ShippingMethodPageTest shipMethod = new ShippingMethodPageTest();

        ExtentTest paymentReport = extent.createTest("Payment Method Module","This is to test payment module");

        shipMethod.ShippingInformationTestRcolor(username, password);            //This function will run Shipping method test

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

    @Test (dataProvider = "logincredentials", dataProviderClass = com.luxbp.utility.LuxBPDataProvider.class,description = "Payment Method Order(s) with only V-76 brand products", groups={"PaymentMethod"})
    public void PaymentMethodTestV76Dollar(String username, String password) throws Throwable {
        ShippingMethodPageTest shipMethod = new ShippingMethodPageTest();

        ExtentTest paymentReport = extent.createTest("Payment Method Module","This is to test payment module");

        shipMethod.ShippingInformationTestV76(username, password);            //This function will run Shipping method test

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

    @Test (dataProvider = "logincredentials", dataProviderClass = com.luxbp.utility.LuxBPDataProvider.class,description = "Payment Method Order(s) with only V-76 brand products POINTS", groups={"PaymentMethod"})
    public void PaymentMethodTestV76Points(String username, String password) throws Throwable {
        ShippingMethodPageTest shipMethod = new ShippingMethodPageTest();

        ExtentTest paymentReport = extent.createTest("Payment Method Module","This is to test payment module");

        shipMethod.ShippingInformationTestV76Points(username, password);            //This function will run Shipping method test

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

    @Test (dataProvider = "logincredentials", dataProviderClass = com.luxbp.utility.LuxBPDataProvider.class,description = "Payment Method Order(s) with only V-76 brand products BOTH", groups={"PaymentMethod"})
    public void PaymentMethodTestV76Both(String username, String password) throws Throwable {
        ShippingMethodPageTest shipMethod = new ShippingMethodPageTest();

        ExtentTest paymentReport = extent.createTest("Payment Method Module","This is to test payment module");

        shipMethod.ShippingInformationTestV76Both(username, password);            //This function will run Shipping method test

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

    @Test (dataProvider = "logincredentials", dataProviderClass = com.luxbp.utility.LuxBPDataProvider.class,description = "Payment Method Order(s) with only V76 brand SAME product (both $ and points SAME product)", groups={"PaymentMethod"})
    public void PaymentMethodTestV76SameItemBoth(String username, String password) throws Throwable {
        ExtentTest paymentRbleuSameItemBothReport = extent.createTest("Payment Method Order(s) with only V76 brand SAME products (both $ and points product)","This is to test payment module");

        ShippingMethodPageTest shipMethod = new ShippingMethodPageTest();
        shipMethod.ShippingMethodTestV76BothSameItem(username, password);           //This function will run Shipping method test
        paymentRbleuSameItemBothReport.log(Status.INFO,"Shipping Method Order(s) with only Rbleu brand SAME product (both $ and points SAME product) module executed...");

        PaymentPage payment = new PaymentPage();
        paymentRbleuSameItemBothReport.log(Status.INFO,"Payment Order(s) with only Rbleu brand SAME product (both $ and points SAME product) status");
        payment.clickSecondContinueBtn();

        try {
            String paymentInfo = payment.validatePaymentInfo();
            Assert.assertEquals(paymentInfo, "PAYMENT INFORMATION");
            System.out.println("Payment info tab executed Successfully "+ paymentInfo);
            paymentRbleuSameItemBothReport.pass("Payment Order(s) with only V76 brand products (both $ and points product) executed successfully");
        } catch (AssertionError paymentInfoException) {
            System.out.println("Payment Method info Order(s) with only V76 brand products (both $ and points SAME product) failed due to " + paymentInfoException);
            paymentRbleuSameItemBothReport.fail("Payment Order(s) with only V76 brand SAME product (both $ and points SAME product) failed to execute " + paymentInfoException);
        }
        paymentRbleuSameItemBothReport.info("Payment Order(s) with only V76 brand SAME products (both $ and points SAME product) test ends");
    }

}