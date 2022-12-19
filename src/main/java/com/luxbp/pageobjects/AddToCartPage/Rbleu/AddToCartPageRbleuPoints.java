package com.luxbp.pageobjects.AddToCartPage.Rbleu;

import com.aventstack.extentreports.ExtentTest;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import com.luxbp.base.BaseClass;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class AddToCartPageRbleuPoints extends BaseClass {

    @FindBy(xpath = "//span[text()='Products']")  //Click on Products dropdown
    WebElement products;

    @FindBy(xpath = "//*[@data-id='icon-rco-bleu']")            //Click R+CO brand
    WebElement rBleu;

    @FindBy(xpath = "//a[@href='/brands/bleu/not-for-resale']")     //Click Redeem your points button
    WebElement redeemYourPointsRbleu;

    @FindBy(xpath = "(//a[@data-testid='productLink'])[2]")     //Click product
    WebElement prodPoint;
    @FindBy(xpath = "//*[@class='ss-gizmo absolute mr-6 -mt-1.5 right-0 top-50% leading-none ss-right']")  //Click on Buy button
    WebElement buyWithPoints;

    @FindBy(xpath = "//*[@class='ss-gizmo ss-delete text-dark text-2h6 opacity-40 hover:opacity-100 slow-color-change leading-none icon-lg']")
    WebElement closeVerifyMessage;

    @FindBy(xpath = "//*[contains(@class,'product__name')]")
    WebElement verifyProductName;
    @FindBy(xpath = "(//*[@type=\'button\'])[4]")
    WebElement prodString;

    @FindBy(xpath = "//*[@data-testid='notificationMessage']")       //Notification bar
    WebElement notify;

    @FindBy(xpath = "(//*[@type='button'])[5]")    //Click buy with Points
    WebElement buyWithDollar;

    ExtentTest addToCartRbleuPointsReport = extent.createTest("R+co Bleu points test functionality");


    public AddToCartPageRbleuPoints() {
        PageFactory.initElements(driver, this);
    }

    public void clickProductRbluePoints() throws InterruptedException {
        Thread.sleep(5000);
        WebDriverWait waitRblue = new WebDriverWait(driver, 5);
        waitRblue.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//span[text()='Products']")));
        products.click();
        driver.findElement(By.cssSelector("a[href='/brands/bleu'][target='']")).click();

//        rBleu.click();
    }

    public void clickRedeemRbleu() throws InterruptedException {
        redeemYourPointsRbleu.click();
        Thread.sleep(5000);

   /*     String buyBtnExpectedMesg = "OUT OF STOCK";
        String buyBtnActualMesg = prodString.getText();

*//*        WebDriverWait waitRedeem = new WebDriverWait(driver, 5);
        waitRedeem.until(ExpectedConditions.visibilityOf(redeemYourPointsRbleu));*//*
        if (buyBtnActualMesg.equals(buyBtnExpectedMesg)) {
            System.out.println("Product is out of stock");
            addToCartRbleuPointsReport.fail("Product is out of stock");
            tearDown();
        } else {
            Thread.sleep(8000);
            prodPoint.click();
            addToCartRbleuPointsReport.pass("Product added successfully");
        }*/
    }

    public void prodPoint() {
        WebDriverWait waitRedeemProd = new WebDriverWait(driver, 5);
        waitRedeemProd.until(ExpectedConditions.visibilityOf(prodPoint));
        prodPoint.click();
    }

    public void buyProdPoint() {

        WebDriverWait waitRedeemProd = new WebDriverWait(driver, 5);
        waitRedeemProd.until(ExpectedConditions.visibilityOf(buyWithPoints));
        buyWithPoints.click();

        String validateMesg = notify.getText().trim();
        System.out.println("Result " + validateMesg);
        String failMesg = "You don't have sufficient points for this product";
        if (validateMesg.contains(failMesg)) {
            System.out.println("Not enough points, continuing with retail $");
            addToCartRbleuPointsReport.fail("Not enough points, continuing with retail $");
            buyWithDollar.click();
            addToCartRbleuPointsReport.pass("Product added successfully via retail $");
        } else {
            addToCartRbleuPointsReport.pass("Product added via NFR Points");
            System.out.println("Product added via NFR Points");
        }


/*        String buyBtnExpectedMesg = "OUT OF STOCK";
        String buyBtnActualMesg = prodString.getText();

        if (buyBtnActualMesg.equals(buyBtnExpectedMesg)) {
            System.out.println("Product is out of stock");
            tearDown();
        } else {
            WebDriverWait waitRedeemProd = new WebDriverWait(driver, 5);
            waitRedeemProd.until(ExpectedConditions.visibilityOf(buyWithPoints));
            buyWithPoints.click();
        }*/
    }

    public String getItemNameRbluePoints() {
       /* WebDriverWait waitItem = new WebDriverWait(driver, 5);
        waitItem.until(ExpectedConditions.visibilityOf(prodPoint));*/
        String message = prodPoint.getText();
        System.out.println("Product Name -> " + message);
        return message;
    }

    public String validateAddProductPoints() {
/*        WebDriverWait waitAlter = new WebDriverWait(driver, 5);
        waitAlter.until(ExpectedConditions.visibilityOf(closeVerifyMessage));*/
        String message = verifyProductName.getText();
        System.out.println("Expected item name -> " + message);
        return message;
    }

}
