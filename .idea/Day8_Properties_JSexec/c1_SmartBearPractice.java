package Day8_Properties_JSexec;

import Base.TestBase;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;
import utilties.ProperTiesReadingUtil;
import utilties.SmartBearUtils;

import java.util.List;

public class c1_SmartBearPractice extends TestBase {
    //open chrome browser
    //gho to http://secure.smartbearsoftware.com/samples/testcomplete11/WebOrders/Login.aspx
    // click on box whic h eberlcong charles dodgeson
    //click on dleete button
    //verify if charles deleted from the list
    @Test
    public void TC1_CharlersDleteVerification() throws InterruptedException {
        //open chrome browser
        driver.get(ProperTiesReadingUtil.getProperties("SmartBear_url"));
        SmartBearUtils.loginforSmartBear(driver);
        Thread.sleep(5);

        //gho to http://secure.smartbearsoftware.com/samples/testcomplete11/WebOrders/Login.aspx
        // click on box whic h eberlcong charles dodgeson
        WebElement Charlerscheckbox= driver.findElement(By.id("ctl00_MainContent_orderGrid_ctl05_OrderSelector"));
        Charlerscheckbox.click();

    //click on dleete button
        WebElement deleteButton = driver.findElement(By.id("ctl00_MainContent_btnDelete"));
        deleteButton.click();
        //verify if charles deleted from the list
        //after deleting the charles we will need to check all tabke and make sure charles is not table anymore
        //first store all names
        List<WebElement> listOfNames = driver.findElements(By.xpath("//table[@id='ctl00_MainContent_btnDelete']/tbody/tr/td[2]"));
        for (WebElement eachName :listOfNames
             ) {
            Assert.assertFalse(eachName.getText().equals("Charles Dodgeson"),"Charles is present in the table test is failled");

        //   verify charles is not there





    }
}}
