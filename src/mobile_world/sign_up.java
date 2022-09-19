package mobile_world;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class sign_up {
		@Test(dataProvider = "datas")



		    public void signup1(String firstname,String lastname,String email,String password,String DOB,String phonenumber,String bio) throws InterruptedException{
		        // TODO Auto-generated method stub
			System.setProperty("webdriver.chrome.driver", "C:\\Users\\aisvarya.narasimman\\Downloads\\chromedriver_win32 (3)\\chromedriver.exe");
		        WebDriver driver = new ChromeDriver();
		        driver.get("https://mobileworld.banyanpro.com//");
		        Landingpage landing = new Landingpage(driver);
		        landing.registrationPage(firstname, lastname, email, password, DOB, phonenumber, bio);


		   }
		@DataProvider



		public Object[][] datas() {



		   Object[][] data = new Object[6][7];
		    
		    data[0][0] = "aisvarya";
		    data[0][1] = "narasimman";
		    data[0][2] = "aish1@gmail.com";
		    data[0][3] = "aish1234";
		    data[0][4] = "10/20/2000";
		    data[0][5] = "9361657414";
		    data[0][6] = "hii i am aisvarya";
		    
		    data[1][0] = "";
		    data[1][1] = "narasimman";
		    data[1][2] = "aish1@gmail.com";
		    data[1][3] = "aish1234";
		    data[1][4] = "10/20/2000";
		    data[1][5] = "9361657414";
		    data[1][6] = "hii i am aisvarya";
		    
		    data[2][0] = "aisvarya";
		    data[2][1] = "";
		    data[2][2] = "aish1@gmail.com";
		    data[2][3] = "aish1234";
		    data[2][4] = "10/20/2000";
		    data[2][5] = "9361657414";
		    data[2][6] = "hii i am aisvarya";
		    
		    data[3][0] = "aisvarya";
		    data[3][1] = "narasimman";
		    data[3][2] = "ai";
		    data[3][3] = "aish1234";
		    data[3][4] = "10/20/2000";
		    data[3][5] = "9361657414";
		    data[3][6] = "hii i am aisvarya";
		    
		    data[4][0] = "aisvarya";
		    data[4][1] = "narasimman";
		    data[4][2] = "aish1@gmail.com";
		    data[4][3] = "ai";
		    data[4][4] = "10/20/2000";
		    data[4][5] = "9361657414";
		    data[4][6] = "hii i am aisvarya";
		    
		    data[5][0] = "aisvarya";
		    data[5][1] = "narasimman";
		    data[5][2] = "aish1@gmail.com";
		    data[5][3] = "aish1234";
		    data[5][4] = "10/20/2000";
		    data[5][5] = "93616574";
		    data[5][6] = "hii i am aisvarya";
		    return data;



		}
		}