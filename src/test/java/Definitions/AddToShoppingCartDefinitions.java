package Definitions;

import Pages.Header;
import Pages.HomePage;
import Pages.ProductPage;
import Pages.ShoppingCartPage;
import Utilies.HelperClass;

public class AddToShoppingCartDefinitions {
    private final HomePage homePage = new HomePage();
    private final Header header = new Header();
    private final ProductPage productPage = new ProductPage();
    private final ShoppingCartPage shoppingCartPage = new ShoppingCartPage();
    public String productName;
    public String expectedEmptyShoppingCartMessage = "Your Shopping Cart is empty!";

    public void addTheProductToShoppingCartFromTheProductPage(){
        productName = productPage.getTheProductName();
        productPage.addToShoppingCart();
    }
    public void goToShoppingCartPage(){
        header.goToShoppingCartPage();
    }
    public String getFirstProductNameInShoppingCartPage(){
        HelperClass.getDriver().navigate().refresh();
        return shoppingCartPage.getFirstProductName();
    }
    public void removeProduct(){
        HelperClass.getDriver().navigate().refresh();
        shoppingCartPage.removeProduct();
    }
    public String getActualEmptyShoppingCartMessage(){
        HelperClass.getDriver().navigate().refresh();
        return shoppingCartPage.getEmptyShoppingCartMessage();
    }
    public void addTheProductToShoppingCartFromTheHomePage(){
        productName = homePage.getTheProductName18();
        homePage.addToShoppingCart();
    }
    public void updateQuantity(){
        HelperClass.getDriver().navigate().refresh();
        shoppingCartPage.setQuantity("4");
        shoppingCartPage.updateCart();
    }
    public double getActualTotalPrice(){
        String totalPrice = shoppingCartPage.getTotalPrice().replace("$","");
        return Double.parseDouble(totalPrice);
    }
    public double getExpectedTotalPrice(){
        String price = shoppingCartPage.getPrice().replace("$","");
        int quantity = Integer.parseInt(shoppingCartPage.getQuantity());
        double cost = Double.parseDouble(price);
        return cost * quantity;
    }
}