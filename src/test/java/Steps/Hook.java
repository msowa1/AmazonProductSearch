package Steps;

import Base.BaseUtils;
import cucumber.api.java.After;
import cucumber.api.java.Before;
import org.openqa.selenium.chrome.ChromeDriver;

public class Hook extends BaseUtils {

    private BaseUtils base;

    public Hook(BaseUtils base) {
        this.base = base;
    }

    static String pageUrl = "http://www.amazon.com";

    @Before
    public void InitializeTest(){

        System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
        base.driver = new ChromeDriver();
        base.driver.manage().window().maximize();
    }

    @After
    public void TearDownTest(){

        base.driver.quit();
    }
}
