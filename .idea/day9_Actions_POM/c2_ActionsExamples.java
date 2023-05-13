package day9_Actions_POM;

import Base.TestBase2;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;
import utilties.BrowseRUtils;
import utilties.DriverUtil;

public class c2_ActionsExamples extends TestBase2 {
    // go to http:..demo.guru99.com/test/simple_context_menu.html
    //double click to dobule click button
    // then accept the aler thats pops up


    Actions actions;//instead of creating this object for eachteac
    @Test
    public void TC1_doubleClick(){
        DriverUtil.getDriver().get("http://demo.guru99.com/test/simple_context_menu.html");
        WebElement doubleClickButton= DriverUtil.getDriver().findElement(By.xpath("//button[.='Double-Click Me To See Alert']"));
        actions= new Actions(DriverUtil.getDriver());
        actions.doubleClick(doubleClickButton).perform();
        Alert alert = DriverUtil.getDriver().switchTo().alert();
        BrowseRUtils.wait(2);

        alert.accept();

    }
    @Test
    public void TC2_rightClick(){
        DriverUtil.getDriver().get("http://demo.guru99.com/test/simple_context_menu.html");
WebElement rightClick = DriverUtil.getDriver().findElement(By.xpath("//span[.='right click me']"));


actions = new Actions(DriverUtil.getDriver());
actions.contextClick(rightClick).perform();
BrowseRUtils.wait(2);
WebElement editButton = DriverUtil.getDriver().findElement(By.xpath("//span[.='Edit']"));
editButton.click();//doesnt work go back to here

BrowseRUtils.wait(2);
Alert aler = DriverUtil.getDriver().switchTo().alert();
aler.accept();
    }


    // go to  http://demo.guru99.com/test/drag_drop.html
    //drag bank word to account section and drop it
    // then drag 5000 to amount section and drop it
    @Test
    public void TC3_dragAndDrop(){
        DriverUtil.getDriver().get("http://demo.guru99.com/test/drag_drop.html");
        //drag bank word to account section and drop it

       WebElement dragFrom = DriverUtil.getDriver().findElement(By.xpath("//a[.=' BANK ']"));
        WebElement dropTo = DriverUtil.getDriver().findElement(By.xpath("//ol[@id='bank']/li"));
        actions = new Actions(DriverUtil.getDriver());
        actions.dragAndDrop(dragFrom,dropTo).perform();

        //    // then drag 5000 to amount section and drop it
        WebElement dragFrom2 = DriverUtil.getDriver().findElement(By.id("fourth"));
        WebElement dropTo2=DriverUtil.getDriver().findElement(By.xpath("//ol[@id='amt7']/li"));
actions = new Actions(DriverUtil.getDriver());
        actions.dragAndDrop(dragFrom2,dropTo2).perform();
    }

}
