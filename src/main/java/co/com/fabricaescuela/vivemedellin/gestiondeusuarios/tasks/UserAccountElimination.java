package co.com.fabricaescuela.vivemedellin.gestiondeusuarios.tasks;

import co.com.fabricaescuela.vivemedellin.gestiondeusuarios.interactions.AccountEliminationInteraction;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;

public class UserAccountElimination implements Task {
    private UserAccountElimination(){}

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(AccountEliminationInteraction.accountElimination());
    }

    public static UserAccountElimination accountElimination(){
        return Tasks.instrumented(UserAccountElimination.class);
    }
}
