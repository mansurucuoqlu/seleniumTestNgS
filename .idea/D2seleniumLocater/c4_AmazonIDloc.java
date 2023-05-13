package D2seleniumLocater;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class c4_AmazonIDloc {
    public static void main(String[] args) {
        /*
        1-open chrome browser
        2- go to https://www.amazon.com
        3-type laptop on search box
        4- click on searh botton
        5- verify title

         */
    /*    4.id
                --id will locate by matching id attribute's value.
                -id is unique for the specific webelement
                --if if you have id and its not dynamic you should always use id .
        dynamic (when you refresh if you see id value is changing that means id is dynamic) syntax : driver. findElement(By.id("id attribute value"));*/

        WebDriverManager.edgedriver().setup();
        WebDriver edgeDr = new EdgeDriver();
        edgeDr.manage().window().maximize();
        edgeDr.get("https://www.amazon.com");
        //ID is unique but we gotta make sure is not dynamic has to be static

       edgeDr.findElement(By.id("twotabsearchtextbox")).sendKeys("laptop" ,  Keys.ENTER); // what teacher did
      // edgeDr.findElement(By.id("nav-search-submit-button")).click(); possible what i did
       edgeDr.getTitle();
       if (edgeDr.getTitle().contains("laptop")){
           System.out.println("passed");
       }
else {
           System.out.println("failled actual title is " + edgeDr.getTitle());
       }
edgeDr.close();
    }

}
