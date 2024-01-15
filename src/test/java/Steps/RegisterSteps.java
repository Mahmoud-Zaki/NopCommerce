package Steps;

import Definitions.RegisterDefinitions;
import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.testng.Assert;

public class RegisterSteps {

    private final RegisterDefinitions definitions = new RegisterDefinitions();

    @Given("Go to home page")
    public void goToHomePage() {
        definitions.goToHomePage();
    }

    @And("Go to registration page")
    public void goToRegistrationPage() {
        definitions.goToRegistrationPage();
    }

    @When("Enter data with the following details:")
    public void enterDataWithTheFollowingDetails(DataTable dataTable) {
        definitions.register(dataTable);
    }

    @Then("Verify that successful message is displayed")
    public void verifyThatSuccessfulMessageIsDisplayed() {
        Assert.assertTrue(definitions.getActualSuccessfulRegistrationMessage().contains(definitions.expectedSuccessfulRegistrationMessage));
    }

    @Then("Verify that password doesn't match with confirm password message is displayed")
    public void verifyThatPasswordDoesNotMatchWithConfirmPasswordMessageIsDisplayed() {
        Assert.assertTrue(definitions.getActualConfirmPasswordErrorMessage().contains(definitions.expectedConfirmPasswordErrorMessage));
    }

    @Then("Verify that exist email message is displayed")
    public void verifyThatExistEmailMessageIsDisplayed() {
        Assert.assertTrue(definitions.getActualExistEmailMessage().contains(definitions.expectedExistEmailMessage));
    }
}