package tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import userinterface.HomePage;

public class AddProduct implements Task {

    private String product;

    public AddProduct(String product) {
        this.product = product;
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Click.on(HomePage.SELECT_PRODUCT.of(product)),
                Click.on(HomePage.ADD_CART)
        );
    }

    public static AddProduct byName(String product){
        return Tasks.instrumented(AddProduct.class, product);
    }

}
