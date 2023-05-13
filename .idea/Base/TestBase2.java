package Base;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import utilties.BrowseRUtils;
import utilties.DriverUtil;

import java.util.concurrent.TimeUnit;

public abstract class TestBase2 {//abstacrtion example
    @BeforeMethod
    public void setUp(){
        DriverUtil.getDriver().manage().window().maximize();
        DriverUtil.getDriver().manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);

    }
    @AfterMethod
    public void closing(){
        BrowseRUtils.wait(2
        );
      //  DriverUtil.closingDriver();
    }
}
