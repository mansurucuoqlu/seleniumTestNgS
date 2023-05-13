package D6_WebTable_Allerts_Iframe;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import utilties.SmartBearUtils;
import utilties.webDriverUtil;

import java.util.concurrent.TimeUnit;

public class c5_smartBearNegativeTest {
    /*
    1-opern choreme
    2-goto:https://secure..smartbearsoftware.com/samples/testcomplete12/WebOrders/login.aspx
        3-enter incorrect username

    4-
    enter wrong pasword
    5-click login button
    6-verify error message displayed : invalid login or password
    //note create another utils method under smarbearutil class called negativeloginforsmartbear
    //this method should cover 3,4,5


     */
    WebDriver driver;

    @BeforeMethod
    public void setUp() {
        //1- Open a chrome browser
//2- 6o to:http://secure.smartbearsoftware.com/samples/testcomplete11/WebOrders/Login.aspx
        driver = webDriverUtil.getDriver("edge");
        driver.get("http://secure.smartbearsoftware.com/samples/testcomplete11/WebOrders/Login.aspx");
        driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
        driver.manage().window().maximize();
        // 3- Login


    }
    @Test(dataProvider="testData")
    public void TC1_NegativeTest(String userName ,String password){
      //  3-enter incorrect username

      //  4enter wrong pasword
       // 5-click login button
    SmartBearUtils.negativeLoginForSmartBear(driver,userName,password);
   // 6-verify errormesagge displayed invalid login or password
        WebElement errorMessage = driver.findElement(By.className("error"));
        Assert.assertTrue(errorMessage.isDisplayed());
    }
    @DataProvider(name ="testData")
    public static  Object[][]wrongUserCredentails(){
        return new Object[][]{
                {"ester","ester2"},
                {"ester","ester2"},
                {"ester","ester2"},
                {"ester","ester2"},
                {"ester","ester2"},
                {"ester","ester2"}


        };
    }
}