package driverFactory;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.safari.SafariDriver;
import java.util.concurrent.TimeUnit;

public class Drivermanager {

    public WebDriver driver;

    public static ThreadLocal<WebDriver> tlDriver = new ThreadLocal<>();

    public WebDriver init_driver(String browser) {
        System.out.println("browser value is: " + browser);
        if (browser.equals("chrome")) {
            WebDriverManager.chromedriver().setup();
            tlDriver.set(new ChromeDriver());
        }
        else if (browser.equals("firefox")) {
            WebDriverManager.firefoxdriver().setup();
            tlDriver.set(new FirefoxDriver());
        }
        else if (browser.equals("safari")) {
            tlDriver.set(new SafariDriver());
        }
        else {
            System.out.println("please provide the correct value of browser:" + browser);
        }
        
        WebDriver driver = getDriver();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS); // Add this line
        driver.manage().deleteAllCookies();
        driver.manage().window().maximize();
        
        return driver;
    }
    
    public static synchronized WebDriver getDriver(){
        return tlDriver.get();
    }
}
