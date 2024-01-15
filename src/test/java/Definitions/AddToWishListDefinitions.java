package Definitions;

import Pages.Header;
import Pages.HomePage;
import Pages.ProductPage;
import Pages.WishListPage;
import Utilies.HelperClass;

public class AddToWishListDefinitions {
    private final HomePage homePage = new HomePage();
    private final Header header = new Header();
    private final ProductPage productPage = new ProductPage();
    private final WishListPage wishListPage = new WishListPage();
    public String productName;
    public String expectedEmptyWishlistMessage = "The wishlist is empty!";

    public void addTheProductToWishlistFromTheProductPage(){
        productName = productPage.getTheProductName();
        productPage.addToWishList();
    }
    public void goToWishlistPage(){
        header.goToWishlistPage();
    }
    public String getFirstProductNameInWishlist(){
        HelperClass.getDriver().navigate().refresh();
        return wishListPage.getFirstProductName();
    }
    public void removeProduct(){
        HelperClass.getDriver().navigate().refresh();
        wishListPage.removeProduct();
    }
    public String getActualEmptyWishlistMessage(){
        HelperClass.getDriver().navigate().refresh();
        return wishListPage.getEmptyWishlistMessage();
    }
    public void addTheProductToWishlistFromTheHomePage(){
        productName = homePage.getTheProductName18();
        homePage.addToWishList();
    }
}