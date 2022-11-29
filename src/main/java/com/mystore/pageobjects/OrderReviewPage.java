package com.mystore.pageobjects;

import com.mystore.base.BaseClass;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class OrderReviewPage extends BaseClass {

    @FindBy(xpath = "(//*[@class='step-title mb-0 cursor-default text-white block font-black text-base leading-none uppercase tracking-xl'])[4]")
    WebElement verifyOrderReview;

    @FindBy(xpath = "//span[contains(text(),'Place order')]")  //Click on PLACE ORDER on ORDER REVIEW
    WebElement placeOrder;
    @FindBy(xpath = "//*[@class='mx-auto bg-white border border-solid border-black px-10 py-4 text-center text-h5 uppercase tracking-sm md:w-1/3 mb-10 text-black flex justify-center items-center']/span")  //Get ORDER NUMBER
    WebElement orderNumber;

    public String validateOrderReview() {PageFactory.initElements(driver, this);

        String message = verifyOrderReview.getText();
        System.out.println("Order Review success-> "+message);
        return message;
    }
    public void placeOrderBtn() {
        placeOrder.click();
        WebDriverWait waitLastContinueBtn = new WebDriverWait(driver, 10);
        waitLastContinueBtn.until(ExpectedConditions.visibilityOf(orderNumber));
    }
}
