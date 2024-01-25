package authenticator.task;

import authenticator.NavigateTo.LoginPage;
import authenticator.userInterface.LoginForm;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.actions.Open;
import net.serenitybdd.screenplay.waits.Wait;
import net.serenitybdd.screenplay.waits.WaitUntil;

public class LoginTask {
    public static Performable theLoginPage(){
        return Task.where("{0} abre la pagina de saucedemo",
                Open.browserOn().the(LoginPage.class));
    }

    public static Performable theLoginSetCredentials(String user, String password){
        return Task.where("{0} ingresa el usuario '" + user +"' y la clave '" + password+"'",
                Enter.theValue(user).into(LoginForm.USER),
                Enter.theValue(password).into(LoginForm.PASSWORD));
    }

    public static Performable theLoginExecute(){
        return Task.where("{0} da click en ingresar",
                Click.on(LoginForm.BTNLOGIN));
    }
}
