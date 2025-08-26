package iLab_Assessment.elements;

import org.openqa.selenium.By;

public class BookHotel {

    private final By book_hotel_firstname = By.className("");
    private final By book_hotel_lastname = By.id("");
    private final By book_hotel_address = By.id("");
    private final By book_hotel_creditCardNumber = By.id("");
    private final By book_hotel_creditCardType = By.className("");
    private final By book_hotel_expiryMonth = By.id("");
    private final By book_hotel_expiryYear = By.id("");
    private final By book_hotel_cvvNumber = By.id("");
    private final By bookNowBtn = By.id("");
    private final By cancelBtn = By.id("");

    public By getBook_hotel_firstname() {
        return book_hotel_firstname;
    }

    public By getBook_hotel_lastname() {
        return book_hotel_lastname;
    }

    public By getBook_hotel_address() {
        return book_hotel_address;
    }

    public By getBook_hotel_creditCardNumber() {
        return book_hotel_creditCardNumber;
    }

    public By getBook_hotel_creditCardType() {
        return book_hotel_creditCardType;
    }

    public By getBook_hotel_expiryMonth() {
        return book_hotel_expiryMonth;
    }

    public By getBook_hotel_expiryYear() {
        return book_hotel_expiryYear;
    }

    public By getBook_hotel_cvvNumber() {
        return book_hotel_cvvNumber;
    }

    public By getBookNowBtn() {
        return bookNowBtn;
    }

    public By getCancelBtn() {
        return cancelBtn;
    }
}
