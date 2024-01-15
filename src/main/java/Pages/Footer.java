package Pages;

import Base.BaseClass;
import org.openqa.selenium.By;

public class Footer extends BaseClass {
    private final By compareListPageBtn = By.xpath("//a[@href='/compareproducts']");

    public Footer(){
        super();
    }
    private By getSocialXpath(int socialNum){
        return By.xpath("//ul[@class='networks']/li["+socialNum+"]/a");
    }
    public void socialFollow(int socialNumber){
        clickOn(getSocialXpath(socialNumber));
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
    public void goToCompareListPage(){
        clickOn(compareListPageBtn);
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
}