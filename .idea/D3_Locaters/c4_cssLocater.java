package D3_Locaters;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import utilties.webDriverUtil;

public class c4_cssLocater {
    public static void main(String[] args) {
        WebDriver drover = webDriverUtil.getDriver("edge");
        drover.get("https://www.amazon.com");
       //1 drover.findElement(By.cssSelector("input[dir='auto']")).sendKeys("librator" );


        //2 drover.findElement(By.cssSelector("input[id='twosearchtextbox']"));
         drover.findElement(By.cssSelector("input#twotabsearchtextbox")).sendKeys("Tv");
        //3 drover.findElement(By.id("twotabseachtextbox"));
         //coukld use everyone
drover.close();

    }
}
