package D6_WebTable_Allerts_Iframe;

import Utilities.BrowserUtils;
import Utilities.WebDriverUtil;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class c3_Alerts {

    WebDriver driver;
    /*
    1-open chrome

    2-go to https://practicerenastech.com/
    3-//locate the alert button to click it
    4-click button
    5-handle alert
     */
    @BeforeMethod
    public void setup(){
        driver= WebDriverUtil.getDriver("chrome");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
    driver.get("http://practicerenastech.com/");

    }
    @Test
    public void TC1_alertPractice(){
        driver.findElement(By.id("selenium-Elements")).click();
        driver.findElement(By.id("Alert BoxI")).click();
        //click button
        WebElement alertButton = driver.findElement(By.id("confirm-demo"));
        alertButton.click();
        //handle alert
        //since alert is JC allert you need to change your driver focus to allert
        Alert alerto = driver.switchTo().alert();
        BrowserUtils.wait(2);
        alerto.accept(); // willl click ok button
        BrowserUtils.wait(2);
        alertButton.click();
        alerto.dismiss(); // will click cancel button
    }
}
