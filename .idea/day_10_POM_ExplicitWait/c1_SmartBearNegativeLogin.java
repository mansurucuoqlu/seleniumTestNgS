package day_10_POM_ExplicitWait;

import Base.TestBase2;
import Pages.smartBearLoginPage;
import org.testng.Assert;
import org.testng.annotations.Test;
import utilties.DriverUtil;
import utilties.ProperTiesReadingUtil;

public class c1_SmartBearNegativeLogin extends TestBase2 {
smartBearLoginPage smartBearLoginPage;
    //enter wrong username
    //enter wrong password
    //verify text is present
    @Test
    public void TC1_SBNegativeTest(){
        DriverUtil.getDriver().get(ProperTiesReadingUtil.getProperties("SmartBear_url"));
        smartBearLoginPage= new smartBearLoginPage();
        smartBearLoginPage.loginSmartBear(ProperTiesReadingUtil.getProperties("SmartBear_invalid_username"), ProperTiesReadingUtil.getProperties("SmartBear_invalid_password"));

      String expectingMessage = "Invalid Login or Password.";
     String actualMessage = smartBearLoginPage.getStatusMessage();
String actualMessage2= smartBearLoginPage.getStatusMessageElement().getText();
Assert.assertEquals(expectingMessage,actualMessage2,"negative login failed!");
    }
    //we extend TestBase2 with logic of inheritence
    //we get before after method
    //we create page class
    //we stored webelements and some usefull methods
    //create an object from page to be able to call webelements and methods
    //you navigate your url
    //then you pass username password and click on loguin button with one method that we created under SMLgin page
    //then we verifierd text after we try to logged in with a method tgat agaub we create under SMLogin page

}

