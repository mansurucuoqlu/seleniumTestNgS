package D6_WebTable_Allerts_Iframe;

import Utilities.SmartbearUtils;
import Utilities.WebDriverUtil;
import com.github.javafaker.Faker;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import utilties.SmartBearUtils;
import utilties.webDriverUtil;

import java.util.concurrent.TimeUnit;

public class c1_SmartBearTest {

//1- Open a chrome browser
//2- 6o to:http://secure.smartbearsoftware.com/samples/testcomplete11/WebOrders/Login.aspx
 // 3- Login
//4. Click on Order
//5. Select familyAlbum from product, set quantity to 5
// 6. Click to "Calculate" button
// 7. Fill address Info with JavaFaker
// 8. Click on "visa" radio button
// 9. Generate card number using JavaFaker
// 10Enter expiration date
// 11. Click on "Process"
//12.Verify success message "New order has been successfully added." is displayed,W
    WebDriver driver;
    @BeforeMethod
    public void setUp(){
        //1- Open a chrome browser
//2- 6o to:http://secure.smartbearsoftware.com/samples/testcomplete11/WebOrders/Login.aspx
    driver = webDriverUtil.getDriver("edge");
        driver.get("http://secure.smartbearsoftware.com/samples/testcomplete11/WebOrders/Login.aspx");
        driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
        driver.manage().window().maximize();
        // 3- Login
       SmartBearUtils.loginforSmartBear(driver);


    }
    @Test
    public void TC1(){

      //  driver.findElement(By.linkText("Order")).click();
        //driver.findElement(By.xpath("//a[.='Order'")).click();
        driver.findElement(By.xpath("//a[@href='Process.aspx']")).click();
        Select dropDown = new Select(driver.findElement(By.id("ctl00_MainContent_fmwOrder_ddlProduct")));
        dropDown.selectByValue("FamilyAlbum");
        WebElement quantity = driver.findElement(By.name("ctl00$MainContent$fmwOrder$txtQuantity"));
        quantity.sendKeys(Keys.BACK_SPACE);

        quantity.sendKeys("5");



        WebElement calculateButton = driver.findElement(By.xpath("//input[@value='Calculate']"));
        calculateButton.click();
 Faker faker = new Faker();
 WebElement customerName = driver.findElement(By.id("ctl00_MainContent_fmwOrder_txtName"));

        WebElement streetName = driver.findElement(By.id("ctl00_MainContent_fmwOrder_TextBox2"));

        WebElement cityName = driver.findElement(By.id("ctl00_MainContent_fmwOrder_TextBox3"));
        WebElement state=driver.findElement(By.id("ctl00_MainContent_fmwOrder_TextBox4"));
        WebElement zip = driver.findElement(By.id("ctl00_MainContent_fmwOrder_TextBox5"));
    customerName.sendKeys(faker.name().fullName());
    cityName.sendKeys(faker.address().city());
    streetName.sendKeys(faker.address().streetAddress());
    state.sendKeys(faker.address().state());
    zip.sendKeys(faker.address().zipCode().replaceAll("-",""));
WebElement radioButton= driver.findElement(By.xpath("//input[@value='Visa']"));
radioButton.click();
WebElement cardNumber = driver.findElement(By.id("ctl00_MainContent_fmwOrder_TextBox6"));
cardNumber.sendKeys(faker.finance().creditCard().replaceAll("-",""));
WebElement expretionDate = driver.findElement(By.id("ctl00_MainContent_fmwOrder_TextBox1"));
expretionDate.sendKeys("01/25");
driver.findElement(By.linkText("Process")).click();

WebElement verify= driver.findElement(By.xpath("//strong"));

        Assert.assertEquals(verify.getText(),"New order has been successfully added.");







    }

}
