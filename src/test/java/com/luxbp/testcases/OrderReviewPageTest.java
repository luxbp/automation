package com.luxbp.testcases;

import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.luxbp.base.BaseClass;
import com.luxbp.pageobjects.OrderReviewPage;
import org.testng.Assert;
import org.testng.annotations.Test;

public class OrderReviewPageTest extends BaseClass {

    @Test (dataProvider = "logincredentials", dataProviderClass = com.luxbp.utility.LuxBPDataProvider.class, description = "Order Review Order(s) with only R+Co brand products (only retail $)", groups={"OrderReview"})
    public void orderReviewTestRplusCo(String username, String password) throws Throwable {
        ExtentTest orderReviewRcoDollarReport = extent.createTest("Order Review Order(s) with only R+Co brand products (only retail $)","This is to test Order review module");

        PurchaseOrderTestPage  pOrder = new PurchaseOrderTestPage();
        pOrder.purchaseOrderRplucCo(username, password);            //This function will run upto Payment Information module.
        orderReviewRcoDollarReport.pass("Purchase Order(s) with only R+Co brand products (only retail $) executed...");

        OrderReviewPage orderReview = new OrderReviewPage();
        orderReviewRcoDollarReport.log(Status.INFO,"Order(s) review with only R+Co brand products (only retail $)");
        try {
            String orderReviewCheck = orderReview.validateOrderReview();
            Assert.assertEquals(orderReviewCheck, "ORDER REVIEW");
            System.out.println("Order review info tab executed successfully " + orderReviewCheck);
            orderReviewRcoDollarReport.pass("Order(s) review with only R+Co brand products (only retail $) executed successfully" + orderReviewCheck);
        } catch (AssertionError orderReviewException) {
            System.out.println("Order(s) review with only R+Co brand products (only retail $) failed due to " + orderReviewException);
            orderReviewRcoDollarReport.fail("Order(s) review with only R+Co brand products (only retail $) failed to execute " + orderReviewException);
        }
        orderReview.placeOrderBtn();
        orderReviewRcoDollarReport.info("Order(s) review with only R+Co brand products (only retail $) test ends");
    }
    @Test (dataProvider = "logincredentials", dataProviderClass = com.luxbp.utility.LuxBPDataProvider.class, description = "Order(s) review with only R+Co brand products (only NFR points product)", groups={"OrderReview"})
    public void orderReviewTestRplusCoPoints(String username, String password) throws Throwable {
        ExtentTest orderReviewRcoPointsReport = extent.createTest("Order Review Order(s) with only R+Co brand products (only NFR points product)","This is to test Order review module");

        PurchaseOrderTestPage  pOrder = new PurchaseOrderTestPage();
        pOrder.purchaseOrderRplucCoPoints(username, password);            //This function will run upto Payment Information module.
        orderReviewRcoPointsReport.pass("Purchase Order(s) with only R+Co brand products (only NFR points product) executed...");

        OrderReviewPage orderReview = new OrderReviewPage();
        orderReviewRcoPointsReport.log(Status.INFO,"Order(s) with only R+Co brand products (only NFR points product) executed...");
        try {
            String orderReviewCheck = orderReview.validateOrderReview();
            Assert.assertEquals(orderReviewCheck, "ORDER REVIEW");
            System.out.println("Order review info tab executed successfully "+ orderReviewCheck);
            orderReviewRcoPointsReport.pass("Order(s) with only R+Co brand products (only NFR points product) executed "+ orderReviewCheck);
        } catch (AssertionError orderReviewException) {
            System.out.println("Order(s) with only R+Co brand products (only NFR points product) failed due to " + orderReviewException);
            orderReviewRcoPointsReport.fail("Order(s) with only R+Co brand products (only NFR points product) failed to execute " + orderReviewException);
        }
        orderReview.placeOrderBtn();
        orderReviewRcoPointsReport.info("Order(s) with only R+Co brand products (only NFR points product) test ends");
    }
    @Test (dataProvider = "logincredentials", dataProviderClass = com.luxbp.utility.LuxBPDataProvider.class,description = "Order(s) review with only R+Co brand products (both $ and points product)", groups={"OrderReview"})
    public void orderReviewTestRplusCoBoth(String username, String password) throws Throwable {
        ExtentTest orderReviewRcoBothReport = extent.createTest("Order(s) review with only R+Co brand products (both $ and points product)","This is to test Order review module");

        PurchaseOrderTestPage  pOrder = new PurchaseOrderTestPage();
        pOrder.purchaseOrderRplucCoBoth(username, password);            //This function will run upto Payment Information module.
        orderReviewRcoBothReport.pass("Purchase Order(s) review with only R+Co brand products (both $ and points product) executed...");

        OrderReviewPage orderReview = new OrderReviewPage();
        orderReviewRcoBothReport.log(Status.INFO,"Order(s) review with only R+Co brand products (both $ and points product) executed...");
        try {
            String orderReviewCheck = orderReview.validateOrderReview();
            Assert.assertEquals(orderReviewCheck, "ORDER REVIEW");
            System.out.println("Order review info tab executed successfully " + orderReviewCheck);
            orderReviewRcoBothReport.pass("Order(s) review with only R+Co brand products (both $ and points product) executed successfully "+ orderReviewCheck);
        } catch (AssertionError orderReviewException) {
            System.out.println("Order(s) review with only R+Co brand products (both $ and points product) failed due to " + orderReviewException);
            orderReviewRcoBothReport.fail("Order(s) review with only R+Co brand products (both $ and points product) failed to execute " + orderReviewException);
        }
        orderReview.placeOrderBtn();
        orderReviewRcoBothReport.info("Order(s) review with only R+Co brand products (both $ and points product) test ends");
    }
@Test(dataProvider = "logincredentials", dataProviderClass = com.luxbp.utility.LuxBPDataProvider.class,description = "Order(s) review with only R+Co brand SAME product (both $ and points SAME product)", groups={"OrderReview"})
    public void orderReviewTestRplusCoBothSameItem(String username, String password) throws Throwable {
        ExtentTest orderReviewRcoBothSameItemReport = extent.createTest("Order(s) review with only R+Co brand SAME product (both $ and points SAME product)","This is to test Order review module");

        PurchaseOrderTestPage  pOrder = new PurchaseOrderTestPage();
        pOrder.purchaseOrderRplucCoSameItemBoth(username, password);            //This function will run upto Payment Information module.
        orderReviewRcoBothSameItemReport.pass("Purchase Order(s) review with only R+Co brand SAME product (both $ and points SAME product) executed...");

        OrderReviewPage orderReview = new OrderReviewPage();
        orderReviewRcoBothSameItemReport.log(Status.INFO,"Order(s) review with only R+Co brand SAME product (both $ and points SAME product) executed...");
        try {
            String orderReviewCheck = orderReview.validateOrderReview();
            Assert.assertEquals(orderReviewCheck, "ORDER REVIEW");
            System.out.println("Order review info tab executed successfully " + orderReviewCheck);
            orderReviewRcoBothSameItemReport.pass("Order(s) review with only R+Co brand SAME product (both $ and points SAME product) executed successfully "+ orderReviewCheck);
        } catch (AssertionError orderReviewException) {
            System.out.println("Order(s) review with only R+Co brand SAME product (both $ and points SAME product) failed due to " + orderReviewException);
            orderReviewRcoBothSameItemReport.fail("Order(s) review with only R+Co brand SAME product (both $ and points SAME product) failed to execute " + orderReviewException);
        }
        orderReview.placeOrderBtn();
        orderReviewRcoBothSameItemReport.info("Order(s) review with only R+Co brand SAME product (both $ and points SAME product) test ends");
    }
    @Test (dataProvider = "logincredentials", dataProviderClass = com.luxbp.utility.LuxBPDataProvider.class,description = "Order(s) review with only R+Co Bleu brand products", groups={"OrderReview"})
    public void orderReviewTestRpluBleu(String username, String password) throws Throwable {
        ExtentTest orderReviewRbleuDollarReport = extent.createTest("Order(s) review with only R+Co Bleu brand products","This is to test Order review module");

        PurchaseOrderTestPage  pOrder = new PurchaseOrderTestPage();
        pOrder.purchaseOrderRbleu(username, password);            //This function will run upto Payment Information module.
        orderReviewRbleuDollarReport.pass("Purchase Order(s) review with only R+Co Bleu brand products executed...");

        OrderReviewPage orderReview = new OrderReviewPage();
        orderReviewRbleuDollarReport.log(Status.INFO,"Order(s) review with only R+Co Bleu brand products executed...");
        try {
            String orderReviewCheck = orderReview.validateOrderReview();
            Assert.assertEquals(orderReviewCheck, "ORDER REVIEW");
            System.out.println("Order review info tab executed successfully "+ orderReviewCheck);
            orderReviewRbleuDollarReport.pass("Order(s) review with only R+Co Bleu brand products executed successfully "+ orderReviewCheck);
        } catch (AssertionError orderReviewException) {
            System.out.println("Order(s) review with only R+Co Bleu brand products failed due to " + orderReviewException);
            orderReviewRbleuDollarReport.fail("Order(s) review with only R+Co Bleu brand products failed to execute " + orderReviewException);
        }
        orderReview.placeOrderBtn();
        orderReviewRbleuDollarReport.info("Order(s) review with only R+Co Bleu brand products test ends");
    }

