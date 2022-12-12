package com.luxbp.pageobjects;

import com.aventstack.extentreports.ExtentTest;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.luxbp.base.BaseClass;



public class PurchaseOrder extends BaseClass {
	@FindBy(xpath = "//input[@type='text']")  //Purchase Order Number
	WebElement purchaseOrderNumber;

	@FindBy(xpath = "//span[contains(text(),'Continue')]")  //Click on Checkout Button on SHIPPING METHOD
	WebElement clickContinue;

	ExtentTest purchaseOrderReport = extent.createTest("Purchase Order tab", "This is test to validate purchase order tab");

	public PurchaseOrder() {
		PageFactory.initElements(driver, this);
	}

	public void enterPurchaseOrderNumber() {
	if(purchaseOrderNumber.isDisplayed()){
		purchaseOrderReport.pass("Entering purchase order");
	}
	else{
		purchaseOrderReport.fail("Couldn't get purchase order text field");
	}
		String pNo= prop.getProperty("PurchaseOrderNumber");
		try {
			purchaseOrderNumber.sendKeys(pNo);
			purchaseOrderReport.pass("Successfully entered value " + pNo);
			System.out.println("Purchase order number is " + pNo);
		}
		catch(Exception e){
			purchaseOrderReport.fail("Couldn't enter purchase order value "+e);
			System.out.println("Couldn't enter purchase order value "+e);
		}

		clickContinue.click();
	}

}