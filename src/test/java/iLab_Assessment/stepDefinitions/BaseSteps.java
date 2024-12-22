package iLab_Assessment.stepDefinitions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BaseSteps {

    protected static WebDriver driver = null;

    protected WebDriver getDriver() {
        if (driver == null) {
            String rootPath = System.getProperty("user.dir");
            System.setProperty("webdriver.chrome.driver", rootPath + "/src/main/java/iLab_Assessment/resources/drivers/chromedriver.exe");
            driver = new ChromeDriver();
        }
        return driver;
    }

    public void openBrowser(String url) throws InterruptedException {
        driver.manage().window().maximize();
        driver.get(url);
        Thread.sleep(5000);
    }

    public void closeBrowser() {
        driver.quit();
    }
}
