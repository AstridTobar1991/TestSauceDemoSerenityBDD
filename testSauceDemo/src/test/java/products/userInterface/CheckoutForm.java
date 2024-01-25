package products.userInterface;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class CheckoutForm {
    public static Target BUTTON_CHECKOUT = Target.the("formulario de compras").located(By.id("checkout"));
    public static Target INPUT_FIRST_NAME = Target.the("input name").located(By.id("first-name"));
    public static Target INPUT_LAST_NAME = Target.the("input lastname").located(By.id("last-name"));
    public static Target INPUT_ZIP = Target.the("input zip").located(By.id("postal-code"));
    public static Target BUTTON_CONTINUE = Target.the("boton continuar").located(By.id("continue"));
    public static Target BUTTON_FINISH = Target.the("boton finalizar compra").located(By.id("finish"));
    public static Target TEXT_FINISH = Target.the("texto finalizado").located(By.className("complete-header"));





}
