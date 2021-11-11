package steps;

import com.codeborne.selenide.Condition;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selenide.*;

public class AuthorizationPage {

    @Given("URL {string}")
    public void openUrl(String url){
        open(url);
    }

    @When("i am input login {string}")
    public void inputUserName(String username){
        $(By.id("passp-field-login")).setValue(username).pressEnter();
    }

    @And("i input password {string}")
    public void inputPassword(String password){
        $(By.id("passp-field-passwd")).val(password).pressEnter();
    }

    @Then("i go to disk")
    public void goToDisk(){
        ProfilePage profilePage = new ProfilePage();
        profilePage.goToDisk();
    }

}
