package day_10_POM_ExplicitWait;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;
import utilties.DriverUtil;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

public class c2_explicitwaitExample {
    /*
    the implicit wait in selenium is used to tell the web driver to wait for a certain amoint of the time before it wthrows a "no such element exception
            "
    the default setting is 0. once we set the time the web driver will wait for the elemetn for that time before throwing an exception

    Explicit Wait
    The Explicit Wait in Selenium is used to tell the Web Driver to wait for certain conditions (Expected Conditions) or maximum time exceeded before throwing "ELementNotVisibLeException" exception.
    It Is an intelLigent kind of wait, but it can be applied onty for specified stenents.
    It gives better options than implicit wait as it waits for dynamically Loaded Ajax elements.*/
    @Test
    public void TC1_implicitWait(){
        DriverUtil.getDriver().manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        DriverUtil.getDriver().get("https://www.google.com");
        DriverUtil.getDriver().findElement(By.name("q"));

    }
    @Test
    public void TC2_explicitWait(){
        WebDriverWait driverWait = new WebDriverWait(DriverUtil.getDriver(), Duration.ofSeconds(15));
        DriverUtil.getDriver().get("https://www.google.com");
        driverWait.until(ExpectedConditions.titleIs("Google"));
        WebElement box = DriverUtil.getDriver().findElement(By.name("q"));
        driverWait.until(ExpectedConditions.visibilityOf(box));

    }
}
