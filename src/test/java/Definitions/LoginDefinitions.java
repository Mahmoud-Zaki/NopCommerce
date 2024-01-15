package Definitions;

import Pages.Header;
import Pages.LoginPage;
import Utilies.HelperClass;

public class LoginDefinitions {
    private final Header header = new Header();
    private final LoginPage loginPage = new LoginPage();
    public final String expectedHomePageURL = "https://demo.nopcommerce.com/";
    public final String expectedErrorMessage = "Login was unsuccessful";
    public final String expectedEmailErrorMessage = "email";

    public void goToLoginPage() {
        header.goToLoginPage();
    }
    public void login(String email, String password) {
        loginPage.enterEmail(email);
        loginPage.enterPassword(password);
        loginPage.login();
    }
    public String getActualHomePageURL(){
        return HelperClass.getDriver().getCurrentUrl();
    }
    public String getActualErrorMessage(){
        return loginPage.getActualErrorMessage();
    }
    public String getActualEmailErrorMessage(){
        return loginPage.getActualEmailErrorMessage();
    }
    public Boolean myAccountAppear(){
        return loginPage.myAccountAppear();
    }
}