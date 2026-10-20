Feature: Check login functionality

  Scenario: 
    Given user is on the login page
    When user enters valid username and password
    And clicks on login button
    Then user is naviagted to the homepage
