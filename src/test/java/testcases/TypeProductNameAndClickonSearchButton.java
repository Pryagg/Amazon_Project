package testcases;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import pages.Homepage;

public class TypeProductNameAndClickonSearchButton 
{
	
	

	static WebDriver driver ;
	

	@Test
	public void EnterProductNAme ()
	{
		//LoginPage loginPageFindBy = PageFactory.initElements(loginPage.driver, LoginPage.class);
		//Homepage homepage = PageFactory.initElements(driver, Homepage.class);
		Homepage homepage =PageFactory.initElements(driver, Homepage.class);
		/*homepage.EnterSearchedProduct("IPhone");
		homepage.ClickSearchButton();
			*/
		homepage.EnterSearchedProduct("Indian flag");
		homepage.ClickSearchButton();
	}

	
}
