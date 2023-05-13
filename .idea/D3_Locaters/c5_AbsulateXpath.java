package D3_Locaters;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import utilties.webDriverUtil;

public class c5_AbsulateXpath {
    public static void main(String[] args) {
        WebDriver driverl= webDriverUtil.getDriver("edge" );
        driverl.get("https:practicerenastech.com");
     WebElement header = driverl.findElement(By.xpath("/html/body/app-root/div/div/app-home/h1[1]"));
     // isdisplayed itw will cgeck if webelement is present on the page
      //  valideate if selenium header is present in the renastech page
                if (header.isDisplayed()){
                    System.out.println("selenyum header us presenet ");
                }
                else {
                    System.out.println("selenium header is not present !!!!! ");
                    System.out.println("header " + header);
                    
                }
    }
}
