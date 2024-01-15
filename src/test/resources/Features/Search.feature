@Regression_TCs @Search_TCs
Feature: Search

  Background:
    Given Go to home page

  @Search_TC_01
  Scenario Outline: Search using product name
    When Enter product name as "<productName>"
    Then Verify that the product has "<productName>" is displayed
    Examples:
      |  productName  |
      |      book     |
      |     laptop    |
      |      nike     |
      |   photoshop   |