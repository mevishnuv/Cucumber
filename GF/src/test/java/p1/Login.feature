Feature: Login

  Scenario: Successful Login
    Given i Enter the username
    And i Enter the password
    When i click on Login button
    Then Home page is displayed
