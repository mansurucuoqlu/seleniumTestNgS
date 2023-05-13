package D2seleniumLocater;

import org.openqa.selenium.WebDriver;
import utilties.webDriverUtil;

public class c7_driverUtilPractice {
    public static void main(String[] args) {
        WebDriver driver1 = webDriverUtil.getDriver("chrome");
        driver1.get("https://www.google.com");
        WebDriver driver2 = webDriverUtil.getDriver("firefox");

    driver2.get("https://www.facebook.com");
        WebDriver driver3 = webDriverUtil.getDriver("edge");
        driver3.get("https://www.google.com");


    }

}
