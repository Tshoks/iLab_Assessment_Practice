package iLab_Assessment.stepDefinitions;

import iLab_Assessment.pages.LoginPage;
import io.cucumber.java.en.*;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;


public class LoginSteps extends BaseSteps {

    private final LoginPage loginPage;

    public LoginSteps() {
        WebDriver driver = getDriver();
        loginPage = new LoginPage(driver);
    }

    @Given("I am on login page")
    public void i_am_on_login_page() throws InterruptedException {
        openBrowser("http://adactinhotelapp.com/HotelAppBuild2/index.php");
        Assert.assertTrue( "I am not on the login page.", loginPage.verify_i_am_on_loginPage("Existing User Login - Build 2"));
    }

    @When("^I enter username (.*) and password (.*)$")
    public void i_enter_username_and_password(String username, String password) {
        Assert.assertTrue("Unable to enter username.", loginPage.enter_username(username));
        Assert.assertTrue("Unable to enter password.", loginPage.enter_password(password));
    }

    @Then("I click on login button")
    public void i_click_on_login_button() {
        Assert.assertTrue("Unable to click login button.", loginPage.click_login_btn());
    }
}
