package Pages;

import Base.BaseClass;
import org.openqa.selenium.By;

public class Header extends BaseClass {
    private final By registerBtn = By.xpath("//div[2]/div[1]/ul/li[1]/a");
    private final By loginBtn = By.xpath("//div[2]/div[1]/ul/li[2]/a");
    private final By logoutBtn = By.className("ico-logout");
    private final By wishlistBtn = By.className("ico-wishlist");
    private final By shoppingCartBtn = By.className("ico-cart");

    public Header(){
        super();
    }
    public void goToRegisterPage(){
        clickOn(registerBtn);
    }
    public void goToLoginPage(){
        clickOn(loginBtn);
    }
    public void logout(){
        clickOn(logoutBtn);
    }
    public Boolean getRegisterText(){
        return waitToPresent(registerBtn).isDisplayed();
    }
    public void goToWishlistPage(){
        clickOn(wishlistBtn);
    }
    public void goToShoppingCartPage(){
        clickOn(shoppingCartBtn);
    }
}