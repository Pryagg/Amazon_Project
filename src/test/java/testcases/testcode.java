package testcases;

import java.io.File;
import java.io.FileInputStream;
import java.io.InputStream;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.input.ReaderInputStream;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class testcode 
{
	static WebDriver driver ;

	public static void main(String[] args) 
	{
		
		// Method to call the input stream (config file)
		try
		{
		
		Properties prop = new Properties();	
		FileInputStream input = new FileInputStream(new File("./src/test/resources/drivers/config.properties"));		
		prop.load(input);
		System.err.println("URL:  " + prop.getProperty("url"));
		System.err.println("Browser:  " + prop.getProperty("browser"));
		
		System.setProperty(prop.getProperty("browser"), prop.getProperty("path"));	
		driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(30l, TimeUnit.SECONDS);
		driver.get("http://amazon.in");
		
		driver.manage().window().maximize();
		}

		catch(Exception e)
		{
			System.out.println(e.getMessage());
			
		}
		
		
		

	}
	
	
	
	
	
	
	

}
