import org.junit.Before;

import java.io.IOException;

/**
 * Created by ith on 6/13/2017.
 */
public class BaseTestAll extends BaseTest {

    protected LoginPage mainPage;

    @Before
    public void setup() throws IOException, InterruptedException {
        super.setup();
    }
}
