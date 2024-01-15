package Definitions;

import Pages.HomePage;

import java.util.List;

public class SearchDefinitions {
    private final HomePage homePage = new HomePage();

    public void search(String productName){
        homePage.enterProductNameToSearch(productName);
        homePage.search();
    }
    public Boolean foundProductNameInTitles(String productName){
        List<String> titles = homePage.getTheTitlesOfSearchResults();
        for(String title: titles){
            if(title.toLowerCase().contains(productName))
                return true;
        }
        return false;
    }
}