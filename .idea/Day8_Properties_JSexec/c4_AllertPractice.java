package Day8_Properties_JSexec;

import Base.TestBase2;
import Utilities.BrowserUtils;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;
import utilties.BrowseRUtils;
import utilties.DriverUtil;

public class c4_AllertPractice extends TestBase2 {
    /*
    go to "http://the-internet.herokuapp.com/
    click javaScript alerts
    click for js promp
    enter "hello word" text
    enter hello word text
    click okat
    validae  your text appearing on the page
     */

    @Test
    public void AllertPractice(){
        DriverUtil.getDriver().get("http://the-internet.herokuapp.com/");

        WebElement jsAllertsButton2= DriverUtil.getDriver().findElement(By.xpath("//a[.='JavaScript Alerts']"));
       jsAllertsButton2.click();
//a[.='JavaScript Alerts']
     //   WebElement jsAllertsButton = DriverUtil.getDriver().findElement(By.linkText("JavaScript Alerts"));
    //    jsAllertsButton.click();

        // click for js promp
        //button[.='Click for JS Prompt']
     //   WebElement clickjs= DriverUtil.getDriver().findElement(By.xpath("//button[.='Click for JS Prompt']"));
        WebElement clickjs2 = DriverUtil.getDriver().findElement(By.xpath("//button[@onclick='jsPrompt()']"));
        clickjs2.click();
        Alert alert = DriverUtil.getDriver().switchTo().alert();
        String word ="osman reyis";
        alert.sendKeys(word);
        BrowseRUtils.wait(5);
        alert.accept();
        WebElement actualText = DriverUtil.getDriver().findElement(By.xpath("//p[@id='result']"));
        Assert.assertTrue(actualText.getText().contains(word)) ;
    }
}
