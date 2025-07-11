package co.com.fabricaescuela.vivemedellin.gestiondeusuarios.userinterfaces;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class    AccountElimination {
    public static final Target ACCOUNT_ELIMINATION_BUTTON = Target.the("ACCOUNT ELIMINATION BUTTON")
            .located(By.id("account-elimination-button"));

    public static final Target CONFIRM_BUTTON = Target.the("CONFIRM BUTTON")
            .located(By.id("confirm-button"));

    public static final Target PASSWORD_FIELD = Target.the("PASSWORD FIELD")
            .located(By.id("password"));

    public static final Target CONFIRM_ELIMINATION_BUTTON = Target.the("CONFIRM ELIMINATION BUTTON")
            .located(By.id("confirm-elimination-button"));

    public static final Target SUCCESS_ELIMINATION = Target.the("SUCCESS ELIMINATION")
            .located(By.id("success-elimination"));
}
