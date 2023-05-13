package day_10_POM_ExplicitWait;

import Base.TestBase2;
import Pages.SeleniumPracticeExplicitWaitPage;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;
import utilties.DriverUtil;
import utilties.ProperTiesReadingUtil;

public class c3_explicitwaitExample2 extends TestBase2 {

    //go to http://seleniumpractise.blogspot.com/2016/08/how-to-use-explicit-waitin-selenfun.html
//click on timer
   // I/verify webdciver text gets present

    // our website doesnt work rn we are doing explicitwait when some element
    // doesnt present but after a moment comes out and we could locate this element by "visibilyof "
SeleniumPracticeExplicitWaitPage seleniumPracticeExplicitWaitPage;
@Test
    public void tc1(){
    seleniumPracticeExplicitWaitPage = new SeleniumPracticeExplicitWaitPage();
    DriverUtil.getDriver().get(ProperTiesReadingUtil.getProperties("selenium_practice_url"));
//seleniumPracticeExplicitWaitPage.timerButton.click();
    //same with above
seleniumPracticeExplicitWaitPage.getDefaultText();
seleniumPracticeExplicitWaitPage.clickTimerButton();
seleniumPracticeExplicitWaitPage.getDefaultText();
//browserUtils.wait(5);
    WebElement actualText = seleniumPracticeExplicitWaitPage.getWebDriverText();
    seleniumPracticeExplicitWaitPage.getDefaultText();
    Assert.assertEquals(actualText.getText(),"WebDriver","WebDriver text is not present!");


    //we extend TestBase2 with logic of inheritence
    //we get before after method
    //we create page class
    //we stored webelements and some usefull methods
    //create an object from page to be able to call webelements and methods
    //you navigate your url
    //then you pass username password and click on loguin button with one method that we created under SMLgin page
    //then we verifierd text after we try to logged in with a method tgat agaub we create under SMLogin page


}

}
