package orangeHrm.models;

import com.codeborne.selenide.CollectionCondition;
import com.codeborne.selenide.ElementsCollection;
import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Condition.visible;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.$$;

public class AdminPage
{
    private static SelenideElement adminLink = $(By.xpath("//a[@href='/web/index.php/admin/viewAdminModule']"));
    private static ElementsCollection navBar = $$(".oxd-topbar-body-nav");



    public static void navToAdminModule()
    {
        adminLink.shouldBe(visible).click();
        navBar.shouldHave(CollectionCondition.texts(
                        "User Management"+
                                     " Job"+
                                     " Organization"+
                                     " Qualifications"+
                                     " Nationalities"+
                                     " Corporate Branding"+
                                     " Configuration")
        );
    }

}
