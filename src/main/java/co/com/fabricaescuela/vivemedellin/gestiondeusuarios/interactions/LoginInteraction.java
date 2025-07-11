package co.com.fabricaescuela.vivemedellin.gestiondeusuarios.interactions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Interaction;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;


import static co.com.fabricaescuela.vivemedellin.gestiondeusuarios.userinterfaces.Login.*;

public class LoginInteraction implements Interaction {

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(Enter.theValue("a").into(USERNAME_FIELD));
        actor.attemptsTo(Enter.theValue("a").into(PASSWORD_FIELD));
        actor.attemptsTo(Click.on(LOGIN_BUTTON));
    }

    public static LoginInteraction login() {

        return Tasks.instrumented(LoginInteraction.class);
    }
}