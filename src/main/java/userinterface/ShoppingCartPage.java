package userinterface;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class ShoppingCartPage {

    public static final Target PRODUCTS = Target.the("Products in the shopping cart").locatedBy("//*[@id='tbodyid']/tr");
    public static final Target PRODUCT_DELETE = Target.the("Delete product").locatedBy("//*[@id='tbodyid']/tr//a[text()='Delete']");
    public static final Target TOTAL = Target.the("Total").located(By.id("totalp"));

}
