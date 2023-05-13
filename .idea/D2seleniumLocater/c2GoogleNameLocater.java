package D2seleniumLocater;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

public class c2GoogleNameLocater {
    //google searh
//1-open a chorome browser
/*
2- go to google.com
3- write gewera in searj box
4-click google searh button
5- verify title
expected title should start with gewera word
6-navigate back
7-Write cum cumhuriyeti in search
8-verify title contains turkey lol



 */






    //1-Name:
//This locator will be looking into the whole HTML code and return the webelement with matching name attribute value
//--this one will find and return the first webelemt it finds.
//syntax : driver. findELement (By. name ("hame attribute value")).
    public static void main(String[] args) throws InterruptedException {
        WebDriverManager.edgedriver().setup();
        WebDriver driver = new EdgeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.google.com");
        //driver.findElement(By.name("q)).sendkeys("orange") same with other 2 lines


        WebElement searhBox = driver.findElement(By.name("q"));

        //find element will return you webelement
        searhBox.sendKeys("gewerarengin");
        Thread.sleep(2000);
        WebElement googleWebSearch = driver.findElement(By.name("btnK"));
       googleWebSearch.click();
       String verified = "gewera";
       String actual = driver.getTitle();

       if(actual.startsWith("gew")){
           System.out.println("actual = " + actual);

       }
       else  {
           System.out.println("Failed for gewera");
           System.out.println("actual title is " + actual);

       }
       Thread.sleep(2222);
       driver.navigate().back();

        /*driver.findElement(By.name("q")).sendKeys("muz cumhuriyeti turkiye ");
       Thread.sleep(2000);
       driver.findElement(By.name("btnK")).click();
       String verifiedword = "turkiy";
       String actually = driver.getTitle();
       if (actually.contains(verifiedword)){
           System.out.println("evet muz cumhuriyeti  "+ actually);
       }
       else {
           System.out.println("Failled for turkiy");
           System.out.println("actual title is " + actually);
       }*/

        driver.findElement(By.name("q")).sendKeys("banana" + Keys.ENTER);
        String verifiedword = "turkiy";
        String actually = driver.getTitle();
        if (actually.contains(verifiedword)){
            System.out.println("evet muz cumhuriyeti  "+ actually);
        }
        else {
            System.out.println("Failled for turkiy");
            System.out.println("actual title is " + actually);




    }
}}
