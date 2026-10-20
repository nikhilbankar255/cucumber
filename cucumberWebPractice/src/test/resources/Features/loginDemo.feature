Feature: Test login functionality

  Scenario Outline: Check login functionality with valid credentials
    Given browser is open
    And user is on login page
    When user enters "<username>" and "<password>"
    And user clicks on login
    Then user should see "<status>"

    Examples:
      | username | password | status |
      | admin    | admin123 | pass   |

       