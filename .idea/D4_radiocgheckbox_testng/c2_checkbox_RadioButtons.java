package D4_radiocgheckbox_testng;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import utilties.webDriverUtil;

import java.util.concurrent.TimeUnit;

public class c2_checkbox_RadioButtons {
    public static void main(String[] args) {
        /*
        1open edge
        2-go to "https://demo.guru99.com/test/radio.html")
        3-verify checkbox1 is not selected
        4 click checkbox2
        verify checkbox2 is selected
         */
        WebDriver dr = webDriverUtil.getDriver("edge");
        dr.get("https://demo.guru99.com/test/radio.html");
        dr.manage().window().maximize();
        dr.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        WebElement checkBox1 = dr.findElement(By.id("vfb-6-0"));
        checkBox1.click();
        //   dr.findElement(By.xpath("//[input[@value='checkbox1']"));
        // dr.findElement(By.xpath("//[input[@value='checkbox1']"));
        WebElement checkBox2 = dr.findElement(By.xpath("//input[@id='vfb-6-1']"));
        checkBox2.click();

        WebElement checkBox3 = dr.findElement(By.xpath("//input[@id='vfb-6-2']"));

        if (!checkBox1.isSelected()) {

            System.out.println("verification for check box after click passed");
        } else if (checkBox2.isSelected() && checkBox3.isSelected()) {
            System.out.println("verification for check box after click failed");
        } else {
            System.out.println("you got that");
        }

        /*
        navigate to https://courses.letskodeit.com/pratice
        click on BMW RADIO button
        verify that its selected
        check bmw,benz,honda
        validate that benz i

         */
        dr.navigate().to("https://courses.letskodeit.com/pratice");
        WebElement bmwRadioElement = dr.findElement(By.xpath("//input[@id='bmwradio']"));
        bmwRadioElement.click();
        dr.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
        boolean bmwRadioSelected = bmwRadioElement.isSelected();

        if (bmwRadioSelected){
            System.out.println("gooogggg");
        }
        else {
            System.out.println("sasodoasodoasd");
            
        }


    }
}