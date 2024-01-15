@Regression_TCs @ViewContentOfCategories_TCs
Feature: View content of categories

  Background:
    Given Go to home page

  @ViewContentOfCategories_TC_01
  Scenario Outline: View content of random main category

    When Choose main category randomly
    Then Verify that items in this category is displayed

    Examples:
      |  id  |
      |   1  |
      |   2  |
      |   3  |


  @ViewContentOfCategories_TC_02
  Scenario Outline: View content of sub category

    When Choose sub category randomly
    Then Verify that items in this category is displayed

    Examples:
      |  id  |
      |   1  |
      |   2  |
      |   3  |