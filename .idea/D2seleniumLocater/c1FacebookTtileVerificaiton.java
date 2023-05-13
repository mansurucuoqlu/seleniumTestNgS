package D2seleniumLocater;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;



public class c1FacebookTtileVerificaiton {
    public static void main(String[] args) {
        WebDriverManager.edgedriver().setup();
        WebDriver Edge = new EdgeDriver();


        Edge.get("https://www.facebook.com");
        Edge.manage().window().maximize();
        Edge.getTitle();
        String title = Edge.getTitle();

        if (title.equalsIgnoreCase("Facebook - Log in or Sign up")){
            System.out.println("WTF NAYSUUU");

        }
        else {
            System.out.println("The title dont expect " + title);
        }

    }
}
