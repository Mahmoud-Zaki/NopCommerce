package Definitions;

import Pages.CompareListPage;
import Pages.Footer;
import Pages.HomePage;
import Pages.ProductPage;
import Utilies.HelperClass;

public class AddToCompareListDefinitions {
    private final HomePage homePage = new HomePage();
    private final ProductPage productPage = new ProductPage();
    private final Footer footer = new Footer();
    private final CompareListPage compareListPage =new CompareListPage();
    public String productName;
    public String secondProductNameInCompareListBeforeDeleted;
    public String expectedEmptyCompareListMessage = "You have no items to compare.";

    public void goToProductPage(){
        homePage.goToProductPage();
    }
    public void addTheProductToCompareListFromTheProductPage(){
        productName = productPage.getTheProductName();
        productPage.addToCompareList();
    }
    public void goToCompareListPage(){
        footer.goToCompareListPage();
    }
    public void removeProduct(){
        HelperClass.getDriver().navigate().refresh();
        secondProductNameInCompareListBeforeDeleted = compareListPage.getTheSecondProductName();
        compareListPage.removeTheFirstProduct();
    }
    public String getFirstProductNameInCompareList(){
        HelperClass.getDriver().navigate().refresh();
        return compareListPage.getTheFirstProductName();
    }
    public void clearProducts(){
        HelperClass.getDriver().navigate().refresh();
        compareListPage.clearProducts();
    }
    public String getActualEmptyCompareListMessage(){
        HelperClass.getDriver().navigate().refresh();
        return compareListPage.getEmptyCompareListMessage();
    }
    public void addTheProductToCompareListFromTheHomePage(){
        productName = homePage.getTheProductName43();
        homePage.addToCompareList();
    }
}