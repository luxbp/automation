package com.luxbp.pageobjects;

import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.luxbp.actiondriver.Action;
import com.luxbp.base.BaseClass;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.List;

public class GridOrderingPage extends BaseClass {

    @FindBy(xpath = "//button[contains(@class,'brandTab')]")
    WebElement brand;

    @FindBy(xpath = "(//button[contains(text(),'R+Co')])[2]")
    WebElement ClickRBleu;

    @FindBy(xpath = "(//button[contains(text(),'R+Co')])[3]")
    WebElement ClickRColor;

    @FindBy(xpath = "(//button[contains(text(),'R+Co')])[1]")
    WebElement ClickRco;

    @FindBy(xpath = "//*[@data-testid='accountButton']")
    WebElement profile;

    @FindBy(xpath = "(//a[@href=\"/quick-order\"])[1]")
    WebElement gridOrdering;

    @FindBy(xpath = "//*[@class='grid-1']")
    List<WebElement> Product;

    @FindBy(xpath = "//*[@class='grid-1']//following-sibling::input")
    WebElement QtyMoney;

    @FindBy(xpath = "//*[@class='addToCart bg-primary2:hover']")
    WebElement addToCart;

    @FindBy(xpath = "(//*[@type='button'])[3]")
    WebElement confirmOk;

    ExtentTest gridOrderingReport = extent.createTest("Grid Ordering");
    Actions action = new Actions(driver);

    public GridOrderingPage() {
        PageFactory.initElements(driver, this);
    }

    public void profile() throws InterruptedException {
        gridOrderingReport.log(Status.INFO, "Checking profile dropdown");
        Thread.sleep(5000);
        action.moveToElement(profile).perform();


        /*WebDriverWait profileWait = new WebDriverWait(driver, 5);
        profileWait.until(ExpectedConditions.visibilityOf(profile));*/
        /*   profile.click();*/

        gridOrderingReport.log(Status.INFO, "Navigating to Grid Ordering module");
       /* WebDriverWait gridOrderingWait = new WebDriverWait(driver, 5);
        gridOrderingWait.until(ExpectedConditions.visibilityOf(gridOrdering));*/
        gridOrdering.click();
    }

    public void getProduct() {
        WebDriverWait profileWait = new WebDriverWait(driver, 5);
        profileWait.until(ExpectedConditions.visibilityOfAllElements(Product));
        if (prop.getProperty("BrandRco").equalsIgnoreCase("True")) {
            ClickRco.click();
            for (WebElement content : Product) {
                String prodName = content.getText();
                if (prodName.equalsIgnoreCase(prop.getProperty("ProductRco"))) {
                    System.out.println("Your product is -> " + prodName);

                    String defineProdName = "//div[contains(text(),'" + prodName + "')]//following-sibling::input";
                    driver.findElement(By.xpath(defineProdName)).sendKeys(prop.getProperty("QuantityMoneyRco"));
                }
            }
        }
        if (prop.getProperty("BrandRbleu").equalsIgnoreCase("True")) {
            ClickRBleu.click();
            for (WebElement content : Product) {
                String prodName = content.getText();
                if (prodName.equalsIgnoreCase(prop.getProperty("Productbleu"))) {
                    System.out.println("Your product is -> " + prodName);

                    String defineProdName = "//div[contains(text(),'" + prodName + "')]//following-sibling::input";
                    driver.findElement(By.xpath(defineProdName)).sendKeys(prop.getProperty("QuantityMoneyRbleu"));
                }
            }
        }
        if (prop.getProperty("BrandRcolor").equalsIgnoreCase("True")) {
            ClickRColor.click();
            for (WebElement content : Product) {
                String prodName = content.getText();
                if (prodName.equalsIgnoreCase(prop.getProperty("ProductRcolor"))) {
                    System.out.println("Your product is -> " + prodName);

                    String defineProdName = "//div[contains(text(),'" + prodName + "')]//following-sibling::input";
                    driver.findElement(By.xpath(defineProdName)).sendKeys(prop.getProperty("QuantityMoneyRcolor"));
                }
            }
        }
    }

    public void QuickOrderAddToCart() {
        addToCart.click();
        WebDriverWait mesgWait = new WebDriverWait(driver, 5);
        mesgWait.until(ExpectedConditions.visibilityOf(confirmOk));
        confirmOk.click();
    }

}
