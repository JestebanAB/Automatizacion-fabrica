package co.com.fabricaescuela.vivemedellin.gestiondeusuarios.stepdefinitions;

import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.serenitybdd.annotations.Managed;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;
import org.openqa.selenium.WebDriver;

public class UserAccountEliminationStepDefinition {

    @Managed(driver="chrome")
    public WebDriver driver;

    private Actor user = Actor.named("user");

    @Before
    public void config(){
        OnStage.setTheStage(new OnlineCast());
        //OnStage.theActorCalled("user");
        user.can(BrowseTheWeb.with(driver));
    }

    @Given("que estoy autenticado en el sistema")
    public void imAuthenticated() {
        //todo task
    }

    @When("hago clic en el enlace de verificación con un token válido")
    public void  iClicTheLink(){
        //todo task
    }

    @Then("el sistema confirma la verificación y activa mi cuenta")
    public void TheSystemConfirmTheVerification(){
        //todo question
    }
}
