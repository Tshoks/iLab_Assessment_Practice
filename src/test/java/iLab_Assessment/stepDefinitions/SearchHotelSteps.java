package iLab_Assessment.stepDefinitions;

import iLab_Assessment.pages.SearchHotelPage;
import io.cucumber.java.en.*;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;


public class SearchHotelSteps extends BaseSteps {

    private final SearchHotelPage searchHotelPage;

    public SearchHotelSteps() {
        WebDriver driver = getDriver();
        searchHotelPage = new SearchHotelPage(driver) ;
    }

    @Given("I am on the search hotel page")
    public void i_am_on_the_search_hotel_page() throws InterruptedException {
        Assert.assertTrue("I am not on the Search Hotel Page", searchHotelPage.verify_i_am_onSearchHotelPage("Search Hotel"));
    }

    @When("^I select location (.*) and hotel (.*)$")
    public void i_select_location_and_hotel(String location, String hotel) {
        Assert.assertTrue("Unable to select location", searchHotelPage.select_location(location));
        Assert.assertTrue("Unable to select hotel", searchHotelPage.select_hotel(hotel));
    }

    @When("^I select location (.*)$")
    public void i_select_location(String location) {
        Assert.assertTrue("Unable to select location", searchHotelPage.select_location(location));
    }

    @When("^I select room type (.*) and number of rooms (.*)$")
    public void i_select_room_type_and_number_of_rooms(String roomType, String numRooms) {
        Assert.assertTrue("Unable to select room type", searchHotelPage.select_roomType(roomType));
        Assert.assertTrue("Unable to select number of rooms", searchHotelPage.select_numRooms(numRooms));
    }

    @When("^I enter checkIn date (.*) and checkOut date (.*)$")
    public void i_enter_check_in_date_and_check_out_date(String checkInDate, String checkOutDate) {
        Assert.assertTrue("Unable to enter check-in date", searchHotelPage.enter_checkIn_date(checkInDate));
        Assert.assertTrue("Unable to enter check-out date", searchHotelPage.enter_checkOut_date(checkOutDate));
    }

    @When("^I select adults per room (.*) and children per room (.*)$")
    public void i_select_adults_per_room_and_children_per_room(String adultsPerRoom, String childrenPerRoom) {
        Assert.assertTrue("Unable to select number of adults per room", searchHotelPage.select_adultsPerRoom(adultsPerRoom));
        Assert.assertTrue("Unable to select number of children per room", searchHotelPage.select_childrenPerRoom(childrenPerRoom));
    }

    @Then("I click on the search button")
    public void i_click_on_the_search_button() {
        Assert.assertTrue("Unable to click Search button", searchHotelPage.click_searchBtn());
    }
}
