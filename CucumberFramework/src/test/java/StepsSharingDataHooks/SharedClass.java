package StepsSharingDataHooks;

import org.junit.After;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import cucumber.api.java.Before;

public class SharedClass 
	{

	WebDriver driver;
	
	@Before
	public WebDriver setup ()
	{	
		if (driver==null)
		{
		System.setProperty("webdriver.gecko.driver", "/Users/sompevangurung/Documents/Automation/Dependencies/BrowserDriver/geckodriver");
		driver=new FirefoxDriver();		
		}
		return driver;
	}	

	@After
	public void teardown()
	{
		driver.close();  
		driver = null;
		System.out.println("Tear down Execution Log");
	}
	
	
}
