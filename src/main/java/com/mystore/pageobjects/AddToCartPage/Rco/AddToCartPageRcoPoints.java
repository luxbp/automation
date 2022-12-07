package com.mystore.pageobjects.AddToCartPage.Rco;

import com.mystore.actiondriver.Action;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import com.mystore.base.BaseClass;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class AddToCartPageRcoPoints extends BaseClass {

    @FindBy(xpath = "//*[@class='ss-gizmo ss-delete text-dark text-2h6 opacity-40 hover:opacity-100 slow-color-change leading-none icon-lg']")
    WebElement closeVerifyMessage;
    @FindBy(xpath = "//span[text()='Products']")  //Click on Products dropdown
    WebElement products;

    @FindBy(xpath = "//*[@data-id='icon-rco']")            //Click R+CO brand
    WebElement rCO;

    @FindBy(xpath = "(//a[@data-testid='productLink'])[8]")
    WebElement prodPoint;

    @FindBy(xpath = "//*[contains(@class,'product__name')]")
    WebElement verifyProductNamePoints;


    @FindBy(xpath = "(//*[@class='ss-gizmo absolute mr-6 -mt-1.5 right-0 top-50% leading-none ss-right'])[1]")    //Click buy with Points
    WebElement buyWithPoints;

    @FindBy(xpath = "//a[@href='/brands/r-and-co/not-for-resale']")        //Click Redeem
    WebElement redeemYourPointsRco;

    @FindBy(xpath = "//*[@class='lg:product-listing__item lg:justify-start lg:items-start pr-xl w-full lg:w-1/4 relative lg:flex lg:w-1/5']")        //NotForResale Wait
    WebElement redeemWait;

    public AddToCartPageRcoPoints() {
        PageFactory.initElements(driver, this);
    }

    public void clickProductRplusCoPoint() throws InterruptedException {

        WebDriverWait waitAlter1 = new WebDriverWait(driver, 5);
        waitAlter1.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//span[text()='Products']")));
        Thread.sleep(5000);

        Action.click(driver,products);

        driver.findElement(By.cssSelector("a[href='/brands/r-and-co'][target='']")).click();
//        rCO.click();
    }
    public void clickRedeemRco() throws InterruptedException {
        redeemYourPointsRco.click();
        Thread.sleep(3000);        //Need to add thread as there are no other elements for explicit wait
        prodPoint.click();
    }
    public void buyProdPoint(){
        WebDriverWait waitRedeemProd = new WebDriverWait(driver, 5);
        waitRedeemProd.until(ExpectedConditions.visibilityOf(buyWithPoints));
        buyWithPoints.click();
    }

    public String getItemNameRplusCoPoints () {
        WebDriverWait waitItem = new WebDriverWait(driver, 5);
        waitItem.until(ExpectedConditions.visibilityOf(prodPoint));
        String message = prodPoint.getText();
        System.out.println("Product Name -> " + message);
        return message;
    }

    public String validateAddProduct () {
        WebDriverWait waitAlter = new WebDriverWait(driver, 5);
        waitAlter.until(ExpectedConditions.visibilityOf(closeVerifyMessage));
        String message = verifyProductNamePoints.getText();
        System.out.println("Expected item name -> " + message);
        return message;
    }
}

