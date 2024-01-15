@Regression_TCs @AddToCompareList_TCs
Feature: Add to compare list

  Background:
    Given Go to home page

  @AddToCompareList_TC_01
  Scenario: Add product to compare list from the product page

    Given Go to product page
    When Add the product to compare list from the product page
    And Go to compare list page
    Then Verify that product added in the compare list

  @AddToCompareList_TC_02
  Scenario: Add product to compare list from the home page

    When Add the product to compare list from the home page
    And Go to compare list page
    Then Verify that product added in the compare list

  @AddToCompareList_TC_03
  Scenario: Remove product from compare list

    Given Add the product to compare list from the home page
    And Go to product page
    And Add the product to compare list from the product page
    When Go to compare list page
    And Remove product from compare list page
    Then Verify that the product deleted from compare list

  @AddToCompareList_TC_04
  Scenario: Clear compare page

    Given Add the product to compare list from the home page
    And Go to product page
    And Add the product to compare list from the product page
    When Go to compare list page
    And Clear compare list page from items
    Then Verify that compare list page is empty