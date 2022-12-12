
package com.luxbp.pageobjects;

import org.openqa.selenium.support.PageFactory;
import com.luxbp.actiondriver.Action;
import com.luxbp.base.BaseClass;

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

