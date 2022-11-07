
import org.junit.After;
import org.junit.Before;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import java.io.IOException;

public class BaseTest {
    WebDriver driver;

    @Before
    public void setup() throws IOException, InterruptedException {

        try {
                System.setProperty("webdriver.chrome.driver", "src/main/resources/chromedriver.exe");
                driver = new ChromeDriver();
                driver.manage().window().maximize();
                driver.get("https://pro.luxbp.com/welcome?");
        } catch (Exception e) {
            System.out.println(e);
        }
    }

    @After
    public void tearDown() {

        //driver.quit();
    }
}
