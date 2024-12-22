package iLab_Assessment.elements;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.List;

public class SelectHotel {

    private WebDriver driver;
    private final By select_hotel_label = By.className("login_title");
    private final By select_radioBtn = By.id("radiobutton_0");
    private final By continueBtn = By.id("continue");
    private final By cancelBtn = By.id("cancel");

    public SelectHotel(WebDriver driver) {
        this.driver = driver;
    }

    public List<WebElement> getHotels(String hotel) {
        return driver.findElements(By.xpath("//td[@class='login_title']//ancestor::tbody//following::tr//input[@value='"+hotel+"' and @class='select_text']"));
    }

    public String getHotelName(int index) {
        return driver.findElement(By.xpath("//td[@class='login_title']//ancestor::tbody//following::tr//input[@name='hotel_name_"+index+"' and @class='select_text']")).getAttribute("value");
    }

    public By getSelect_hotel_label() {
        return select_hotel_label;
    }

    public By getSelect_radioBtn() {
        return select_radioBtn;
    }

    public By getContinueBtn() {
        return continueBtn;
    }

    public By getCancelBtn() {
        return cancelBtn;
    }
}
