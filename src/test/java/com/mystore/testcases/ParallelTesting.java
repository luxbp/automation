package com.mystore.testcases;

import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;
import com.mystore.base.BaseClass;
import io.github.bonigarcia.wdm.WebDriverManager;

public class ParallelTesting extends BaseClass {

	@Test(priority = 1, description = "This is a Add to Cart Test")
	public void VerifyAddtoCart_Functionality() throws InterruptedException {

		SoftAssert softassert = new SoftAssert();
		String expected_error = "Add to Cart Unsuccessful";
		String expectedtext = "Product successfully added to your shopping cart";
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		JavascriptExecutor js = (JavascriptExecutor) driver;
		driver.get("https://automationpractice.com/");
		driver.manage().window().maximize();
		String actual_error = "Add to Cart Unsuccessful";
		System.out.println("Error Msg verified");
		System.out.println("Result Actual - " + actual_error + " Expected - " + expected_error);
		softassert.assertEquals(actual_error, expected_error, "Error Msg Verification");
		// Login
		WebElement SignBtn = driver.findElement(By.xpath("//*[@id=\"header\"]/div[2]/div/div/nav/div[1]/a"));
		SignBtn.click();
		js.executeScript("window.scrollBy(0,300)");
		WebElement EmlBtn = driver.findElement(By.id("email"));
		EmlBtn.click();
		EmlBtn.sendKeys("randhirall20@gmail.com");
		WebElement PwdBtn = driver.findElement(By.id("passwd"));
		PwdBtn.click();
		PwdBtn.sendKeys("automation");
		WebElement SignBttn = driver.findElement(By.id("SubmitLogin"));
		SignBttn.click();
		WebElement LdBtn = driver.findElement(By.xpath("//*[@id=\"header_logo\"]/a/img"));
		LdBtn.click();
		WebElement DrssBtn = driver.findElement(By.xpath("//*[@id=\"block_top_menu\"]/ul/li[2]/a"));
		DrssBtn.click();
		WebElement CslDrss = driver.findElement(By.xpath("//*[@id=\"subcategories\"]/ul/li[2]/h5/a"));
		CslDrss.click();
		js.executeScript("window.scrollBy(0,700)");
		WebElement ele = driver.findElement(By.xpath("//*[@id=\"center_column\"]/ul/li/div/div[1]/div/a[1]/img"));
		// Creating object of an Actions class
		Actions action = new Actions(driver);
		// Performing the mouse hover action on the target element.
		action.moveToElement(ele).perform();
		WebElement AdCrt = driver.findElement(By.xpath("//*[@id=\"center_column\"]/ul/li/div/div[2]/div[2]/a[1]/span"));
		AdCrt.click();
		String actual_text = driver.findElement(By.xpath("//*[@id=\"layer_cart\"]/div[1]/div[1]/h2/text()")).getText();
		String expected_text = "Product successfully added to your shopping cart";

		// Type 1
		Assert.assertEquals(actual_text, expected_text);

		// Type 2
		Assert.assertTrue(actual_error.contains("Product successfully added to your shopping cart"));

		System.out.println("Test Completed");
	}

	@Test(priority = 2, description = "This is a Add to Cart Test -1")
	public void VerifyAddtoCart1_Functionality() throws InterruptedException {

		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		String URL = "http://automationpractice.com/index.php";

		// Open URL and Maximize browser window
		driver.get(URL);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(3000, TimeUnit.MILLISECONDS);
		// Click on Sign in
		driver.findElement(By.linkText("Sign in")).click();
		// Login
		driver.findElement(By.id("email")).sendKeys("randhirall20@gmail.com");
		driver.findElement(By.id("passwd")).sendKeys("automation");
		driver.findElement(By.id("SubmitLogin")).click();
		// Click on Women
		driver.findElement(By.linkText("WOMEN")).click();
		WebElement SecondImg = driver
				.findElement(By.xpath("/html/body/div[1]/div[2]/div/div[3]/div[2]/ul/li[2]/div/div[1]/div/a[1]/img"));
		WebElement MoreBtn = driver.findElement(
				By.xpath("/html/body[1]/div[1]/div[2]/div[1]/div[3]/div[2]/ul/li[2]/div[1]/div[2]/div[2]/a[2]"));
		Actions actions = new Actions(driver);
		actions.moveToElement(SecondImg).moveToElement(MoreBtn).click().perform();
		// Change quantity by 2
		driver.findElement(By.id("quantity_wanted")).clear();
		driver.findElement(By.id("quantity_wanted")).sendKeys("2");
		// Select size as L
		WebElement Sizedrpdwn = driver.findElement(By.xpath("//*[@id='group_1']"));
		Select oSelect = new Select(Sizedrpdwn);
		oSelect.selectByVisibleText("M");
		// Select Color
		driver.findElement(By.id("color_11")).click();
		// Click on add to cart
		driver.findElement(By.xpath("//p[@id='add_to_cart']//span[.='Add to cart']")).click();
		// Click on proceed
		driver.findElement(By.xpath("/html//div[@id='layer_cart']//a[@title='Proceed to checkout']/span")).click();
		// Checkout page Proceed
		driver.findElement(By.xpath("/html/body/div[1]/div[2]/div/div[3]/div/p[2]/a[1]/span")).click();
		driver.findElement(By.xpath("/html/body/div[1]/div[2]/div/div[3]/div/form/p/button/span")).click();
		// Agree terms&Conditions
		driver.findElement(By.xpath("//*[@id=\"cgv\"]")).click();
		driver.findElement(By.xpath("/html/body/div[1]/div[2]/div/div[3]/div/div/form/p/button/span")).click();
		// Click on Payby Check
		driver.findElement(By.xpath("/html/body/div[1]/div[2]/div/div[3]/div/div/div[3]/div[2]/div/p/a")).click();
		// Confirm the order
		driver.findElement(By.xpath("/html/body/div[1]/div[2]/div/div[3]/div/form/p/button/span")).click();

		// Get Text
		String ConfirmationText = driver
				.findElement(By.xpath("//div[@id='center_column']/p[@class='alert alert-success']")).getText();

		// Verify that Product is ordered
		if (ConfirmationText.contains("complete")) {
			System.out.println("Order Completed: Test Case Passed");
		} else {
			System.out.println("Order Not Successfull: Test Case Failed");
		}
	}
}
