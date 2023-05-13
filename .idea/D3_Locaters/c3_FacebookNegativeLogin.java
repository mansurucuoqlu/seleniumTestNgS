package D3_Locaters;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import utilties.webDriverUtil;

public class c3_FacebookNegativeLogin {
    public static void main(String[] args) throws InterruptedException {
        WebDriver dvr = webDriverUtil.getDriver("edge");
        dvr.get("https://www.facebook.com");
        dvr.findElement(By.id("email")).sendKeys("mansurucuoqlu");
        dvr.findElement(By.id("pass")).sendKeys("Qewere1903."+ Keys.ENTER);
       Thread.sleep(2000);


        String actual = dvr.getTitle();
        String expected = "Log into Facebook";
        if (actual.equals(expected)){
            System.out.println("facebook negative test passed");
        }
        else {
            System.out.println("facebook failled ");
            System.out.println("actualtitle " + actual);
            Thread.sleep(2000);
        }
dvr.close();
    }
}
