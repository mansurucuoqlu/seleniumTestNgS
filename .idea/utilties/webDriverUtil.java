package utilties;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class webDriverUtil {

    public static WebDriver getDriver(String browser) {
        if (browser.equalsIgnoreCase("chrome")) {
            WebDriverManager.chromedriver().setup();
            WebDriver driver = new ChromeDriver();
            driver.get("https://www.google.com");
            return new ChromeDriver(); }

       else if (browser.equalsIgnoreCase("edge")) {
           WebDriverManager.chromedriver().setup();
           WebDriver driver = new EdgeDriver();
           driver.get("https://www.google.com");
           return new EdgeDriver();
        }
       else if (browser.equalsIgnoreCase("firefox")){
           WebDriverManager.firefoxdriver().setup();
           WebDriver driver = new FirefoxDriver();
           driver.get("https://www.google.com");
           return new FirefoxDriver();
        }
       else {
            System.out.println("thjos brpwser not supported on your comp or havent lunched!");
        return null ; }

    }

}