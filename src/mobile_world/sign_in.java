package mobile_world;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class sign_in {
    
@Test(dataProvider = "datas")
    public void signin(String username,String password) throws InterruptedException{
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\aisvarya.narasimman\\Downloads\\chromedriver_win32 (3)\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://mobileworld.banyanpro.com//");
        Landingpage landing = new Landingpage(driver);
        landing.loginApplication(username,password);
        }



@DataProvider



public Object[][] datas() {



   Object[][] data = new Object[10][2];
            
    data[0][0] = "aisvarya";
    data[0][1] = "aish2010";
    
    data[1][0] = "sdfghjkasdfghjasdfghjasdfghjkasdfghjasdfghjkasdfghj";
    data[1][1] = "aish2010";
    
    data[2][0] = "";
    data[2][1] = "aish2010";
    
    data[3][0] = "ai";
    data[3][1] = "";
    
    data[4][0] = "!@#$%^";
    data[4][1] = "aish2010";
    
    data[5][0] = "ai";
    data[5][1] = "ai";
    
    data[6][0] = "ai";
    data[6][1] = "aish201035678";
    
    data[7][0] = "12345";
    data[7][1] = "aish2010";
    
    data[8][0] = "ai";
    data[8][1] = "123456";
    
    data[9][0] = "gg12";
    data[9][1] = "aish2010";
    
    
  
    return data;
}
    
}