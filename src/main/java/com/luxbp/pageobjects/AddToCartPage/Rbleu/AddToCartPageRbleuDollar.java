package com.luxbp.pageobjects.AddToCartPage.Rbleu;

import com.aventstack.extentreports.ExtentTest;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import com.luxbp.actiondriver.Action;
import com.luxbp.base.BaseClass;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class AddToCartPageRbleuDollar extends BaseClass {

    @FindBy(xpath = "//span[text()='Products']")  //Click on Products dropdown
    WebElement products;

    @FindBy(xpath = "//*[@data-id='icon-rco-bleu']")            //Click R+CO brand
    WebElement rBleu;

    @FindBy(xpath = "//*[@class='mb-6.5 lg:mb-0']")  //Click on All filter
    WebElement clickElse;

    @FindBy(xpath = "(//a[@data-testid='productLink'])[2]")     //Click first product
    WebElement productOne;

    @FindBy(xpath = "//*[@class='ss-gizmo absolute mr-6 -mt-1.5 right-0 top-50% leading-none ss-right']")  //Click on Buy button
    WebElement buyProductOne;

    @FindBy(xpath = "//*[@class='ss-gizmo ss-delete text-dark text-2h6 opacity-40 hover:opacity-100 slow-color-change leading-none icon-lg']")
    WebElement closeVerifyMessage;

    @FindBy(xpath = "//*[contains(@class,'product__name')]")
    WebElement verifyProductName;
    @FindBy(xpath = "(//*[@type=\'button\'])[4]")
    WebElement prodString;

    ExtentTest addToCartRbleuDollarReport = extent.createTest("R+co Bleu test functionality");

    public AddToCartPageRbleuDollar() {
        PageFactory.initElements(driver, this);
    }

    public void clickProductRblue() throws InterruptedException {
        Thread.sleep(5000);

        WebDriverWait waitRblue = new WebDriverWait(driver, 5);
        waitRblue.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//span[text()='Products']")));
        products.click();
        driver.findElement(By.cssSelector("a[href='/brands/bleu'][target='']")).click();

//        rBleu.click();

        WebDriverWait waitAll = new WebDriverWait(driver, 5);
        waitAll.until(ExpectedConditions.visibilityOf(clickElse));
        Thread.sleep(5000);
        Action.click(driver, clickElse);
    }

    public void prodPoint(){
        WebDriverWait waitRedeemProd = new WebDriverWait(driver, 5);
        waitRedeemProd.until(ExpectedConditions.visibilityOf(productOne));
        productOne.click();
    }
    public void clickFirstProductRblue() {
        WebDriverWait waitBuyProductOne = new WebDriverWait(driver, 10);
        waitBuyProductOne.until(ExpectedConditions.visibilityOf(buyProductOne));
        buyProductOne.click();
        addToCartRbleuDollarReport.pass("Product added successfully");

/*        String buyBtnExpectedMesg = "OUT OF STOCK";
        String buyBtnActualMesg = prodString.getText();

        if (buyBtnActualMesg.equals(buyBtnExpectedMesg)) {
            System.out.println("Product is out of stock");
            addToCartRbleuDollarReport.fail("Product is out of stock");
            tearDown();
        } else {
            WebDriverWait waitBuyProductOne = new WebDriverWait(driver, 10);
            waitBuyProductOne.until(ExpectedConditions.visibilityOf(buyProductOne));
            buyProductOne.click();
            addToCartRbleuDollarReport.pass("Product added successfully");
        }*/
    }

    public String getItemNameRblue() {
      /*  WebDriverWait waitItem = new WebDriverWait(driver, 5);
        waitItem.until(ExpectedConditions.visibilityOf(productOne));*/
        String message = productOne.getText();
        System.out.println("Product Name -> " + message);
        return message;
    }

    public String validateAddProduct() {
/*        WebDriverWait waitAlter = new WebDriverWait(driver, 5);
        waitAlter.until(ExpectedConditions.visibilityOf(closeVerifyMessage));*/
        String message = verifyProductName.getText();
        System.out.println("Expected item name -> " + message);
        return message;
    }

}
