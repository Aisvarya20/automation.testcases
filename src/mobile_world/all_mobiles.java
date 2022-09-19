package mobile_world;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class all_mobiles {
	@Test

	public void setup() throws InterruptedException  {
        
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\aisvarya.narasimman\\Downloads\\chromedriver_win32 (3)\\chromedriver.exe");
	       WebDriver driver = new ChromeDriver();
	       driver.get("https://mobileworld.banyanpro.com//");
	       Landingpage landingpage3 = new Landingpage(driver);
	       Thread.sleep(1000);
	       landingpage3.Allmobiles("search");
	     }
	}