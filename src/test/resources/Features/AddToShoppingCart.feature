@Regression_TCs @AddToShoppingCart_TCs
Feature: Add to shopping cart

  Background:
    Given Go to home page

  @AddToShoppingCart_TC_01
  Scenario: Add product to shopping cart from the product page

    Given Go to product page
    When Add the product to shopping cart from the product page
    And Go to shopping cart
    Then Verify that product added in the shopping cart

  @AddToShoppingCart_TC_02
  Scenario: Add product to shopping cart from the home page

    When Add the product to shopping cart from the home page
    And Go to shopping cart
    Then Verify that product added in the shopping cart

  @AddToShoppingCart_TC_03
  Scenario: Remove product from shopping cart

    Given Add the product to shopping cart from the home page
    And Go to shopping cart
    When Remove product from shopping cart
    Then Verify that product deleted from shopping cart

  @AddToShoppingCart_TC_03
  Scenario: Update product in the shopping cart

    Given Add the product to shopping cart from the home page
    And Go to shopping cart
    When update the quantity of the product
    Then Verify that product cost and quantity updated