package co.com.fabricaescuela.vivemedellin.gestiondeusuarios.userinterfaces;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class EmailVerification {

    public static final Target SEND_VERIFICATION_BUTTON = Target.the("SEND VERIFICATION EMAIL BUTTON")
            .located(By.id("send-verification-button"));
}
