package Pages;

import Base.BaseClass;
import Utilies.HelperClass;
import org.openqa.selenium.By;

public class WishListPage extends BaseClass {
    private final By productName = By.className("product-name");
    private final By removeProductBtn = By.className("remove-btn");
    private final By emptyWishlistMessage = By.className("no-data");

    public WishListPage(){
        super();
    }
    public String getFirstProductName(){
        return getText(productName);
    }
    public void removeProduct(){
        clickOn(removeProductBtn);
    }
    public String getEmptyWishlistMessage(){
        return getText(emptyWishlistMessage);
    }
}