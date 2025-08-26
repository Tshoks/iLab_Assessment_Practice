package iLab_Assessment.pages;

import iLab_Assessment.elements.Login;
import org.openqa.selenium.WebDriver;

public class LoginPage extends BasePage {

    private final Login login;

    public LoginPage(WebDriver driver) {
        super(driver);
        login = new Login();
    }

    public boolean verify_i_am_on_loginPage(String expected) throws InterruptedException {
        return verifyText(login.getLogin_label(), expected);
    }

    public boolean enter_username(String username) {
        return enter_text_to(login.getUsername_input(), username);
    }

    public boolean enter_password(String password) {
        return enter_text_to(login.getPassword_input(), password);
    }

    public boolean click_forgot_password_link() {
        return click(login.getForgot_password_link());
    }

    public boolean click_login_btn() {
        return click(login.getLoginBtn());
    }

//    public boolean click_login_btn() {
//        return click_element(("login"));
//    }

    public boolean click_registration_link() {
        return click(login.getRegistration_link());
    }
}
