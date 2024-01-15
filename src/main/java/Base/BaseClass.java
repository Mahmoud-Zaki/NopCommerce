package Base;

import Utilies.HelperClass;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import java.time.Duration;
import java.util.List;

public class BaseClass {
    private final WebDriver driver = HelperClass.getDriver();
    private final WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(60));

    protected BaseClass(){
        PageFactory.initElements(HelperClass.getDriver(),this);
    }
    protected void clickOn(By element){
        wait.until(ExpectedConditions.elementToBeClickable(element)).click();
    }
    protected void sendKeys(By element,String text){
        WebElement webElement = wait.until(ExpectedConditions.presenceOfElementLocated(element));
        webElement.clear();
        webElement.sendKeys(text);
    }
    protected String getText(By element){
        return wait.until(ExpectedConditions.presenceOfElementLocated(element)).getText();
    }
    protected void selectByText(By element,String txt){
        WebElement webElement = wait.until(ExpectedConditions.presenceOfElementLocated(element));
        Select select = new Select(webElement);
        select.selectByVisibleText(txt);
    }
    protected WebElement waitToPresent(By locator){
        return wait.until(ExpectedConditions.visibilityOfElementLocated(locator));
    }
    protected void scrollTo(By element){
        WebElement webElement = waitToPresent(element);
        JavascriptExecutor js = (JavascriptExecutor)driver;
        js.executeScript("arguments[0].scrollIntoView();", webElement);
    }
    protected void hoverOn(By element){
        WebElement webElement = wait.until(ExpectedConditions.presenceOfElementLocated(element));
        Actions action = new Actions(driver);
        action.moveToElement(webElement).perform();
    }
    protected List<WebElement> getWebElements(By element){
        return wait.until(ExpectedConditions.presenceOfAllElementsLocatedBy(element));
    }
    protected String getAttribute(By element, String attribute){
        return wait.until(ExpectedConditions.presenceOfElementLocated(element)).getAttribute(attribute);
    }
}