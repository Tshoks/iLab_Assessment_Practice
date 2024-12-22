Feature: Search Hotel Feature
  Background: I want to search for my desired hotel destination.

    @PositiveSearchHotel
    Scenario Outline: Search Hotel with correct data
      Given I am on the search hotel page
      When I select location <location> and hotel <hotel>
      And I select room type <roomType> and number of rooms <numOfRooms>
      And I enter checkIn date <checkInDate> and checkOut date <checkOutDate>
      And I select adults per room <adultsPerRoom> and children per room <childrenPerRoom>
      Then I click on the search button

      Examples:
      | location | hotel        | roomType  | numOfRooms  | checkInDate | checkOutDate  | adultsPerRoom | childrenPerRoom |
      | Sydney   | Hotel Creek  | Deluxe    | 2 - Two     | 01/11/2024  | 03/11/2024    | 2 - Two       | 1 - One         |



      @ListOfHotelsInLocation
     Scenario Outline: Search for a list of hotels in one location
        Given I am on the search hotel page
        When I select location <location>
        Then I click on the search button

        Examples:
        | location  |
        | London    |