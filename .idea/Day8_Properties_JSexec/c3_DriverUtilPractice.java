package Day8_Properties_JSexec;

import Base.TestBase;
import Base.TestBase2;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;
import utilties.DriverUtil;
import utilties.ProperTiesReadingUtil;

public class c3_DriverUtilPractice extends TestBase2{
    @Test
    public void TC1_practice(){
        //go to google
        // searh for hello
        //verify title contains hello
        DriverUtil.getDriver().get(ProperTiesReadingUtil.getProperties("google_url"));
        WebElement searchBox =DriverUtil.getDriver().findElement(By.name("q"));
        String searchItem= ProperTiesReadingUtil.getProperties("google_searchData");
searchBox.sendKeys(searchItem+ Keys.ENTER);
        Assert.assertTrue(DriverUtil.getDriver().getTitle().contains(searchItem));
    }
}
