package Steps;

import Definitions.AddToCompareListDefinitions;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.testng.Assert;

public class AddToCompareListSteps {
    private final AddToCompareListDefinitions definitions = new AddToCompareListDefinitions();

    @Given("Go to product page")
    public void goToProductPage() {
        definitions.goToProductPage();
    }

    @When("Add the product to compare list from the product page")
    public void addTheProductToCompareListFromTheProductPage() {
        definitions.addTheProductToCompareListFromTheProductPage();
    }

    @When("Add the product to compare list from the home page")
    public void addTheProductToCompareListFromTheHomePage() {
        definitions.addTheProductToCompareListFromTheHomePage();
    }

    @And("Go to compare list page")
    public void goToCompareListPage() {
        definitions.goToCompareListPage();
    }

    @Then("Verify that product added in the compare list")
    public void verifyThatProductAddedInTheCompareList() {
        Assert.assertEquals(definitions.getFirstProductNameInCompareList(),definitions.productName);
    }

    @And("Remove product from compare list page")
    public void removeProductCompareListPage() {
        definitions.removeProduct();
    }

    @Then("Verify that the product deleted from compare list")
    public void verifyThatTheProductDeletedFromCompareList() {
        Assert.assertEquals(definitions.getFirstProductNameInCompareList(),definitions.secondProductNameInCompareListBeforeDeleted);
    }

    @And("Clear compare list page from items")
    public void clearCompareListPageFromItems() {
        definitions.clearProducts();
    }

    @Then("Verify that compare list page is empty")
    public void verifyThatCompareListPageIsEmpty() {
        Assert.assertTrue(definitions.getActualEmptyCompareListMessage().contains(definitions.expectedEmptyCompareListMessage));
    }
}