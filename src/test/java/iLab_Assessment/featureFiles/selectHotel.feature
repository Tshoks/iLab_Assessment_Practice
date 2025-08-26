Feature: Select Hotel Feature

  @IterateHotelList
  Scenario: Iterate over the hotel list
    Given I am on the select hotel page
    When I iterate over the list
    Then I print the hotel names

  @SelectHotel
  Scenario Outline: Select Hotel from the table.
    Given I am on the select hotel page
    When I select the <hotel> from the table
    Then I click on continue button

    Examples:
    | hotel       |
    | Hotel Creek |