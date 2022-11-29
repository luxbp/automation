
package com.mystore.pageobjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import com.mystore.actiondriver.Action;
import com.mystore.base.BaseClass;

public class HomePage extends BaseClass {
	Action action = new Action();


	public HomePage() {
		PageFactory.initElements(driver, this);
	}



	public String getCurrURL() {
		String homePageURL = driver.getCurrentUrl();
		return homePageURL;
	}
}

