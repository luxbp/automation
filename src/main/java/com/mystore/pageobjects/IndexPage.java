package com.mystore.pageobjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.mystore.actiondriver.Action;
import com.mystore.base.BaseClass;

public class IndexPage extends BaseClass {

	@FindBy(xpath = "//*[contains(text(),'Sign In')]")   //Click on Sign in button
	WebElement signInBtn;

	public IndexPage() {
		PageFactory.initElements(driver, this);
	}
/*	public LoginPage clickOnsignIn()  {
		Action.click(driver, signInBtn);
		return new LoginPage();
	}*/


}
