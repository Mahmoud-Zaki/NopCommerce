package Pages;

import Base.BaseClass;
import org.openqa.selenium.By;

public class ShoppingCartPage extends BaseClass {
    private final By productName = By.className("product-name");
    private final By removeProductBtn = By.className("remove-btn");
    private final By quantityField = By.className("qty-input");
    private final By price = By.className("product-unit-price");
    private final By totalPrice = By.className("product-subtotal");
    private final By emptyShoppingCartMessage = By.className("no-data");
    private final By updateCartBtn = By.id("updatecart");

    public ShoppingCartPage(){
        super();
    }
    public String getFirstProductName(){
        return getText(productName);
    }
    public void removeProduct(){
        clickOn(removeProductBtn);
    }
    public String getEmptyShoppingCartMessage(){
        return getText(emptyShoppingCartMessage);
    }
    public void updateCart(){
        clickOn(updateCartBtn);
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
    public String getPrice(){
        return getText(price);
    }
    public String getTotalPrice(){
        return getText(totalPrice);
    }
    public String getQuantity(){
        return getAttribute(quantityField,"value");
    }
    public void setQuantity(String quantity){
        sendKeys(quantityField,quantity);
    }
}