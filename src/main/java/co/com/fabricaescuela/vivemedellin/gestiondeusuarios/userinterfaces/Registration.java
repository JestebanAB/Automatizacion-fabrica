    package co.com.fabricaescuela.vivemedellin.gestiondeusuarios.userinterfaces;

    import net.serenitybdd.screenplay.targets.Target;
    import org.openqa.selenium.By;

    public class Registration {

        public static final Target NAME_FIELD = Target.the("NAME")
                .located(By.name("name"));

        public static final Target DATE_OF_BIRTH_FIELD = Target.the("DATE OF BIRTH")
                .located(By.name("date-of-birth"));

        public static final Target INTERESTS_FIELD = Target.the("INTERESTS")
                .located(By.id("interests"));

        public static final Target LOCATION_FIELD = Target.the("LOCATION")
                .located(By.name("location"));

        public static final Target NICKNAME_FIELD = Target.the("NICKNAME")
                .located(By.name("nick-name"));

        public static final Target EMAIL_FIELD = Target.the("EMAIL")
                .located(By.id("email"));

        public static final Target PASSWORD_FI3LD = Target.the("PASSWORD")
                .located(By.name("password"));

        public static final Target PASSWORD_CONFIRMATION_FIELD = Target.the("PASSWORD CONFIRMATION")
                .located(By.name("password-confirmation"));

        public static final Target PROFILE_PICTURE_FIELD = Target.the("PROFILE PICTURE")
                .located(By.id("profile-picture"));

        public static final Target BIOGRAPHY_FIELD = Target.the("BIOGRAPHY")
                .located(By.name("biography"));

        public static final Target PHONE_NUMBER_FIELD = Target.the("PHONE NUMBER")
                .located(By.name("phone-number"));

        public static final Target REGISTRATION_BUTTON = Target.the("REGISTRATION BUTTON")
                .located(By.id("registration-button"));

        public static final Target SUCCESS_REGISTRATION_MESSAGE = Target.the("SUCCESS REGISTRATION MESSAGE")
                .located(By.id("success-registration-message"));

    }
