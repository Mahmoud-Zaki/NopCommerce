package Pages;

import Base.BaseClass;
import Utilies.HelperClass;
import org.openqa.selenium.By;
import java.util.ArrayList;
import java.util.List;

public class HomePage extends BaseClass {
    final private By searchInputField = By.id("small-searchterms");
    final private By searchBtn = By.xpath("//*[@id=\"small-search-box-form\"]/button");
    final private By currencySelect = By.id("customerCurrency");
    final private By itemPrice = By.xpath("//div[3]/div[1]/span");
    final private By productTitle = By.className("product-title");
    final private By categoryTitle = By.xpath("//div[@class='page-title']/h1");
    final private By productItem = By.xpath("//div[@data-productid='18']/div[1]/a");
    final private By productItemName43 = By.xpath("//div[@data-productid='43']/div[2]/h2/a");
    final private By productItemName18 = By.xpath("//div[@data-productid='18']/div[2]/h2/a");
    final private By addToShoppingCartBtn = By.xpath("//div[@data-productid='18']/div[2]/div[3]/div[2]/button[1]");
    final private By addToWishListBtn = By.xpath("//div[@data-productid='18']/div[2]/div[3]/div[2]/button[3]");
    final private By addToCompareListBtn = By.xpath("//div[@data-productid='43']/div[2]/div[3]/div[2]/button[2]");

    public HomePage(){
        super();
    }
    private By getMainCategoryXpath(int mainCategoryNum){
        return By.xpath("//div[@class='header-menu']/ul/li["+mainCategoryNum+"]/a");
    }
    private By getSubCategoryXpath(int mainCategoryNum,int subCategoryNum){
        return By.xpath("//div[@class='header-menu']/ul/li["+mainCategoryNum+"]/ul/li["+subCategoryNum+"]/a");
    }
    public void enterProductNameToSearch(String productName){
        sendKeys(searchInputField,productName);
    }
    public void search(){
        clickOn(searchBtn);
    }
    public List<String> getTheTitlesOfSearchResults(){
        List<String> titles = new ArrayList<String>();
        getWebElements(productTitle).forEach((webElement) -> {
            titles.add(webElement.getText());
        });
        return titles;
    }
    public void changeCurrency(String currency){
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        selectByText(currencySelect,currency);
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
    public String getItemPrice(){
        HelperClass.getDriver().navigate().refresh();
        scrollTo(itemPrice);
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        return getText(itemPrice);
    }
    public String chooseMainCategory(int mainCategoryNum){
        clickOn(getMainCategoryXpath(mainCategoryNum));
        return getText(getMainCategoryXpath(mainCategoryNum));
    }
    public String chooseSubCategory(int mainCategoryNum,int subCategoryNum){
        hoverOn(getMainCategoryXpath(mainCategoryNum));
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        String categoryName = getText(getSubCategoryXpath(mainCategoryNum,subCategoryNum));
        clickOn(getSubCategoryXpath(mainCategoryNum,subCategoryNum));
        return categoryName;
    }
    public String getCategoryTitle(){
        return getText(categoryTitle);
    }
    public void goToProductPage(){
        clickOn(productItem);
    }
    public String getTheProductName43(){
        return getText(productItemName43);
    }
    public String getTheProductName18(){
        return getText(productItemName18);
    }
    public void addToShoppingCart(){
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        clickOn(addToShoppingCartBtn);
    }
    public void addToWishList(){
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        clickOn(addToWishListBtn);
    }
    public void addToCompareList(){
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        clickOn(addToCompareListBtn);
    }
}