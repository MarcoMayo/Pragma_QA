package runners;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.cucumber.junit.CucumberOptions;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(
        features = "src/test/resources/features/shopping_cart.feature",
        glue = {"stepsdefinitions"},
        snippets = CucumberOptions.SnippetType.CAMELCASE,
        tags = ""
)

public class ShoppingCart {}
