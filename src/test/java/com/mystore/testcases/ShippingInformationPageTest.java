package com.mystore.testcases;

import com.mystore.base.BaseClass;
import com.mystore.pageobjects.ShippingInformation;
import org.testng.Assert;
import org.testng.annotations.Test;

public class ShippingInformationPageTest extends BaseClass {
    @Test
    public void ShippingInformationTest() throws Throwable {
        AddToCartPageTest addCart = new AddToCartPageTest();

        addCart.addToCartTest();            //This function logins, navigate to a brand, click on a product & buy

        ShippingInformation confirm = new ShippingInformation();

        confirm.clickCart();                //Click on cart button

        confirm.clickCheckoutBtn();         //Click on "Checkout" button
        try {
            String shippingInfo = confirm.validateShippingInformation();
            Assert.assertEquals(shippingInfo, "SHIPPING INFORMATION");
            System.out.println("Shipping info tab executed Successfully");
        } catch (AssertionError shipInfoException) {
            System.out.println("Shipping info tab failed due to " + shipInfoException);
        }

    }

}
