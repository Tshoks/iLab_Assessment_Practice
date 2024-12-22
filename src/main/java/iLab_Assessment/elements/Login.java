package iLab_Assessment.elements;

import org.openqa.selenium.By;

public class Login {

    private final By login_label = By.className("login_title");
    private final By username_input = By.id("username");
    private final By password_input = By.id("password");
    private final By forgot_password_link = By.xpath("//a[text()='Forgot Password?']");
    private final By loginBtn = By.id("login");
    private final By registration_link = By.xpath("//a[text()='New User Register Here']");

    public By getLogin_label() {
        return login_label;
    }

    public By getUsername_input() {
        return username_input;
    }

    public By getPassword_input() {
        return password_input;
    }

    public By getForgot_password_link() {
        return forgot_password_link;
    }

    public By getLoginBtn() {
        return loginBtn;
    }

    public By getRegistration_link() {
        return registration_link;
    }
}
