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

public class AddToCartPageV76Points extends BaseClass {

    @FindBy(xpath = "//*[@class='ss-gizmo ss-delete text-dark text-2h6 opacity-40 hover:opacity-100 slow-color-change leading-none icon-lg']")
    WebElement closeVerifyMessage;
    @FindBy(xpath = "//span[text()='Products']")  //Click on Products dropdown
    WebElement products;

    @FindBy(xpath = "(//a[@data-testid='productLink'])[22]")
    WebElement prodPoint;

    @FindBy(xpath = "//*[contains(@class,'product__name')]")
    WebElement verifyProductNamePoints;


    @FindBy(xpath = "(//*[@class='ss-gizmo absolute mr-6 -mt-1.5 right-0 top-50% leading-none ss-right'])[1]")    //Click buy with Points
    WebElement buyWithPoints;

    @FindBy(xpath = "//a[@href='/brands/v76/not-for-resale']")        //Click Redeem
    WebElement redeemYourPointsV76;

    @FindBy(xpath = "(//*[@type=\'button\'])[4]")
    WebElement prodString;

    @FindBy(xpath = "//*[@data-testid='notificationMessage']")       //Notification bar
    WebElement notify;

    @FindBy(xpath = "(//*[@type='button'])[5]")    //Click buy with Points
    WebElement buyWithDollar;

    ExtentTest addToCartV76PointsReport = extent.createTest("V76 NFR points test functionality");

    public AddToCartPageV76Points() {
        PageFactory.initElements(driver, this);
    }

    public void clickProductV76Point() throws InterruptedException {

        WebDriverWait waitAlter1 = new WebDriverWait(driver, 10);
        waitAlter1.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//span[text()='Products']")));
        Thread.sleep(5000);

        Action.click(driver, products);

        driver.findElement(By.cssSelector("a[href='/brands/v76'][target='']")).click();
    }

    public void clickRedeemV76Points() throws InterruptedException {
        redeemYourPointsV76.click();
        Thread.sleep(3000);         //Need to add Thread as there are no other element to explicit wait

    /*    String buyBtnExpectedMesg = "OUT OF STOCK";
        String buyBtnActualMesg = prodString.getText();

        if (buyBtnActualMesg.equals(buyBtnExpectedMesg)) {
            System.out.println("Product is out of stock");
            addToCartV76PointsReport.fail("Product is out of stock");
            tearDown();
        } else {
            prodPoint.click();
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
            System.out.println("Not enough points");
            addToCartV76PointsReport.fail("Not enough points, continuing with retail $");
            buyWithDollar.click();
            addToCartV76PointsReport.pass("Product added successfully via retail $");
        } else {
            addToCartV76PointsReport.pass("Product added via NFR Points");
            System.out.println("Product added via NFR Points");
        }
    }

    public String getItemNameV76Points() {
     /*   WebDriverWait waitItem = new WebDriverWait(driver, 5);
        waitItem.until(ExpectedConditions.visibilityOf(prodPoint));*/
        String message = prodPoint.getText();
        System.out.println("Product Name -> " + message);
        return message;
    }

    public String validateAddProductPoints() {
/*        WebDriverWait waitAlter = new WebDriverWait(driver, 5);
        waitAlter.until(ExpectedConditions.visibilityOf(closeVerifyMessage));*/
        String message = verifyProductNamePoints.getText();
        System.out.println("Expected item name -> " + message);
        return message;
    }
}

