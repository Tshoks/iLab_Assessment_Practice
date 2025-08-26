package iLab_Assessment.pages;

import iLab_Assessment.elements.BookHotel;
import org.openqa.selenium.WebDriver;

public class BookHotelPage extends BasePage {

    private final BookHotel bookHotel;

    public BookHotelPage(WebDriver driver) {
        super(driver);
        bookHotel = new BookHotel();
    }
}
