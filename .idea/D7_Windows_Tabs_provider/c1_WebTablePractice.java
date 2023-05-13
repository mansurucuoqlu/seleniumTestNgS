package D7_Windows_Tabs_provider;

import Utilities.WebDriverUtil;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import utilties.SmartBearUtils;

import java.util.concurrent.TimeUnit;

public class c1_WebTablePractice {
    WebDriver driver;
    @BeforeMethod
    public void setUp(){
        driver= WebDriverUtil.getDriver("chrome");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
        driver.get("http://secure.smartbearsoftware.com/samples/testcomplete11/WebOrders/Login.aspx");

    }
    @Test
    public void TC1_LoginVerification(){
        SmartBearUtils.loginforSmartBear(driver);
        Assert.assertEquals(driver.getTitle(),"Web Orders");}


        @Test
                public void TC2_streetVerification(){
            SmartBearUtils.loginforSmartBear(driver);
            /*
            create a test tghat will cgheck given street name and verify if its present in the table
            ex given street name 17,park aveneu
            rsult should passed because iots present in the tavle
            ex;wall street
            result should fail its not present in the table
            to tlocate all table ctl00_MainContent_orderGrid
            */
            SmartBearUtils.verifyStreet(driver,"17, Park Avenue");

            }
            /*
            for verifyinng for 4 streets
             */
    @DataProvider(name="testDataForStreetName")
    public static Object[][] test(){
        return new Object[][] {
                {"17, Park Avenue"},
                {"17, Parknue"},
                {"17, Park Aveue"},
                {"1rk Avenue"}};

        }
    }






