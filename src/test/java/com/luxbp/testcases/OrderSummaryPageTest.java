package com.luxbp.testcases;

import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.luxbp.base.BaseClass;
import com.luxbp.pageobjects.OrderSummary;
import org.testng.Assert;
import org.testng.annotations.Test;

public class OrderSummaryPageTest extends BaseClass {

    @Test (dataProvider = "logincredentials", dataProviderClass = com.luxbp.utility.LuxBPDataProvider.class, description = "Order(s) summary with only R+Co brand products (only retail $)", groups={"OrderSummary"}, priority = 1)
    public void orderSummaryPageRplusCo(String username, String password) throws Throwable {
        ExtentTest orderSummaryRcoDollarReport = extent.createTest("Order(s) summary with only R+Co brand products (only retail $)","This is to test Order summary page");

        OrderReviewPageTest order = new OrderReviewPageTest();
        order.orderReviewTestRplusCo(username, password);
        orderSummaryRcoDollarReport.pass("Order(s) review with only R+Co brand products (only retail $) executed...");

        OrderSummary orderSummary = new OrderSummary();
        try {
            String orderValidate = orderSummary.validateOrder();
            Assert.assertEquals(orderValidate, "Your order has been received");
            System.out.println("Order tab executed Successfully "+ orderValidate);
            orderSummaryRcoDollarReport.pass("Order Summary module executed successfully "+ orderValidate);
        } catch (AssertionError orderException) {
            System.out.println("Order(s) summary with only R+Co brand products (only retail $) failed due to " + orderException);
            orderSummaryRcoDollarReport.fail("Order(s) summary with only R+Co brand products (only retail $) failed to execute " + orderException);
        }
        orderSummary.lastContinueBtn();
        orderSummaryRcoDollarReport.info("Order(s) review with only R+Co brand products (only retail $) test ends");
        System.out.println("Clicked on Last Continue button");
    }

    @Test (dataProvider = "logincredentials",dataProviderClass = com.luxbp.utility.LuxBPDataProvider.class, description = "Order(s) summary with only R+Co brand products (only NFR points product)", groups={"OrderSummary"}, priority = 2)
    public void orderSummaryPageRplusCoPoints(String username, String password) throws Throwable {
        ExtentTest orderSummaryRcoPointsReport = extent.createTest("Order(s) summary with only R+Co brand products (only NFR points product)","This is to test Order summary page");

        OrderReviewPageTest order = new OrderReviewPageTest();
        order.orderReviewTestRplusCoPoints(username, password);
        orderSummaryRcoPointsReport.pass("Order(s) review with only R+Co brand products (only NFR points product) executed...");

        OrderSummary orderSummary = new OrderSummary();
        try {
            String orderValidate = orderSummary.validateOrder();
            Assert.assertEquals(orderValidate, "Your order has been received.");
            System.out.println("Order tab executed Successfully "+ orderValidate);
            orderSummaryRcoPointsReport.pass("Order Summary module executed successfully " + orderValidate);
        } catch (AssertionError orderException) {
            System.out.println("Order(s) summary with only R+Co brand products (only NFR points product) failed due to " + orderException);
            orderSummaryRcoPointsReport.fail("Order(s) summary with only R+Co brand products (only NFR points product) failed to execute " + orderException);
        }
        orderSummary.lastContinueBtn();
        orderSummaryRcoPointsReport.info("Order(s) summary with only R+Co brand products (only NFR points product) test ends");
        System.out.println("Clicked on Last Continue button");
    }

    @Test (dataProvider = "logincredentials", dataProviderClass = com.luxbp.utility.LuxBPDataProvider.class,description = "Order(s) summary with only R+Co brand products (both $ and points product)", groups={"OrderSummary"}, priority = 3)
    public void orderSummaryPageRplusCoBoth(String username, String password) throws Throwable {
        ExtentTest orderSummaryRcoBothReport = extent.createTest("Order(s) summary with only R+Co brand products (both $ and points product)","This is to test Order summary page");

        OrderReviewPageTest order = new OrderReviewPageTest();
        order.orderReviewTestRplusCoBoth(username, password);
        orderSummaryRcoBothReport.pass("Order(s) review with only R+Co brand products (both $ and points product) executed...");

        OrderSummary orderSummary = new OrderSummary();
        orderSummaryRcoBothReport.log(Status.INFO,"Order(s) summary with only R+Co brand products (both $ and points product) execute...");
        try {
            String orderValidate = orderSummary.validateOrder();
            Assert.assertEquals(orderValidate, "Your order has been received.");
            System.out.println("Order tab executed Successfully "+ orderValidate);
            orderSummaryRcoBothReport.pass("Order Summary module executed successfully "+ orderValidate);
        } catch (AssertionError orderException) {
            System.out.println("Order(s) summary with only R+Co brand products (both $ and points product) failed due to " + orderException);
            orderSummaryRcoBothReport.fail("Order(s) summary with only R+Co brand products (both $ and points product) failed to execute " + orderException);
        }
        orderSummary.lastContinueBtn();
        orderSummaryRcoBothReport.info("Order(s) summary with only R+Co brand products (both $ and points product) test ends");
        System.out.println("Clicked on Last Continue button");
    }

