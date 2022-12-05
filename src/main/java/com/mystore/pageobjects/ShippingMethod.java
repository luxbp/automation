package com.mystore.pageobjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.mystore.actiondriver.Action;
import com.mystore.base.BaseClass;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ShippingMethod extends BaseClass {

	@FindBy(xpath = "//span[contains(text(),'Continue')]")  //Click on Checkout Button on SHIPPING METHOD
	WebElement clickContinue;

	@FindBy(xpath = "(//*[@class='step-title mb-0 cursor-default text-white block font-black text-base leading-none uppercase tracking-xl'])[2]")
	WebElement verifyshippingMethodInfo;

	public ShippingMethod() {
		PageFactory.initElements(driver, this);
	}

	public void clickFirstContinueBtn() throws InterruptedException {
		WebDriverWait waitClickFirstContinueBtn = new WebDriverWait(driver, 3);
		waitClickFirstContinueBtn.until(ExpectedConditions.visibilityOf(clickContinue));
		clickContinue.click();
	}
	public String validateShippingMethodInfo(){

		String message = verifyshippingMethodInfo.getText();
		System.out.println("Shipping Method success-> "+message);
		return message;
	}


}
