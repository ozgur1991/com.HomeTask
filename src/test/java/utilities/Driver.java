package utilities;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;


import java.util.concurrent.TimeUnit;

public class Driver {

    private Driver() {

    }

    static private WebDriver driver;

    public static WebDriver getDriver() {


        if(driver==null) {

            switch(ConfigReader.getProperty("browser")) {

                case "chrome":
                    WebDriverManager.chromedriver().setup();
                    ChromeOptions options = new ChromeOptions();
                    options.addArguments("no-sandbox");
                   // options.addArguments("--headless");//runs the driver headless
                    options.setExperimentalOption("useAutomationExtension",false);
                    options.addArguments("--window-size=1920,1080");
                    options.addArguments("--disable-infobars");
                    options.addArguments("--disable-extensions");
                    options.addArguments("--disable-gpu");
                    options.addArguments("--disable-dev-shm-usage");
                    driver = new ChromeDriver(options);
                    driver.manage().deleteAllCookies();
                    break;
                case "firefox":
                    WebDriverManager.firefoxdriver().setup();
                    FirefoxOptions firefoxOptions=new FirefoxOptions();
                    firefoxOptions.addArguments("no-sandbox");
                    // options.addArguments("--headless");
                    firefoxOptions.setCapability("useAutomationExtension",false);
                    firefoxOptions.addArguments("--window-size=1920,1080");
                    firefoxOptions.addArguments("--disable-infobars");
                    firefoxOptions.addArguments("--disable-extensions");
                    firefoxOptions.addArguments("--disable-gpu");
                    firefoxOptions.addArguments("--disable-dev-shm-usage");
                    driver = new FirefoxDriver(firefoxOptions);
                    driver.manage().deleteAllCookies();
                    break;
            }

        }

        driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
        driver.manage().window().maximize();
        return driver;

    }

    public static void closeDriver() {
        if (driver!=null) {
            driver.close();
            driver=null;
        }
    }
}
