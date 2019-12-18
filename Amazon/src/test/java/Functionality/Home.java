package Functionality;

import java.io.IOException;
import java.util.logging.LogManager;
import java.util.logging.Logger;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import Data.Base;
import PageFactory.HomePage;

public class Home extends Base 
{
	
	@BeforeTest
	
	public void initialize() throws IOException
	{
		driver = initializeDriver();
		
	}	
	
	@Test
	public void HomePagePopUp_SignIn()
	{
	
		driver.get("https://www.amazon.in");
		HomePage hp = new HomePage();
		hp.HomePage_LogInButton().click();
		
		hp.HomePage_EmailTextBox().sendKeys("7042733831");
		hp.HomePage_ContinueButton().click();
		hp.HomePage_PasswordText().sendKeys("Ninja@123");
		hp.HomePage_LogInButton().click();
	}
	

}
