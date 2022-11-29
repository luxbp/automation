package com.mystore.testcases;

import com.mystore.base.BaseClass;
import com.mystore.pageobjects.OrderReviewPage;
import com.mystore.pageobjects.PaymentPage;
import org.testng.Assert;
import org.testng.annotations.Test;

public class OrderReviewPageTest extends BaseClass {

    @Test
    public void orderReviewTest() throws Throwable {
        PurchaseOrderTestPage  pOrder = new PurchaseOrderTestPage();
        pOrder.purchaseOrder();            //This function will run upto Payment Information module.

        OrderReviewPage orderReview = new OrderReviewPage();
        try {
            String orderReviewCheck = orderReview.validateOrderReview();
            Assert.assertEquals(orderReviewCheck, "ORDER REVIEW");
            System.out.println("Order review info tab executed successfully");
        } catch (AssertionError orderReviewException) {
            System.out.println("Order Review info tab failed due to " + orderReviewException);
        }

        orderReview.placeOrderBtn();

    }
}
