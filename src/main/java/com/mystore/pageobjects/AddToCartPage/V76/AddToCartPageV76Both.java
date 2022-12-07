package com.mystore.pageobjects.AddToCartPage.V76;

import com.mystore.actiondriver.Action;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import com.mystore.base.BaseClass;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class AddToCartPageV76Both extends BaseClass {

    @FindBy(xpath = "//*[@class='ss-gizmo ss-delete text-dark text-2h6 opacity-40 hover:opacity-100 slow-color-change leading-none icon-lg']")
    WebElement closeVerifyMessage;
    @FindBy(xpath = "//span[text()='Products']")  //Click on Products dropdown
    WebElement products;

    @FindBy(xpath = "(//a[@href='/brands/v76'])[1]")       //Back to R+Co
    WebElement backToV76;

    @FindBy(xpath = "(//a[@data-testid='productLink'])[4]")  //Click on item name of selected brand product
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

    @FindBy(xpath = "//*[@class='lg:product-listing__item lg:justify-start lg:items-start pr-xl w-full lg:w-1/4 relative lg:flex lg:w-1/5']")        //NotForResale Wait
    WebElement redeemWait;

    @FindBy(xpath = "(//a[@data-testid='productLink'])[22]")
    WebElement prodPoint;

    public AddToCartPageV76Both() {
        PageFactory.initElements(driver, this);
    }

    public void clickProductV76() throws InterruptedException {

        WebDriverWait waitAlter1 = new WebDriverWait(driver, 10);
        waitAlter1.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//span[text()='Products']")));

        Action.click(driver, products);
        driver.findElement(By.cssSelector("a[href='/brands/v76'][target='']")).click();

        WebDriverWait waitFilter = new WebDriverWait(driver, 5);
        waitFilter.until(ExpectedConditions.visibilityOf(clickElse));
        Thread.sleep(5000);
        clickElse.click();

        productOne.click();
    }

    public void buyFirstProdBoth(){
        WebDriverWait waitBuyProductOne = new WebDriverWait(driver, 10);
        waitBuyProductOne.until(ExpectedConditions.visibilityOf(buyProductOne));
        Action.click(driver,buyProductOne);
    }

    public void backToRedeem() throws InterruptedException {
        backToV76.click();
        redeemYourPointsV76.click();
        Thread.sleep(3000);             //Need to add thread as there are no element for explicit wait
        prodPoint.click();
        WebDriverWait waitRedeemProd = new WebDriverWait(driver, 5);
        waitRedeemProd.until(ExpectedConditions.visibilityOf(buyWithPoints));
        buyWithPoints.click();
    }


    public String getItemNameV76Both () {
        WebDriverWait waitItem = new WebDriverWait(driver, 5);
        waitItem.until(ExpectedConditions.visibilityOf(productOne));
        String message = productOne.getText();
        System.out.println("Product Name -> " + message);
        return message;
    }

    public String validateAddProductBoth () {
        WebDriverWait waitAlter = new WebDriverWait(driver, 5);
        waitAlter.until(ExpectedConditions.visibilityOf(closeVerifyMessage));
        String message = verifyProductName.getText();
        System.out.println("Expected item name -> " + message);
        return message;
    }
}

