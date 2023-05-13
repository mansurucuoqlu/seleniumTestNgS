package Pages;

import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;
import utilties.DriverUtil;

import java.time.Duration;

public class BasePage {

    protected WebDriverWait webDriverWait = new WebDriverWait(DriverUtil.getDriver(), Duration.ofSeconds(15));
    /*
    IN POM Design you need to have some structure for each page
    1.PageFactory.initElements(driver,this)
    ->it creates connection in between driver and object of the class
    2.@findBy annotation to locate webElements
    -> using this FindBy annotation help us to locate web elements
    3.Create methods related webeleemtns

     */
    public BasePage(){ //1.PageFactory.initElements(driver,this)
        PageFactory.initElements(DriverUtil.getDriver(),this);


    }
}
