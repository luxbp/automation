import org.junit.Test;
import java.io.IOException;

/**
 * Created by ith on 6/13/2017.
 */
public class MainPageTest extends BaseTest {

    @Test
    public void mainPageTest() throws IOException, InterruptedException {
        LoginPage mainPage =new LoginPage(driver);
        mainPage.clickSignOn();
        mainPage.signInEmail();
        mainPage.signInPassword();
        mainPage.signInButton();
    }


}
