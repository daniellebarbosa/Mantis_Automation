package core;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class BasePage {

    private static WebDriver driver;

    private static void createDriver() {
        System.setProperty("webdriver.chrome.driver", "src/main/java/chromedriver.exe");
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("http://mantis-prova.base2.com.br");
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
    }

    public static WebDriver getDriver() {
        if (driver == null) {
            createDriver();
        }
        return driver;
    }

    public static void killDriver() {
        if (driver != null)
            driver.quit();
        driver = null;
    }
}
