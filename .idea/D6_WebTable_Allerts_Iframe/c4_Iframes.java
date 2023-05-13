package D6_WebTable_Allerts_Iframe;

import Utilities.WebDriverUtil;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class c4_Iframes {
    WebDriver driver;
    @BeforeMethod
    public void setup(){
        driver= WebDriverUtil.getDriver("chrome");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
        driver.get("http://the-internet.herouapp.com/iframe");

    }
@Test
    public void Iframe(){
        // in order to interact with iframes we will need to switch driver fucos to iframe
//3-Switching by id or name attribute vlaue
// driver.switchTo.frame("idValue")
// driver.switchTo.frame(nameValue")

    driver.switchTo().frame("mce_0_ifr");
    WebElement messageBox = driver.findElement(By.id("tinymce"));
    messageBox.clear();
    messageBox.sendKeys("hey its me mansur");
    driver.switchTo().defaultContent();// retunrs to the main html
    driver.switchTo().parentFrame();//this willl retun you previous iframe of html block
    System.out.println("driver.getTitle() = " + driver.getTitle());
}
}
