package Pages;

import Base.BaseClass;
import org.openqa.selenium.By;

public class ProductPage extends BaseClass {
    final private By addToShoppingCartBtn = By.id("add-to-cart-button-18");
    final private By addToWishListBtn = By.id("add-to-wishlist-button-18");
    final private By addToCompareListBtn = By.xpath("//div[@class=\"compare-products\"]/button");
    final private By productName = By.xpath("//div[@class='product-name']/h1");

    public ProductPage(){
        super();
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
        clickOn(addToWishListBtn);
    }
    public void addToCompareList(){
        clickOn(addToCompareListBtn);
    }
    public String getTheProductName(){
        return getText(productName);
    }
}