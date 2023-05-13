package D5_TestNGDropDown;

import Utilities.WebDriverUtil;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import utilties.BrowseRUtils;

import java.util.concurrent.TimeUnit;

public class c4_SmartBearLogin {
     //1-open a chrome browser
    //2-go to https://secure.smartbearsoftware.com/samples/testcomlete12/WebOrders/login.aspx
    //3-Enter username >> Tester
    //4-Enter pasword >> test
    //5-click login button

WebDriver driver;

    @BeforeMethod
            public void setUp() throws InterruptedException {
        WebDriver driver = WebDriverUtil.getDriver("chrome");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
        BrowseRUtils.wait(3);

        driver.get("http://secure.smartbearsoftware.com/samples/testcomplete11/WebOrders/Login.aspx");
    }
    @Test
    public void TC1_LoginVarification(){
        WebElement username = driver.findElement(By.id("ctl00_MainContent_username"));
        username.sendKeys("Tester");
        WebElement password = driver.findElement(By.id (" ctl00_MainContent_password"));
        password.sendKeys("Test");
        WebElement LoginButton = driver.findElement(By.id("ctl00_MainContent_login_button"));
        LoginButton.click();

        String act = driver.getTitle();
        String expec = "loginooo";
        Assert.assertEquals(act,expec,"you got intgo it");
    }

}
