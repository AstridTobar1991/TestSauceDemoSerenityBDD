package products.userInterface;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class ListProductForm {
    public static Target LISTPRODUCTS = Target.the("lista de productos").located(By.id("inventory_container"));
    public static Target PRODUCT_A = Target.the("producto a").located(By.name("add-to-cart-sauce-labs-backpack"));
    public static Target PRODUCT_B = Target.the("producto b").located(By.name("add-to-cart-sauce-labs-bike-light"));
    public static Target BUTTON_CAR = Target.the("carrito de compras").located(By.className("shopping_cart_link"));

}
