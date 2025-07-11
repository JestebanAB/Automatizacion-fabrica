package co.com.fabricaescuela.vivemedellin.gestiondeusuarios.userinterfaces;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class Login {
    public static final Target USERNAME_FIELD = Target.the("USERNAME FIELD")
            .located(By.name("user-name"));

    public static final Target PASSWORD_FIELD = Target.the("PASSWORD FIELD")
            .located(By.name("password"));

    public static final Target LOGIN_BUTTON = Target.the("Login button")
            .located(By.id("login-button"));

    public static final Target SUCCESS_LOGIN_MESSAGE = Target.the("SUCCESS LOGIN MESSAGE")
            .located(By.id("success-login-message"));

}