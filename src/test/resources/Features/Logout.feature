@Regression_TCs @Logout_TCs
Feature: Logout

  Background:
    Given Go to home page
    And Go to login page
    And Enter email as "mahmoudmz@gmail.com" and password as "1234567890"

  @Logout_TC_01
  Scenario: Logout

    When Logout from account
    Then Verify that logout successfully