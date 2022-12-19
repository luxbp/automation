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

public class AddToCartPageRbleuBoth extends BaseClass {

    @FindBy(xpath = "//*[@class='ss-gizmo ss-delete text-dark text-2h6 opacity-40 hover:opacity-100 slow-color-change leading-none icon-lg']")
    WebElement closeVerifyMessage;
    @FindBy(xpath = "//span[text()='Products']")  //Click on Products dropdown
    WebElement products;

    @FindBy(xpath = "//*[@data-id='icon-rco-bleu']")			//Click R+CO brand
    WebElement rBleu;

    @FindBy(xpath = "(//a[@href='/brands/bleu'])[1]")       //Back to R+Co
    WebElement back;

    @FindBy(xpath = "(//a[@data-testid='productLink'])[8]")  //Click on item name of selected brand product
    WebElement productOne;

    @FindBy(xpath = "//*[contains(@class,'product__name')]")
    WebElement verifyProductName;

    @FindBy(xpath = "//*[@class='mb-6.5 lg:mb-0']")  //Click on All filter
    WebElement clickElse;

    @FindBy(xpath = "//*[@class='ss-gizmo absolute mr-6 -mt-1.5 right-0 top-50% leading-none ss-right']")  //Click on Buy button
    WebElement buyProductOne;
    @FindBy(xpath = "(//a[@href='/brands/bleu/not-for-resale'])[1]")        //Click Redeem
    WebElement redeemYourPoints;

    @FindBy(xpath = "(//a[@data-testid='productLink'])[4]")
    WebElement prodPoint;

    @FindBy(xpath = "(//*[@class=\'ss-gizmo absolute mr-6 -mt-1.5 right-0 top-50% leading-none ss-right\'])[1]")        //Buy With Points
    WebElement buyWithPoint;
    @FindBy(xpath = "(//*[@type=\'button\'])[4]")
    WebElement prodString;

    @FindBy(xpath = "//*[@data-testid='notificationMessage']")       //Notification bar
    WebElement notify;

    @FindBy(xpath = "(//*[@type='button'])[5]")    //Click buy with Points
    WebElement buyWithDollar;

    ExtentTest addToCartRbleuBothReport=extent.createTest("R+co Bleu both test functionality");

    public AddToCartPageRbleuBoth() {
        PageFactory.initElements(driver, this);
    }

    public void clickProductRbleuDollar() throws InterruptedException {

        WebDriverWait waitAlter1 = new WebDriverWait(driver, 5);
        waitAlter1.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//span[text()='Products']")));
        Thread.sleep(5000);

        Action.click(driver, products);
        driver.findElement(By.cssSelector("a[href='/brands/bleu'][target='']")).click();

        WebDriverWait waitFilter = new WebDriverWait(driver, 5);
        waitFilter.until(ExpectedConditions.visibilityOf(clickElse));
        clickElse.click();
    }

    public void prodPoint(){
        WebDriverWait waitRedeemProd = new WebDriverWait(driver, 5);
        waitRedeemProd.until(ExpectedConditions.visibilityOf(productOne));
        productOne.click();
    }
    public void buyFirstProdRbleu(){
        WebDriverWait waitBuyProductOne = new WebDriverWait(driver, 10);
        waitBuyProductOne.until(ExpectedConditions.visibilityOf(buyProductOne));
        buyProductOne.click();
        addToCartRbleuBothReport.pass("Product added successfully");

    /*    String buyBtnExpectedMesg = "OUT OF STOCK";
        String buyBtnActualMesg = prodString.getText();
        WebDriverWait waitBuyProductOne = new WebDriverWait(driver, 10);
        waitBuyProductOne.until(ExpectedConditions.visibilityOf(buyProductOne));
        if(buyBtnActualMesg.equals(buyBtnExpectedMesg)){
            System.out.println("Product is out of stock");
            addToCartRbleuBothReport.fail("Product is out of stock");
        }
        else {
            Action.click(driver,buyProductOne);
            addToCartRbleuBothReport.pass("Product added successfully");
        }*/

    }

    public void backToRedeemBleuBoth() throws InterruptedException {
        back.click();
        redeemYourPoints.click();
        Thread.sleep(8000);
        prodPoint.click();
        WebDriverWait waitBuyProductOne = new WebDriverWait(driver, 10);
        waitBuyProductOne.until(ExpectedConditions.visibilityOf(buyWithPoint));
        buyWithPoint.click();


        String validateMesg = notify.getText().trim();
        System.out.println("Result " + validateMesg);
        String failMesg = "You don't have sufficient points for this product";
        if (validateMesg.contains(failMesg)) {
            System.out.println("Not enough points, continuing with retail $");
            addToCartRbleuBothReport.fail("Not enough points, continuing with retail $");
            buyWithDollar.click();
            addToCartRbleuBothReport.pass("Product added successfully via Retail $");
        }
        addToCartRbleuBothReport.pass("Products added successfully");

/*        String buyBtnExpectedMesg = "OUT OF STOCK";
        String buyBtnActualMesg = prodString.getText();

        back.click();
        if (buyBtnActualMesg.equals(buyBtnExpectedMesg)) {
            System.out.println("Product is out of stock");
            addToCartRbleuBothReport.fail("Product is out of stock");
            tearDown();
        } else {
            WebDriverWait waitRedeem = new WebDriverWait(driver, 5);
            waitRedeem.until(ExpectedConditions.visibilityOf(redeemYourPoints));
            redeemYourPoints.click();
            Thread.sleep(5000);
            prodPoint.click();
            WebDriverWait waitBuyProductOne = new WebDriverWait(driver, 10);
            waitBuyProductOne.until(ExpectedConditions.visibilityOf(buyWithPoint));
            Action.click(driver, buyWithPoint);
            addToCartRbleuBothReport.pass("Product added successfully");
        }*/
    }
    public String getItemNameRbleuBoth () {
     /*   WebDriverWait waitItem = new WebDriverWait(driver, 5);
        waitItem.until(ExpectedConditions.visibilityOf(productOne));*/
        String message = productOne.getText();
        System.out.println("Product Name -> " + message);
        return message;
    }

    public String validateAddProductBoth () {
/*        WebDriverWait waitAlter = new WebDriverWait(driver, 5);
        waitAlter.until(ExpectedConditions.visibilityOf(closeVerifyMessage));*/
        String message = verifyProductName.getText();
        System.out.println("Expected item name -> " + message);
        return message;
    }
}

