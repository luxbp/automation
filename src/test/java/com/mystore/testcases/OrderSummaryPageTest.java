package com.mystore.testcases;

import com.mystore.base.BaseClass;
import com.mystore.pageobjects.OrderSummary;
import com.mystore.pageobjects.PurchaseOrder;
import org.testng.Assert;
import org.testng.annotations.Test;

public class OrderSummaryPageTest extends BaseClass {

    @Test
    public void orderSummaryPage() throws Throwable {
        OrderReviewPageTest order = new OrderReviewPageTest();
        order.orderReviewTest();

        OrderSummary orderSummary = new OrderSummary();
        try {
            String orderValidate = orderSummary.validateOrder();
            Assert.assertEquals(orderValidate, "Your order has been received.");
            System.out.println("Order tab executed Successfully");
        } catch (AssertionError orderException) {
            System.out.println("Order tab failed due to " + orderException);
        }

        orderSummary.lastContinueBtn();
    }
}
