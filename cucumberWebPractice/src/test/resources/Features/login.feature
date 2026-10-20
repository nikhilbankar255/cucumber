#Author-Nikhil
Feature: test login functionality
@smoketest
  Scenario: login with valid credentials
    Given user is on login page
    When user enter username and password
    And clicks on login button
    Then navigation to home page

   