Feature: Select Hotel Feature

  @SelectHotel
  Scenario: Select Hotel from the table.
    Given I am on the select hotel page
    When I select the hotel form the table
    Then I click on continue button

    @IterateHotelList
    Scenario: Iterate over the hotel list
      Given I am on the select hotel page
      When I iterate over the list
      Then I print the hotel names