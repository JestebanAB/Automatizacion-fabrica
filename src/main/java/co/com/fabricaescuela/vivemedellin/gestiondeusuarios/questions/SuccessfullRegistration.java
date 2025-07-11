package co.com.fabricaescuela.vivemedellin.gestiondeusuarios.questions;

import co.com.fabricaescuela.vivemedellin.gestiondeusuarios.userinterfaces.Registration;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.Text;

public class SuccessfullRegistration implements Question<String> {
    @Override
    public String answeredBy(Actor actor) {
        return Text.of(Registration.SUCCESS_REGISTRATION_MESSAGE).answeredBy(actor);
    }

    public static SuccessfullRegistration successRe(){
        return new SuccessfullRegistration();
    }

}
