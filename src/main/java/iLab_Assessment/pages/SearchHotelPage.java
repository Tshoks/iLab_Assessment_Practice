package iLab_Assessment.pages;

import iLab_Assessment.elements.SearchHotel;
import org.openqa.selenium.WebDriver;

public class SearchHotelPage extends BasePage {

    private final SearchHotel searchHotel;

    public SearchHotelPage(WebDriver driver) {
        super(driver);
        searchHotel = new SearchHotel();
    }

    public boolean verify_i_am_onSearchHotelPage(String value) throws InterruptedException {
        return verifyText(searchHotel.getSearchHotel_label(), value);
    }

    public boolean select_location(String location) {
        return select_option(searchHotel.getLocation_dropdown(), "visible_text", location);
    }

    public boolean select_hotel(String hotel) {
        return select_option(searchHotel.getHotels_dropdown(), "visible_text", hotel);
    }

    public boolean select_roomType(String roomType) {
        return select_option(searchHotel.getRoomType_dropdown(), "visible_text", roomType);
    }

    public boolean select_numRooms(String numRooms) {
        return select_option(searchHotel.getNumRooms_dropdown(), "visible_text", numRooms);
    }

    public boolean enter_checkIn_date(String inDate) {
        return enter_text_to(searchHotel.getCheckInDate_input(), inDate);
    }

    public boolean enter_checkOut_date(String outDate) {
        return enter_text_to(searchHotel.getCheckOutDate_input(), outDate);
    }

    public boolean select_adultsPerRoom(String adultsPerRoom) {
        return select_option(searchHotel.getAdultsPerRoom_dropdown(), "visible_text", adultsPerRoom);
    }

    public boolean select_childrenPerRoom(String childrenPerRoom) {
        return select_option(searchHotel.getChildrenPerRoom_dropdown(), "visible_text", childrenPerRoom);
    }

    public boolean click_searchBtn() {
        return click(searchHotel.getSearchBtn());
    }

    public boolean click_resetBtn() {
        return click(searchHotel.getResetBtn());
    }
}
