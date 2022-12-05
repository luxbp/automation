package com.mystore.testcases;

import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.mystore.base.BaseClass;
import com.mystore.pageobjects.OrderReviewPage;
import org.testng.Assert;
import org.testng.annotations.Test;

public class OrderReviewPageTest extends BaseClass {

    @Test
    public void orderReviewTest() throws Throwable {
        PurchaseOrderTestPage  pOrder = new PurchaseOrderTestPage();
        ExtentTest orderReviewReport = extent.createTest("Order Review Module","This is to test Order review module");
        pOrder.purchaseOrder();            //This function will run upto Payment Information module.

        OrderReviewPage orderReview = new OrderReviewPage();
        orderReviewReport.log(Status.INFO,"Order Review Module status");
        try {
            String orderReviewCheck = orderReview.validateOrderReview();
            Assert.assertEquals(orderReviewCheck, "ORDER REVIEW");
            System.out.println("Order review info tab executed successfully");
            orderReviewReport.pass("Order review module executed successfully");
        } catch (AssertionError orderReviewException) {
            System.out.println("Order Review info tab failed due to " + orderReviewException);
            orderReviewReport.fail("Order review module failed to execute " + orderReviewException);
        }
        orderReview.placeOrderBtn();
        orderReviewReport.info("Order review page test ends");
    }
}
