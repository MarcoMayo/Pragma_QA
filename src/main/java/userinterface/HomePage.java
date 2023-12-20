package userinterface;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class HomePage {

    public static final Target SELECT_PRODUCT = Target.the("Select {0}").locatedBy("//*[@id='article' and contains(text(),'{0}')]//parent::*//a[@href]");
    public static final Target ADD_CART = Target.the("Add to the shopping cart").locatedBy("//a[@class='btn btn-success btn-lg']");
    public static final Target CART_BUTTON = Target.the("Cart button").located(By.id("cartur"));
    public static final Target HOME_BUTTON = Target.the("Home button").locatedBy("//*[@class='nav-link' and contains(text(),'Home')]");

}
