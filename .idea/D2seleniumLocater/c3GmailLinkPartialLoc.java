package D2seleniumLocater;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class c3GmailLinkPartialLoc {
    public static void main(String[] args) {
   /*     2.Linktext (equals the text)
                --this Locater allows us to locate links by their text
                --this Locater will only works if webelement has links
        How do i understand if the webelemt has links ? <a href-"https//www.amazon.com*> Text amazon </a>
        Lagnane
                --> а
        Attribute --> href
        Atribute Value https//www.amazon.com
        Link text
        -- Text amazon
        syntax : driver. findElement(By.linktext("Text amazon")) ;

        d
        ago)
        3.Partiallinktext (contain the text)
                --this locater allows us to locate links by their text
                --but it doesnt need exact match for text
        syntax : driver. findELement(By-partialLinktext ("amazon")) ;
        c2_GoogleNameLocater
        c2 GoogleNameLocater.java
*/
        //1 - open browser and go to google
        //2 - click to gmail link from top of the right
        //3- verify title contains gmail , expected "gmail"

        WebDriverManager.edgedriver().setup();
        WebDriver edgeBrow = new EdgeDriver();
        edgeBrow.manage().window().maximize();
        edgeBrow.get("https://www.google.com");

       // edgeBrow.findElement(By.linkText("Gmail")).click(); check for exact match
        edgeBrow.findElement(By.partialLinkText("Gma")).click(); //check for contains cracters or words
        String Expected = edgeBrow.getTitle();

        String title =edgeBrow.getTitle();
        if (title.contains(Expected)){
            System.out.println("well you are on the gmail wep page" + title);
        }
        else {
            System.out.println("gmail failled");
            System.out.println("Actual title is " +title);
        }

        edgeBrow.close();
    }
}
