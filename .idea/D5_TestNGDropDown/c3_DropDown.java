package D5_TestNGDropDown;

import Utilities.WebDriverUtil;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class c3_DropDown {

        //task1
        //1. open chrome browser /
        //go to "https://the-internet.herokuapp.com/"
        //click on dropdown
        //confirm default selected dropdown is please selecet an option
        //task 2
        //1. open chrome browser /
        //go to "https://the-internet.herokuapp.com/"
        //click on dropdown
        //choose option 2 from dropdown
        //choose option 1 from dropdown
        //choose option 2 from dropdown
        WebDriver drivo;

@BeforeClass
public void beforeClass(){
    System.out.println("=======================");
}
@AfterClass
public void afterClass(){
    System.out.println("test is finished");
}
    @BeforeMethod
    public void setUp(){
        drivo = WebDriverUtil.getDriver("chrome");
        drivo.manage().window().maximize();
        drivo.get("https://the-internet.herokuapp.com/");
        WebElement dropDownBox =drivo.findElement(By.linkText("Dropdown"));
        dropDownBox.click();
    }
@Test
    public void TC1_verifyDefaultOptionInDropDown(){
    WebElement DropDownBIX= drivo.findElement(By.id("dropdown"));


    Select DropDown = new Select(DropDownBIX);
    //confirm default selected dropdown is please selecet an option
    String defaultOption = DropDown.getFirstSelectedOption().getText();
    String expectedOption = "Please select an option";
    Assert.assertEquals(defaultOption,expectedOption,"default optuion is not");
}
@Test
    public void TC2_verifyOptionsFromDropDown() throws InterruptedException {
    //confirm default selected dropdown is please selecet an option


    WebElement DropDownBIX= drivo.findElement(By.id("dropdown"));
    Select dropDOWN = new Select(DropDownBIX);
    Thread.sleep(2000);
    dropDOWN.selectByVisibleText("Option 2");
    Thread.sleep(2000);
    dropDOWN.selectByValue("1");
    Thread.sleep(2000);
    dropDOWN.selectByIndex(2);
}


}
