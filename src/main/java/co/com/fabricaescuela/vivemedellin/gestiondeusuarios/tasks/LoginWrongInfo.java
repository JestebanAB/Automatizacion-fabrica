package co.com.fabricaescuela.vivemedellin.gestiondeusuarios.tasks;

import co.com.fabricaescuela.vivemedellin.gestiondeusuarios.userinterfaces.Login;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;


import static net.serenitybdd.screenplay.Tasks.instrumented;

public class LoginWrongInfo implements Task {
    private final String username;
    private final String password;

    public LoginWrongInfo(String username, String password) {
        this.username = username;
        this.password = password;
    }

    public static LoginWrongInfo withData(String username, String password) {
        return instrumented(LoginWrongInfo.class, username, password);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Enter.theValue(username).into(Login.USERNAME_FIELD),
                Enter.theValue(password).into(Login.USERNAME_FIELD),
                Click.on(Login.LOGIN_BUTTON)
        );

    }
}
