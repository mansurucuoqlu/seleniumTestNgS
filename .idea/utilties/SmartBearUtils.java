package utilties;

import Utilities.SmartbearUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;

import java.util.List;

public class SmartBearUtils { WebDriver driver;
    // method goal is to create a util that will do logib function for smartbear
    public static void loginforSmartBear(WebDriver driver){
        WebElement userName = driver.findElement(By.id("ctl00_MainContent_username"));
        userName.sendKeys("Tester");
        WebElement password = driver.findElement(By.id ("ctl00_MainContent_password"));
        password.sendKeys("test");
 WebElement loginButton = driver.findElement(By.id("ctl00_MainContent_login_button"));
     loginButton.click();

    }

public  void TC2_LoginVerification(){


        SmartBearUtils.loginforSmartBear(driver);
        //6-verify title equals web orders

    Assert.assertTrue(driver.getTitle().equals("loginooo"),"login failled!");
    }
    public static void negativeLoginForSmartBear(WebDriver driver,String userID,String passwordID){
        WebElement userName = driver.findElement(By.id("ctl00_MainContent_username"));
        userName.sendKeys(userID);
        WebElement password = driver.findElement(By.id ("ctl00_MainContent_password"));
        password.sendKeys(passwordID);
        WebElement loginButton = driver.findElement(By.id("ctl00_MainContent_login_button"));
        loginButton.click();

    }

public static void verifyStreet(WebDriver driver,String streetName) {


    List<WebElement> streetList = driver.findElements(By.xpath("table[@id='ctl00_MainContent_orderGrid']//tr//td[6]"));
    // this xpath will store all the streets name from table
    for (WebElement eachStreet : streetList) {
        if (eachStreet.getText().equals("5, Ringer Street")) {
            Assert.assertTrue(eachStreet.getText().equals("5, Ringer Street"));
            return;

        }
    }
    Assert.fail("Street Name " + streetName+"is not present on the table");
}}

