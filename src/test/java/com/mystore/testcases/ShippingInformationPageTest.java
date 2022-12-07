package com.mystore.testcases;

import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.mystore.base.BaseClass;
import com.mystore.pageobjects.ShippingInformation;
import org.testng.Assert;
import org.testng.annotations.Test;

public class ShippingInformationPageTest extends BaseClass {

    @Test(description = "SHIPPINGINFORMATION Order(s) with only R+Co brand products (only retail $)", groups={"ShippingInformation"})
    public void ShippingInformationTestRplusCo() throws Throwable {

        ExtentTest shippingInfoRcoDollarReport = extent.createTest("SHIPPING INFORMATION Order(s) with only R+Co brand products (only retail $)","This is to test the Shipping Information module");

        AddToCartPageTest addCart = new AddToCartPageTest();

        addCart.addToCartRplusCoDollar();            //This function logins, navigate to a brand, click on a product & buy

        shippingInfoRcoDollarReport.log(Status.INFO, "Rco (Only Retail $ product) add executed...");
        ShippingInformation confirm = new ShippingInformation();

        shippingInfoRcoDollarReport.log(Status.INFO,"Shipping Information of Rco(Only Retail $ product) visiting cart...");
        confirm.clickCart();                //Click on cart button

        confirm.clickCheckoutBtn();         //Click on "Checkout" button
        try {
            String shippingInfo = confirm.validateShippingInformation();
            Assert.assertEquals(shippingInfo, "SHIPPING INFORMATION");
            System.out.println("Shipping Information of Rco (Only Retail $ product) executed successfully | " + shippingInfo);
            shippingInfoRcoDollarReport.pass("Shipping information module (Rco Only Retail $) executed successfully");
        } catch (AssertionError shipInfoException) {
            System.out.println("Shipping Information of Rco Only Retail $ product failed due to " + shipInfoException);
            shippingInfoRcoDollarReport.fail("Shipping Information of Rco Only Retail $ product failed to execute "+ shipInfoException);
        }
        shippingInfoRcoDollarReport.info("Shipping Information of Rco (Only Retail $ product) page test ends");
    }

    @Test(description = "SHIPPING INFORMATION Order(s) with only R+Co brand products (only NFR points product)", groups={"ShippingInformation"})
    public void ShippingInformationTestRplusCoPoints() throws Throwable {

        ExtentTest shippingInfoRcoPointsReport = extent.createTest("Shipping Information R+Co brand products (only NFR points product)","This is to test the Shipping Information module");

        AddToCartPageTest addCart = new AddToCartPageTest();

        addCart.addToCartRplusCoPoints();            //This function logins, navigate to a brand, click on a product & buy
        shippingInfoRcoPointsReport.log(Status.INFO, "Rco (only NFR points product) product add executed...");

        ShippingInformation confirm = new ShippingInformation();

        shippingInfoRcoPointsReport.log(Status.INFO,"Shipping Information Rco (only NFR points product) visiting cart...");
        confirm.clickCart();                //Click on cart button

        confirm.clickCheckoutBtn();         //Click on "Checkout" button
        try {
            String shippingInfo = confirm.validateShippingInformation();
            Assert.assertEquals(shippingInfo, "SHIPPING INFORMATION");
            System.out.println("Shipping Information page of R+Co brand products (only NFR points product) executed Successfully" + shippingInfo);
            shippingInfoRcoPointsReport.pass("Shipping Information page of R+Co brand products (only NFR points product) executed successfully");
        } catch (AssertionError shipInfoException) {
            System.out.println("Shipping Information page of R+Co brand products (only NFR points product) failed due to " + shipInfoException);
            shippingInfoRcoPointsReport.fail("Shipping Information page of R+Co brand products (only NFR points product) failed to execute "+ shipInfoException);
        }
        shippingInfoRcoPointsReport.info("Shipping Information page of R+Co brand products (only NFR points product) test ends)");
    }

