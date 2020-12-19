package StepsSharingDataHooks;

import org.junit.After;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import cucumber.api.PendingException;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class SharedDataFormultipleScenarios_01
	{

	WebDriver driver;
// Create a constructor to get the "Shared Info from new class SharedClass

	public SharedDataFormultipleScenarios_01 (SharedClass share) 
	{
	driver = share.setup();
	}
	
//	@Before moved to shared class
/*
	public void before ()
	{	
		System.out.println("1. Before Execution Log");
		System.setProperty("webdriver.gecko.driver", "/Users/sompevangurung/Documents/Automation/Dependencies/BrowserDriver/geckodriver");
		driver=new FirefoxDriver();		
	}
*/	
	
	@Given("^User need to be on Facebook login page$")
	public void user_need_to_be_on_Facebook_login_page() throws Throwable {
		driver.get("https://www.facebook.com");	
		Thread.sleep(1000);
	}

	@When("^User enters user \"([^\"]*)\" first name$")
	public void user_enters_user_first_name(String username) throws Throwable {
		
		driver.findElement(By.xpath("//input[@id='email']")).sendKeys(username);
		Thread.sleep(1000);
	}

	@When("^User enters password \"([^\"]*)\" in email$")
	public void user_enters_password(String password) throws Throwable {
		driver.findElement(By.xpath("//input[@id='pass']")).sendKeys(password);
		Thread.sleep(1000);
	}
	
//	@After - Tear Down moved to Shared Class	

	
}
