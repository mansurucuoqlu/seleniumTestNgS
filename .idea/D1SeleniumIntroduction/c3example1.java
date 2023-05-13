package D1SeleniumIntroduction;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class c3example1 {
    public static void main(String[] args) throws InterruptedException {
        WebDriverManager.chromedriver().setup();
        WebDriver EdgeDriver = new EdgeDriver();
        EdgeDriver.manage().window().maximize();
         EdgeDriver.get("https://www.google.com");
         EdgeDriver.getTitle();
        System.out.println("EdgeDriver.getTitle() = " + EdgeDriver.getTitle());
        if (EdgeDriver.getTitle().equalsIgnoreCase("google"))

        { System.out.println("YOU GOT IT ");}
        else {

            System.out.println("fail");
            System.out.println("because titlel is " + EdgeDriver.getTitle());
        }
         Thread.sleep(4000);
         EdgeDriver.close();

    }
}
