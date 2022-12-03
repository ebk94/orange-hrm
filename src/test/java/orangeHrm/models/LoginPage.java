package orangeHrm.models;

import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.$;

public class LoginPage
{
    private static SelenideElement username = $(By.name("username")),
            password = $(By.name("password")),
            loginBtn = $(By.cssSelector(".oxd-form-actions.orangehrm-login-action"));

    public static SelenideElement resetPwdLink = $(By.className("orangehrm-login-forgot")),
            orangeHRMLogo = $(By.xpath("//img[@alt='company-branding']"));

    public static void login(String name, String pwd)
    {
        username.setValue(name);
        password.sendKeys(pwd);
        loginBtn.click();
    }
}