    @Test (dataProvider = "logincredentials",dataProviderClass = com.luxbp.utility.LuxBPDataProvider.class, description = "Order(s) review with only R+Co Bleu brand products (only NFR points product)", groups={"OrderReview"})
    public void orderReviewTestRbleuPoints(String username, String password) throws Throwable {
        ExtentTest orderReviewRbleuPointsReport = extent.createTest("Order(s) review with only R+Co Bleu brand products (only NFR points product)","This is to test Order review module");

        PurchaseOrderTestPage  pOrder = new PurchaseOrderTestPage();
        pOrder.purchaseOrderRbleuPoints(username, password);            //This function will run upto Payment Information module.
        orderReviewRbleuPointsReport.pass("Purchase Order(s) review with only R+Co Bleu brand products (only NFR points product) executed...");

        OrderReviewPage orderReview = new OrderReviewPage();
        orderReviewRbleuPointsReport.log(Status.INFO,"Order(s) review with only R+Co Bleu brand products (only NFR points product) executed...");
        try {
            String orderReviewCheck = orderReview.validateOrderReview();
            Assert.assertEquals(orderReviewCheck, "ORDER REVIEW");
            System.out.println("Order review info tab executed successfully "+ orderReviewCheck);
            orderReviewRbleuPointsReport.pass("Order review module executed successfully "+ orderReviewCheck);
        } catch (AssertionError orderReviewException) {
            System.out.println("Order(s) review with only R+Co Bleu brand products (only NFR points product) failed due to " + orderReviewException);
            orderReviewRbleuPointsReport.fail("Order(s) review with only R+Co Bleu brand products (only NFR points product) failed to execute " + orderReviewException);
        }
        orderReview.placeOrderBtn();
        orderReviewRbleuPointsReport.info("Order(s) review with only R+Co Bleu brand products (only NFR points product) test ends");
    }
    @Test (dataProvider = "logincredentials",dataProviderClass = com.luxbp.utility.LuxBPDataProvider.class, description = "Order(s) review with only R+Co Bleu brand products (both $ and points product)", groups={"OrderReview"})
    public void orderReviewTestRleuBoth(String username, String password) throws Throwable {
        ExtentTest orderReviewRbleuBothReport = extent.createTest("Order(s) review with only R+Co Bleu brand products (both $ and points product)","This is to test Order review module");

        PurchaseOrderTestPage  pOrder = new PurchaseOrderTestPage();
        pOrder.purchaseOrderRbleuBoth(username, password);            //This function will run upto Payment Information module.
        orderReviewRbleuBothReport.pass("Purchase Order(s) review with only R+Co Bleu brand products (both $ and points product) executed...");

        OrderReviewPage orderReview = new OrderReviewPage();
        orderReviewRbleuBothReport.log(Status.INFO,"Order(s) review with only R+Co Bleu brand products (both $ and points product) executed...");
        try {
            String orderReviewCheck = orderReview.validateOrderReview();
            Assert.assertEquals(orderReviewCheck, "ORDER REVIEW");
            System.out.println("Order(s) review with only R+Co Bleu brand products (both $ and points product) executed successfully "+ orderReviewCheck);
            orderReviewRbleuBothReport.pass("Order(s) review with only R+Co Bleu brand products (both $ and points product) executed successfully "+ orderReviewCheck);
        } catch (AssertionError orderReviewException) {
            System.out.println("Order Review info tab failed due to " + orderReviewException);
            orderReviewRbleuBothReport.fail("Order review module failed to execute " + orderReviewException);
        }
        orderReview.placeOrderBtn();
        orderReviewRbleuBothReport.info("Order(s) review with only R+Co Bleu brand products (both $ and points product) test emds");
    }
    @Test (dataProvider = "logincredentials",dataProviderClass = com.luxbp.utility.LuxBPDataProvider.class, description = "Order(s) review with only Rbleu brand SAME product (both $ and points SAME product)", groups={"OrderReview"})