    @Test (dataProvider = "logincredentials", dataProviderClass = com.luxbp.utility.LuxBPDataProvider.class,description = "Order(s) summary with only R+Co brand SAME product (both $ and points SAME product)", groups={"OrderSummary"}, priority = 4)
    public void orderSummaryPageRplusCoBothSameItem(String username, String password) throws Throwable {
        ExtentTest orderSummaryRcoBothSameItemReport = extent.createTest("Order(s) summary with only R+Co brand SAME product (both $ and points SAME product)","This is to test Order summary page");

        OrderReviewPageTest order = new OrderReviewPageTest();
        order.orderReviewTestRplusCoBothSameItem(username, password);
        orderSummaryRcoBothSameItemReport.pass("Order(s) review with only R+Co brand SAME product (both $ and points SAME product) executed...");

        OrderSummary orderSummary = new OrderSummary();
        orderSummaryRcoBothSameItemReport.log(Status.INFO,"Order(s) summary with only R+Co brand SAME product (both $ and points SAME product) execute...");
        try {
            String orderValidate = orderSummary.validateOrder();
            Assert.assertEquals(orderValidate, "Your order has been received.");
            System.out.println("Order tab executed Successfully "+ orderValidate);
            orderSummaryRcoBothSameItemReport.pass("Order Summary module executed successfully "+ orderValidate);
        } catch (AssertionError orderException) {
            System.out.println("Order(s) summary with only R+Co brand SAME product (both $ and points SAME product) failed due to " + orderException);
            orderSummaryRcoBothSameItemReport.fail("Order(s) summary with only R+Co brand SAME product (both $ and points SAME product) failed to execute " + orderException);
        }
        orderSummary.lastContinueBtn();
        orderSummaryRcoBothSameItemReport.info("Order(s) summary with only R+Co brand SAME product (both $ and points SAME product) test ends");
        System.out.println("Clicked on Last Continue button");
    }
    @Test(dataProvider = "logincredentials", dataProviderClass = com.luxbp.utility.LuxBPDataProvider.class,description = "Order(s) summary with only R+Co Bleu brand products", groups={"OrderSummary"}, priority = 5)
    public void orderSummaryPageRbleu(String username, String password) throws Throwable {
        ExtentTest orderSummaryRbleuDollarReport = extent.createTest("Order(s) summary with only R+Co Bleu brand products","This is to test Order summary page");

        OrderReviewPageTest order = new OrderReviewPageTest();
        order.orderReviewTestRpluBleu(username, password);
        orderSummaryRbleuDollarReport.pass("Order(s) review with only R+Co Bleu brand products executed...");

        OrderSummary orderSummary = new OrderSummary();
        orderSummaryRbleuDollarReport.log(Status.INFO,"Order(s) summary with only R+Co Bleu brand products executed....");
        try {
            String orderValidate = orderSummary.validateOrder();
            Assert.assertEquals(orderValidate, "Your order has been received.");
            System.out.println("Order tab executed Successfully " + orderValidate);
            orderSummaryRbleuDollarReport.pass("Order Summary module executed successfully "+ orderValidate);
        } catch (AssertionError orderException) {
            System.out.println("Order(s) summary with only R+Co Bleu brand products failed due to " + orderException);
            orderSummaryRbleuDollarReport.fail("Order(s) summary with only R+Co Bleu brand products failed to execute " + orderException);
        }
        orderSummary.lastContinueBtn();
        orderSummaryRbleuDollarReport.info("Order(s) summary with only R+Co Bleu brand products test ends");
        System.out.println("Clicked on Last Continue button");
    }
    @Test (dataProvider = "logincredentials",dataProviderClass = com.luxbp.utility.LuxBPDataProvider.class, description = "Order(s) summary with only R+Co Bleu brand products (only NFR points product)", groups={"OrderSummary"}, priority = 6)
    public void orderSummaryPageRbleuPoints(String username, String password) throws Throwable {
        ExtentTest orderSummaryRbleuPointsReport = extent.createTest("Order(s) summary with only R+Co Bleu brand products (only NFR points product)","This is to test Order summary page");

        OrderReviewPageTest order = new OrderReviewPageTest();
        order.orderReviewTestRbleuPoints(username, password);
        orderSummaryRbleuPointsReport.pass("Order(s) review with only R+Co Bleu brand products (only NFR points product) executed...");

        OrderSummary orderSummary = new OrderSummary();
        orderSummaryRbleuPointsReport.log(Status.INFO,"sOrder(s) summary with only R+Co Bleu brand products (only NFR points product) executed...");
        try {
            String orderValidate = orderSummary.validateOrder();
            Assert.assertEquals(orderValidate, "Your order has been received.");
            System.out.println("Order tab executed Successfully "+ orderValidate);
            orderSummaryRbleuPointsReport.pass("Order Summary module executed successfully "+ orderValidate);
        } catch (AssertionError orderException) {
            System.out.println("Order(s) summary with only R+Co Bleu brand products (only NFR points product) failed due to " + orderException);
            orderSummaryRbleuPointsReport.fail("Order(s) summary with only R+Co Bleu brand products (only NFR points product) failed to execute " + orderException);
        }
        orderSummary.lastContinueBtn();
        orderSummaryRbleuPointsReport.info("Order(s) summary with only R+Co Bleu brand products (only NFR points product) test ends");
        System.out.println("Clicked on Last Continue button");
    }

