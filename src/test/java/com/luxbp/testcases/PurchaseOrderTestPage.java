package com.luxbp.testcases;

import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.luxbp.base.BaseClass;
import com.luxbp.pageobjects.PurchaseOrder;
import org.testng.annotations.Test;

public class PurchaseOrderTestPage extends BaseClass {

    @Test (dataProvider = "logincredentials", dataProviderClass = com.luxbp.utility.LuxBPDataProvider.class, groups={"PurchaseOrder"}, description = "Purchase Order Order(s) with only R+Co brand products (only retail $)")
    public void purchaseOrderRplucCo(String username, String password) throws Throwable {
        ExtentTest purchaseOrderRcoDollarReport = extent.createTest("Purchase Order Order(s) with only R+Co brand products (only retail $)", "This is to test purchase order module");

        PaymentPageTest paymentPage = new PaymentPageTest();
        paymentPage.PaymentMethodTestRplusCo(username, password);            //This will run the upto payment Function
        purchaseOrderRcoDollarReport.log(Status.INFO, "Payment Order(s) with only R+Co brand products (only retail $) executed...");

        PurchaseOrder purchaseOrder = new PurchaseOrder();
        purchaseOrder.enterPurchaseOrderNumber();           //This will enter Purchase Order Number and click on Continue button
        purchaseOrderRcoDollarReport.log(Status.INFO, "Purchase Order Order(s) with only R+Co brand products (only retail $) executed...");

        purchaseOrderRcoDollarReport.info("Purchase Order Order(s) with only R+Co brand products (only retail $) test ends");
    }

    @Test (dataProvider = "logincredentials", dataProviderClass = com.luxbp.utility.LuxBPDataProvider.class,groups={"PurchaseOrder"}, description = "Purchase Order Order(s) with only R+Co brand products (only NFR points product)")
    public void purchaseOrderRplucCoPoints(String username, String password) throws Throwable {
        ExtentTest purchaseOrderRcoPointsReport = extent.createTest("Purchase Order(s) with only R+Co brand products (only NFR points product)", "This is to test purchase order module");

        PaymentPageTest paymentPage = new PaymentPageTest();
        paymentPage.PaymentMethodTestRplusCoPoints(username, password);            //This will run the upto payment Function
        purchaseOrderRcoPointsReport.pass("Payment Order(s) with only R+Co brand products (only NFR points product) executed...");

        PurchaseOrder purchaseOrder = new PurchaseOrder();
        purchaseOrder.enterPurchaseOrderNumber();           //This will enter Purchase Order Number and click on Continue button
        purchaseOrderRcoPointsReport.pass("Purchase Order(s) with only R+Co brand products (only NFR points product) executed...");

        purchaseOrderRcoPointsReport.info("Purchase Order(s) with only R+Co brand products (only NFR points product) test ends");
    }

    @Test (dataProvider = "logincredentials", dataProviderClass = com.luxbp.utility.LuxBPDataProvider.class,groups={"PurchaseOrder"}, description = "Purchase Order(s) with only R+Co brand products (both $ and points product)")
    public void purchaseOrderRplucCoBoth(String username, String password) throws Throwable {
        ExtentTest purchaseOrderReport = extent.createTest("Purchase Order(s) with only R+Co brand products (both $ and points product)", "This is to test purchase order module");

        PaymentPageTest paymentPage = new PaymentPageTest();
        paymentPage.PaymentMethodTestRplusCoBoth(username, password);            //This will run the upto payment Function
        purchaseOrderReport.log(Status.INFO, "Purchase Order(s) with only R+Co brand products (both $ and points product) executed...");

        PurchaseOrder purchaseOrder = new PurchaseOrder();
        purchaseOrder.enterPurchaseOrderNumber();           //This will enter Purchase Order Number and click on Continue button
        purchaseOrderReport.pass("Purchase Order(s) with only R+Co brand products (both $ and points product) executed...");

        purchaseOrderReport.info("Purchase Order(s) with only R+Co brand products (both $ and points product)test ends");
    }
    @Test (dataProvider = "logincredentials", dataProviderClass = com.luxbp.utility.LuxBPDataProvider.class,groups={"PurchaseOrder"}, description = "Purchase Order(s) with only R+Co brand SAME product (both $ and points SAME product)")
    public void purchaseOrderRplucCoSameItemBoth(String username, String password) throws Throwable {
        ExtentTest purchaseOrderRcoSameReport = extent.createTest("Purchase Order(s) with only R+Co brand SAME product (both $ and points SAME product)", "This is to test purchase order module");

        PaymentPageTest paymentPage = new PaymentPageTest();
        paymentPage.PaymentMethodTestRplusCoSameItemBoth(username, password);            //This will run the upto payment Function
        purchaseOrderRcoSameReport.log(Status.INFO, "Purchase Order(s) with only R+Co brand SAME product (both $ and points SAME product) executed...");

        PurchaseOrder purchaseOrder = new PurchaseOrder();
        purchaseOrder.enterPurchaseOrderNumber();           //This will enter Purchase Order Number and click on Continue button
        purchaseOrderRcoSameReport.pass("Purchase Order(s) with only R+Co brand SAME product (both $ and points SAME product) executed...");

        purchaseOrderRcoSameReport.info("Purchase Order(s) with only R+Co brand SAME product (both $ and points SAME product)test ends");
    }

