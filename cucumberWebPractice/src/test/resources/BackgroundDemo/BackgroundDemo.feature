Feature: Check homepage functionality

  Background: user is logged in
    Given user navigates to login page
    When user enters username and password
    And clicks login button
    Then user is navigated to homepage

  Scenario: Check logout link
    When user clicks on welcome link
    Then logout link is displayed

  Scenario: Verify quick launch toolbar is present
    When user clicks on dashboard link
    Then quick launch toolbar is displayed
