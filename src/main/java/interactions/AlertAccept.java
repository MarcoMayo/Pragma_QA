package interactions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Interaction;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.waits.WaitUntil;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class AlertAccept implements Interaction {
    @Override
    public <T extends Actor> void performAs(T actor) {
        WebDriver driver =  BrowseTheWeb.as(actor).getDriver();
        actor.attemptsTo(WaitUntil.the(ExpectedConditions.alertIsPresent()));
        driver.switchTo().alert().accept();
    }

    public static final AlertAccept ok(){
        return Tasks.instrumented(AlertAccept.class);
    }

}
