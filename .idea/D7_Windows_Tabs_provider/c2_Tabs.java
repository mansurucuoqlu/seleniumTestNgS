package D7_Windows_Tabs_provider;

import Base.TestBase;
import Utilities.BrowserUtils;
import Utilities.WebDriverUtil;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import java.util.Set;

public class c2_Tabs extends TestBase {
    WebDriver driver;

   // public void setUp(){
      /* driver= WebDriverUtil.getDriver("chrome");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
       */// driver.get("http://secure.smartbearsoftware.com/samples/testcomplete11/WebOrders/Login.aspx");
    @Test
    public void TC1_tabHandle(){
        driver.get("https://practicerenastech.com/");
        driver.findElement(By.id("selenium-Elements")).click();
        driver.findElement(By.id("WindowsII")).click();


        String currentWindow   = driver.getWindowHandle();
        //this will only store one window and it will store cyrrent window that you gahve
        System.out.println("currentWindow = " + currentWindow);
        System.out.println("driver = " + driver.getTitle());
        WebElement openTabButton = driver.findElement(By.id("open-tab"));
        openTabButton.click();
        System.out.println("after clicking tab button driver.getTitle() = " + driver.getTitle());
        //since we dint chagnge driver fucps ot will give us same one at the  begging
        Set<String>allWindows = driver.getWindowHandles();
        for (String tab :allWindows){
            driver.switchTo().window(tab);
            BrowserUtils.wait(2);
            System.out.println("driver.getTitle() = " + driver.getTitle());
        }
    }
}

