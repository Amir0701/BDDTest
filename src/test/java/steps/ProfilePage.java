package steps;

import com.codeborne.selenide.Condition;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selenide.$;

public class ProfilePage {
    public void goToDisk(){
        $(By.xpath("//*[contains(@class, 'user-pic__image')]")).click();
        $(byText("Мой диск")).should(Condition.exist).click();
    }
}
