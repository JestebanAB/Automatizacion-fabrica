package co.com.fabricaescuela.vivemedellin.gestiondeusuarios.stepdefinitions;

import co.com.fabricaescuela.vivemedellin.gestiondeusuarios.questions.SuccessAccountElimination;
import co.com.fabricaescuela.vivemedellin.gestiondeusuarios.tasks.UserAccountElimination;
import co.com.fabricaescuela.vivemedellin.gestiondeusuarios.tasks.UserLogin;
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

import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static org.hamcrest.Matchers.containsString;

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
    public void imAuthenticatedIn() {
        user.attemptsTo(UserLogin.login());
    }

    @When("solicito la eliminación de mi perfil y confirmo la acción")
    public void  iRequestTheElimination(){
        user.attemptsTo(UserAccountElimination.accountElimination());
    }

    @Then("el sistema elimina mi perfil y me muestra un mensaje de confirmación")
    public void TheSystemDeleteMyAccount(){
        user.should(seeThat(SuccessAccountElimination.successElimination(),
                containsString("Cuenta eliminada con exito")));
    }
}
