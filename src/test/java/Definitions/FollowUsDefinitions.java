package Definitions;

import Pages.Footer;
import Utilies.HelperClass;

import java.util.ArrayList;

public class FollowUsDefinitions {
    private final Footer footer = new Footer();
    public String faceBookURL = "facebook.com";
    public String twitterURL = "twitter.com";
    public String youtubeURL = "youtube.com";
    public String rssURL = "rss.com";
    public int numberOfTabsBeforeClickOnSocial;

    public void followFacebookPage() {
        setNumberOfTabsBeforeClickOnSocial();
        footer.socialFollow(1);
    }
    public void followTwitterPage() {
        setNumberOfTabsBeforeClickOnSocial();
        footer.socialFollow(2);
    }
    public void followYoutubeChannel() {
        setNumberOfTabsBeforeClickOnSocial();
        footer.socialFollow(4);
    }
    public void followRss() {
        setNumberOfTabsBeforeClickOnSocial();
        footer.socialFollow(3);
    }
    public String getCurrentURL() {
        ArrayList<String> tabs = new ArrayList<String>(HelperClass.getDriver().getWindowHandles());
        return HelperClass.getDriver().switchTo().window(tabs.get(1)).getCurrentUrl();
    }
    private void setNumberOfTabsBeforeClickOnSocial() {
        ArrayList<String> tabs = new ArrayList<String>(HelperClass.getDriver().getWindowHandles());
        numberOfTabsBeforeClickOnSocial = tabs.size();
    }
    public int getNumberOfTabsAfterClickOnSocial() {
        ArrayList<String> tabs = new ArrayList<String>(HelperClass.getDriver().getWindowHandles());
        return tabs.size();
    }
}