    @Test (dataProvider = "logincredentials",dataProviderClass = com.luxbp.utility.LuxBPDataProvider.class, description = "Order(s) summary with only R+Co Bleu brand products (both $ and points product)", groups={"OrderSummary"}, priority = 7)
    public void orderSummaryPageRbleuBoth(String username, String password) throws Throwable {
        ExtentTest orderSummaryRbleuBothReport = extent.createTest("Order(s) summary with only R+Co Bleu brand products (both $ and points product)","This is to test Order summary page");

        OrderReviewPageTest order = new OrderReviewPageTest();
        order.orderReviewTestRleuBoth(username, password);
        orderSummaryRbleuBothReport.pass("Order(s) review with only R+Co Bleu brand products (both $ and points product) executed...");

        OrderSummary orderSummary = new OrderSummary();
        orderSummaryRbleuBothReport.log(Status.INFO,"Order(s) summary with only R+Co Bleu brand products (both $ and points product) executed...");
        try {
            String orderValidate = orderSummary.validateOrder();
            Assert.assertEquals(orderValidate, "Your order has been received.");
            System.out.println("Order tab executed Successfully "+ orderValidate);
            orderSummaryRbleuBothReport.pass("Order Summary module executed successfully "+ orderValidate);
        } catch (AssertionError orderException) {
            System.out.println("Order(s) summary with only R+Co Bleu brand products (both $ and points product) failed due to " + orderException);
            orderSummaryRbleuBothReport.fail("Order(s) summary with only R+Co Bleu brand products (both $ and points product) failed to execute " + orderException);
        }
        orderSummary.lastContinueBtn();
        orderSummaryRbleuBothReport.info("Order(s) summary with only R+Co Bleu brand products (both $ and points product) test ends");
        System.out.println("Clicked on Last Continue button");
    }

    @Test (dataProvider = "logincredentials",dataProviderClass = com.luxbp.utility.LuxBPDataProvider.class, description = "Order(s) summary with only Rbleu brand SAME product (both $ and points SAME product)", groups={"OrderSummary"}, priority = 8)
    public void orderSummaryPageRbleuCoBothSameItem(String username, String password) throws Throwable {
        ExtentTest orderSummaryRbleuBothSameItemReport = extent.createTest("Order(s) summary with only Rbleu brand SAME product (both $ and points SAME product)","This is to test Order summary page");

        OrderReviewPageTest order = new OrderReviewPageTest();
        order.orderReviewTestRbleuBothSameItem(username, password);
        orderSummaryRbleuBothSameItemReport.pass("Order(s) review with only Rbleu brand SAME product (both $ and points SAME product) executed...");

        OrderSummary orderSummary = new OrderSummary();
        orderSummaryRbleuBothSameItemReport.log(Status.INFO,"Order(s) summary with only Rbleu brand SAME product (both $ and points SAME product) execute...");
        try {
            String orderValidate = orderSummary.validateOrder();
            Assert.assertEquals(orderValidate, "Your order has been received.");
            System.out.println("Order tab executed Successfully "+ orderValidate);
            orderSummaryRbleuBothSameItemReport.pass("Order Summary module executed successfully "+ orderValidate);
        } catch (AssertionError orderException) {
            System.out.println("Order(s) summary with only Rbleu brand SAME product (both $ and points SAME product) failed due to " + orderException);
            orderSummaryRbleuBothSameItemReport.fail("Order(s) summary with only Rbleu brand SAME product (both $ and points SAME product) failed to execute " + orderException);
        }
        orderSummary.lastContinueBtn();
        orderSummaryRbleuBothSameItemReport.info("Order(s) summary with only Rbleu brand SAME product (both $ and points SAME product) test ends");
        System.out.println("Clicked on Last Continue button");
    }