    @Test (dataProvider = "logincredentials", dataProviderClass = com.luxbp.utility.LuxBPDataProvider.class,groups={"PurchaseOrder"}, description = "Purchase Order(s) with only R+Co Bleu brand products")
    public void purchaseOrderRbleu(String username, String password) throws Throwable {
        ExtentTest purchaseOrderRbleuReport = extent.createTest("Purchase Order(s) with only R+Co Bleu brand products", "This is to test purchase order module");

        PaymentPageTest paymentPage = new PaymentPageTest();
        paymentPage.PaymentMethodTestRbleu(username, password);            //This will run the upto payment Function
        purchaseOrderRbleuReport.log(Status.INFO, "Payment method Order(s) with only R+Co Bleu brand products executed...");

        PurchaseOrder purchaseOrder = new PurchaseOrder();
        purchaseOrder.enterPurchaseOrderNumber();           //This will enter Purchase Order Number and click on Continue button
        purchaseOrderRbleuReport.pass("Purchase Order(s) with only R+Co Bleu brand products executed...");

        purchaseOrderRbleuReport.info("Purchase Order(s) with only R+Co Bleu brand products test ends");
    }

    @Test (dataProvider = "logincredentials",dataProviderClass = com.luxbp.utility.LuxBPDataProvider.class, groups={"PurchaseOrder"}, description = "Purchase Order(s) with only R+Co Bleu brand products (only NFR points product)")
    public void purchaseOrderRbleuPoints(String username, String password) throws Throwable {
        ExtentTest purchaseOrderRbleuPointsReport = extent.createTest("Purchase Order(s) with only R+Co Bleu brand products (only NFR points product)", "This is to test purchase order module");

        PaymentPageTest paymentPage = new PaymentPageTest();
        paymentPage.PaymentMethodTestRbleuPoints(username, password);            //This will run the upto payment Function
        purchaseOrderRbleuPointsReport.log(Status.INFO, "Payment method Order(s) with only R+Co Bleu brand products (only NFR points product) module executed...");

        PurchaseOrder purchaseOrder = new PurchaseOrder();
        purchaseOrder.enterPurchaseOrderNumber();           //This will enter Purchase Order Number and click on Continue button
        purchaseOrderRbleuPointsReport.pass("Purchase Order(s) with only R+Co Bleu brand products (only NFR points product) executed");

        purchaseOrderRbleuPointsReport.info("Purchase Order(s) with only R+Co Bleu brand products (only NFR points product) page test ends");
    }

