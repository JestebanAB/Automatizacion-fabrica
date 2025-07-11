package co.com.fabricaescuela.vivemedellin.gestiondeusuarios.stepdefinitions;

import co.com.fabricaescuela.vivemedellin.gestiondeusuarios.questions.SuccessfulLogin;
import co.com.fabricaescuela.vivemedellin.gestiondeusuarios.tasks.UserLogin;
import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.serenitybdd.annotations.Managed;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import net.serenitybdd.screenplay.actions.Open;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;
import org.openqa.selenium.WebDriver;

import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static org.hamcrest.Matchers.containsString;

public class UserLoginStepDefinition {

    @Managed(driver="chrome")
    public WebDriver driver;

    private Actor user = Actor.named("user");

    @Before
    public void config(){
        OnStage.setTheStage(new OnlineCast());
        //OnStage.theActorCalled("user");
        user.can(BrowseTheWeb.with(driver));
    }

    @Given("que estoy en la pagina de inicio de sesion del sistema")
    public void imInTheLoginPage() {
        user.attemptsTo(Open.url("http://localhost:???/login"));
    }

    @When("ingreso un usuario y contrasena validos")
    public void  iEnterMyCredentials(){
        user.attemptsTo(UserLogin.login());

    }

    @Then("accedo exitosamente al sistema y se muestra la pagina principal")
    public void successfullyAccessed(){
        user.should(seeThat(SuccessfulLogin.success(), containsString("inicio de sesión exitoso")));
    }
}
