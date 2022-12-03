package orangeHrm.tests;

import orangeHrm.models.LoginPage;
import org.junit.jupiter.api.*;
import org.junit.jupiter.api.extension.ExtendWith;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Condition.visible;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;
import com.codeborne.selenide.junit5.TextReportExtension;

@ExtendWith({TextReportExtension.class})
public class LoginTest extends BaseTest
{

    @BeforeEach
    public void visitPage() { open("https://opensource-demo.orangehrmlive.com/"); }

    @Test
    @Order(1)
    @DisplayName("Wrong password and right username")
    public void wrongPassword()
    {
        LoginPage.resetPwdLink.shouldBe(visible);
        LoginPage.orangeHRMLogo.shouldBe(visible);
        LoginPage.login("Admin","admin1");
        $(By.xpath("//div[@class='oxd-pie-chart']")).shouldNotBe(visible);
    }

    @Test
    @Order(2)
    @DisplayName("Right password and right username")
    public void rightPassword()
    {
        LoginPage.resetPwdLink.shouldBe(visible);
        LoginPage.orangeHRMLogo.shouldBe(visible);
        LoginPage.login("Admin","admin123");
        $(By.xpath("//div[@class='oxd-pie-chart']")).shouldBe(visible);
    }
}
