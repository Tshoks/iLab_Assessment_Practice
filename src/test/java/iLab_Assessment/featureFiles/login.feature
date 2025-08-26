Feature: Login Feature

  @PositiveLogin
  Scenario Outline: Login Positive Test
    Given I am on login page
    When I enter username <username> and password <password>
    Then I click on login button

    Examples:
    | username       | password |
    | thembinkosi488 | 66LYG6   |


  @WrongCredentials
  Scenario Outline: Login with correct username and wrong password
    Given I am on login page
    When I enter username <username> and password <password>
    Then I click on login button

    Examples:
      | username              | password | communication|
      | @ | #   |      vkjjnvds*&^%vchj        |


  @WrongUsernameCorrectPassword
  Scenario Outline: Login Positive Test
    Given I am on login page
    When I enter username <username> and password <password>
    Then I click on login button

    Examples:
      | username       | password |
      | thembinkosi488 | 66LYG6   |
