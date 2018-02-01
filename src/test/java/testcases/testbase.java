package testcases;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;


public class testbase 
{
	WebDriver driver ;
	
	
	@BeforeSuite
	public void Initialise()
	{
		
		try
		{
			// need to write the code from the property file to take the value of WebBrowser
			System.setProperty("webdriver.chrome.driver", "./src/test/resources/drivers/chromedriver.exe");
			driver = new ChromeDriver();			
			navigate();
			SetBrowserSettings();					
			
		}
		
		catch(Exception e)
		{
			System.err.println("got an error while Initialising");
		}
	}
	
	
	public void testmethod()
	{
		System.out.println("test data abc");
	}
	
	public void SetBrowserSettings()
	{
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30l, TimeUnit.SECONDS);
	}
	
	public void navigate()
	{
		try 
		{
			//driver.get(Property.getPropertyValue("URL"));
			driver.get("http://amazon.in");
			
			
		}
		catch(Exception e)
		{
			System.out.println(e.getMessage());
			
		}
		
	}
	
	
	//@AfterSuite
	public void TearDown()
	{
		if(driver!=null)
		{
			driver.quit();
		}
		
	}



}
