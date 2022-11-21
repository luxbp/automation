import org.apache.poi.util.SystemOutLogger;
import org.junit.Assert;
import org.openqa.selenium.*;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.io.IOException;

/**
 * Created by ith on 6/13/2017.
 */
public class LoginPage {
    WebDriver driver;

    @FindBy(xpath = "//*[contains(text(),'Sign In')]")   //Click on Sign in button
    WebElement signOn;

    @FindBy(xpath = "//input[@type='email']")  //Click on Email
    WebElement signInEmail;

    @FindBy(xpath = "//input[@type='password']")  //Click on Password
    WebElement signInPassword;

    @FindBy(xpath = "//button[@type='submit']")  //Click on Sign in button
    WebElement signInButton;

    @FindBy(xpath = "//*[@data-testid='notificationMessage']")    //Verify login message
    WebElement verifyLoginMessage;

    @FindBy(xpath = "//*[@class='ss-icon leading-none inline-block align-middle ss-navigatedown menu__icon']")  //Click on Products dropdown
    WebElement products;

    @FindBy(xpath = "//img[@src=\'https://ecomm-b2b.luxbp.com/img/310/300/resize/r/_/r_co-going-up-kit_pdp.png\']")  //Click on R+CO brand
    WebElement productOne;

    @FindBy(xpath = "//*[@class='mb-6.5 lg:mb-0']")  //Click on All filter
    WebElement clickElse;

    @FindBy(xpath = "//*[@data-testid=\'addToCart\']")  //Click on Buy button
    WebElement buyProductOne;

    @FindBy(xpath = "//a[@href='/cart']")  //Click on Cart button
    WebElement clickCartBtn;

    @FindBy(xpath = "//*[@class=\'ss-gizmo checkout-icon ss-right absolute text-h5\']")  //Click on Checkout Button on SHIPPING INFORMATION
    WebElement checkoutBtn;

    @FindBy(xpath = "//span[contains(text(),'Continue')]")  //Click on Checkout Button on SHIPPING METHOD
    WebElement clickContinue;

    @FindBy(xpath = "//input[@type='text']")  //Purchase Order Number
    WebElement purchaseOrderNumber;

    @FindBy(xpath = "//span[contains(text(),'Place order')]")  //Click on PLACE ORDER on ORDER REVIEW
    WebElement placeOrder;

    @FindBy(xpath = "//*[@class='mx-auto bg-white border border-solid border-black px-10 py-4 text-center text-h5 uppercase tracking-sm md:w-1/3 mb-10 text-black flex justify-center items-center']/span")  //Get ORDER NUMBER
    WebElement orderNumber;

    @FindBy(xpath = "//*[@class='text-base']")  //Click on CONTINUE
    WebElement lastContinue;

    @FindBy(xpath = "//*[@class='font-serif text-base text-white xl:font-bold leading-loose tracking-tiny italic']")
    WebElement signOut;

    public LoginPage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    public void clickSignOn() throws IOException, InterruptedException {
        new WebDriverWait(driver, 40).until(ExpectedConditions.visibilityOf(signOn));
        signOn.click();
    }

    public void signInEmail() {
        signInEmail.sendKeys("devops@luxbp.com");
    }

    public void signInPassword() {
        signInPassword.sendKeys("LBP#Test");
    }

    public void signInButton() throws InterruptedException {
        signInButton.click();
        WebDriverWait wait = new WebDriverWait(driver,5);
        wait.until(ExpectedConditions.visibilityOf(verifyLoginMessage));
        String message = verifyLoginMessage.getText();
          if(message.equals("YOU ARE LOGGED IN!"))
            {
                System.out.println("You are successfully logged in");
            }
            else {
              System.out.println("System login Failed");
          }
    }

    public void clickProduct() throws InterruptedException {
        Thread.sleep(5000);
        products.click();
        //String test = driver.getPageSource();
        //System.out.println("page source is"+test);
        driver.findElement(By.cssSelector("a[href='/brands/r-and-co'][target='']")).click();
    }

    public void clickFirstProduct() throws InterruptedException {
        Thread.sleep(3000);
        clickElse.click();
        Thread.sleep(5000);
        productOne.click();
        Thread.sleep(2000);
        buyProductOne.click();
    }

    public void clickCart() {
        clickCartBtn.click();
    }

    public void clickCheckoutBtn() throws InterruptedException {
        Thread.sleep(5000);
        checkoutBtn.click();
    }

    public void clickFirstContinueBtn() throws InterruptedException {
        Thread.sleep(2000);
        clickContinue.click();
    }

    public void clickSecondContinueBtn() throws InterruptedException {
        Thread.sleep(2000);
        clickContinue.click();
    }

    public void enterPurchaseOrderNumber() {
        purchaseOrderNumber.sendKeys("1ABCD");
        clickContinue.click();
    }

    public void placeOrderBtn() {
        placeOrder.click();
    }

    public void lastContinueBtn() throws InterruptedException {
        Thread.sleep(5000);
        String a = orderNumber.getText();
        try {
            System.out.println("Your order number is" + a);
        } catch (Exception e) {
            System.out.println("Couldn't get the order number cause of " + e);
        }
        lastContinue.click();
    }

}
