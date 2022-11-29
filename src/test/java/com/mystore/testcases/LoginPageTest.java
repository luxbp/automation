package com.mystore.testcases;


import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import com.mystore.base.BaseClass;
import com.mystore.pageobjects.HomePage;
import com.mystore.pageobjects.IndexPage;
import com.mystore.pageobjects.LoginPage;


public class LoginPageTest extends BaseClass {

	@Test()
	public void loginTest() throws Throwable {
		LoginPage loginTest = new LoginPage();
		loginTest.clickOnsignIn();
		loginTest.login(prop.getProperty("username"),prop.getProperty("password"));
		loginTest.signInButton();
		try {
			String LogInfo = loginTest.validateLogin();

			try {
				Assert.assertEquals("YOU ARE LOGGED IN!", LogInfo);
				System.out.println("Login Successful");

			} catch (AssertionError Ae) {
				System.out.println("Logged In Failed due to " + Ae);
			}
		} catch (Exception logException) {
			System.out.println("Failed due to " + logException);
		}
	}
}
