package com.luxbp.pageobjects;

import com.aventstack.extentreports.ExtentTest;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import com.luxbp.base.BaseClass;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ShippingInformation extends BaseClass {
    @FindBy(xpath = "(//a[@href='/cart'])[1]")  //Click on Cart button
    WebElement clickCartBtn;

    @FindBy(xpath = "(//*[@class='pro_checkout_sp hidden font-serif font-black text-h2 leading-none text-dark capitalize mb-6 md:block'])")     //To verify "Your Cart" text
    WebElement yourCart;

    @FindBy(xpath = "//*[@class=\'ss-gizmo checkout-icon ss-right absolute text-h5\']")  //Click on Checkout Button on SHIPPING INFORMATION
    WebElement checkoutBtn;
    @FindBy(xpath = "(//*[@class='step-title mb-0 cursor-default text-white block font-black text-base leading-none uppercase tracking-xl'])[1]")
    WebElement verifyShippingInfo;

    ExtentTest shippingInfoModuleReport = extent.createTest("Shipping Info Module", "This is test to validate Shipping Information Module");

    public ShippingInformation() {
        PageFactory.initElements(driver, this);
    }

    public void clickCart() throws InterruptedException {

/*        WebDriverWait waitCart = new WebDriverWait(driver, 10);
        waitCart.until(ExpectedConditions.visibilityOf(clickCartBtn));*/

            Thread.sleep(8000);
            clickCartBtn.click();
            if (yourCart.isDisplayed()) {
                shippingInfoModuleReport.pass("Add to cart page validated");
            } else {
                shippingInfoModuleReport.fail("Couldn't navigate to Add to cart page");
            }
    }

    public void clickCheckoutBtn() throws InterruptedException {
        WebDriverWait waitClickCheckoutBtn = new WebDriverWait(driver, 5);
        waitClickCheckoutBtn.until(ExpectedConditions.visibilityOf(checkoutBtn));
        try {
            checkoutBtn.click();
            shippingInfoModuleReport.pass("Navigated to shipping information");
        }
        catch(Exception e){
            shippingInfoModuleReport.fail("Failed to click checkout button");
            System.out.println("Shipping Information failed "+e);
        }
        WebDriverWait waitShipment = new WebDriverWait(driver, 5);
        waitShipment.until(ExpectedConditions.visibilityOf((verifyShippingInfo)));
    }

    public String validateShippingInformation() {

        String message = verifyShippingInfo.getText();
        System.out.println("Shipping info success -> " + message);
        return message;
    }
}
