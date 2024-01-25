package products.task;

import authenticator.NavigateTo.LoginPage;
import authenticator.userInterface.LoginForm;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.actions.Open;
import net.serenitybdd.screenplay.ensure.Ensure;
import products.userInterface.CheckoutForm;
import products.userInterface.ListProductForm;

public class ListProductTask {
    public static Performable theAddItemsToCar(){
        return Task.where("{0} agrega 2 items al carrito",
                Click.on(ListProductForm.PRODUCT_A),
                Click.on(ListProductForm.PRODUCT_B));
    }

    public static Performable theOpenCarPage(){
        return Task.where("{0} ingresa al carrito de compras",
                Click.on(ListProductForm.BUTTON_CAR));
    }
}
