package iLab_Assessment.pages;

import iLab_Assessment.elements.SelectHotel;
import org.openqa.selenium.WebDriver;

public class SelectHotelPage extends BasePage {

    private final SelectHotel selectHotel;

    public SelectHotelPage(WebDriver driver) {
        super(driver);
        selectHotel = new SelectHotel(driver);
    }

    public boolean verify_if_i_am_on_selectHotelPage(String expectedText) throws InterruptedException {
        return verifyText(selectHotel.getSelect_hotel_label(), expectedText);
    }

    public boolean select_hotel() {
        return click(selectHotel.getSelect_radioBtn());
    }

    public boolean click_continue_btn() throws InterruptedException {
        wait_();
        return click(selectHotel.getContinueBtn());
    }

    public boolean click_cancel_btn() {
        return click(selectHotel.getCancelBtn());
    }

    public void verify_Hotels(String location) {
        int hotel_list = selectHotel.getHotels(location).size();
        for (int i = 1; i <= hotel_list; i++) {
            System.out.println("Hotel " + i);
        }
    }

    public void print_hotel_names(String location) {
        int hotel_list = selectHotel.getHotels(location).size();
        for (int i = 1; i <= hotel_list; i++) {
            System.out.println("Hotel " + i + " name is: " + selectHotel.getHotelName(i));
        }
    }
}
