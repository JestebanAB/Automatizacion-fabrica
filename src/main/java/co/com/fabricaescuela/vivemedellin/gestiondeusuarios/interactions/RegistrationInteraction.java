package co.com.fabricaescuela.vivemedellin.gestiondeusuarios.interactions;


import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Interaction;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;


import static co.com.fabricaescuela.vivemedellin.gestiondeusuarios.userinterfaces.Registration.*;

public class RegistrationInteraction implements Interaction {

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(Enter.theValue("a").into(NAME_FIELD));
        actor.attemptsTo(Enter.theValue("a").into(DATE_OF_BIRTH_FIELD));
        actor.attemptsTo(Enter.theValue("a").into(INTERESTS_FIELD));
        actor.attemptsTo(Enter.theValue("a").into(LOCATION_FIELD));
        actor.attemptsTo(Enter.theValue("a").into(NICKNAME_FIELD));
        actor.attemptsTo(Enter.theValue("a").into(EMAIL_FIELD));
        actor.attemptsTo(Enter.theValue("a").into(PASSWORD_FI3LD));
        actor.attemptsTo(Enter.theValue("a").into(PASSWORD_CONFIRMATION_FIELD));
        actor.attemptsTo(Enter.theValue("a").into(PROFILE_PICTURE_FIELD));
        actor.attemptsTo(Enter.theValue("a").into(BIOGRAPHY_FIELD));
        actor.attemptsTo(Enter.theValue("a").into(PHONE_NUMBER_FIELD));
        actor.attemptsTo(Click.on(REGISTRATION_BUTTON));
    }

    public static RegistrationInteraction registration() {

        return Tasks.instrumented(RegistrationInteraction.class);
    }
}
