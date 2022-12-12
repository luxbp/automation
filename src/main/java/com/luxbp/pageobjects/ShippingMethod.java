package com.luxbp.pageobjects;

import com.aventstack.extentreports.ExtentTest;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.luxbp.base.BaseClass;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ShippingMethod extends BaseClass {

	@FindBy(xpath = "//span[contains(text(),'Continue')]")  //Click on Checkout Button on SHIPPING METHOD
	WebElement clickContinue;

	@FindBy(xpath = "(//*[@class='step-title mb-0 cursor-default text-white block font-black text-base leading-none uppercase tracking-xl'])[2]")
	WebElement verifyshippingMethodInfo;

	@FindBy(xpath = "(//*[@class='step-title mb-0 cursor-default text-white block font-black text-base leading-none uppercase tracking-xl'])[1]")
	WebElement verifyShippingInfo;

	ExtentTest shippingMethodModuleReport = extent.createTest("Shipping Method Module", "This is test to validate Shipping Method Module");

	public ShippingMethod() {
		PageFactory.initElements(driver, this);
	}

	public void clickFirstContinueBtn() throws InterruptedException {
		if (verifyShippingInfo.isDisplayed()) {
			shippingMethodModuleReport.pass("Shipping Information passed" + verifyShippingInfo);
		} else {
			shippingMethodModuleReport.fail("Shipping method failed to execute");
		}
		WebDriverWait waitClickFirstContinueBtn = new WebDriverWait(driver, 3);
		waitClickFirstContinueBtn.until(ExpectedConditions.visibilityOf(clickContinue));

		try {
			clickContinue.click();
			shippingMethodModuleReport.pass("Proceeding to payment method tab");
		} catch (Exception e) {
			shippingMethodModuleReport.fail("Failed to navigate to payment method tab due to " + e);
			System.out.println("Failed due to " + e);
		}
	}
	public String validateShippingMethodInfo(){

		String message = verifyshippingMethodInfo.getText();
		System.out.println("Shipping Method success-> "+message);
		return message;
	}


}