    @Test (dataProvider = "logincredentials",dataProviderClass = com.luxbp.utility.LuxBPDataProvider.class, groups={"PurchaseOrder"}, description = "Purchase Order(s) with only R+Co Bleu brand products (both $ and points product)")
    public void purchaseOrderRbleuBoth(String username, String password) throws Throwable {
        ExtentTest purchaseOrderRbleuBothReport = extent.createTest("Purchase Order(s) with only R+Co Bleu brand products (both $ and points product)", "This is to test purchase order module");

        PaymentPageTest paymentPage = new PaymentPageTest();
        paymentPage.PaymentMethodTestRbleuBoth(username, password);            //This will run the upto payment Function
        purchaseOrderRbleuBothReport.log(Status.INFO, "Payment method Order(s) with only R+Co Bleu brand products (both $ and points product) executed...");

        PurchaseOrder purchaseOrder = new PurchaseOrder();
        purchaseOrder.enterPurchaseOrderNumber();           //This will enter Purchase Order Number and click on Continue button
        purchaseOrderRbleuBothReport.pass("Purchase Order(s) with only R+Co Bleu brand products (both $ and points product)executed...");

        purchaseOrderRbleuBothReport.info("Purchase Order(s) with only R+Co Bleu brand products (both $ and points product) page test ends");
    }

    @Test (dataProvider = "logincredentials", dataProviderClass = com.luxbp.utility.LuxBPDataProvider.class,groups={"PurchaseOrder"}, description = "Purchase Order(s) with only Rbleu brand SAME product (both $ and points SAME product)")
    public void purchaseOrderRbleuSameItemBoth(String username, String password) throws Throwable {
        ExtentTest purchaseOrderRbleuSameReport = extent.createTest("Purchase Order(s) with only Rbleu brand SAME product (both $ and points SAME product)", "This is to test purchase order module");

        PaymentPageTest paymentPage = new PaymentPageTest();
        paymentPage.PaymentMethodTestRbleuSameItemBoth(username, password);            //This will run the upto payment Function
        purchaseOrderRbleuSameReport.log(Status.INFO, "Purchase Order(s) with only Rbleu brand SAME product (both $ and points SAME product) executed...");

        PurchaseOrder purchaseOrder = new PurchaseOrder();
        purchaseOrder.enterPurchaseOrderNumber();           //This will enter Purchase Order Number and click on Continue button
        purchaseOrderRbleuSameReport.pass("Purchase Order(s) with only Rbleu brand SAME product (both $ and points SAME product) executed...");

        purchaseOrderRbleuSameReport.info("Purchase Order(s) with only Rbleu brand SAME product (both $ and points SAME product)test ends");
    }
    @Test (dataProvider = "logincredentials", dataProviderClass = com.luxbp.utility.LuxBPDataProvider.class,groups={"PurchaseOrder"}, description = "Purchase Order(s) with only R+Color brand products")
    public void purchaseOrderRcolor(String username, String password) throws Throwable {
        ExtentTest purchaseOrderRcolorReport = extent.createTest("Purchase Order(s) with only R+Color brand products", "This is to test purchase order module");

        PaymentPageTest paymentPage = new PaymentPageTest();
        paymentPage.PaymentMethodTestRcolor(username, password);            //This will run the upto payment Function
        purchaseOrderRcolorReport.log(Status.INFO, "Payment method Order(s) with only R+Color brand products executed...");

        PurchaseOrder purchaseOrder = new PurchaseOrder();
        purchaseOrder.enterPurchaseOrderNumber();           //This will enter Purchase Order Number and click on Continue button
        purchaseOrderRcolorReport.pass("Purchase Order(s) with only R+Color brand products executed...");

        purchaseOrderRcolorReport.info("Purchase Order(s) with only R+Color brand products test ends");
    }

