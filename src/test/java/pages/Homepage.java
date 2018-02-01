package pages;

import org.apache.xmlbeans.impl.xb.xsdschema.Public;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Homepage 
{

	//Page factory concept by Page Object Design Pattern
	
			 WebDriver driver ;
			
			@FindBy(id="twotabsearchtextbox")
			WebElement SearchBox;
			
			@FindBy(xpath="//input[@value='Go']")
			WebElement SearchButton ; 
			
			public Homepage(WebDriver driver) 
			{
				// TODO Auto-generated constructor stub
				this.driver = driver;
				//PageFactory.initElements(driver, this);
				//PageFactory.initElements(driver, this);
				System.out.println("test code");
			}
			
						
		public void EnterSearchedProduct(String productname)
			{
				try
				{
					// use excel sheet to take the data
					//ProductName_ExcelSheet pdname = new ProductName_ExcelSheet(); 
					SearchBox.clear();				
					SearchBox.sendKeys(productname);				
												
				}
				catch(Exception e)
				{
					e.printStackTrace();				
				}
		    }
			
		public void ClickSearchButton()
			{
				try
				{
					//driver.		
					SearchButton.click();					
				}
				catch(Exception e)
				{
					e.printStackTrace();				
				}
			}			
	
			
}
