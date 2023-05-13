package D3_Locaters;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import utilties.webDriverUtil;

public class c6_relativeXpath {
    public static void main(String[] args) {
        WebDriver driver0 = webDriverUtil.getDriver("edge");
        driver0.get("https://www.renastech.com");
        driver0.manage().window().maximize();
        //1-// tagname[attribute='value]--looks for tagname attrubute and value
        driver0.findElement(By.xpath("//mat-card[@id='selenium-Elements']")).click();
        //    2-//tagname[contains(@attribute,'value'))--lacate webelement with the given value if contains
        driver0.findElement(By.xpath("//mat-card[contains(@id , 'selenium')]")).click();

        //     3-//tagname[.='text']-- looks for exat text natcg for any attribute
WebElement seleniumHeader =driver0.findElement(By.xpath("//h1[.='Element part I']"));
if(seleniumHeader.isDisplayed()){
    //is displayed will check if the element is present on the page
    System.out.println("header is present");
}
else{
    System.out.println("header us no t present" + seleniumHeader);
}

        //1-// tagname[attribute='value]--looks for tagname attrubute and value
        //    2-//tagname[contains(@attribute,'value'))--lacate webelement with the given value if contains
        //     3-//tagname[.='text']-- looks for exat text natcg for any attribute
    }
}
//Locater approaches
//first option will be id becasuse it is unique (not dynamic we have to check it is staticc)
//second option can be name class name linktext if it is unique (usually theyu are not unique)
// then i prefer x path

//differences css and xpath
/*
-xpath has custom methods but css doesnt have those
-- x path has ability to go child to parent and parent to child
--but in css you can only go from parent to cghild
-- css it works little faster than x path
 */
// if a find a tag in our html cod its mean link
