package com.luxbp.pageobjects.AddToCartPage.V76;

import com.aventstack.extentreports.ExtentTest;
import com.luxbp.actiondriver.Action;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import com.luxbp.base.BaseClass;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class AddToCartPageV76SameItemBoth extends BaseClass {

    @FindBy(xpath = "//*[@class='ss-gizmo ss-delete text-dark text-2h6 opacity-40 hover:opacity-100 slow-color-change leading-none icon-lg']")
    WebElement closeVerifyMessage;
    @FindBy(xpath = "//span[text()='Products']")  //Click on Products dropdown
    WebElement products;

 /*   @FindBy(xpath = "//*[@data-id='icon-rco']")            //Click R+CO brand
    WebElement rCO;*/

    @FindBy(xpath = "(//a[@data-testid='productLink'])[28]")
    WebElement prod;

    @FindBy(xpath = "//*[contains(@class,'product__name')]")
    WebElement verifyProductNamePoints;

    @FindBy(xpath = "(//*[@class='ss-gizmo absolute mr-6 -mt-1.5 right-0 top-50% leading-none ss-right'])[1]")    //Click buy with Points
    WebElement buyWithPoints;

    @FindBy(xpath = "(//*[@class='ss-gizmo absolute mr-6 -mt-1.5 right-0 top-50% leading-none ss-right'])[2]")    //Click buy with Points
    WebElement buyWithDollar;

    @FindBy(xpath = "//a[@href='/brands/v76/not-for-resale']")        //Click Redeem
    WebElement redeemYourPointsV76;

    @FindBy(xpath = "//*[@class='notification border-box text-dark error']")        //Error notification
    WebElement notifyErrorMesg;
    @FindBy(xpath = "//*[@data-testid='notificationMessage']")       //Notification bar
    WebElement notify;

    @FindBy(xpath = "(//*[@type=\'button\'])[4]")
    WebElement prodString;
    String passMesg = "Product has been added to the cart!";

    ExtentTest addToCartV76SameItemReport = extent.createTest("V76 Same product test functionality");

    public AddToCartPageV76SameItemBoth() {
        PageFactory.initElements(driver, this);
    }

    public void clickProductV76Item() throws InterruptedException {
        Thread.sleep(5000);

        WebDriverWait waitAlter1 = new WebDriverWait(driver, 5);
        waitAlter1.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//span[text()='Products']")));

        Action.click(driver, products);

        driver.findElement(By.cssSelector("a[href='/brands/v76'][target='']")).click();
//		v76.click();
        WebDriverWait waitRedeem = new WebDriverWait(driver, 5);
        waitRedeem.until(ExpectedConditions.visibilityOf(redeemYourPointsV76));
        redeemYourPointsV76.click();
        Thread.sleep(8000);
    }

    public void prodPoint() {
        WebDriverWait waitRedeemProd = new WebDriverWait(driver, 5);
        waitRedeemProd.until(ExpectedConditions.visibilityOf(prod));
        prod.click();
    }

    public void addViaPoint() throws InterruptedException {
        buyWithPoints.click();

        String validateMesg = notify.getText().trim();
        System.out.println("Result " + validateMesg);
        String failMesg = "You don't have sufficient points for this product";
        if (validateMesg.contains(failMesg)) {
            System.out.println("Not enough points");
            addToCartV76SameItemReport.fail("Not enough points");
        } else {
            addToCartV76SameItemReport.pass("Product added via NFR Points");
            System.out.println("Product added via NFR Points");
        }

    /*    String buyBtnExpectedMesg = "OUT OF STOCK";
        String buyBtnActualMesg = prodString.getText();

   *//*     WebDriverWait waitRedeemProd = new WebDriverWait(driver, 5);
        waitRedeemProd.until(ExpectedConditions.visibilityOf(buyWithPoints));*//*
        if (buyBtnActualMesg.equals(buyBtnExpectedMesg)) {
            System.out.println("Product is out of stock");
            addToCartV76SameItemReport.fail("Product is out of stock");
            tearDown();

        } else {
            buyWithPoints.click();
        }*/
    }

    public void addViaDollar() throws InterruptedException {
       /* WebDriverWait waitRedeemProd = new WebDriverWait(driver, 5);
        waitRedeemProd.until(ExpectedConditions.visibilityOf(notifyErrorMesg));*/
        buyWithDollar.click();
    }

    public String getItemNameV76Item() {
      /*  WebDriverWait waitItem = new WebDriverWait(driver, 5);
        waitItem.until(ExpectedConditions.visibilityOf(prod));*/
        String message = prod.getText();
        System.out.println("Product Name -> " + message);
        return message;
    }

    public String validateAddProductItem() {
 /*       WebDriverWait waitAlter = new WebDriverWait(driver, 5);
        waitAlter.until(ExpectedConditions.visibilityOf(closeVerifyMessage));*/
        String message = verifyProductNamePoints.getText();
        System.out.println("Expected item name -> " + message);
        return message;
    }
}

