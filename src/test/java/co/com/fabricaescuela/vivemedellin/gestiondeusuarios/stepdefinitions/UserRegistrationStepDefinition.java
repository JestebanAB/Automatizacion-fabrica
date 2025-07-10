package co.com.fabricaescuela.vivemedellin.gestiondeusuarios.stepdefinitions;

import co.com.fabricaescuela.vivemedellin.gestiondeusuarios.tasks.UserRegistration;
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

public class UserRegistrationStepDefinition {

    @Managed(driver="chrome")
    public WebDriver driver;

    private Actor user = Actor.named("user");

    @Before
    public void config(){
        OnStage.setTheStage(new OnlineCast());
        //OnStage.theActorCalled("user");
        user.can(BrowseTheWeb.with(driver));
    }

    @Given("que estoy en la página de registro del sistema")
    public void imInTheRegistrationPage() {
        user.attemptsTo(Open.url("http://localhost:???/registration"));
    }

    @When("ingreso todos los datos requeridos correctamente")
    public void  iEnterMyRegistrationCredentials(){
        user.attemptsTo(UserRegistration.registration());
    }

    @Then("el sistema crea la cuenta y muestra un mensaje de confirmación")
    public void successfullyRegistration(){
        //todo question
    }
}
