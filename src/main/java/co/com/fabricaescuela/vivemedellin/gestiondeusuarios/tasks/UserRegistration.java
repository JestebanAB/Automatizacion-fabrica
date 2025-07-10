package co.com.fabricaescuela.vivemedellin.gestiondeusuarios.tasks;

import co.com.fabricaescuela.vivemedellin.gestiondeusuarios.interactions.RegistrationInteraction;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;

public class UserRegistration implements Task{
    private UserRegistration(){}

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(RegistrationInteraction.registration());
    }

    public static UserRegistration registration(){
        return Tasks.instrumented(UserRegistration.class);
    }
}


