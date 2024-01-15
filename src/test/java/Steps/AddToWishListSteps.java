package Steps;

import Definitions.AddToWishListDefinitions;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.testng.Assert;

public class AddToWishListSteps {
    private final AddToWishListDefinitions definitions = new AddToWishListDefinitions();

    @When("Add the product to wishlist from the product page")
    public void addTheProductToWishlistFromTheProductPage() {
        definitions.addTheProductToWishlistFromTheProductPage();
    }

    @And("Go to wishlist page")
    public void goToWishlistPage() {
        definitions.goToWishlistPage();
    }

    @Then("Verify that product added in the wishlist")
    public void verifyThatProductAddedInTheWishlist() {
        Assert.assertEquals(definitions.getFirstProductNameInWishlist(),definitions.productName);
    }

    @When("Add the product to wishlist from the home page")
    public void addTheProductToWishlistFromTheHomePage() {
        definitions.addTheProductToWishlistFromTheHomePage();
    }

    @When("Remove product from wishlist page")
    public void removeProductFromWishlistPage() {
        definitions.removeProduct();
    }

    @Then("Verify that the product deleted wishlist")
    public void verifyThatTheProductDeletedWishlist() {
        Assert.assertTrue(definitions.getActualEmptyWishlistMessage().contains(definitions.expectedEmptyWishlistMessage));
    }
}
