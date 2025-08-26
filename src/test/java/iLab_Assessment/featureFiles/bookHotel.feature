Feature: Book Hotel

  @BookHotel
  Scenario Outline: Book the selected hotel
    Given I am on the book hotel page
    When I enter firstname: <firstname>, lastname: <lastname> and billing address: <address>
    And I ent credit card number: <creditCardNumber>
    And I select credit card type: <creditCardType>
    And I select the expiry date as month: <expiryMonth> and year: <expiryYear>
    And I enter the CVV number: <cvvNumber>
    Then I click on the Book Now button

    Examples:
    | firstname | lastname | address                                      | creditCardNumber | creditCardType | expiryMonth | expiryYear | cvvNumber |
    | Bongiwe   | Masango  | 215 Chakela Str, Wedela, Carletonville, 2499 | 2554783192541617 |     VISA       |     10      |    30      |   401     |