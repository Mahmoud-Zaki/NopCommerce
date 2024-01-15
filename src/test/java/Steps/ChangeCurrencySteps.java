package Steps;

import Definitions.ChangeCurrencyDefinitions;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.testng.Assert;

public class ChangeCurrencySteps {
    private final ChangeCurrencyDefinitions definitions = new ChangeCurrencyDefinitions();

    @When("Change currency to Euro")
    public void changeCurrencyToEuro() {
        definitions.changeCurrencyTo("Euro");
    }

    @Then("Verify that price of items in the website in Euro")
    public void verifyThatPriceOfItemsInTheWebsiteInEuro() {
        Assert.assertTrue(definitions.getItemPrice().contains(definitions.euroSign));
    }

    @When("Change currency to Dollar")
    public void changeCurrencyToDollar() {
        definitions.changeCurrencyTo("US Dollar");
    }

    @Then("Verify that price of items in the website in Dollar")
    public void verifyThatPriceOfItemsInTheWebsiteInDollar() {
        Assert.assertTrue(definitions.getItemPrice().contains(definitions.dollarSign));
    }
}
