package co.com.fabricaescuela.vivemedellin.gestiondeusuarios.questions;

import co.com.fabricaescuela.vivemedellin.gestiondeusuarios.userinterfaces.AccountElimination;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.Text;

public class SuccessAccountElimination implements Question<String> {

    @Override
    public String answeredBy(Actor actor) {
        return Text.of(AccountElimination.SUCCESS_ELIMINATION).answeredBy(actor);
    }

    public static SuccessAccountElimination successElimination(){
        return new SuccessAccountElimination();
    }
}
