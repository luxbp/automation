package com.mystore.pageobjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.mystore.base.BaseClass;



public class PurchaseOrder extends BaseClass {
	@FindBy(xpath = "//input[@type='text']")  //Purchase Order Number
	WebElement purchaseOrderNumber;

	@FindBy(xpath = "//span[contains(text(),'Continue')]")  //Click on Checkout Button on SHIPPING METHOD
	WebElement clickContinue;


	public PurchaseOrder() {
		PageFactory.initElements(driver, this);
	}

	public void enterPurchaseOrderNumber() {
		purchaseOrderNumber.sendKeys(prop.getProperty("PurchaseOrderNumber"));
		System.out.println("Purchase order number is " + purchaseOrderNumber);

		clickContinue.click();
	}

}