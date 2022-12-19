package com.luxbp.pageobjects.AddToCartPage.Rbleu;

import com.aventstack.extentreports.ExtentTest;
import com.luxbp.actiondriver.Action;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import com.luxbp.base.BaseClass;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class AddToCartPageRbleuSameItemBoth extends BaseClass {

    @FindBy(xpath = "//*[@class='ss-gizmo ss-delete text-dark text-2h6 opacity-40 hover:opacity-100 slow-color-change leading-none icon-lg']")
    WebElement closeVerifyMessage;
    @FindBy(xpath = "//span[text()='Products']")  //Click on Products dropdown
    WebElement products;

    @FindBy(xpath = "//*[@data-id='icon-rco']")            //Click R+CO brand
    WebElement rCO;
    @FindBy(xpath = "(//a[@data-testid='productLink'])[14]")
    WebElement prod;

    @FindBy(xpath = "//*[contains(@class,'product__name')]")
    WebElement verifyProductNamePoints;

    @FindBy(xpath = "(//*[@class='ss-gizmo absolute mr-6 -mt-1.5 right-0 top-50% leading-none ss-right'])[1]")    //Click buy with Points
    WebElement buyWithPoints;
    @FindBy(xpath = "(//*[@type=\'button\'])[4]")
    WebElement prodString;
    @FindBy(xpath = "(//*[@class='ss-gizmo absolute mr-6 -mt-1.5 right-0 top-50% leading-none ss-right'])[2]")    //Click buy with Points
    WebElement buyWithDollar;

    @FindBy(xpath = "//a[@href='/brands/bleu/not-for-resale']")        //Click Redeem
    WebElement redeemYourPointsRco;

    @FindBy(xpath = "//*[@data-testid='notificationMessage']")       //Notification bar
    WebElement notify;
    String failMesg = "You don't have sufficient points for this product";
    String passMesg = "Product has been added to the cart!";
    ExtentTest addToCartRleuSameBothReport = extent.createTest("R+Co Blue same item NFR & Retail $ test functionality");


    public AddToCartPageRbleuSameItemBoth() {
        PageFactory.initElements(driver, this);
    }

    public void clickProductRbleuItem() throws InterruptedException {

        WebDriverWait waitAlter1 = new WebDriverWait(driver, 5);
        waitAlter1.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//span[text()='Products']")));
        Thread.sleep(5000);

        Action.click(driver, products);

        driver.findElement(By.cssSelector("a[href='/brands/bleu'][target='']")).click();
//		rBlu.click();
        WebDriverWait waitRedeem = new WebDriverWait(driver, 5);
        waitRedeem.until(ExpectedConditions.visibilityOf(redeemYourPointsRco));
        redeemYourPointsRco.click();
        Thread.sleep(8000);
    }

    public void prodPoint() {
        WebDriverWait waitRedeemProd = new WebDriverWait(driver, 5);
        waitRedeemProd.until(ExpectedConditions.visibilityOf(prod));
        prod.click();
    }

    public void addViaPoint() throws InterruptedException {
/*        WebDriverWait waitRedeemProd = new WebDriverWait(driver, 5);
        waitRedeemProd.until(ExpectedConditions.visibilityOf(buyWithPoints));*/
        buyWithPoints.click();

        String validateMesg = notify.getText().trim();
        System.out.println("Result " + validateMesg);
        String failMesg = "You don't have sufficient points for this product";
        if (validateMesg.contains(failMesg)) {
            System.out.println("Not enough points");
            addToCartRleuSameBothReport.fail("Not enough point");
        } else {
            addToCartRleuSameBothReport.pass("Product added via NFR Points");
            System.out.println("Product added via NFR Points");
        }
    }

 /*       String buyBtnExpectedMesg = "OUT OF STOCK";
        String buyBtnActualMesg = prodString.getText();

        if (buyBtnActualMesg.equals(buyBtnExpectedMesg)) {
            System.out.println("Product is out of stock");
            addToCartRleuSameBothReport.fail("Product is out of stock");
            tearDown();
        } else {
            buyWithPoints.click();
            addToCartRleuSameBothReport.pass("Product added successfully");
        }*/


    public void addViaDollar() throws InterruptedException {
        buyWithDollar.click();
        addToCartRleuSameBothReport.pass("Product added successfully via Retail $");
/*        String buyBtnExpectedMesg = "OUT OF STOCK";
        String buyBtnActualMesg = prodString.getText();

     *//*   WebDriverWait waitRedeemProd = new WebDriverWait(driver, 5);
        waitRedeemProd.until(ExpectedConditions.invisibilityOf(notifyMesg));*//*
        if (buyBtnActualMesg.equals(buyBtnExpectedMesg)) {
            System.out.println("Product is out of stock");
            addToCartRleuSameBothReport.fail("Product is out of stock");
            tearDown();
        } else {
            buyWithDollar.click();
            addToCartRleuSameBothReport.fail("Product added successfully");
        }*/
    }

    public String getItemNameRbleuItem() {
        /*WebDriverWait waitItem = new WebDriverWait(driver, 5);
        waitItem.until(ExpectedConditions.visibilityOf(prod));*/
        String message = prod.getText();
        System.out.println("Product Name -> " + message);
        return message;
    }

    public String validateAddProductItem() {
/*        WebDriverWait waitAlter = new WebDriverWait(driver, 5);
        waitAlter.until(ExpectedConditions.visibilityOf(closeVerifyMessage));*/
        String message = verifyProductNamePoints.getText();
        System.out.println("Expected item name -> " + message);
        return message;
    }
}

