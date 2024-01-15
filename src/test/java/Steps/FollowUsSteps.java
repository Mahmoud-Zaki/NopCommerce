package Steps;

import Definitions.FollowUsDefinitions;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.testng.Assert;

public class FollowUsSteps {
    private final FollowUsDefinitions definitions =new FollowUsDefinitions();

    @When("Follow facebook page")
    public void followFacebookPage() {
        definitions.followFacebookPage();
    }

    @Then("Verify that facebook page opened in another tab")
    public void verifyThatFacebookPageOpenedInAnotherTab() {
        Assert.assertEquals(definitions.getNumberOfTabsAfterClickOnSocial(),definitions.numberOfTabsBeforeClickOnSocial+1);
        Assert.assertTrue(definitions.getCurrentURL().contains(definitions.faceBookURL));
    }

    @When("Follow twitter page")
    public void followTwitterPage() {
        definitions.followTwitterPage();
    }

    @Then("Verify that twitter page opened in another tab")
    public void verifyThatTwitterPageOpenedInAnotherTab() {
        Assert.assertEquals(definitions.getNumberOfTabsAfterClickOnSocial(),definitions.numberOfTabsBeforeClickOnSocial+1);
        Assert.assertTrue(definitions.getCurrentURL().contains(definitions.twitterURL));
    }

    @When("Follow youtube channel")
    public void followYoutubeChannel() {
        definitions.followYoutubeChannel();
    }

    @Then("Verify that youtube channel opened in another tab")
    public void verifyThatYoutubeChannelOpenedInAnotherTab() {
        Assert.assertEquals(definitions.getNumberOfTabsAfterClickOnSocial(),definitions.numberOfTabsBeforeClickOnSocial+1);
        Assert.assertTrue(definitions.getCurrentURL().contains(definitions.youtubeURL));
    }

    @When("Follow rss")
    public void followRss() {
        definitions.followRss();
    }

    @Then("Verify that rss opened in another tab")
    public void verifyThatRssOpenedInAnotherTab() {
        Assert.assertEquals(definitions.getNumberOfTabsAfterClickOnSocial(),definitions.numberOfTabsBeforeClickOnSocial+1);
        Assert.assertTrue(definitions.getCurrentURL().contains(definitions.rssURL));
    }
}