package Day_11_xmlFiles;

import Base.TestBase2;
import org.testng.annotations.Test;
import utilties.DriverUtil;

public class googleTest extends TestBase2 {

//verfiy title is change after you click  on gmail button
@Test
    public void test(){
    DriverUtil.getDriver().get("https://www.google.com");

}
//we extend TestBase2 with logic of inheritence
    //we get before after method
    //we create page class googlemainpage
    //we stored webelements:such as gmail button and some usefull methods:getTitle,clickGmailButton
    //create an object from page to be able to call webelements and methods
    //you navigate your url with using properties file nad properties util
    //then you on gmail bvutton
    //then we verifierd title is changed with assert


}
