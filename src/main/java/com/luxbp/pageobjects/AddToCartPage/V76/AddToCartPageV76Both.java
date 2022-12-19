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

public class AddToCartPageV76Both extends BaseClass {

    @FindBy(xpath = "//*[@class='ss-gizmo ss-delete text-dark text-2h6 opacity-40 hover:opacity-100 slow-color-change leading-none icon-lg']")
    WebElement closeVerifyMessage;
    @FindBy(xpath = "//span[text()='Products']")  //Click on Products dropdown
    WebElement products;

    @FindBy(xpath = "(//a[@href='/brands/v76'])[1]")       //Back to R+Co
    WebElement backToV76;

    @FindBy(xpath = "(//a[@data-testid='productLink'])[6]")  //Click on item name of selected brand product
    WebElement productOne;

    @FindBy(xpath = "//*[contains(@class,'product__name')]")
    WebElement verifyProductName;

    @FindBy(xpath = "//*[@class='mb-6.5 lg:mb-0']")  //Click on All filter
    WebElement clickElse;

    @FindBy(xpath = "//*[@class='ss-gizmo absolute mr-6 -mt-1.5 right-0 top-50% leading-none ss-right']")  //Click on Buy button
    WebElement buyProductOne;

    @FindBy(xpath = "(//*[@class='ss-gizmo absolute mr-6 -mt-1.5 right-0 top-50% leading-none ss-right'])[1]")    //Click buy with Points
    WebElement buyWithPoints;

    @FindBy(xpath = "//a[@href='/brands/v76/not-for-resale']")        //Click Redeem
    WebElement redeemYourPointsV76;


    @FindBy(xpath = "(//a[@data-testid='productLink'])[24]")
    WebElement prodPoint;

    @FindBy(xpath = "(//*[@type=\'button\'])[4]")
    WebElement prodString;

    @FindBy(xpath = "//*[@data-testid='notificationMessage']")       //Notification bar
    WebElement notify;

    @FindBy(xpath = "(//*[@type='button'])[5]")    //Click buy with Points
    WebElement buyWithDollar;

    ExtentTest addToCartV76BothReport = extent.createTest("V76 both NFR Points and retail $ test functionality");

    public AddToCartPageV76Both() {
        PageFactory.initElements(driver, this);
    }

    public void clickProductV76() throws InterruptedException {

        WebDriverWait waitAlter1 = new WebDriverWait(driver, 10);
        waitAlter1.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//span[text()='Products']")));
        Thread.sleep(5000);

        Action.click(driver, products);
        driver.findElement(By.cssSelector("a[href='/brands/v76'][target='']")).click();

        WebDriverWait waitFilter = new WebDriverWait(driver, 5);
        waitFilter.until(ExpectedConditions.visibilityOf(clickElse));
        clickElse.click();
    }

    public void prodPoint() {
        WebDriverWait waitRedeemProd = new WebDriverWait(driver, 5);
        waitRedeemProd.until(ExpectedConditions.visibilityOf(productOne));
        productOne.click();
    }

    public void buyFirstProdBoth() {
        WebDriverWait waitBuyProductOne = new WebDriverWait(driver, 10);
        waitBuyProductOne.until(ExpectedConditions.visibilityOf(buyProductOne));
        Action.click(driver, buyProductOne);


/*        String buyBtnExpectedMesg = "OUT OF STOCK";
        String buyBtnActualMesg = prodString.getText();

        if (buyBtnActualMesg.equals(buyBtnExpectedMesg)) {
            System.out.println("Product is out of stock");
            addToCartV76BothReport.fail("Product is out of stock");
            tearDown();
        } else {
            WebDriverWait waitBuyProductOne = new WebDriverWait(driver, 10);
            waitBuyProductOne.until(ExpectedConditions.visibilityOf(buyProductOne));
            Action.click(driver, buyProductOne);
            addToCartV76BothReport.pass("Product added successfully");
        }*/
    }

    public void backToRedeem() throws InterruptedException {
        backToV76.click();
        redeemYourPointsV76.click();
        Thread.sleep(5000);             //Need to add thread as there are no element for explicit wait

        prodPoint.click();
        WebDriverWait waitRedeemProd = new WebDriverWait(driver, 5);
        waitRedeemProd.until(ExpectedConditions.visibilityOf(buyWithPoints));
        buyWithPoints.click();

        String validateMesg = notify.getText().trim();
        System.out.println("Result " + validateMesg);
        String failMesg = "You don't have sufficient points for this product";
        if (validateMesg.contains(failMesg)) {
            System.out.println("Not enough points, continuing with retail $");
            addToCartV76BothReport.fail("Not enough points, continuing with retail $");
            buyWithDollar.click();
            addToCartV76BothReport.pass("Product added successfully via retail $");
        } else {
            addToCartV76BothReport.pass("Product added via NFR Points");
            System.out.println("Product added via NFR Points");
        }


    /*    String buyBtnExpectedMesg = "OUT OF STOCK";
        String buyBtnActualMesg = prodString.getText();

        if (buyBtnActualMesg.equals(buyBtnExpectedMesg)) {
            System.out.println("Product is out of stock");
            addToCartV76BothReport.fail("Product is out of stock");
            tearDown();
        } else {
            WebDriverWait waitRedeemProd = new WebDriverWait(driver, 5);
            waitRedeemProd.until(ExpectedConditions.visibilityOf(buyWithPoints));
            buyWithPoints.click();
            addToCartV76BothReport.pass("Product added successfully");
        }*/
    }

    public String getItemNameV76Both() {
     /*   WebDriverWait waitItem = new WebDriverWait(driver, 5);
        waitItem.until(ExpectedConditions.visibilityOf(productOne));*/
        String message = productOne.getText();
        System.out.println("Product Name -> " + message);
        return message;
    }

    public String validateAddProductBoth() {
/*        WebDriverWait waitAlter = new WebDriverWait(driver, 5);
        waitAlter.until(ExpectedConditions.visibilityOf(closeVerifyMessage));*/
        String message = verifyProductName.getText();
        System.out.println("Expected item name -> " + message);
        return message;
    }
}

