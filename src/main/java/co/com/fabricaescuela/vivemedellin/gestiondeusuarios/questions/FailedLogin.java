package co.com.fabricaescuela.vivemedellin.gestiondeusuarios.questions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class FailedLogin implements Question<String> {

    private static final Target FAILED_LOGIN_MESSAGE = Target.the("failed login message")
            .located(By.cssSelector(""));

    @Override
    public String answeredBy(Actor actor) {
        return FAILED_LOGIN_MESSAGE.resolveFor(actor).getText();
    }

    public static FailedLogin text() {

        return new FailedLogin();
    }
}
