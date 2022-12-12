package com.luxbp.pageobjects;

import com.aventstack.extentreports.ExtentTest;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.luxbp.base.BaseClass;

public class OrderSummary extends BaseClass {


    @FindBy(xpath = "//*[@class='font-black text-caption leading-h2 text-black font-serif mb-10']")
    WebElement verifyOrder;
    @FindBy(xpath = "//*[@class='mx-auto bg-white border border-solid border-black px-10 py-4 text-center text-h5 uppercase tracking-sm md:w-1/3 mb-10 text-black flex justify-center items-center']/span")  //Get ORDER NUMBER
    WebElement orderNumber;
    @FindBy(xpath = "//*[@class='text-base']")  //Click on CONTINUE
    WebElement lastContinue;

    ExtentTest orderSummaryReport = extent.createTest("Order Summary Module", "This is test to validate Order Summary Module");

    public OrderSummary() {
        PageFactory.initElements(driver, this);
    }

    public String validateOrder() {

        String message = verifyOrder.getText();
        System.out.println("Success-> " + message);
        return message;
    }

    public void lastContinueBtn() throws InterruptedException {
        try {
            String a = orderNumber.getText();
            orderSummaryReport.info("Your order number is " + a);
            System.out.println("Your order number is" + a);
        } catch (Exception e) {
            System.out.println("Couldn't get the order number cause of " + e);
        }
        try {
            lastContinue.click();
            orderSummaryReport.pass("Product checkout successfully");
        } catch (Exception e) {
            orderSummaryReport.fail("Failed to continue " + e);
            System.out.println("Failed to continue " + e);
        }
    }
}