    @Test(description = "SHIPPING INFORMATION Order(s) with only R+Co brand products (both $ and points product)", groups={"ShippingInformation"})
    public void ShippingInformationTestRplusCoBoth() throws Throwable {

        ExtentTest shippingInfoRcoBothReport = extent.createTest("Shipping Information R+Co brand products (both $ and points product)","This is to test the Shipping Information module");

        AddToCartPageTest addCart = new AddToCartPageTest();

        addCart.addToCartRplusCoPointsBoth();            //This function logins, navigate to a brand, click on a product & buy

        shippingInfoRcoBothReport.log(Status.INFO, "Rco brand products (both $ and points product) add executed...");

        ShippingInformation confirm = new ShippingInformation();

        shippingInfoRcoBothReport.log(Status.INFO,"Shipping Information Rco brand products (both $ and points product) visiting cart...");

        confirm.clickCart();                //Click on cart button

        confirm.clickCheckoutBtn();         //Click on "Checkout" button
        try {
            String shippingInfo = confirm.validateShippingInformation();
            Assert.assertEquals(shippingInfo, "SHIPPING INFORMATION");
            System.out.println("Shipping Information page of Rco brand products (both $ and points product) executed Successfully" + shippingInfo);
            shippingInfoRcoBothReport.pass("Shipping Information page of Rco brand products (both $ and points product) executed successfully");
        } catch (AssertionError shipInfoException) {
            System.out.println("Shipping Information page of Rco brand products (both $ and points product) failed due to " + shipInfoException);
            shippingInfoRcoBothReport.fail("Shipping Information page of Rco brand products (both $ and points product) failed to execute "+ shipInfoException);
        }
        shippingInfoRcoBothReport.info("Shipping Information page of Rco brand products (both $ and points product) test ends");
    }

    @Test(description = "SHIPPING INFORMATION Order(s) with only RBleu brand products", groups={"ShippingInformation"})
    public void ShippingInformationTestRbleu() throws Throwable {

        ExtentTest shippingInfoRbleuReport = extent.createTest("Shipping Information Order(s) with only RBleu brand products","This is to test the Shipping Information module");

        AddToCartPageTest addCart = new AddToCartPageTest();

        addCart.addToCartRbleuDollar();            //This function logins, navigate to a brand, click on a product & buy

        shippingInfoRbleuReport.log(Status.INFO, "Order(s) with only RBleu brand products add executed...");

        ShippingInformation confirm = new ShippingInformation();

        shippingInfoRbleuReport.log(Status.INFO,"Shipping Information Order(s) with only RBleu brand products visiting cart...");
        confirm.clickCart();                //Click on cart button

        confirm.clickCheckoutBtn();         //Click on "Checkout" button
        try {
            String shippingInfo = confirm.validateShippingInformation();
            Assert.assertEquals(shippingInfo, "SHIPPING INFORMATION");
            System.out.println("SShipping Information Order(s) with only RBleu brand products executed Successfully" + shippingInfo);
            shippingInfoRbleuReport.pass("Shipping Information Order(s) with only RBleu brand products executed successfully");
        } catch (AssertionError shipInfoException) {
            System.out.println("Shipping Information Order(s) with only RBleu brand products failed due to " + shipInfoException);
            shippingInfoRbleuReport.fail("Shipping Information Order(s) with only RBleu brand products failed to execute "+ shipInfoException);
        }
        shippingInfoRbleuReport.info("Shipping Information Order(s) with only RBleu brand products test ends");
    }

    @Test(description = "SHIPPING INFORMATION Order(s) with only R+Co Bleu brand products (only NFR points product)", groups={"ShippingInformation"})
    public void ShippingInformationTestRbleuPoints() throws Throwable {

        ExtentTest shippingInfoRbleuPointsReport = extent.createTest("Shipping Information Module (only NFR points product)","This is to test the Shipping Information module");

        AddToCartPageTest addCart = new AddToCartPageTest();

        addCart.AddToCartPageRbleuPointsTest();            //This function logins, navigate to a brand, click on a product & buy
        shippingInfoRbleuPointsReport.log(Status.INFO, "R-Bleu brand products (only NFR points product) add executed...");

        ShippingInformation confirm = new ShippingInformation();

        shippingInfoRbleuPointsReport.log(Status.INFO,"Shipping Information R-Bleu brand products (only NFR points product) status");
        confirm.clickCart();                //Click on cart button

        confirm.clickCheckoutBtn();         //Click on "Checkout" button
        try {
            String shippingInfo = confirm.validateShippingInformation();
            Assert.assertEquals(shippingInfo, "SHIPPING INFORMATION");
            System.out.println("Shipping info tab R-Bleu brand products (only NFR points product) executed Successfully " + shippingInfo);
            shippingInfoRbleuPointsReport.pass("Shipping information module R-Bleu brand products (only NFR points product) executed successfully");
        } catch (AssertionError shipInfoException) {
            System.out.println("Shipping info tab failed due to " + shipInfoException);
            shippingInfoRbleuPointsReport.fail("Shipping information module R-Bleu brand products (only NFR points product) failed to execute "+ shipInfoException);
        }
        shippingInfoRbleuPointsReport.info("Shipping Information R-Bleu brand products (only NFR points product) test ends");
    }

