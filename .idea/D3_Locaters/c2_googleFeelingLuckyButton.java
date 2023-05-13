package D3_Locaters;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import utilties.webDriverUtil;

public class c2_googleFeelingLuckyButton {
    /*
    1-open chorem =
    2=- go to google
    3-write apple in search box
    4- click i am flelling lucky
    //verify title cointains apple
     */
    public static void main(String[] args) {
       WebDriver Drivr = webDriverUtil.getDriver("edge");
        Drivr.get("https://www.google.com");
        Drivr.findElement(By.name("q")).sendKeys("apple");

        //Drivr.findelement(By.classname("gLFyf gsfi"))
        // if you have space in class name
        Drivr.findElement(By.id("gbqfbb")).click();

        String actaltittle= Drivr.getTitle();
        String expectedt="apple";


        if(expectedt.equalsIgnoreCase("apple")){
            System.out.println("Tittle passed" );

        }
        else {
            System.out.println("tittle failled actual title is :" + actaltittle);

        }
    }
}