    @Test (dataProvider = "logincredentials", dataProviderClass = com.luxbp.utility.LuxBPDataProvider.class,groups={"PurchaseOrder"}, description = "Purchase Order(s) with only V-76 brand products")
    public void purchaseOrderV76Dollar(String username, String password) throws Throwable {
        ExtentTest purchaseOrderV76DollarReport = extent.createTest("Purchase Order(s) with only V-76 brand products", "This is to test purchase order module");

        PaymentPageTest paymentPage = new PaymentPageTest();
        purchaseOrderV76DollarReport.log(Status.INFO, "Payment method Order(s) with only V-76 brand products executed...");
        paymentPage.PaymentMethodTestV76Dollar(username, password);            //This will run the upto payment Function

        PurchaseOrder purchaseOrder = new PurchaseOrder();
        purchaseOrder.enterPurchaseOrderNumber();           //This will enter Purchase Order Number and click on Continue button
        purchaseOrderV76DollarReport.pass("Purchase Order(s) with only V-76 brand products executed...");

        purchaseOrderV76DollarReport.info("Purchase Order(s) with only V-76 brand products ends");
    }
    @Test (dataProvider = "logincredentials", dataProviderClass = com.luxbp.utility.LuxBPDataProvider.class,groups={"PurchaseOrder"}, description = "Purchase Order(s) with only V-76 brand products POINTS")
    public void purchaseOrderV76Points(String username ,String password) throws Throwable {
        ExtentTest purchaseOrderV76PointsReport = extent.createTest("Purchase Order(s) with only V-76 brand products POINTS", "This is to test purchase order module");

        PaymentPageTest paymentPage = new PaymentPageTest();
        purchaseOrderV76PointsReport.log(Status.INFO, "Payment method Order(s) with only V-76 brand products POINTS executed...");
        paymentPage.PaymentMethodTestV76Points(username, password);            //This will run the upto payment Function

        PurchaseOrder purchaseOrder = new PurchaseOrder();
        purchaseOrder.enterPurchaseOrderNumber();           //This will enter Purchase Order Number and click on Continue button
        purchaseOrderV76PointsReport.pass("Purchase Order(s) with only V-76 brand products POINTS executed...");

        purchaseOrderV76PointsReport.info("Purchase Order(s) with only V-76 brand products POINTS test ends");
    }
    @Test (dataProvider = "logincredentials", dataProviderClass = com.luxbp.utility.LuxBPDataProvider.class,groups={"PurchaseOrder"}, description = "Purchase Order(s) with only V-76 brand products BOTH")
    public void purchaseOrderV76Both(String username, String password) throws Throwable {
        ExtentTest purchaseOrderV76BothReport = extent.createTest("Purchase Order(s) with only V-76 brand products BOTH", "This is to test purchase order module");

        PaymentPageTest paymentPage = new PaymentPageTest();
        purchaseOrderV76BothReport.log(Status.INFO, "Purchase Order(s) with only V-76 brand products BOTH executed...");
        paymentPage.PaymentMethodTestV76Both(username, password);            //This will run the upto payment Function

        PurchaseOrder purchaseOrder = new PurchaseOrder();
        purchaseOrder.enterPurchaseOrderNumber();           //This will enter Purchase Order Number and click on Continue button
        purchaseOrderV76BothReport.pass("Purchase Order(s) with only V-76 brand products BOTH executed...");

        purchaseOrderV76BothReport.info("Purchase Order(s) with only V-76 brand products BOTH  ends");
    }

    @Test (dataProvider = "logincredentials", dataProviderClass = com.luxbp.utility.LuxBPDataProvider.class,groups={"PurchaseOrder"}, description = "Purchase Order(s) with only V76 brand SAME product (both $ and points SAME product)")
    public void purchaseOrderV76SameItemBoth(String username, String password) throws Throwable {
        ExtentTest purchaseOrderV76SameReport = extent.createTest("Purchase Order(s) with only V76 brand SAME product (both $ and points SAME product)", "This is to test purchase order module");

        PaymentPageTest paymentPage = new PaymentPageTest();
        paymentPage.PaymentMethodTestV76SameItemBoth(username, password);            //This will run the upto payment Function
        purchaseOrderV76SameReport.log(Status.INFO, "Purchase Order(s) with only V76 brand SAME product (both $ and points SAME product) executed...");

        PurchaseOrder purchaseOrder = new PurchaseOrder();
        purchaseOrder.enterPurchaseOrderNumber();           //This will enter Purchase Order Number and click on Continue button
        purchaseOrderV76SameReport.pass("Purchase Order(s) with only V76 brand SAME product (both $ and points SAME product) executed...");

        purchaseOrderV76SameReport.info("Purchase Order(s) with only V76 brand SAME product (both $ and points SAME product) test ends");
    }
}
