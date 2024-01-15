@Regression_TCs @Login_TCs
Feature: Login

  Background:
    Given Go to home page

  @Login_TC_01
  Scenario: Login with valid data

    Given Go to registration page
    And Enter data with the following details:
      |  gender  |  firstname  |  lastname  |  day  |  month  |  year  |       email            |  companyName  |   password   |   confirmPassword   |
      |   male   |   mahmoud   |    zaki    |  16   |  April  |  2000  |  mahmoudmz@gmail.com   |  E-commerce   |  1234567890  |      1234567890     |
    And Go to login page
    When Enter email as "mahmoudmz@gmail.com" and password as "1234567890"
    Then Verify that logged in successfully and redirect to home page

  @Login_TC_02
  Scenario Outline: Login with invalid data

    Given Go to login page
    When Enter email as "<email>" and password as "<password>"
    Then Verify that error message is displayed

    Examples:
      |      email       |  password   |
      |  mum@gmail.com   |  123456789  |
      |  pop@gmail.com   |  123456789  |

  @Login_TC_03
  Scenario: Login with blank email

    Given Go to login page
    When Enter email as "" and password as "123456789"
    Then Verify that email error message is displayed

  @Login_TC_04
  Scenario: Login with blank password

    Given Go to login page
    When Enter email as "mahmoud@gmail.com" and password as ""
    Then Verify that error message is displayed