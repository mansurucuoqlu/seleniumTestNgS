package day9_Actions_POM;

import Base.TestBase2;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;
import utilties.DriverUtil;

public class C1_dropDown extends TestBase2 {
@Test
    public void TC1_test(){
    DriverUtil.getDriver().get("https://exchange.sandbox.gemini.com/register");
WebElement drop = DriverUtil.getDriver().findElement(By.id("locationButton"));
drop.sendKeys();

}
}
