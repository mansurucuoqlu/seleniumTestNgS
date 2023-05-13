package D5_TestNGDropDown;

import org.testng.annotations.*;

public class c1_TestNGExample {
    @BeforeClass  //one time
    public void setupClass(){
        //this one will only run once before eberyting in the class
        System.out.println("before class is runnig ");

    }
    @AfterClass // runnign 1 time after all
    public void setupAfterClass() {
        //will run only once after everyting in the class
        System.out.println("after class is nunning");
    }


    @BeforeMethod //1 for first test 1//for 2 //for3
    public void setup (){// this will rung before each test annotation
        System.out.println("before method is runing");
    }
    @AfterMethod//runing for test1 //for 2 //for3
    public void closing (){
        System.out.println("after method is running ");

    }
    @Test(priority = 2, dependsOnMethods = "TC3_test")
    public void TC1_test(){
        System.out.println("Test1 is running ");
    }
    @Test(priority = 3)
    public void TC3_test(){
        System.out.println("test3 is running");
    }
    @Test(priority = 1)
    public void TC2_test(){
        System.out.println("test 2 is rybbging");
    }
    @Ignore //WILL IGNORE THE TEST WHICH IS WE DONT WANT TO RUN
    @Test
    public void TC4_test(){
        System.out.println("ruggning test4");
    }
}

