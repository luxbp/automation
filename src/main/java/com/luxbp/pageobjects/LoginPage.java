package com.luxbp.pageobjects;

import com.aventstack.extentreports.ExtentTest;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.safari.SafariDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import com.luxbp.actiondriver.Action;
import com.luxbp.base.BaseClass;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class LoginPage extends BaseClass {


    @FindBy(xpath = "//*[contains(text(),'Sign In')]")   //Click on Sign in button
    WebElement signOn;

    @FindBy(xpath = "//input[@type='email']")  //Click on Email
    WebElement signInEmail;

    @FindBy(xpath = "//input[@type='password']")  //Click on Password
    WebElement signInPassword;

    @FindBy(xpath = "//button[@type='submit']")  //Click on Sign in button
    WebElement signInButton;

    @FindBy(xpath = "//*[@data-testid='notificationMessage']")    //Verify login message
    WebElement verifyLoginMessage;


    @FindBy(xpath = "//*[@class='ss-gizmo ss-delete text-dark text-2h6 opacity-40 hover:opacity-100 slow-color-change leading-none icon-lg']")
    WebElement closeVerifyMessage;

    @FindBy(xpath = "//*[@class='toast-close']")        //Toast close
    WebElement toastClose;

    ExtentTest loginModule = extent.createTest("Login Module", "This is test to validate successful login");

    public LoginPage() {
        PageFactory.initElements(driver, this);
    }

    public void clickOnsignIn() {

        if (driver instanceof SafariDriver) {
            System.out.println("Driver is safari");
            WebDriverWait waitToastMesg = new WebDriverWait(driver, 5);
            waitToastMesg.until(ExpectedConditions.visibilityOf(toastClose));
            toastClose.click();
            signOn.click();
        } else {
            signOn.click();
        }
    }

    public HomePage login(String uname, String pwd) {
        WebDriverWait wait = new WebDriverWait(driver, 5);
        wait.until(ExpectedConditions.visibilityOf(signInEmail));
        Action.type(signInEmail, uname);
        Action.type(signInPassword, pwd);
        return new HomePage();
    }

    public void signInButton() throws InterruptedException {
        signInButton.click();
        if (verifyLoginMessage.isDisplayed()) {
            loginModule.pass("Successfully Logged in");
        } else {
            loginModule.fail("Login failed");
        }
    }

    public String validateLogin() {
        WebDriverWait waitAlter = new WebDriverWait(driver, 5);
        waitAlter.until(ExpectedConditions.visibilityOf(closeVerifyMessage));
        String message = verifyLoginMessage.getText();
        return message;
    }
}