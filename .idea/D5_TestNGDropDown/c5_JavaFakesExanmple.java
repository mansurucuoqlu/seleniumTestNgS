package D5_TestNGDropDown;

import com.github.javafaker.Faker;
import org.testng.annotations.Test;

public class c5_JavaFakesExanmple {
@Test
    public void TC1_JavaFakerExample(){

    //to be able to use library you nbeed to create an istance objcet from class
    Faker faker = new Faker();
    System.out.println("faker.name.fulname() = " +faker.name().fullName());
    // each time you run you will gave new fake results
    System.out.println("faker.bame .first name = "+faker.name().firstName());
    System.out.println("faker.adress.cityname = " + faker.address());
    System.out.println("faker," + faker.lordOfTheRings());
    System.out.println(faker.leagueOfLegends().champion());
    System.out.println(faker.artist());

}
}