    @Test(description = "SHIPPING INFORMATION Order(s) with only R-Bleu brand products (both $ and points product)", groups={"ShippingInformation"})
    public void ShippingInformationTestRbleuBoth() throws Throwable {

        ExtentTest shippingInfoRbleuBothReport = extent.createTest("Shipping Information R-Bleu brand products (both $ and points product)","This is to test the Shipping Information module");

        AddToCartPageTest addCart = new AddToCartPageTest();

        addCart.AddToCartPageRbleuBothTest();            //This function logins, navigate to a brand, click on a product & buy
        shippingInfoRbleuBothReport.log(Status.INFO, "R-Bleu brand products (both $ and points product) add executed...");

        ShippingInformation confirm = new ShippingInformation();

        shippingInfoRbleuBothReport.log(Status.INFO,"Shipping Information R-Bleu brand products (both $ and points product) status");
        confirm.clickCart();                //Click on cart button

        confirm.clickCheckoutBtn();         //Click on "Checkout" button
        try {
            String shippingInfo = confirm.validateShippingInformation();
            Assert.assertEquals(shippingInfo, "SHIPPING INFORMATION");
            System.out.println("Shipping info tab R-Bleu brand products (both $ and points product) executed Successfully" + shippingInfo);
            shippingInfoRbleuBothReport.pass("Shipping information module R-Bleu brand products (both $ and points product) executed successfully");
        } catch (AssertionError shipInfoException) {
            System.out.println("Shipping info R-Bleu brand products (both $ and points product) tab failed due to " + shipInfoException);
            shippingInfoRbleuBothReport.fail("Shipping information module R-Bleu brand products (both $ and points product) failed to execute "+ shipInfoException);
        }
        shippingInfoRbleuBothReport.info("Shipping Information R-Bleu brand products (both $ and points product) test ends");
    }

    @Test(description = "SHIPPING INFORMATION Order(s) with only R+Color brand products", groups={"ShippingInformation"})
    public void ShippingInformationTestRcolor() throws Throwable {

        ExtentTest shippingInfoRcolorReport = extent.createTest("Shipping Information Module only R+Color brand products","This is to test the Shipping Information module");

        AddToCartPageTest addCart = new AddToCartPageTest();

        addCart.addToCartPageRcolorTestDollar();            //This function logins, navigate to a brand, click on a product & buy
        shippingInfoRcolorReport.log(Status.INFO, "R+Color brand products add executed...");

        ShippingInformation confirm = new ShippingInformation();

        shippingInfoRcolorReport.log(Status.INFO,"Shipping Information R+Color brand products status");
        confirm.clickCart();                //Click on cart button

        confirm.clickCheckoutBtn();         //Click on "Checkout" button
        try {
            String shippingInfo = confirm.validateShippingInformation();
            Assert.assertEquals(shippingInfo, "SHIPPING INFORMATION");
            System.out.println("Shipping info tab R+Color brand products executed Successfully " + shippingInfo);
            shippingInfoRcolorReport.pass("Shipping information module R+Color brand products executed successfully");
        } catch (AssertionError shipInfoException) {
            System.out.println("Shipping info tab failed due to " + shipInfoException);
            shippingInfoRcolorReport.fail("Shipping information module failed to execute "+ shipInfoException);
        }
        shippingInfoRcolorReport.info("Shipping Information R+Color brand products test ends");
    }

