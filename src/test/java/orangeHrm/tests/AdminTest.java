package orangeHrm.tests;

import com.codeborne.selenide.junit5.TextReportExtension;
import orangeHrm.models.AdminPage;
import orangeHrm.models.LoginPage;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.MethodOrderer;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestMethodOrder;
import org.junit.jupiter.api.extension.ExtendWith;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Condition.visible;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;

@ExtendWith({TextReportExtension.class})
@TestMethodOrder(MethodOrderer.OrderAnnotation.class)
public class AdminTest extends BaseTest
{
    @BeforeEach
    public void visitPage() { open(""); }

    @Test
    public void adminCanViewSystemUsers()
    {
        LoginPage.login("Admin", "admin123");
        AdminPage.navToAdminModule();
    }
}
