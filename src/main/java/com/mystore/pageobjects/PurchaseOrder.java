package com.mystore.pageobjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.mystore.actiondriver.Action;
import com.mystore.base.BaseClass;
import org.testng.annotations.BeforeTest;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class PurchaseOrder extends BaseClass {
	@FindBy(xpath = "//input[@type='text']")  //Purchase Order Number
	WebElement purchaseOrderNumber;

	@FindBy(xpath = "//span[contains(text(),'Continue')]")  //Click on Checkout Button on SHIPPING METHOD
	WebElement clickContinue;


	@BeforeTest
	public void loadConfig() {
		try {
			prop = new Properties();
			FileInputStream ip = new FileInputStream(
					System.getProperty("user.dir") + "\\Configuration\\Config.properties");
			prop.load(ip);
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}


	public PurchaseOrder() {
		PageFactory.initElements(driver, this);
	}

	public void enterPurchaseOrderNumber() {
		purchaseOrderNumber.sendKeys(prop.getProperty("purchaseordernumber"));
		clickContinue.click();
	}

}
