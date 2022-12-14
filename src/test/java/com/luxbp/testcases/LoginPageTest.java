/*
package com.luxbp.testcases;

import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;

import org.testng.Assert;
import org.testng.annotations.Test;
import com.luxbp.base.BaseClass;
import com.luxbp.pageobjects.LoginPage;


public class LoginPageTest extends BaseClass {

	@Test (groups={"Login"})
	public void loginTest() throws Throwable {
		ExtentTest loginReport = extent.createTest("Login test","This is test to validate successful login");

		LoginPage loginTest = new LoginPage();
		loginReport.log(Status.INFO, "Starting Browser");
		loginReport.pass("Navigated to login page");
		loginTest.clickOnsignIn();
		loginTest.login(prop.getProperty("username"),prop.getProperty("password"));
		loginTest.signInButton();
		try {
			String LogInfo = loginTest.validateLogin();

			try {
				Assert.assertEquals("YOU ARE LOGGED IN!", LogInfo);
				System.out.println("Login Successful");
				loginReport.pass("Logged in successfully");

			} catch (AssertionError Ae) {
				loginReport.fail("Login failed due to " + Ae);
				System.out.println("Logged In Failed due to " + Ae);
			}
		} catch (Exception logException) {
			loginReport.fail("Login failed");
			System.out.println("Failed due to " + logException);
			loginReport.fail("Exception failed due to " + logException);
		}
		loginReport.info("Test Complete");
	}
}
*/
