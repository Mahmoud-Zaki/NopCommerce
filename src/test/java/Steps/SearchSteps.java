package Steps;

import Definitions.SearchDefinitions;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.testng.Assert;

public class SearchSteps {
    private final SearchDefinitions definitions = new SearchDefinitions();

    @When("Enter product name as {string}")
    public void enterProductNameAs(String productName) {
        definitions.search(productName);
    }

    @Then("Verify that the product has {string} is displayed")
    public void verifyThatTheProductHasIsDisplayed(String productName) {
        Assert.assertTrue(definitions.foundProductNameInTitles(productName));
    }
}
