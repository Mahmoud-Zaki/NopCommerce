@Regression_TCs @ChangeCurrency_TCs
Feature: Change Currency

  Background:
    Given Go to home page

  @ChangeCurrency_TC_01
  Scenario: Change currency to Euro

    When Change currency to Euro
    Then Verify that price of items in the website in Euro

  @ChangeCurrency_TC_02
  Scenario: Change currency to Dollar

    When Change currency to Dollar
    Then Verify that price of items in the website in Dollar