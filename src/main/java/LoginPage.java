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

    @FindBy(xpath = "//*[contains(text(),'Sign In')]")
    WebElement signOn;

    @FindBy(xpath="//input[@type='email']")
    WebElement signInEmail;

    @FindBy(xpath="//input[@type='password']")
    WebElement signInPassword;

    @FindBy(xpath = "//button[@type='submit']")
    WebElement signInButton;

    @FindBy(xpath = "//a[@title='Home Page']")
    WebElement verifyLogin;


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

    public void signInPassword(){
        signInPassword.sendKeys("LBP#Test");
    }

    public void signInButton() {
            signInButton.click();

        try {
                Thread.sleep(5000);
            }
            catch(Exception ex){
                System.out.println("Thread sleep failed");
            }
        String homeTitle = driver.getTitle();
            if(homeTitle.equals("Take Your Salon to the Next Level - LBP Pro"))
            {
            System.out.println("Login Success");
        }
         else{
            System.out.println("Login Failed");
        }
    }
}
