package iLab_Assessment.stepDefinitions;

import iLab_Assessment.pages.SelectHotelPage;
import io.cucumber.java.en.*;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;

public class SelectHotelSteps extends BaseSteps {

    private final SelectHotelPage selectHotelPage;

    public SelectHotelSteps() {
        WebDriver driver = getDriver();
        selectHotelPage = new SelectHotelPage(driver);
    }

    @Given("I am on the select hotel page")
    public void i_am_on_the_select_hotel_page() throws InterruptedException {
        Assert.assertTrue("I am not on the select hotel page.", selectHotelPage.verify_if_i_am_on_selectHotelPage("Select Hotel"));
    }

    @When("I select the hotel form the table")
    public void i_select_the_hotel_form_the_table() {
        Assert.assertTrue("Unable to select the hotel.", selectHotelPage.select_hotel());
    }

    @Then("I click on continue button")
    public void i_click_on_continue_button() throws InterruptedException {
        Assert.assertTrue("Unable to click continue button.", selectHotelPage.click_continue_btn());
    }

    @When("I iterate over the list")
    public void i_iterate_over_the_list() {
        selectHotelPage.verify_Hotels("London");
    }

    @Then("I print the hotel names")
    public void i_print_the_hotel_names() {
        selectHotelPage.print_hotel_names("London");
    }

    @When("^I select the (.*) from the table$")
    public void iSelectTheHotelHotelFromTheTable(String hotel) {
        Assert.assertTrue("Unable to select the hotel.", selectHotelPage.select_hotel());
    }
}
