package com.luxbp.pageobjects;

import com.aventstack.extentreports.ExtentTest;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.luxbp.base.BaseClass;

public class PaymentPage extends BaseClass {

	@FindBy(xpath = "(//*[@class='step-title mb-0 cursor-default text-white block font-black text-base leading-none uppercase tracking-xl'])[3]")
	WebElement verifyPaymentInfo;

	@FindBy(xpath = "//span[contains(text(),'Continue')]")  //Click on Checkout Button on SHIPPING METHOD
	WebElement clickContinue;

	ExtentTest paymentReport = extent.createTest("Payment Info Module", "This is test to validate Payment Information Module");


	public PaymentPage() {
		PageFactory.initElements(driver, this);
	}

	public String validatePaymentInfo(){
		String message = verifyPaymentInfo.getText();
		System.out.println("Payment info success -> "+message);
		return message;
	}
	public void clickSecondContinueBtn() throws InterruptedException {
		if (verifyPaymentInfo.isDisplayed()) {
			paymentReport.pass("Payment Information module pass " + verifyPaymentInfo);
		} else {
			paymentReport.fail("Payment Information module failed to load");
		}
		try {
			clickContinue.click();
			paymentReport.info("Proceeding to enter Purchase Order number");
		} catch (Exception e) {
			paymentReport.warning("Failed to execute " + e);
			System.out.println("Payment Information failed to executed due to " + e);
		}
	}
}
