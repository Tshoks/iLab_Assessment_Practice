package iLab_Assessment.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import java.time.Duration;

public class BasePage {

    private final WebDriver driver;

    public BasePage(WebDriver driver) {
        this.driver = driver;
    }

    public boolean click(By element) {
        if(element_is_displayed_and_enabled(element)) {
            driver.findElement(element).click();
            return true;
        }
        return false;
    }

    public boolean enter_text_to(By element, String value) {
        if(element_is_displayed_and_enabled(element)) {
            if(click(element)) {
                driver.findElement(element).sendKeys(value);
                return true;
            }
        }
        return false;
    }

    public boolean element_is_displayed_and_enabled(By element) {
        if(driver.findElement(element).isDisplayed()) {
            return driver.findElement(element).isEnabled();
        }
        return false;
    }

    public String getText(By element) throws InterruptedException {
        Thread.sleep(5000);
        if (element_is_displayed_and_enabled(element)) {
            return driver.findElement(element).getText();
        }
        return "Unable to get element text";
    }

    public boolean verifyText(By element, String expectedText) throws InterruptedException {
        Thread.sleep(5000);
        System.out.println("Actual Text: " + getText(element));
        return getText(element).contains(expectedText);
    }

    public boolean select_option(By element, String optionType, String option) {
        if (element_is_displayed_and_enabled(element)) {
            WebElement ele = driver.findElement(element);
            Select dropdown = new Select(ele);
            switch(optionType) {
                case "value":
                    dropdown.selectByValue(option);
                    return true;
                case "index":
                    dropdown.selectByIndex(Integer.parseInt(option));
                    return true;
                case "visible_text":
                    dropdown.selectByVisibleText(option);
                    return true;
                default:
                    System.out.println("No option type to select with");
            }
        }
        return false;
    }

    public void wait_() throws InterruptedException {
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(2));
    }


}
