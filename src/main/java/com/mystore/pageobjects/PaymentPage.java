package com.mystore.pageobjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.mystore.base.BaseClass;

public class PaymentPage extends BaseClass {

	@FindBy(xpath = "(//*[@class='step-title mb-0 cursor-default text-white block font-black text-base leading-none uppercase tracking-xl'])[3]")
	WebElement verifyPaymentInfo;

	@FindBy(xpath = "//span[contains(text(),'Continue')]")  //Click on Checkout Button on SHIPPING METHOD
	WebElement clickContinue;

	public PaymentPage() {
		PageFactory.initElements(driver, this);
	}

	public String validatePaymentInfo(){
		String message = verifyPaymentInfo.getText();
		System.out.println("Payment info success -> "+message);
		return message;
	}
	public void clickSecondContinueBtn() throws InterruptedException {
		clickContinue.click();
	}
}
