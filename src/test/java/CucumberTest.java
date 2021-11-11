import org.junit.runner.RunWith;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
@RunWith(Cucumber.class)
@CucumberOptions(
        plugin = {"pretty"},
        glue = {"cucumber.stepdefs"},
        features = {"src/test/java/resources/features"})
public class CucumberTest {
}
