package day9_Actions_POM;

import Pages.smartBearLoginPage;
import org.testng.annotations.Test;
import utilties.DriverUtil;
import utilties.ProperTiesReadingUtil;

public class c4_smartBearPOMExample {
    //to be able to work with page you need to create an instance ftrom page
    // so you can have access to meyhods and webelements
    Pages.smartBearLoginPage smartBearLoginPage;
    @Test
    public void  TC1_smartBearPositiveLoginVerification(){
        DriverUtil.getDriver().get(ProperTiesReadingUtil.getProperties("SmartBear_url"));
        smartBearLoginPage = new smartBearLoginPage();
        smartBearLoginPage.loginSmartBear(ProperTiesReadingUtil.getProperties("SmartBear_username"), ProperTiesReadingUtil.getProperties("SmartBear_password"));
    }

}
