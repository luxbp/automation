package com.mystore.pageobjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import com.mystore.actiondriver.Action;
import com.mystore.base.BaseClass;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ShippingInformation extends BaseClass {
    @FindBy(xpath = "(//a[@href='/cart'])[1]")  //Click on Cart button
    WebElement clickCartBtn;

    @FindBy(xpath = "//*[@class=\'ss-gizmo checkout-icon ss-right absolute text-h5\']")  //Click on Checkout Button on SHIPPING INFORMATION
    WebElement checkoutBtn;
    @FindBy(xpath = "(//*[@class='step-title mb-0 cursor-default text-white block font-black text-base leading-none uppercase tracking-xl'])[1]")
    WebElement verifyShippingInfo;

    public ShippingInformation() {
        PageFactory.initElements(driver, this);
    }

    public void clickCart() throws InterruptedException {

/*        WebDriverWait waitCart = new WebDriverWait(driver, 10);
        waitCart.until(ExpectedConditions.visibilityOf(clickCartBtn));*/
        Thread.sleep(8000);
        clickCartBtn.click();
    }

    public void clickCheckoutBtn() throws InterruptedException {
        WebDriverWait waitClickCheckoutBtn = new WebDriverWait(driver, 5);
        waitClickCheckoutBtn.until(ExpectedConditions.visibilityOf(checkoutBtn));
        checkoutBtn.click();

        WebDriverWait waitShipment = new WebDriverWait(driver, 5);
        waitShipment.until(ExpectedConditions.visibilityOf((verifyShippingInfo)));
    }

    public String validateShippingInformation() {

        String message = verifyShippingInfo.getText();
        System.out.println("Shipping info success -> " + message);
        return message;
    }
}
