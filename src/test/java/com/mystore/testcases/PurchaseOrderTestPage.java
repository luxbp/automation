package com.mystore.testcases;

import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.mystore.base.BaseClass;
import com.mystore.pageobjects.PurchaseOrder;
import org.testng.Assert;
import org.testng.annotations.Test;

public class PurchaseOrderTestPage extends BaseClass {

    @Test (priority = 6)
    public void purchaseOrder() throws Throwable {
        PaymentPageTest paymentPage = new PaymentPageTest();
        ExtentTest purchaseOrderReport = extent.createTest("Purchsae Order Module", "This is to test purchase order module");

        purchaseOrderReport.log(Status.INFO, "Purchase order module status");
        paymentPage.PaymentMethodTest();            //This will run the upto payment Function

        PurchaseOrder purchaseOrder = new PurchaseOrder();
        purchaseOrder.enterPurchaseOrderNumber();           //This will enter Purchase Order Number and click on Continue button
        purchaseOrderReport.pass("Purchase order entered successfully");

        purchaseOrderReport.info("Purchase order page test ends");
    }
}
