package D4_radiocgheckbox_testng;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class c3_TestNG {
    @BeforeMethod
    public void setup (){
        System.out.println("before metgod runnign");

    }
    @AfterMethod
    public void closing (){ // this method is will run after each test method
        System.out.println("after method is running");
    }
    @Test
    public void TC1_test(){
        System.out.println("test1 is running");

    }
    @Test
    public  void   TC3_test(){
        System.out.println("Test3 is running");
        String actual = "hello";
        String expected = "helo2";
        Assert.assertEquals(actual,expected);
    }
    @Test
    public void TC2_test(){
        System.out.println("Test2 is running");
        String str= "renastech";
        String str2 = "renastech";
        Assert.assertTrue(str.equals(str2));
    }
}
