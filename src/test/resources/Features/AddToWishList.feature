@Regression_TCs @AddToWishList_TCs
Feature: Add to wishlist

  Background:
    Given Go to home page

  @AddToWishlist_TC_01
  Scenario: Add product to wishlist from the product page

    Given Go to product page
    When Add the product to wishlist from the product page
    And Go to wishlist page
    Then Verify that product added in the wishlist

  @AddToWishlist_TC_02
  Scenario: Add product to wishlist from the home page

    When Add the product to wishlist from the home page
    And Go to wishlist page
    Then Verify that product added in the wishlist

  @AddToCompareList_TC_03
  Scenario: Remove product from wishlist

    Given Add the product to wishlist from the home page
    And Go to wishlist page
    When Remove product from wishlist page
    Then Verify that the product deleted wishlist