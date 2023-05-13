package D7_Windows_Tabs_provider;

import Base.TestBase;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

public class c3_Windows extends TestBase {
    @Test
    public void TC1_multiWindow(){
        driver.get("https://practicerenastech.com/");
        driver.findElement(By.id("selenium-Elements")).click();
        driver.findElement(By.id("WindowsII")).click();
        System.out.println("driver before clicking new windpw = " + driver.getTitle());

        WebElement openWindowButton = driver.findElement(By.xpath("//button[@id='open-window']"));
        openWindowButton.click();
        /*
        after clicking this line now you have 2 windows
        and to able to workd on secopnd window
        change selenium fucos on the next window
         */
        Set<String> allWindows = driver.getWindowHandles(); //to store all windows
        List<String>windowList = new ArrayList<>();
        for (String window : allWindows){
            windowList.add(window);
            driver.switchTo().window(window);
            System.out.println("after switch driver.gettitle = + " +driver.getTitle());

        }
driver.switchTo().window(windowList.get(1));
        System.out.println("driver = " + driver.getTitle());
        //span[.='Concact']
        //(//span[.='Concact'])[1]
        //(//span[.='Concact'] and @class='elementor-icon-list-text'])[1]

        /*
        you can use and or
        in and both has to be true
        in or one of them enough
        in fact same like java
        contains will work best with ids that are dynamic which has some part as static

         */
        driver.findElement(By.xpath("(//span[.='Concat' and @class-icon-list-text'])[1]")).click();
    }

}
