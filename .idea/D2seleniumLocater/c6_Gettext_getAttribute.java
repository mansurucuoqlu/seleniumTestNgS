package D2seleniumLocater;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

public class c6_Gettext_getAttribute {
    public static void main(String[] args) {
        WebDriverManager.edgedriver().setup();
        WebDriver driver = new EdgeDriver();
        driver.get("https://www.google.com");
        WebElement gmailButton = driver.findElement(By.linkText("Gmail"));
        System.out.println("gmail buttonm"+gmailButton);
        System.out.println("gmailButton.getAttribute(\"href\") = " + gmailButton.getAttribute("href"));
        WebElement aboutButton = driver.findElement(By.className("MV3Tnb" ));
        System.out.println("aboutButton.getText() = " + aboutButton.getText());
        System.out.println(aboutButton.getAttribute("href"));
        System.out.println("aboutButton.getAttribute(\"ping\") = " + aboutButton.getAttribute("ping"));
driver.close();

    }
}