    public void orderReviewTestRbleuBothSameItem(String username, String password) throws Throwable {
        ExtentTest orderReviewRleuBothSameItemReport = extent.createTest("Order(s) review with only Rbleu brand SAME product (both $ and points SAME product)","This is to test Order review module");

        PurchaseOrderTestPage  pOrder = new PurchaseOrderTestPage();
        pOrder.purchaseOrderRbleuSameItemBoth(username, password);            //This function will run upto Payment Information module.
        orderReviewRleuBothSameItemReport.pass("Purchase Order(s) review with only Rbleu brand SAME product (both $ and points SAME product) executed...");

        OrderReviewPage orderReview = new OrderReviewPage();
        orderReviewRleuBothSameItemReport.log(Status.INFO,"Order(s) review with only Rbleu brand SAME product (both $ and points SAME product) executed...");
        try {
            String orderReviewCheck = orderReview.validateOrderReview();
            Assert.assertEquals(orderReviewCheck, "ORDER REVIEW");
            System.out.println("Order review info tab executed successfully " + orderReviewCheck);
            orderReviewRleuBothSameItemReport.pass("Order(s) review with only Rbleu brand SAME product (both $ and points SAME product) executed successfully "+ orderReviewCheck);
        } catch (AssertionError orderReviewException) {
            System.out.println("Order(s) review with only Rbleu brand SAME product (both $ and points SAME product) failed due to " + orderReviewException);
            orderReviewRleuBothSameItemReport.fail("Order(s) review with only Rbleu brand SAME product (both $ and points SAME product) failed to execute " + orderReviewException);
        }
        orderReview.placeOrderBtn();
        orderReviewRleuBothSameItemReport.info("Order(s) review with only Rbleu brand SAME product (both $ and points SAME product) test ends");
    }
    @Test (dataProvider = "logincredentials", dataProviderClass = com.luxbp.utility.LuxBPDataProvider.class,description = "Order(s) review with only R+Color brand products", groups={"OrderReview"})
    public void orderReviewTestRcolor(String username, String password) throws Throwable {
        ExtentTest orderReviewRcolorReport = extent.createTest("Order(s) review with only R+Color brand products","This is to test Order review module");

        PurchaseOrderTestPage  pOrder = new PurchaseOrderTestPage();
        pOrder.purchaseOrderRcolor(username, password);            //This function will run upto Payment Information module.
        orderReviewRcolorReport.pass("Purchase Order(s) review with only R+Color brand products executed...");

        OrderReviewPage orderReview = new OrderReviewPage();
        orderReviewRcolorReport.log(Status.INFO,"Order(s) review with only R+Color brand products executed...");
        try {
            String orderReviewCheck = orderReview.validateOrderReview();
            Assert.assertEquals(orderReviewCheck, "ORDER REVIEW");
            System.out.println("Order review info tab executed successfully "+ orderReviewCheck);
            orderReviewRcolorReport.pass("Order(s) review with only R+Color brand products executed successfully "+ orderReviewCheck);
        } catch (AssertionError orderReviewException) {
            System.out.println("Order(s) review with only R+Color brand products failed due to " + orderReviewException);
            orderReviewRcolorReport.fail("Order(s) review with only R+Color brand products failed to execute " + orderReviewException);
        }
        orderReview.placeOrderBtn();
        orderReviewRcolorReport.info("Order(s) review with only R+Color brand products test ends");
    }
    @Test (dataProvider = "logincredentials", dataProviderClass = com.luxbp.utility.LuxBPDataProvider.class,description = "Order(s) review with only V-76 brand products", groups={"OrderReview"})
    public void orderReviewTestV76Dollar(String username, String password) throws Throwable {
        ExtentTest orderReviewV76DollarReport = extent.createTest("Order(s) review with only V-76 brand products","This is to test Order review module");

        PurchaseOrderTestPage  pOrder = new PurchaseOrderTestPage();
        pOrder.purchaseOrderV76Dollar(username, password);            //This function will run upto Payment Information module.
        orderReviewV76DollarReport.pass("Purchase Order(s) review with only R+Color brand products executed...");

        OrderReviewPage orderReview = new OrderReviewPage();
        orderReviewV76DollarReport.log(Status.INFO,"Order Review Order(s) with only V-76 brand products executed...");
        try {
            String orderReviewCheck = orderReview.validateOrderReview();
            Assert.assertEquals(orderReviewCheck, "ORDER REVIEW");
            System.out.println("Order review info tab executed successfully "+ orderReviewCheck);
            orderReviewV76DollarReport.pass("Order review module executed successfully "+ orderReviewCheck);
        } catch (AssertionError orderReviewException) {
            System.out.println("Order Review Order(s) with only V-76 brand products failed due to " + orderReviewException);
            orderReviewV76DollarReport.fail("Order Review Order(s) with only V-76 brand products failed to execute " + orderReviewException);
        }
        orderReview.placeOrderBtn();
        orderReviewV76DollarReport.info("Order Review Order(s) with only V-76 brand products test ends");
    }
    @Test (dataProvider = "logincredentials", dataProviderClass = com.luxbp.utility.LuxBPDataProvider.class,description = "Order(s) review with only V-76 brand products POINTS", groups={"OrderReview"})
    public void orderReviewTestV76Points(String username, String password) throws Throwable {
        ExtentTest orderReviewV76PointsReport = extent.createTest("Order(s) review with only V-76 brand products POINTS","This is to test Order review module");

        PurchaseOrderTestPage  pOrder = new PurchaseOrderTestPage();
        pOrder.purchaseOrderV76Points(username, password);            //This function will run upto Payment Information module.
        orderReviewV76PointsReport.pass("Purchase Order(s) review with only V-76 brand products POINTS executed...");

        OrderReviewPage orderReview = new OrderReviewPage();
        orderReviewV76PointsReport.log(Status.INFO,"Order(s) review with only V-76 brand products POINTS executed...");
        try {
            String orderReviewCheck = orderReview.validateOrderReview();
            Assert.assertEquals(orderReviewCheck, "ORDER REVIEW");
            System.out.println("Order review info tab executed successfully "+ orderReviewCheck);
            orderReviewV76PointsReport.pass("Order review module executed successfully "+ orderReviewCheck);
        } catch (AssertionError orderReviewException) {
            System.out.println("Order(s) review with only V-76 brand products POINTS failed due to " + orderReviewException);
            orderReviewV76PointsReport.fail("Order(s) review with only V-76 brand products POINTS failed to execute " + orderReviewException);
        }
        orderReview.placeOrderBtn();
        orderReviewV76PointsReport.info("Order(s) review with only V-76 brand products POINTS test ends");
    }
    @Test (dataProvider = "logincredentials", dataProviderClass = com.luxbp.utility.LuxBPDataProvider.class, description = "Order(s) review with only V-76 brand products BOTH", groups={"OrderReview"})
    public void orderReviewTestV76Both(String username, String password) throws Throwable {
        ExtentTest orderReviewV76BothReport = extent.createTest("Order(s) review with only V-76 brand products BOTH","This is to test Order review module");

        PurchaseOrderTestPage  pOrder = new PurchaseOrderTestPage();
        pOrder.purchaseOrderV76Both(username, password);            //This function will run upto Payment Information module.
        orderReviewV76BothReport.pass("Purchase Order(s) review with only V-76 brand products BOTH executed...");

        OrderReviewPage orderReview = new OrderReviewPage();
        orderReviewV76BothReport.log(Status.INFO,"Order(s) review with only V-76 brand products BOTH executed...");
        try {
            String orderReviewCheck = orderReview.validateOrderReview();
            Assert.assertEquals(orderReviewCheck, "ORDER REVIEW");
            System.out.println("Order review info tab executed successfully "+ orderReviewCheck);
            orderReviewV76BothReport.pass("Order review module executed successfully "+ orderReviewCheck);
        } catch (AssertionError orderReviewException) {
            System.out.println("Order(s) review with only V-76 brand products BOTH failed due to " + orderReviewException);
            orderReviewV76BothReport.fail("Order(s) review with only V-76 brand products BOTH failed to execute " + orderReviewException);
        }
        orderReview.placeOrderBtn();
        orderReviewV76BothReport.info("Order(s) review with only V-76 brand products BOTH test ends");
    }
    @Test(dataProvider = "logincredentials", dataProviderClass = com.luxbp.utility.LuxBPDataProvider.class,description = "Order(s) review with only V-76 brand Same product BOTH", groups={"OrderReview"})
    public void orderReviewTestV76BothSameItem(String username, String password) throws Throwable {
        ExtentTest orderReviewV76BothSameItemReport = extent.createTest("Order(s) review with only V76 brand SAME product (both $ and points SAME product)","This is to test Order review module");

        PurchaseOrderTestPage  pOrder = new PurchaseOrderTestPage();
        pOrder.purchaseOrderV76SameItemBoth(username, password);            //This function will run upto Payment Information module.
        orderReviewV76BothSameItemReport.pass("Purchase Order(s) review with only V76 brand SAME product (both $ and points SAME product) executed...");

        OrderReviewPage orderReview = new OrderReviewPage();
        orderReviewV76BothSameItemReport.log(Status.INFO,"Order(s) review with only V76 brand SAME product (both $ and points SAME product) executed...");
        try {
            String orderReviewCheck = orderReview.validateOrderReview();
            Assert.assertEquals(orderReviewCheck, "ORDER REVIEW");
            System.out.println("Order review info tab executed successfully " + orderReviewCheck);
            orderReviewV76BothSameItemReport.pass("Order(s) review with only V76 brand SAME product (both $ and points SAME product) executed successfully "+ orderReviewCheck);
        } catch (AssertionError orderReviewException) {
            System.out.println("Order(s) review with only V76 brand SAME product (both $ and points SAME product) failed due to " + orderReviewException);
            orderReviewV76BothSameItemReport.fail("Order(s) review with only V76 brand SAME product (both $ and points SAME product) failed to execute " + orderReviewException);
        }
        orderReview.placeOrderBtn();
        orderReviewV76BothSameItemReport.info("Order(s) review with only V76 brand SAME product (both $ and points SAME product) test ends");
    }
}
