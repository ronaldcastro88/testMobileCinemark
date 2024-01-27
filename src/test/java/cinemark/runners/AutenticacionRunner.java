package cinemark.runners;

import cucumber.api.CucumberOptions;
import cucumber.api.SnippetType;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(
        features = "src/test/resources/features/Autenticacion.feature",
        glue = {"cinemark.stepdefinitions"},
        snippets = SnippetType.CAMELCASE
)
public class AutenticacionRunner {
}