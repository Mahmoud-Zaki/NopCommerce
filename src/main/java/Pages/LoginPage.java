package Pages;

import Base.BaseClass;
import org.openqa.selenium.By;

public class LoginPage extends BaseClass {
    final private By emailField = By.id("Email");
    final private By passwordField = By.id("Password");
    final private By loginBtn = By.xpath("//form/div[3]/button");
    final private By emailErrorMessage = By.id("Email-error");
    final private By errorMessage = By.xpath("//form/div[1]");
    final private By myAccount = By.className("ico-account");

    public LoginPage(){
        super();
    }
    public void enterEmail(String email){
        sendKeys(emailField,email);
    }
    public void enterPassword(String password){
        sendKeys(passwordField,password);
    }
    public void login(){
        clickOn(loginBtn);
    }
    public String getActualEmailErrorMessage(){
        return getText(emailErrorMessage);
    }
    public String getActualErrorMessage(){
        return getText(errorMessage);
    }
    public Boolean myAccountAppear(){
        return waitToPresent(myAccount).isDisplayed();
    }
}