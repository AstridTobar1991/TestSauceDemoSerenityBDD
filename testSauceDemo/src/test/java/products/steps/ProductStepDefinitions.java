package products.steps;

import authenticator.task.LoginTask;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.ensure.Ensure;
import net.serenitybdd.screenplay.questions.page.TheWebPage;
import products.task.CheckOutTask;
import products.task.ListProductTask;
import products.userInterface.CheckoutForm;

public class ProductStepDefinitions {
    @Given("{actor} se encuentra dentro del sistema con el usuario {user} y clave {password}")
    public void ingresa_al_portal_de_compras(Actor actor, String user, String password){
        actor.wasAbleTo(LoginTask.theLoginPage(), LoginTask.theLoginSetCredentials(user, password), LoginTask.theLoginExecute());
    }
    @When("{actor} agrega dos productos del listado de productos al carrito de compras")
    public void agrega_dos_producto_al_carrito(Actor actor){
        actor.attemptsTo(ListProductTask.theAddItemsToCar());
    }

    @And("{actor} visualiza los productos seleccionados en el carrito de compra")
    public void visualida_los_productos(Actor actor){
        actor.attemptsTo(ListProductTask.theOpenCarPage());
    }
    @And("{actor} ingresa al formulario de compra")
    public void ingresa_al_formulario_de_compra(Actor actor){
        actor.attemptsTo(CheckOutTask.theCheckoutPage());
    }
    @And("{actor} ingresa los datos para nomber: {nombre} apellido: {apellido} zip: {zip}")
    public void ingresa_datos_al_formulario(Actor actor, String nombre, String apellido, String zip){
        actor.attemptsTo(CheckOutTask.theEnterDataForm(nombre, apellido, zip));
    }
    @And("{actor} va a la pagina del resumen de la compra")
    public void va_a_la_pagina_del_resumen_de_la_compra(Actor actor) {
        actor.attemptsTo(CheckOutTask.theSummaryPage());
    }
    @And("{actor} finaliza la compra")
    public void finaliza_la_compra(Actor actor) {
        actor.attemptsTo(CheckOutTask.theFinishPage());
    }

    @Then("{actor} tiene la confirmacion por pantalla")
    public void tiene_la_confirmacion_por_pantalla(Actor actor) {
        actor.attemptsTo(CheckOutTask.theConfirmationtext());
    }
}
