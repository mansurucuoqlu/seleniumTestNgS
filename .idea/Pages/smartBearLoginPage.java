package Pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class smartBearLoginPage extends BasePage{
   /* 2.@findBy annotation to locate webElements
    -> using this FindBy annotation help us to locate web elements
    3.Create methods related webeleemtns*/

    @FindBy(id = "ctl00_MainContent_username")
    public WebElement usernameBox; // you assigned id locater to this webelement
    @FindBy (id = "ctl00_MainContent_password")
    public WebElement passwordBox; // tyou assigned id locater to this element
    @FindBy (id = "ctl00_MainContent_login_button")
    public WebElement loginButtonBox; // tyou assigned id locater to this element

    @FindBy(id = "ctl00_MainContent_status")
    private WebElement statusMessage;
    // if this is private you wont have access from outside
    //you will need create some methods to be able to use it
    // create metghods related webelements
    public void loginSmartBear (String userName,String password){
        //eitger you can also assign your username and pasword from properties file
        // or just from coling the method
        usernameBox.sendKeys(userName);
        passwordBox.sendKeys(password);
        loginButtonBox.click();

    }
    public String getStatusMessage (){
        return statusMessage.getText();
    }
    public WebElement getStatusMessageElement(){
        return statusMessage;
    }
}
