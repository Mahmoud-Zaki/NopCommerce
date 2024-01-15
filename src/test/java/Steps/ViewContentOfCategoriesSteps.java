package Steps;

import Definitions.ViewContentOfCategoriesDefinitions;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.testng.Assert;

public class ViewContentOfCategoriesSteps {
    private final ViewContentOfCategoriesDefinitions definitions = new ViewContentOfCategoriesDefinitions();

    @When("Choose main category randomly")
    public void chooseMainCategoryRandomly() {
        definitions.chooseMainCategory();
    }

    @When("Choose sub category randomly")
    public void chooseSubCategoryRandomly() {
        definitions.chooseSubCategory();
    }

    @Then("Verify that items in this category is displayed")
    public void verifyThatItemsInThisCategoryIsDisplayed() {
        Assert.assertEquals(definitions.getDisplayedCategoryTitle(),definitions.categoryName);
    }
}
