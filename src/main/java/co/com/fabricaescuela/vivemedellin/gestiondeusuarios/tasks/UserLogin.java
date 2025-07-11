package co.com.fabricaescuela.vivemedellin.gestiondeusuarios.tasks;

import co.com.fabricaescuela.vivemedellin.gestiondeusuarios.interactions.LoginInteraction;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;

public class UserLogin implements Task {

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(LoginInteraction.login());
    }

    public static UserLogin login(){
        return Tasks.instrumented(UserLogin.class);
    }

}