package D1SeleniumIntroduction;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class c2browserNavigation {
    public static void main(String[] args) throws InterruptedException {
        //create the conntction between chrome and selenieunm

        WebDriverManager.edgedriver().setup();
        //create an instance of chrome driver
        WebDriver EdgeDriver = new EdgeDriver();
    EdgeDriver.manage().window().maximize();
    EdgeDriver.get("https://www.amazon.com");
    Thread.sleep(2000);
    EdgeDriver.navigate().back();
    Thread.sleep(2000);
    EdgeDriver.navigate().forward();
        System.out.println("EdgeDriver.getTitle() = " + EdgeDriver.getTitle());
        EdgeDriver.navigate().to("https://www.facebook.com");
        Thread.sleep(2000);
        System.out.println("EdgeDriver.getTitle() = " + EdgeDriver.getTitle());
        EdgeDriver.close();

    }
}