    @Test(description = "SHIPPING INFORMATION Order(s) with only V-76 brand products", groups={"ShippingInformation"})
    public void ShippingInformationTestV76() throws Throwable {

        ExtentTest shippingInfoV76Report = extent.createTest("Shipping Information Module V-76 brand products","This is to test the Shipping Information module");

        AddToCartPageTest addCart = new AddToCartPageTest();

        addCart.addToCartV76Dollar();            //This function logins, navigate to a brand, click on a product & buy
        shippingInfoV76Report.log(Status.INFO, "V-76 brand products add executed...");

        ShippingInformation confirm = new ShippingInformation();

        shippingInfoV76Report.log(Status.INFO,"Shipping Information V-76 brand products status");
        confirm.clickCart();                //Click on cart button

        confirm.clickCheckoutBtn();         //Click on "Checkout" button
        try {
            String shippingInfo = confirm.validateShippingInformation();
            Assert.assertEquals(shippingInfo, "SHIPPING INFORMATION");
            System.out.println("Shipping info tab V-76 brand products test ends executed Successfully " + shippingInfo);
            shippingInfoV76Report.pass("Shipping information module V-76 brand products executed successfully");
        } catch (AssertionError shipInfoException) {
            System.out.println("Shipping info tab failed due to " + shipInfoException);
            shippingInfoV76Report.fail("Shipping information module failed to execute "+ shipInfoException);
        }
        shippingInfoV76Report.info("Shipping Information V-76 brand products test ends");
    }

    @Test(description = "SHIPPING INFORMATION Order(s) with only V-76 brand products(NFR Brand product)", groups={"ShippingInformation"})
    public void ShippingInformationTestV76Points() throws Throwable {

        ExtentTest shippingInfoV76PointsReport = extent.createTest("Shipping Information Module V-76 brand products(NFR Brand product)","This is to test the Shipping Information module");

        AddToCartPageTest addCart = new AddToCartPageTest();

        addCart.addToCartV76Points();            //This function logins, navigate to a brand, click on a product & buy
        shippingInfoV76PointsReport.log(Status.INFO, "V-76 brand products(NFR Brand product) add executed...");

        ShippingInformation confirm = new ShippingInformation();

        shippingInfoV76PointsReport.log(Status.INFO,"Shipping Information V-76 brand products(NFR Brand product) status");
        confirm.clickCart();                //Click on cart button

        confirm.clickCheckoutBtn();         //Click on "Checkout" button
        try {
            String shippingInfo = confirm.validateShippingInformation();
            Assert.assertEquals(shippingInfo, "SHIPPING INFORMATION");
            System.out.println("Shipping info tab V-76 brand products(NFR Brand product) executed Successfully " + shippingInfo);
            shippingInfoV76PointsReport.pass("Shipping information module V-76 brand products(NFR Brand product) executed successfully");
        } catch (AssertionError shipInfoException) {
            System.out.println("Shipping info tab failed due to " + shipInfoException);
            shippingInfoV76PointsReport.fail("Shipping information module V-76 brand products(NFR Brand product) failed to execute "+ shipInfoException);
        }
        shippingInfoV76PointsReport.info("Shipping Information V-76 brand products(NFR Brand product) test ends");
    }
    @Test(description = "SHIPPING INFORMATION Order(s) with only V-76 brand products (NFR Product and retail $)", groups={"ShippingInformation"})
    public void ShippingInformationTestV76Both() throws Throwable {

        ExtentTest shippingInfoV76BothReport = extent.createTest("Shipping Information Module V-76 brand products (NFR Product and retail $)","This is to test the Shipping Information module");

        AddToCartPageTest addCart = new AddToCartPageTest();

        addCart.addToCartV76Both();            //This function logins, navigate to a brand, click on a product & buy
        shippingInfoV76BothReport.log(Status.INFO,"V-76 brand products (NFR Product and retail $) status");

        ShippingInformation confirm = new ShippingInformation();

        shippingInfoV76BothReport.log(Status.INFO,"Shipping Information V-76 brand products (NFR Product and retail $) status");
        confirm.clickCart();                //Click on cart button

        confirm.clickCheckoutBtn();         //Click on "Checkout" button
        try {
            String shippingInfo = confirm.validateShippingInformation();
            Assert.assertEquals(shippingInfo, "SHIPPING INFORMATION");
            System.out.println("Shipping info V-76 brand products (NFR Product and retail $) tab executed Successfully " + shippingInfo);
            shippingInfoV76BothReport.pass("Shipping information module V-76 brand products (NFR Product and retail $) test ends executed successfully");
        } catch (AssertionError shipInfoException) {
            System.out.println("Shipping info tab failed due to " + shipInfoException);
            shippingInfoV76BothReport.fail("Shipping information module V-76 brand products (NFR Product and retail $) failed to execute "+ shipInfoException);
        }
        shippingInfoV76BothReport.info("Shipping Information V-76 brand products (NFR Product and retail $) test ends");
    }

}
