package D3_Locaters;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import utilties.webDriverUtil;

public class c1_googleImage {
    public static void main(String[] args) {
        //task google image link
        //1- open a chrome browser go to goole =\
        //2- click to image link from top right
        //3- verify title contains image

        /*WebDriverManager.edgedriver().setup();
        WebDriver drv = new EdgeDriver();
        drv.get("https://www.google.com");*/

       WebDriver Drv =  webDriverUtil.getDriver("edge");
Drv.get("https://www.google.com");
Drv.findElement(By.linkText("Images")).click();
     //   Drv.findElement(By.partialLinkText("Ima")).click(); but its nmot gonna be unique
        //this element has also class name it is not unique also has same name class name with gmail button and first match is gmail bu tton
        String actualTItl= Drv.getTitle();
        String ContainsT= "Image";
        if (actualTItl.contains(ContainsT)){
            System.out.println("tittle passed");

        }
        else {
            System.out.println("failled ");
            System.out.println("actual title is "+ actualTItl);
        }


    }
}
