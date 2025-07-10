package co.com.fabricaescuela.vivemedellin.gestiondeusuarios.tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;

public class UserEmailVerification implements Task{
    private UserEmailVerification(){}

    @Override
    public <T extends Actor> void performAs(T t) {
        //todo interaction
    }

    public static UserEmailVerification login(){
        return Tasks.instrumented(UserEmailVerification.class);
    }

}
