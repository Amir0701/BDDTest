package steps;

import com.codeborne.selenide.Condition;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import com.codeborne.xlstest.XLS;
import java.io.File;

import static com.codeborne.selenide.Selenide.$;
import static java.lang.Thread.sleep;
import static org.hamcrest.MatcherAssert.assertThat;

public class DiskPage {
    private File file;
    @When("i choose a image")
    public void chooseFile(){
        file = new File("E://Images//ozero_rassvet_gory_126967_3840x2160.jpg");
    }

    @Then("i upload image")
    public void upload(){
        $(By.className("upload-button__attach")).uploadFile(file);
        try {
            sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        //$(By.className("Button2 Button2_view_clear-inverse Button2_size_m uploader-progress__close-button")).
          //      shouldHave(Condition.visible).click();
    }

    @When("i find {string}")
    public void findFile(String fileName){
        $(By.xpath("//span[text()='" + fileName + "']/../..")).shouldBe(Condition.visible).click();
    }

    @And("i download file")
    public void clickButtonDownload(){
        $(By.xpath("//span[text()='" + "Скачать" + "']/..")).click();
        try {
            sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    @Then("i check {string}")
    public void check(String fileName){
        String filePath = "E:\\" + fileName;
        File file = new File(filePath);
        XLS xls = new XLS(file);
        assertThat(xls, XLS.containsText("V0"));
        assertThat(xls, XLS.containsText("class"));
        assertThat(xls, XLS.containsText("173"));
    }

}
