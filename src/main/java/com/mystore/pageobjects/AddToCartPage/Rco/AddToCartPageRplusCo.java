package com.mystore.pageobjects.AddToCartPage.Rco;

import com.mystore.actiondriver.Action;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import com.mystore.base.BaseClass;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class AddToCartPageRplusCo extends BaseClass {

	@FindBy(xpath = "//*[@class='ss-gizmo ss-delete text-dark text-2h6 opacity-40 hover:opacity-100 slow-color-change leading-none icon-lg']")
	WebElement closeVerifyMessage;
	@FindBy(xpath = "//span[text()='Products']")  //Click on Products dropdown
	WebElement products;

	@FindBy(xpath = "//*[@data-id='icon-rco']")            //Click R+CO brand
	WebElement rCO;

	@FindBy(xpath = "(//a[@data-testid='productLink'])[2]")  //Click on item name of selected brand product
	WebElement productOne;

	@FindBy(xpath = "//*[contains(@class,'product__name')]")
	WebElement verifyProductName;

	@FindBy(xpath = "//*[@class='mb-6.5 lg:mb-0']")  //Click on All filter
	WebElement clickElse;

	@FindBy(xpath = "//*[@class='ss-gizmo absolute mr-6 -mt-1.5 right-0 top-50% leading-none ss-right']")  //Click on Buy button
	WebElement buyProductOne;

	public AddToCartPageRplusCo() {
		PageFactory.initElements(driver, this);
	}

	public void clickProductRplusCo() throws InterruptedException {

		WebDriverWait waitAlter1 = new WebDriverWait(driver, 5);
		waitAlter1.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//span[text()='Products']")));

		Action.click(driver,products);

		driver.findElement(By.cssSelector("a[href='/brands/r-and-co'][target='']")).click();
//		rCO.click();

			WebDriverWait waitFilter = new WebDriverWait(driver, 5);
			waitFilter.until(ExpectedConditions.visibilityOf(clickElse));
			Thread.sleep(5000);
			clickElse.click();
		}

		public void clickFirstProductRplusCo () {
			productOne.click();

			WebDriverWait waitBuyProductOne = new WebDriverWait(driver, 10);
			waitBuyProductOne.until(ExpectedConditions.visibilityOf(buyProductOne));
			Action.click(driver,buyProductOne);
		}

		public String getItemNameRplusCo () {
			WebDriverWait waitItem = new WebDriverWait(driver, 5);
			waitItem.until(ExpectedConditions.visibilityOf(productOne));
			String message = productOne.getText();
			System.out.println("Product Name -> " + message);
			return message;
		}

		public String validateAddProduct () {
			WebDriverWait waitAlter = new WebDriverWait(driver, 5);
			waitAlter.until(ExpectedConditions.visibilityOf(closeVerifyMessage));
			String message = verifyProductName.getText();
			System.out.println("Expected item name -> " + message);
			return message;
		}
}

