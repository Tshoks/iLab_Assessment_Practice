Feature: Login Feature

  @PositiveLogin
  Scenario Outline: Login Positive Test
    Given I am on login page
    When I enter username <username> and password <password>
    Then I click on login button

    Examples:
    | username       | password |
    | thembinkosi488 | 66LYG6   |