package Pages;

import Base.BaseClass;
import Utilies.HelperClass;
import org.openqa.selenium.By;

public class CompareListPage extends BaseClass {
    private final By firstProductName = By.xpath("//tbody/tr[3]/td[2]/a");
    private final By secondProductName = By.xpath("//tbody/tr[3]/td[3]/a");
    private final By firstProductRemoveBtn = By.xpath("//tbody/tr[1]/td[2]/button");
    private final By clearBtn = By.xpath("//div[@class='page-body']/a");
    private final By emptyCompareListMessage = By.className("no-data");

    public CompareListPage(){
        super();
    }
    public String getTheFirstProductName(){
        return getText(firstProductName);
    }
    public String getTheSecondProductName(){
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        HelperClass.getDriver().navigate().refresh();
        return getText(secondProductName);
    }
    public void removeTheFirstProduct(){
        clickOn(firstProductRemoveBtn);
    }
    public void clearProducts(){
        clickOn(clearBtn);
    }
    public String getEmptyCompareListMessage(){
        return getText(emptyCompareListMessage);
    }
}
