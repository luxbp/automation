package com.mystore.pageobjects.AddToCartPage.V76;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import com.mystore.actiondriver.Action;
import com.mystore.base.BaseClass;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class AddToCartPageV76Dollar extends BaseClass {

    @FindBy(xpath = "//*[@class='ss-gizmo ss-delete text-dark text-2h6 opacity-40 hover:opacity-100 slow-color-change leading-none icon-lg']")
    WebElement closeVerifyMessage;
    @FindBy(xpath = "//span[text()='Products']")  //Click on Products dropdown
    WebElement products;

    @FindBy(xpath = "//*[@data-id='icon-v76']")			//Click R+CO brand
    WebElement v76;

//    a[href='/brands/v76'][target='']

    @FindBy(xpath = "(//a[@data-testid='productLink'])[4]")  //Click on item name of selected brand product
    WebElement productOne;

    @FindBy(xpath = "//*[contains(@class,'product__name')]")
    WebElement verifyProductName;

    @FindBy(xpath = "//*[@class='mb-6.5 lg:mb-0']")  //Click on All filter
    WebElement clickElse;

    @FindBy(xpath = "//*[@class='ss-gizmo absolute mr-6 -mt-1.5 right-0 top-50% leading-none ss-right']")  //Click on Buy button
    WebElement buyProductOne;

    public AddToCartPageV76Dollar() {
        PageFactory.initElements(driver, this);
    }

    public void clickProductV76() throws InterruptedException {

        WebDriverWait waitAlter = new WebDriverWait(driver, 10);
        waitAlter.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//span[text()='Products']")));
        Action.click(driver,products);

//        v76.click();
		driver.findElement(By.cssSelector("a[href='/brands/v76'][target='']")).click();

        WebDriverWait waitAll = new WebDriverWait(driver, 5);
        waitAll.until(ExpectedConditions.visibilityOf(clickElse));
        clickElse.click();
    }

    public void clickFirstProductV76()  {
        Action.click(driver,productOne);

        WebDriverWait waitBuyProductOne = new WebDriverWait(driver, 10);
        waitBuyProductOne.until(ExpectedConditions.visibilityOf(buyProductOne));
        Action.click(driver,buyProductOne);
    }
    public String getItemNameV76(){
        WebDriverWait waitItem = new WebDriverWait(driver, 5);
        waitItem.until(ExpectedConditions.visibilityOf(productOne));
        String message = productOne.getText();
        System.out.println("Product Name -> "+message);
        return message;
    }

    public String validateAddProduct(){
        WebDriverWait waitAlter = new WebDriverWait(driver, 5);
        waitAlter.until(ExpectedConditions.visibilityOf(closeVerifyMessage));
        String message = verifyProductName.getText();
        System.out.println("Expected item name -> "+message);
        return message;
    }

}
