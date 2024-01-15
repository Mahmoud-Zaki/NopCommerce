@Regression_TCs @Register_TCs
Feature: Register

  Background:
    Given Go to home page
    And Go to registration page

  @Register_TC_01
  Scenario: Register with valid data

    When Enter data with the following details:
      |  gender  |  firstname  |  lastname  |  day  |  month  |  year  |       email        |  companyName  |   password   |   confirmPassword   |
      |   male   |   mahmoud   |    zaki    |  16   |  April  |  2000  |   mmzi@gmail.com   |  E-commerce   |  1234567890  |      1234567890     |
    Then Verify that successful message is displayed

  @Register_TC_02
  Scenario: Register with password doesn't match with confirm password

    When Enter data with the following details:
      |  gender  |  firstname  |  lastname  |  day  |  month  |  year  |        email         |  companyName  |   password   |   confirmPassword   |
      |   male   |   mahmoud   |    zaki    |  16   |  April  |  2000  |  mahmoud4@gmail.com  |  E-commerce   |  1234567890  |       12345678      |
    Then Verify that password doesn't match with confirm password message is displayed

  @Register_TC_03
  Scenario: Register with exist email

    When Enter data with the following details:
      |  gender  |  firstname  |  lastname  |  day  |  month  |  year  |      email       |  companyName  |   password   |   confirmPassword   |
      |   male   |   mahmoud   |    zaki    |  16   |  April  |  2000  |  mmzi@gmail.com  |  E-commerce   |  1234567890  |      1234567890     |
    Then Verify that exist email message is displayed