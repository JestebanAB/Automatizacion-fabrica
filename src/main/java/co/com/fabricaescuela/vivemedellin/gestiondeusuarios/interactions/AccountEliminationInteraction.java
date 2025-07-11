package co.com.fabricaescuela.vivemedellin.gestiondeusuarios.interactions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Interaction;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;

import static co.com.fabricaescuela.vivemedellin.gestiondeusuarios.userinterfaces.AccountElimination.*;

public class AccountEliminationInteraction implements Interaction{

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(Click.on(ACCOUNT_ELIMINATION_BUTTON));
        actor.attemptsTo(Click.on(CONFIRM_BUTTON));
        actor.attemptsTo(Enter.theValue("a").into(PASSWORD_FIELD));
        actor.attemptsTo(Click.on(CONFIRM_ELIMINATION_BUTTON));
    }

    public static AccountEliminationInteraction accountElimination() {

        return Tasks.instrumented(AccountEliminationInteraction.class);
    }
}

