package day9_Actions_POM;

import Base.TestBase2;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.Test;
import utilties.DriverUtil;

public class c3_actionHoverOver extends TestBase2 {
    /*
    go to http://the-internet.herokuapp.com/hovers
    moce mouse to third image
    verify text of image present on the screen
     */


    @Test
    public void TC1_HoverOver(){
        DriverUtil.getDriver().get("http://the-internet.herokuapp.com/hovers");
        ////h5[.='name: user3']/../../img
        //h5[.='name: user3']/../preceding-sibling::img

        //  /preceding-sibling will go previous sibling
        // /following-sibliong will go next sibling

        WebElement thirdimage = DriverUtil.getDriver().findElement(By.xpath("//h5[.='name: user3']/../preceding-sibling::img"));
        Actions actions= new Actions(DriverUtil.getDriver());
        actions.moveToElement(thirdimage).perform();
        WebElement ImageText = DriverUtil.getDriver().findElement(By.xpath("//h5[.='name: user3']"));
        boolean testIsPresent = ImageText.isDisplayed();
        Assert.assertTrue(testIsPresent," Text is not present" );
    }
}
