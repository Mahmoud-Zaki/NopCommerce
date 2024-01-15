package Steps;

import Definitions.AddToShoppingCartDefinitions;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.testng.Assert;

public class AddToShoppingCartSteps {
    private final AddToShoppingCartDefinitions definitions = new AddToShoppingCartDefinitions();

    @When("Add the product to shopping cart from the product page")
    public void addTheProductToShoppingCartFromTheProductPage() {
        definitions.addTheProductToShoppingCartFromTheProductPage();
    }

    @And("Go to shopping cart")
    public void goToShoppingCart() {
        definitions.goToShoppingCartPage();
    }

    @Then("Verify that product added in the shopping cart")
    public void verifyThatProductAddedInTheShoppingCart() {
        Assert.assertEquals(definitions.getFirstProductNameInShoppingCartPage(),definitions.productName);
    }

    @When("Add the product to shopping cart from the home page")
    public void addTheProductToShoppingCartFromTheHomePage() {
        definitions.addTheProductToShoppingCartFromTheHomePage();
    }

    @When("Remove product from shopping cart")
    public void removeProductFromShoppingCart() {
        definitions.removeProduct();
    }

    @Then("Verify that product deleted from shopping cart")
    public void verifyThatProductDeletedFromShoppingCart() {
        Assert.assertTrue(definitions.getActualEmptyShoppingCartMessage().contains(definitions.expectedEmptyShoppingCartMessage));
    }

    @When("update the quantity of the product")
    public void updateTheQuantityOfTheProduct() {
        definitions.updateQuantity();
    }

    @Then("Verify that product cost and quantity updated")
    public void verifyThatProductCostAndQuantityUpdated() {
        Assert.assertEquals(definitions.getActualTotalPrice(),definitions.getExpectedTotalPrice());
    }
}