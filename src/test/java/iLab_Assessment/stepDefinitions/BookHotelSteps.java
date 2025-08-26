package iLab_Assessment.stepDefinitions;

import iLab_Assessment.elements.BookHotel;
import iLab_Assessment.pages.BookHotelPage;
import org.openqa.selenium.WebDriver;

public class BookHotelSteps extends BaseSteps {

    private final BookHotelPage bookHotelPage;

    public BookHotelSteps() {
        WebDriver driver = getDriver();
        bookHotelPage = new BookHotelPage(driver);
    }
}
