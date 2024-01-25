package authenticator.steps;

import authenticator.task.LoginTask;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.ensure.Ensure;
import net.serenitybdd.screenplay.questions.page.TheWebPage;

public class LoginStepDefinitions {
    @Given("{actor} ingresa a la pagina de saucedemo")
    public void ingresa_a_la_pagina_de_saucedemo(Actor actor){
        actor.wasAbleTo(LoginTask.theLoginPage());
    }
    @When("{actor} ingresa el usuario {user} y la clave {password}")
    public void ingresa_el_usuario_standard_user_y_la_clave_secret_sauce(Actor actor, String user, String password) {
        actor.attemptsTo(LoginTask.theLoginSetCredentials(user, password));
    }
    @When("{actor} da click en ingresar")
    public void da_click_en_ingresar(Actor actor) {
        actor.attemptsTo(LoginTask.theLoginExecute());
    }
    @Then("{actor} ingresa al portal del listado de productos")
    public void ingresa_al_portal_del_listado_de_productos(Actor actor){
        actor.attemptsTo(Ensure.that(TheWebPage.currentUrl()).containsIgnoringCase("inventory"));
    }
}