    @Test (dataProvider = "logincredentials", dataProviderClass = com.luxbp.utility.LuxBPDataProvider.class,description = "Order(s) summary with only R+Color brand products", groups={"OrderSummary"}, priority = 9)
    public void orderSummaryPageRcolor(String username, String password) throws Throwable {
        ExtentTest orderSummaryRcolorReport = extent.createTest("Order(s) summary with only R+Color brand products","This is to test Order summary page");

        OrderReviewPageTest order = new OrderReviewPageTest();
        order.orderReviewTestRcolor(username, password);
        orderSummaryRcolorReport.pass("Order(s) review with only R+Color brand products executed...");

        OrderSummary orderSummary = new OrderSummary();
        orderSummaryRcolorReport.log(Status.INFO,"Order(s) summary with only R+Color brand products executed...");
        try {
            String orderValidate = orderSummary.validateOrder();
            Assert.assertEquals(orderValidate, "Your order has been received.");
            System.out.println("Order tab executed Successfully "+ orderValidate);
            orderSummaryRcolorReport.pass("Order Summary module executed successfully "+ orderValidate);
        } catch (AssertionError orderException) {
            System.out.println("Order(s) summary with only R+Color brand products failed due to " + orderException);
            orderSummaryRcolorReport.fail("Order(s) summary with only R+Color brand products failed to execute " + orderException);
        }
        orderSummary.lastContinueBtn();
        orderSummaryRcolorReport.info("Order(s) summary with only R+Color brand products test ends");
        System.out.println("Clicked on Last Continue button");
    }

    @Test (dataProvider = "logincredentials", dataProviderClass = com.luxbp.utility.LuxBPDataProvider.class,description = "Order(s) summary with only V-76 brand products", groups={"OrderSummary"}, priority = 10)
    public void orderSummaryPageV76Dollar(String username, String password) throws Throwable {
        ExtentTest orderSummaryV76DollarReport = extent.createTest("Order(s) summary with only V-76 brand products","This is to test Order summary page");

        OrderReviewPageTest order = new OrderReviewPageTest();
        order.orderReviewTestV76Dollar(username, password);
        orderSummaryV76DollarReport.pass("Order(s) review with only V-76 brand products executed...");

        OrderSummary orderSummary = new OrderSummary();
        orderSummaryV76DollarReport.log(Status.INFO,"Order(s) summary with only V-76 brand products executed...");
        try {
            String orderValidate = orderSummary.validateOrder();
            Assert.assertEquals(orderValidate, "Your order has been received.");
            System.out.println("Order tab executed Successfully "+ orderValidate);
            orderSummaryV76DollarReport.pass("Order Summary module executed successfully "+orderValidate);
        } catch (AssertionError orderException) {
            System.out.println("Order(s) summary with only V-76 brand products failed due to " + orderException);
            orderSummaryV76DollarReport.fail("Order(s) summary with only V-76 brand products failed to execute " + orderException);
        }
        orderSummary.lastContinueBtn();
        orderSummaryV76DollarReport.info("Order(s) summary with only V-76 brand products test ends");
        System.out.println("Clicked on Last Continue button");
    }

