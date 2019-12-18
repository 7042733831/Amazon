package Data;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class Base
{
	
	public static WebDriver driver;
	public Properties prop;
	public WebDriver initializeDriver() throws IOException
	{
		
		Properties prop = new Properties();
		FileInputStream file= new FileInputStream("C:\\Users\\ankur.rana.ODA\\eclipse-workspace\\Amazon\\src\\main\\java\\Data\\data.properties");
		
		prop.load(file);
		
		String BrowserName = prop.getProperty("browser");
		
		if(BrowserName.equals("chrome"))
		{
			 System.setProperty("webdriver.chrome.driver", "C:\\Users\\ankur.rana.ODA\\eclipse-workspace\\Amazon\\Drivers\\chromedriver.exe");
			 driver= new ChromeDriver();
			
			
		}
		else if (BrowserName.equals("firefox"))
		{
			 System.setProperty("webdriver.gecko.driver", "D:\\AmazonProject\\Amazon\\Drivers\\geckodriver.exe");
			 driver= new FirefoxDriver();
			
		}
		else if (BrowserName.equals("IE"))
		{
			System.setProperty("webdriver.ie.driver", "D:\\AmazonProject\\Amazon\\Drivers\\IEDriverServer.exe");
			driver= new InternetExplorerDriver();
		}
		return driver;
	}
	
	public void GetScreenShot()
	{
		
	}

}
