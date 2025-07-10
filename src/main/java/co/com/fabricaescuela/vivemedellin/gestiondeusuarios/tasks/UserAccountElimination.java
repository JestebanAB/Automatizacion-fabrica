package co.com.fabricaescuela.vivemedellin.gestiondeusuarios.tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;

public class UserAccountElimination implements Task {
    private UserAccountElimination(){}

    @Override
    public <T extends Actor> void performAs(T t) {
        //todo interaction
    }

    public static UserAccountElimination login(){
        return Tasks.instrumented(UserAccountElimination.class);
    }
}
