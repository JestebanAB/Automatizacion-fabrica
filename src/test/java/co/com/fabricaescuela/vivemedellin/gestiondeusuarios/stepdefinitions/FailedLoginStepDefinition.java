package co.com.fabricaescuela.vivemedellin.gestiondeusuarios.stepdefinitions;

import co.com.fabricaescuela.vivemedellin.gestiondeusuarios.questions.FailedLogin;
import co.com.fabricaescuela.vivemedellin.gestiondeusuarios.tasks.LoginWrongInfo;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.serenitybdd.screenplay.actors.OnStage;

import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static org.hamcrest.Matchers.containsString;

public class FailedLoginStepDefinition {

    @When("ingreso credenciales inválidas")
    public void enterInvalidCredentials() {
        OnStage.theActorInTheSpotlight().attemptsTo(
                LoginWrongInfo.withData("louis123", "12345")
        );
    }

    @Then("veo un mensaje de error indicando que el inicio de sesión fallo")
    public void iSeeAnErrorMessage() {
        OnStage.theActorInTheSpotlight().should(
                seeThat(FailedLogin.text(), containsString("Inicio de sesión fallido"))
        );
    }
}
