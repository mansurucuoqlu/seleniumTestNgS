package D1SeleniumIntroduction;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class c4Example2 {
    public static void main(String[] args) throws InterruptedException {
        WebDriverManager.edgedriver().setup();
        WebDriver EdgeDriver = new EdgeDriver();
        EdgeDriver.get("https://www.google.com");
        EdgeDriver.manage().window().maximize();
        Thread.sleep(2000);
        EdgeDriver.navigate().back();
        Thread.sleep(1000);
        EdgeDriver.navigate().forward();
        Thread.sleep(1000);
        EdgeDriver.navigate().to("https://www.amazon.com");
        EdgeDriver.getTitle();
        String Tittle= EdgeDriver.getTitle();

        if (Tittle.contains("Simile")){
            System.out.println("nice practice");
        }
        else {
            System.out.println("the title not expected simile word");
            System.out.println("actual title is " + EdgeDriver.getTitle());
        }
        EdgeDriver.close();

    }
}
