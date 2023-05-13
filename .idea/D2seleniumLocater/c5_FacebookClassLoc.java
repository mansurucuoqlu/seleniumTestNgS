package D2seleniumLocater;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class c5_FacebookClassLoc {
    public static void main(String[] args) {
    /*    5. cLassName :
        -className is not unique , thats why it might have multiple values of the same attribute
        --and it will return you the first one it finds
        syntax : driver. findElement (By.className ("class attribute value"));*/
        WebDriverManager.edgedriver().setup();
        WebDriver Driverr = new EdgeDriver();
        Driverr.get("https://www.facebook.com");

        String actualHeader = Driverr.findElement(By.className("_8eso")).getText();
        String expectedHeader = "Connect with friends and the world around you on facebook ";
        if (actualHeader.equals(expectedHeader)){
            System.out.println("header passed!0");
        }
        else {
            System.out.println("Header failled");
            System.out.println("actualheader " + actualHeader);
        }
        Driverr.close();

    }
}
