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
@TestMethodOrder(MethodOrderer.OrderAnnotation.class)
public class LoginTest extends BaseTest
{

    @BeforeEach
    public void visitPage() { open(""); }

    @Test
    @Order(1)
    @DisplayName("Wrong password and right username")
    public void userCanNotLogWithWrongPwd()
    {
        LoginPage.resetPwdLink.shouldBe(visible);
        LoginPage.orangeHRMLogo.shouldBe(visible);
        LoginPage.login("Admin","admin1");
        $(By.xpath("//div[@class='oxd-pie-chart']")).shouldNotBe(visible);
    }

    @Test
    @Order(2)
    @DisplayName("Right password and wrong username")
    public void userCanNotLogWithWrongUserName()
    {
        LoginPage.resetPwdLink.shouldBe(visible);
        LoginPage.orangeHRMLogo.shouldBe(visible);
        LoginPage.login("Admin","admin1");
        $(By.xpath("//div[@class='oxd-pie-chart']")).shouldNotBe(visible);
    }

    @Test
    @Order(3)
    @DisplayName("Wrong password and username")
    public void userCanNotLogWithWrongCredentials()
    {
        LoginPage.resetPwdLink.shouldBe(visible);
        LoginPage.orangeHRMLogo.shouldBe(visible);
        LoginPage.login("Admin","admin1");
        $(By.xpath("//div[@class='oxd-pie-chart']")).shouldNotBe(visible);
    }

    @Test
    @Order(4)
    @DisplayName("Right username and password\n")
    public void userCanLogin()
    {
        LoginPage.resetPwdLink.shouldBe(visible);
        LoginPage.orangeHRMLogo.shouldBe(visible);
        LoginPage.login("Admin","admin123");
        $(By.xpath("//div[@class='oxd-pie-chart']")).shouldBe(visible);
    }
}
