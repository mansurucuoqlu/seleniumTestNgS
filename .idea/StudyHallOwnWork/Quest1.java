package StudyHallOwnWork;

import Utilities.WebDriverUtil;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.List;

public class Quest1 {
    public static void main(String[] args) {
        //TASK 1
        //1. Open Chrome browser
        //2. Go to https://demo.guru99.com/test/radio.html
        //3. Verify all checkboxes are not selected (you can use findelements to store in list and use for loop to validate)
        //4. Click to checkbox3
        //5. Verify checkbox3 is selected
        WebDriver driver = WebDriverUtil.getDriver("chrome");
        driver.get("https://demo.guru99.com/test/radio.html");
        driver.manage().window().maximize();
        driver.findElement(By.id("vfb-7-1")).click();
        WebElement checkBox3 = driver.findElement(By.xpath("//input[@value='checkbox3']"));
        List<WebElement> AllcheckBoxes  = driver.findElements(By.xpath("//input[@type='checkbox']"));
        for (WebElement each:AllcheckBoxes
             ) {
            if(!each.isSelected()){
                System.out.println(each.getAttribute("value")+"   Is not selected");
            }
            else { System.out.println(each.getAttribute("value")+"  is selected");}


        }
        // tagname[attribute='value]

        //4. Click to checkbox3
        checkBox3.click();

        //5. Verify checkbox3 is selected
        if (checkBox3.isSelected()){

            System.out.println("Checkbox3 is already selected");

        } else {

            checkBox3.click();

        }


//input[@type='checkbox']]

    }
}
