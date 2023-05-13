package D3_Locaters;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import utilties.webDriverUtil;

import java.util.List;

public class c7_AppleFindElements {
    public static void main(String[] args) {
        /*
        1- open chorem e
        go google
        click to iphone
        print out the texts of all links

         */
        WebDriver apple= webDriverUtil.getDriver("chrome");
        apple.get("https://www.apple.com");
        //3-//tagname[.='text']-- looks for exat text natcg for any attribute
        //span['iPhone']
        //xpath has ability to go also from child parent
        //to child to parent use /..
        //if add /.. and we go the close parent maybe we can do clickable

        apple.findElement(By.xpath("//span['iPhone']/..")).click();
        //4.print out the texts of all links
        //a tag has  href links
        //body//a-->>its parent to child all the a tag links

        // we cannot use findelement cuz its return to just one of them
        //we can use list
        List<WebElement> allLinks=apple.findElements(By.xpath("//body//a"));
        int linkWithText = 0; //to count a tag has text link
        int linkwithoutText = 0; // to count without ones
        for (WebElement eachLink: allLinks ){
            String elementTotext = eachLink.getText();
            System.out.println(elementTotext);
            if(elementTotext.isEmpty()){
                linkwithoutText++;


            }
            else {linkWithText++;}
        }
        System.out.println("links without text  :"+linkwithoutText);
        System.out.println("links with text : "+ linkWithText);
        System.out.println("all links count :"  +allLinks.size());

    }
}
