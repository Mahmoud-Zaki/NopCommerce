package Steps;

import Definitions.LogoutDefinitions;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import org.testng.Assert;

public class LogoutSteps {
    private final LogoutDefinitions definitions = new LogoutDefinitions();

    @And("Logout from account")
    public void logoutFromAccount() {
        definitions.logout();
    }

    @Then("Verify that logout successfully")
    public void verifyThatLogoutSuccessfully() {
        Assert.assertTrue(definitions.registrationAppears());
    }
}
