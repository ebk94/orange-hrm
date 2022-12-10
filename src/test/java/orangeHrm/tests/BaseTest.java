package orangeHrm.tests;

import com.codeborne.selenide.Configuration;
import com.codeborne.selenide.Selenide;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;

public class BaseTest
{
    @BeforeAll
    public static void setUp()
    {
        Configuration.headless = false;
        Configuration.browser = "chrome";
        Configuration.baseUrl = "https://opensource-demo.orangehrmlive.com/";
    }

    @AfterAll
    public static void tearDown() { Selenide.closeWebDriver(); }
}
