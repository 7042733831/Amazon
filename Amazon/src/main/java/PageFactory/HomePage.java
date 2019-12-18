package PageFactory;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class HomePage 
{

	WebDriver driver;
	
	By signIn =  By.id("nav-link-accountList");
	By email = By.id("ap_email");
	By cont = By.id("continue");
	By pass = By.id("ap_password");
	By login = By.id("signInSubmit");
	
	
	public HomePage()
	{
		this.driver= driver;
	}
	
	public WebElement HomePage_SignInPopUp()
	{
		return driver.findElement(signIn);
	}
	
	public WebElement HomePage_EmailTextBox()
	{
		return driver.findElement(email);
	}
	
	public WebElement HomePage_ContinueButton()
	{
		return driver.findElement(cont);
	}
	
	public WebElement HomePage_PasswordText()
	{
		return driver.findElement(pass);
	}
	
	public WebElement HomePage_LogInButton()
	{
		return driver.findElement(login);
	}
	
}
