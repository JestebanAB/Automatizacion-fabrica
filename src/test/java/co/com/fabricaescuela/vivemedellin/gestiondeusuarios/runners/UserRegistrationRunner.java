package co.com.fabricaescuela.vivemedellin.gestiondeusuarios.runners;

import io.cucumber.junit.CucumberOptions;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(
        features = "src/test/resources/features/user_registration.feature",
        glue = "co.com.fabricaescuela.vivemedellin.stepdefinitions",
        snippets = CucumberOptions.SnippetType.CAMELCASE
)
public class UserRegistrationRunner {
}
