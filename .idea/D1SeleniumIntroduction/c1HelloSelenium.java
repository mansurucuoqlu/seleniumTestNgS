package D1SeleniumIntroduction;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class c1HelloSelenium {
    public static void main(String[] args) throws InterruptedException {
        WebDriverManager.chromedriver().setup();
        // we created connection between selenium and browser
        //set up browser
        WebDriver driver = new ChromeDriver();
        //this is also polymorpshim
        // we created a driver which is a chrome driver
        Thread.sleep(2000);
        driver.manage().window().maximize();//this lane wikll maximize our browser

        driver.get("https://www.amazon.com");
        System.out.println("driver.getCurrentUrl() = " + driver.getCurrentUrl());
        System.out.println("driver.getTitle() = " + driver.getTitle());
        Thread.sleep(2000);
        driver.close();

    }
}
