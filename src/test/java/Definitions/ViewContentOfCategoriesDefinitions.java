package Definitions;

import Pages.HomePage;
import java.util.Random;

public class ViewContentOfCategoriesDefinitions {
    private final HomePage homePage = new HomePage();
    public String categoryName;
    public void chooseMainCategory(){
        Random randomNumber = new Random();
        int mainCategoryNumber = randomNumber.nextInt(7) + 1;
        categoryName = homePage.chooseMainCategory(mainCategoryNumber);
    }
    public void chooseSubCategory(){
        Random randomNumber = new Random();
        int mainCategoryNumber = randomNumber.nextInt(3) + 1;
        int subCategoryNumber = randomNumber.nextInt(3) + 1;
        categoryName = homePage.chooseSubCategory(mainCategoryNumber,subCategoryNumber);
    }
    public String getDisplayedCategoryTitle(){
        return homePage.getCategoryTitle();
    }
}
