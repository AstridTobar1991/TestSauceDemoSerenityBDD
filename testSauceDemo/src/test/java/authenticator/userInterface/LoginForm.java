package authenticator.userInterface;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;


public class LoginForm {
    public static final Target USER = Target.the("input user").located(By.id("user-name"));
    public static final Target PASSWORD = Target.the("input password").located(By.id("password"));
    public static final Target BTNLOGIN = Target.the("button login").located(By.id("login-button"));
}
