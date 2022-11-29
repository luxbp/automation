package com.mystore.testcases;

import com.mystore.base.BaseClass;
import com.mystore.pageobjects.PurchaseOrder;
import org.testng.Assert;
import org.testng.annotations.Test;

public class PurchaseOrderTestPage extends BaseClass {

    @Test
    public void purchaseOrder() throws Throwable {
        PaymentPageTest paymentPage = new PaymentPageTest();
        paymentPage.PaymentMethodTest();            //This will run the upto payment Function

        PurchaseOrder purchaseOrder = new PurchaseOrder();
        purchaseOrder.enterPurchaseOrderNumber();           //This will enter Purchase Order Number and click on Continue button
    }
}
