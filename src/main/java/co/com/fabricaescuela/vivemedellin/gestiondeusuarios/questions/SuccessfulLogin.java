package co.com.fabricaescuela.vivemedellin.gestiondeusuarios.questions;

import co.com.fabricaescuela.vivemedellin.gestiondeusuarios.userinterfaces.Login;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.Text;

public class SuccessfulLogin implements Question<String> {
    @Override
    public String answeredBy(Actor actor) {
        return Text.of(Login.SUCCESS_LOGIN_MESSAGE).answeredBy(actor);
    }

    public static SuccessfulLogin success(){
        return new SuccessfulLogin();
    }
}