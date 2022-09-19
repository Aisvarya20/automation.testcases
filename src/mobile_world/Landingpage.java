package mobile_world;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;



public class Landingpage {
	
			WebDriver driver;
			public Landingpage(WebDriver driver)
			{
				this.driver=driver;
				PageFactory.initElements(driver,this);
			}
			@FindBy(xpath= "//button[@class='btn btn-warning my-2 my-sm-0']")
	        WebElement signin;
			@FindBy(id="username")
			WebElement username;
			@FindBy(id="password")
			WebElement password;
			@FindBy(linkText="Log In")
			WebElement login;
			//---------------------------------------------------------------------------
			@FindBy(xpath= "//button[@class='btn btn-warning my-2 my-sm-0']")
	        WebElement Signin;
			
			@FindBy(linkText = "Sign up")
	         WebElement  Signup;
			
			@FindBy(css="input[type='text']")
			WebElement Firstname;
			
			@FindBy(xpath="//input[@placeholder='Last Name']")
			WebElement Lastname;
			
			@FindBy(xpath="//input[@placeholder='Enter Email']")
			WebElement Email;
			
			@FindBy(xpath="//input[@type='Password']")
			WebElement Password;
			
			@FindBy(xpath="//input[@type='date']")
			WebElement calendar;
			
			@FindBy(xpath="//*[@id=\"myForm\"]/div[3]/div[4]/input")
			WebElement form;
			
			@FindBy(xpath="//input[@min='0']")
			WebElement number;
			
			@FindBy(css="textarea.form-control")
			WebElement shortbio;
			
			@FindBy(xpath="//button[@type='submit']")
			WebElement submit;
			
			@FindBy(xpath="//form/div[6]/div[3]")
			WebElement signin1; 
			
	//---------------------------------------------------------------------------------------------------------		
			  @FindBy(linkText="All Mobiles")
		      WebElement allmobiles;
		      
		      @FindBy(id="myInput")
		      WebElement search;  
			
			public void loginApplication(String name,String loginpassword)
			{
			    signin.click();
				username.sendKeys(name);
				password.sendKeys(loginpassword);
				login.click();
			}
			public void registrationPage(String fname,String lname,String mailname,String pword,String cfield,String mobilenumber,String bioarea)
			{
				Signin.click();
				Signup.click();
                Firstname.sendKeys(fname);
				Lastname.sendKeys(lname);
				Email.sendKeys(mailname);
				Password.sendKeys(pword);
				calendar.sendKeys(cfield);
				form.click();
				number.sendKeys(mobilenumber);
				shortbio.sendKeys(bioarea);
				submit.click();
				driver.switchTo().alert().accept();
				
			
				
			}
			 public void Allmobiles(String MobileName) throws InterruptedException
		      {
		          allmobiles.click();
		          Thread.sleep(2000);
		          search.sendKeys(MobileName);
		          Thread.sleep(2000);
		          
		      }
	

	}


