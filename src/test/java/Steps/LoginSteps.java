package Steps;

import Definitions.LoginDefinitions;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.testng.Assert;

public class LoginSteps {
    private final LoginDefinitions definitions = new LoginDefinitions();

    @Given("Go to login page")
    public void goToLoginPage() {
        definitions.goToLoginPage();
    }

    @When("Enter email as {string} and password as {string}")
    public void enterEmailAndPassword(String email, String password) {
        definitions.login(email,password);
    }

    @Then("Verify that logged in successfully and redirect to home page")
    public void verifyThatLoggedInSuccessfullyAndRedirectToHomePage() {
        Assert.assertTrue(definitions.myAccountAppear());
        Assert.assertEquals(definitions.getActualHomePageURL(),definitions.expectedHomePageURL);
    }

    @Then("Verify that email error message is displayed")
    public void verifyThatEmailErrorMessageIsDisplayed() {
        Assert.assertTrue(definitions.getActualEmailErrorMessage().contains(definitions.expectedEmailErrorMessage));
    }

    @Then("Verify that error message is displayed")
    public void verifyThatErrorMessageIsDisplayed() {
        Assert.assertTrue(definitions.getActualErrorMessage().contains(definitions.expectedErrorMessage));
    }
}