    @Test (dataProvider = "logincredentials", dataProviderClass = com.luxbp.utility.LuxBPDataProvider.class,description = "Order(s) summary with only V-76 brand products POINTS", groups={"OrderSummary"}, priority = 11)
    public void orderSummaryPageV76Points(String username, String password) throws Throwable {
        ExtentTest orderSummaryV76PointsReport = extent.createTest("Order(s) summary with only V-76 brand products POINTS","This is to test Order summary page");

        OrderReviewPageTest order = new OrderReviewPageTest();
        order.orderReviewTestV76Points(username, password);
        orderSummaryV76PointsReport.pass("Order(s) review with only V-76 brand products POINTS executed...");

        OrderSummary orderSummary = new OrderSummary();
        orderSummaryV76PointsReport.log(Status.INFO,"Order(s) summary with only V-76 brand products POINTS executed...");
        try {
            String orderValidate = orderSummary.validateOrder();
            Assert.assertEquals(orderValidate, "Your order has been received.");
            System.out.println("Order tab executed Successfully "+ orderValidate);
            orderSummaryV76PointsReport.pass("Order Summary module executed successfully "+ orderValidate);
        } catch (AssertionError orderException) {
            System.out.println("Order(s) summary with only V-76 brand products POINTS failed due to " + orderException);
            orderSummaryV76PointsReport.fail("Order(s) summary with only V-76 brand products POINTS failed to execute " + orderException);
        }
        orderSummary.lastContinueBtn();
        orderSummaryV76PointsReport.info("Order(s) summary with only V-76 brand products POINTS test ends");
        System.out.println("Clicked on Last Continue button");
    }

    @Test (dataProvider = "logincredentials", dataProviderClass = com.luxbp.utility.LuxBPDataProvider.class, description = "Order(s) summary with only V-76 brand products BOTH", groups={"OrderSummary"}, priority = 12)
    public void orderSummaryPageV76Both(String username, String password) throws Throwable {
        ExtentTest orderSummaryV76BothReport = extent.createTest("Order(s) summary with only V-76 brand products BOTH","This is to test Order summary page");

        OrderReviewPageTest order = new OrderReviewPageTest();
        order.orderReviewTestV76Both(username, password);
        orderSummaryV76BothReport.pass("Order(s) review with only V-76 brand products BOTH executed...");

        OrderSummary orderSummary = new OrderSummary();
        orderSummaryV76BothReport.log(Status.INFO,"Order(s) summary with only V-76 brand products BOTH starts here...");
        try {
            String orderValidate = orderSummary.validateOrder();
            Assert.assertEquals(orderValidate, "Your order has been received.");
            System.out.println("Order tab executed Successfully "+ orderValidate);
            orderSummaryV76BothReport.pass("Order Summary module executed successfully "+ orderValidate);
        } catch (AssertionError orderException) {
            System.out.println("Order(s) summary with only V-76 brand products BOTH failed due to " + orderException);
            orderSummaryV76BothReport.fail("Order(s) summary with only V-76 brand products BOTH failed to execute " + orderException);
        }
        orderSummary.lastContinueBtn();
        orderSummaryV76BothReport.info("Order(s) summary with only V-76 brand products BOTH test ends");
        System.out.println("Clicked on Last Continue button");
    }

    @Test (dataProvider = "logincredentials", dataProviderClass = com.luxbp.utility.LuxBPDataProvider.class,description = "Order(s) summary with only V76 brand SAME product (both $ and points SAME product)", groups={"OrderSummary"}, priority = 13)
    public void orderSummaryPageV76CoBothSameItem(String username, String password) throws Throwable {
        ExtentTest orderSummaryV76BothSameItemReport = extent.createTest("Order(s) summary with only V76 brand SAME product (both $ and points SAME product)","This is to test Order summary page");

        OrderReviewPageTest order = new OrderReviewPageTest();
        order.orderReviewTestV76BothSameItem(username, password);
        orderSummaryV76BothSameItemReport.pass("Order(s) review with only V76 brand SAME product (both $ and points SAME product) executed...");

        OrderSummary orderSummary = new OrderSummary();
        orderSummaryV76BothSameItemReport.log(Status.INFO,"Order(s) summary with only V76 brand SAME product (both $ and points SAME product) execute...");
        try {
            String orderValidate = orderSummary.validateOrder();
            Assert.assertEquals(orderValidate, "Your order has been received.");
            System.out.println("Order tab executed Successfully "+ orderValidate);
            orderSummaryV76BothSameItemReport.pass("Order Summary module executed successfully "+ orderValidate);
        } catch (AssertionError orderException) {
            System.out.println("Order(s) summary with only V76 brand SAME product (both $ and points SAME product) failed due to " + orderException);
            orderSummaryV76BothSameItemReport.fail("Order(s) summary with only V76 brand SAME product (both $ and points SAME product) failed to execute " + orderException);
        }
        orderSummary.lastContinueBtn();
        orderSummaryV76BothSameItemReport.info("Order(s) summary with only V76 brand SAME product (both $ and points SAME product) test ends");
        System.out.println("Clicked on Last Continue button");
    }
}
