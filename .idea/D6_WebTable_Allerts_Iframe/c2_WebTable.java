package D6_WebTable_Allerts_Iframe;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import utilties.SmartBearUtils;
import utilties.webDriverUtil;

import java.util.concurrent.TimeUnit;

public class c2_WebTable {
    //Smartbear software street verification
    /*
    1-open browser login to smartbear sofware
    2-click on view all orders
    3-Verify Mark Smith has street as "9, Maple Valley"
     */       //1- Open a chrome browser
//2- 6o to:http://secure.smartbearsoftware.com/samples/testcomplete11/WebOrders/Login.aspx
    WebDriver driver;

    @BeforeMethod
    public  void loginSmartbear(){
    driver = webDriverUtil.getDriver("edge");
        driver.get("http://secure.smartbearsoftware.com/samples/testcomplete11/WebOrders/Login.aspx");
        driver.manage().timeouts().implicitlyWait(15,TimeUnit.SECONDS);
        driver.manage().window().maximize();
    // 3- Login
       SmartBearUtils.loginforSmartBear(driver);

    }
    @Test
    public void TC1_verifyMarkStreetName(){
        //2- click on view all orders
        driver.findElement(By.linkText("View all orders"));
        //td[.='9,Maple Valley'] // if your daya is unique you can use
        //td[.='770077007700']//..//td[6]
        //td[.='Mark Smith']/following-sibling::td[4]

      //  WebElement markStreet = driver.findElement(By.xpath("//td[.='9, Maple Valley']") );
        WebElement markStreet = driver.findElement(By.xpath("//td[.='770077007700']//..//td[6]") );
        System.out.println("markStreet.getText() = " + markStreet.getText());
        String actual = markStreet.getText();
        String expected= "9, Maple Valley";
        Assert.assertEquals(actual,expected,"lavko its couildnt passed");
    }

}
