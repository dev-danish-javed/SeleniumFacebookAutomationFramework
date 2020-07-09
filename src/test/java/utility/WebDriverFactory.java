package utility;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxOptions;

public class WebDriverFactory {
    public static WebDriver createWebDriver() {
        String webdriver = System.getProperty("browser", "chrome");
        switch(webdriver) {
            case "firefox":
                System.setProperty("webdriver.gecko.driver", "./src/test/resources/Drivers/geckodriver.exe");
                FirefoxOptions options=new FirefoxOptions();
                options.addArguments("--disable-notifications");
                return new FirefoxDriver(options);
            case "chrome":
                System.setProperty("webdriver.chrome.driver", "./src/test/resources/Drivers/chromedriver.exe");
                ChromeOptions options2 = new ChromeOptions();
                options2.addArguments("--disable-notifications");
                return new ChromeDriver(options2);
            default:
                throw new RuntimeException("Unsupported webdriver: " + webdriver);
        }
    }
}
