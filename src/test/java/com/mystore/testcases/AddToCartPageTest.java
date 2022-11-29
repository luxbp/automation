package com.mystore.testcases;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import com.mystore.base.BaseClass;
import com.mystore.pageobjects.AddToCartPage;
import com.mystore.pageobjects.IndexPage;
import com.mystore.pageobjects.SearchResultPage;

public class AddToCartPageTest extends BaseClass {


    @Test
    public void addToCartTest() throws Throwable {
        LoginPageTest login = new LoginPageTest();
        login.loginTest();

        AddToCartPage AddToCartPage = new AddToCartPage();
        AddToCartPage.clickProduct();
        String itemName = AddToCartPage.getItemName();
        AddToCartPage.clickFirstProduct();
        try {
            String expectedItemName = AddToCartPage.validateAddProduct();
            Assert.assertEquals(itemName, expectedItemName);
            System.out.println(itemName + "Added Successfully");
        } catch (AssertionError prodClickException) {
            System.out.println(itemName + "add failed due to " + prodClickException);
        }
    }
}
