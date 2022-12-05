package com.mystore.testcases;

import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.mystore.base.BaseClass;
import com.mystore.pageobjects.OrderSummary;
import org.testng.Assert;
import org.testng.annotations.Test;

public class OrderSummaryPageTest extends BaseClass {

    @Test
    public void orderSummaryPage() throws Throwable {
        OrderReviewPageTest order = new OrderReviewPageTest();
        ExtentTest orderSummaryReport = extent.createTest("Order Summary Module","This is to test Order summary page");
        order.orderReviewTest();

        OrderSummary orderSummary = new OrderSummary();
        orderSummaryReport.log(Status.INFO,"Order Summary Status");
        try {
            String orderValidate = orderSummary.validateOrder();
            Assert.assertEquals(orderValidate, "Your order has been received.");
            System.out.println("Order tab executed Successfully");
            orderSummaryReport.pass("Order Summary module executed successfully");
        } catch (AssertionError orderException) {
            System.out.println("Order tab failed due to " + orderException);
            orderSummaryReport.fail("Order summary module failed to execute " + orderException);
        }
        orderSummary.lastContinueBtn();
        orderSummaryReport.info("Order Summary page test ends");    }
}
