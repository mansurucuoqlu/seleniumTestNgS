package Pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class SeleniumPracticeExplicitWaitPage extends BasePage{

@FindBy(xpath ="//button[.='Click me to start timer']")
    public WebElement timerButton;
@FindBy(id = "demo" )
    public WebElement defaultText;
@FindBy(xpath = "//p[.='WebDriver']")
public WebElement webDriverText;
public void clickTimerButton(){//timerButton.click();
     webDriverWait.until(ExpectedConditions.elementToBeClickable(timerButton)).click();





    }
    public void getDefaultText() {
        System.out.println("defaultText.getText() = " + defaultText.getText());
}

    public WebElement getWebDriverText(){
    webDriverWait.until(ExpectedConditions.visibilityOf(webDriverText));
    return
            webDriverText;
    }

}
