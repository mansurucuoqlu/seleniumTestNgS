package D4_radiocgheckbox_testng;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import utilties.webDriverUtil;

import java.util.concurrent.TimeUnit;

public class c1_implicitWaitExample {
    public static void main(String[] args) {
        //1 open browser
        //2 go to the page https:www.vinexponewyork.com/
        //3 click on attend button
        WebDriver drr= webDriverUtil.getDriver("edge");
        drr.manage().window().maximize();
        drr.get("https:www.vinexponewyork.com/");
        drr.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
        drr.findElement(By.className("elementor-button-text")).click();
    }
}
