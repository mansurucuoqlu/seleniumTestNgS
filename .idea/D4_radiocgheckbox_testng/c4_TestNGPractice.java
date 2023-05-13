package D4_radiocgheckbox_testng;

import org.testng.annotations.*;

public class c4_TestNGPractice {
    @BeforeClass
    public void setupClass(){
        //this one will only run once before eberyting in the class
        System.out.println("before class is runnig ");

    }
    @AfterClass
    public void setupAfterClass() {
        //will run only once after everyting in the class
        System.out.println("after class is nunning");
    }


    @BeforeMethod
    public void setup (){// this will rung before each test annotation
        System.out.println("before method is runing");
    }
    @AfterMethod
    public void closing (){
        System.out.println("after method is running ");

    }
    @Test
    public void TC1_test(){
        System.out.println("Test1 is running ");
    }
    @Test
    public void TC3_test(){
        System.out.println("test3 is running");
    }
    @Test
    public void TC2_test(){
        System.out.println("test 2 is rybbging");
    }
}

