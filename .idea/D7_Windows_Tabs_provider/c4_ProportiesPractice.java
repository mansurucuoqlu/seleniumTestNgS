package D7_Windows_Tabs_provider;

import org.testng.annotations.Test;
import utilties.ProperTiesReadingUtil;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class c4_ProportiesPractice {
    @Test
    public void TC1_systemProperties(){
        //Java has some ready properties that yoiu can get system info
        System.out.println("System.getProperty(\"os.name \") = " + System.getProperty("os.name "));
        System.out.println("System.getProperty(\"user.name\") = " + System.getProperty("user.name"));
    }


    @Test
    public void TC2_configurationProporties() throws FileNotFoundException {
        //to be able to make our code understand properties file i bneed tp connect to my file

        Properties properties = new Properties();
        String pathForPropertiesFile="configuration.properties";
        //we need to get parh of file either absulate or root
        //we need to tell compiler to open this file
        FileInputStream fileInputStream = new FileInputStream(pathForPropertiesFile);


        try {
            properties.load(fileInputStream);
            //file needs to be loadded ibn the automation
            //we use load method that comes from propertises class
        }
        catch(IOException e){
            e.printStackTrace();
        }
        System.out.println(properties.getProperty("SmartBear_url"));
        System.out.println(properties.getProperty("SmartBear_username"));
    }
     @Test
    public void TC3_configurationProporties() throws FileNotFoundException {
         //to be able to make our code understand properties file i bneed tp connect to my file
         System.out.println(ProperTiesReadingUtil.getProperties("SmartBear_url"));
         System.out.println(ProperTiesReadingUtil.getProperties("SmartBear_password"));

    }
}
