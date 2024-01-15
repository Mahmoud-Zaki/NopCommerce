package Definitions;

import Pages.HomePage;
import Utilies.HelperClass;

public class ChangeCurrencyDefinitions {
    private final HomePage homePage = new HomePage();
    public String dollarSign = "$";
    public String euroSign = "€";

    public void changeCurrencyTo(String currency) {
        homePage.changeCurrency(currency);
    }
    public String getItemPrice() {
        return homePage.getItemPrice();
    }
}