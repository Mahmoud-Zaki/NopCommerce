@Regression_TCs @FollowUs_TCs
Feature: Logout

  Background:
    Given Go to home page

  @FollowUs_TC_01
  Scenario: Follow facebook page

    When Follow facebook page
    Then Verify that facebook page opened in another tab

  @FollowUs_TC_02
  Scenario: Follow twitter page

    When Follow twitter page
    Then Verify that twitter page opened in another tab

  @FollowUs_TC_03
  Scenario: Follow youtube channel

    When Follow youtube channel
    Then Verify that youtube channel opened in another tab

  @FollowUs_TC_04
  Scenario: Follow rss

    When Follow rss
    Then Verify that rss opened in another tab