package iLab_Assessment.elements;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class SearchHotel {

    private final By searchHotel_label = By.xpath("//td[contains(text(),'Search Hotel')]");
    private final By location_dropdown = By.id("location");
    private final By hotels_dropdown = By.id("hotels");
    private final By roomType_dropdown = By.id("room_type");
    private final By numRooms_dropdown = By.id("room_nos");
    private final By checkInDate_input = By.id("datepick_in");
    private final By checkOutDate_input = By.id("datepick_out");
    private final By adultsPerRoom_dropdown = By.id("adult_room");
    private final By childrenPerRoom_dropdown = By.id("child_room");
    private final By searchBtn = By.id("Submit");
    private final By resetBtn = By.id("Reset");

    public By getSearchHotel_label() {
        return searchHotel_label;
    }

    public By getLocation_dropdown() {
        return location_dropdown;
    }

    public By getLocation_dropdownOption(String option) {
        return By.xpath("//option[contains(text(),'" + option + "')]");
    }

    public By getHotels_dropdown() {
        return hotels_dropdown;
    }

    public By getHotels_dropdownOption(String option) {
        return By.xpath("//option[contains(text(),'"+option+"')]");
    }

    public By getRoomType_dropdown() {
        return roomType_dropdown;
    }

    public By getRoomType_dropdownOption(String option) {
        return By.xpath("//option[contains(text(),'"+option+"')]");
    }

    public By getNumRooms_dropdown() {
        return numRooms_dropdown;
    }

    public By getNumRooms_dropdownOption(String option) {
        return By.xpath("//option[contains(text(),'"+option+"')]");
    }

    public By getCheckInDate_input() {
        return checkInDate_input;
    }

    public By getCheckOutDate_input() {
        return checkOutDate_input;
    }

    public By getAdultsPerRoom_dropdown() {
        return adultsPerRoom_dropdown;
    }

    public By getAdultsPerRoom_dropdownOption(String option) {
        return By.xpath("//option[contains(text(),'"+option+"')]");
    }

    public By getChildrenPerRoom_dropdown() {
        return childrenPerRoom_dropdown;
    }

    public By getChildrenPerRoom_dropdownOption(String option) {
        return By.xpath("//option[contains(text(),'"+option+"')]");
    }

    public By getSearchBtn() {
        return searchBtn;
    }

    public By getResetBtn() {
        return resetBtn;
    }
}
