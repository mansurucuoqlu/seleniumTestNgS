package D5_TestNGDropDown;

import Utilities.WebDriverUtil;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class c2_GOOGLETestNG {
    /*
    GO GOOGLE
    VERIFY TITLE IS GOOGLE
    2- go to google search laptop
    make sure title is contains laptop
     */
    WebDriver drv; //null driver

    @BeforeMethod

    public void setUp() {
        //this annotion will apply all of your tests

        //so its better to use comment steps int here so you dont dublicate steps
       drv= WebDriverUtil.getDriver("chrome");
        drv.manage().window().maximize();
        drv.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
        drv.get("https://www.google.com");

    }

    @Test(priority = 1)
    public void TC1_googleVerifyTitle()throws  InterruptedException {


        System.out.println("test1 is running");
        String expected = "Google";

        String act = drv.getTitle();
        Assert.assertEquals(expected,act,"title is failled");

    }

    @Test(priority = 2)
    public void TC2_googleVerifySearchBox()throws  InterruptedException{
        System.out.println("test2 is ruinnging"
        );
        WebElement searchBox= drv.findElement(By.name("q"));
       searchBox.sendKeys("laptop",Keys.ENTER);
    String aCT= drv.getTitle();
    String cont= "laptop";
    Assert.assertTrue(aCT.contains(cont)," fthe function is failled!");

    }
    @AfterMethod
    public void Closing(){
        drv.close();
    }
}

