package com.luxbp.testcases;

import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.luxbp.base.BaseClass;
import com.luxbp.pageobjects.*;

import org.testng.annotations.Test;

@Test(dataProvider = "logincredentials", dataProviderClass = com.luxbp.utility.LuxBPDataProvider.class, description = "Grid Ordering", groups = {"GridOrdering"})
public class GridOrderingPageTest extends BaseClass {

    public void gridOrdering(String username, String password) throws Throwable {
        ExtentTest gridOrderingTestReport = extent.createTest("Grid Ordering Test Page", "This is to test Grid Ordering module");

        LoginPage login = new LoginPage();
        login.loginTest(username, password);

        gridOrderingTestReport.log(Status.INFO,"Navigated to Profile module");
        GridOrderingPage gridOrdering = new GridOrderingPage();
        ShippingInformation checkoutShipInfo = new ShippingInformation();
        ShippingMethod checkoutShipMethod = new ShippingMethod();
        PaymentPage checkoutPayment = new PaymentPage();
        PurchaseOrder purchaseOrder = new PurchaseOrder();
        OrderReviewPage orderReview = new OrderReviewPage();
        OrderSummary orderSummary = new OrderSummary();

        gridOrdering.profile();
        gridOrderingTestReport.log(Status.INFO,"Navigated to Quick Order module");
        gridOrdering.getProduct();
        gridOrdering.QuickOrderAddToCart();
        checkoutShipInfo.clickCheckoutBtn();
        checkoutShipMethod.clickFirstContinueBtn();
        checkoutPayment.clickSecondContinueBtn();
        purchaseOrder.enterPurchaseOrderNumber();
        orderReview.placeOrderBtn();
        orderSummary.lastContinueBtn();
    }
}
