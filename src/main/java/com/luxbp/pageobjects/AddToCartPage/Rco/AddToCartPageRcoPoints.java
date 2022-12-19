package com.luxbp.pageobjects.AddToCartPage.Rco;

import com.aventstack.extentreports.ExtentTest;
import com.luxbp.actiondriver.Action;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import com.luxbp.base.BaseClass;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class AddToCartPageRcoPoints extends BaseClass {

    @FindBy(xpath = "//*[@class='ss-gizmo ss-delete text-dark text-2h6 opacity-40 hover:opacity-100 slow-color-change leading-none icon-lg']")
    WebElement closeVerifyMessage;
    @FindBy(xpath = "//span[text()='Products']")  //Click on Products dropdown
    WebElement products;

    @FindBy(xpath = "//*[@data-id='icon-rco']")            //Click R+CO brand
    WebElement rCO;

    @FindBy(xpath = "(//a[@data-testid='productLink'])[6]")
    WebElement prodPoint;

    @FindBy(xpath = "//*[contains(@class,'product__name')]")
    WebElement verifyProductNamePoints;

    @FindBy(xpath = "(//*[@class='ss-gizmo absolute mr-6 -mt-1.5 right-0 top-50% leading-none ss-right'])[1]")    //Click buy with Points
    WebElement buyWithPoints;

    @FindBy(xpath = "//a[@href='/brands/r-and-co/not-for-resale']")        //Click Redeem
    WebElement redeemYourPointsRco;

    @FindBy(xpath = "(//*[@type='button'])[5]")    //Click buy with Points
    WebElement buyWithDollar;
    @FindBy(xpath = "(//*[@type=\'button\'])[4]")
    WebElement prodString;
    @FindBy(xpath = "//*[@data-testid='notificationMessage']")       //Notification bar
    WebElement notify;
    ExtentTest addToCartRcoPointsReport = extent.createTest("R+co functionality Test");

    public AddToCartPageRcoPoints() {
        PageFactory.initElements(driver, this);
    }

    public void clickProductRplusCoPoint() throws InterruptedException {

        WebDriverWait waitAlter1 = new WebDriverWait(driver, 5);
        waitAlter1.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//span[text()='Products']")));
        Thread.sleep(5000);

        Action.click(driver, products);

        driver.findElement(By.cssSelector("a[href='/brands/r-and-co'][target='']")).click();
//        rCO.click();
    }

    public void clickRedeemRco() throws InterruptedException {
        redeemYourPointsRco.click();
        Thread.sleep(10000);        //Need to add thread as there are no other elements for explicit wait
    }

    public void prodPoint(){
        WebDriverWait waitRedeemProd = new WebDriverWait(driver, 5);
        waitRedeemProd.until(ExpectedConditions.visibilityOf(prodPoint));
        prodPoint.click();
    }

    public void buyProdPoint() throws InterruptedException {
        WebDriverWait waitRedeemProd = new WebDriverWait(driver, 5);
        waitRedeemProd.until(ExpectedConditions.visibilityOf(buyWithPoints));
        buyWithPoints.click();
        String validateMesg = notify.getText().trim();
        System.out.println("Result " + validateMesg);
        String failMesg = "You don't have sufficient points for this product";
        if (validateMesg.contains(failMesg)) {
            System.out.println("Not enough points, continuing with retail $");
            addToCartRcoPointsReport.fail("Not enough points, continuing with retail $");
            buyWithDollar.click();
            addToCartRcoPointsReport.pass("Product added successfully");
        }
    }
 /*       String buyBtnExpectedMesg = "OUT OF STOCK";
        String buyBtnActualMesg = prodString.getText();

        if (buyBtnActualMesg.equals(buyBtnExpectedMesg)) {
            System.out.println("Product is out of stock");
            addToCartRcoPointsReport.fail("Product is out of stock");
            tearDown();
        } else {
            Thread.sleep(5000);
            buyWithPoints.click();


            System.out.println("Result "+ validateMesg);
            if (validateMesg.equals(failMesg))
            System.out.println("Not enough points, continuing with retail $");
            addToCartRcoPointsReport.fail("Not enough points, continuing with retail $");

            AddToCartPageRcoSameItemBoth rBoth = new AddToCartPageRcoSameItemBoth();
            rBoth.addViaDollar();*/


        public String getItemNameRplusCoPoints () {
    /*    WebDriverWait waitItem = new WebDriverWait(driver, 5);
        waitItem.until(ExpectedConditions.visibilityOf(prodPoint));*/
            String message = prodPoint.getText().trim();
            System.out.println("Product Name -> " + message);
            return message;
        }

        public String validateAddProduct () {
/*        WebDriverWait waitAlter = new WebDriverWait(driver, 5);
        waitAlter.until(ExpectedConditions.visibilityOf(closeVerifyMessage));*/
            String message = verifyProductNamePoints.getText().trim();
            System.out.println("Expected item name -> " + message);
            return message;
        }
    }

