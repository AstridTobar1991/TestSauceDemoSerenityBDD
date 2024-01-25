package products.task;

import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.ensure.Ensure;
import products.userInterface.CheckoutForm;

public class CheckOutTask {
    public static Performable theCheckoutPage(){
        return Task.where("{0} Se dirige al formulario de compras",
                Click.on(CheckoutForm.BUTTON_CHECKOUT));
    }

    public static Performable theEnterDataForm(String nombre, String apellido, String zip){
        return Task.where("{0} Ingresa los datos al formulario",
                Enter.theValue(nombre).into(CheckoutForm.INPUT_FIRST_NAME),
                Enter.theValue(apellido).into(CheckoutForm.INPUT_LAST_NAME),
                Enter.theValue(zip).into(CheckoutForm.INPUT_ZIP));
    }

    public static Performable theSummaryPage(){
        return Task.where("{0} Va a la pagina del resumen de la compra",
                Click.on(CheckoutForm.BUTTON_CONTINUE));
    }

    public static Performable theFinishPage(){
        return Task.where("{0} Finaliza la compra",
                Click.on(CheckoutForm.BUTTON_FINISH));
    }

    public static Performable theConfirmationtext() {
        return Task.where("{0} confirma que la compra se haya hecho",
                Ensure.that(CheckoutForm.TEXT_FINISH).hasText("Thank you for your order!"));
    }
}
