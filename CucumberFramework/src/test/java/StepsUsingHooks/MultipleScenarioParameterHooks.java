package StepsUsingHooks;

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

public class MultipleScenarioParameterHooks
	{

	WebDriver driver;
	
	@Before (order=1)
	public void before1 ()
	{
		
		System.out.println("1. Before Execution Log");
		//System.setProperty("webdriver.chrome.driver", "/Users/sompevangurung/Documents/Automation/Dependencies/BrowserDriver/chromedriver");
		//driver=new ChromeDriver();
		System.setProperty("webdriver.gecko.driver", "/Users/sompevangurung/Documents/Automation/Dependencies/BrowserDriver/geckodriver");
		driver=new FirefoxDriver();		
	}
	
	@Before (order=2)
	public void before2 ()
	{
		System.out.println("2. Before Execution Log");
	}
	
	
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
	
	@Then("^User checks user \"([^\"]*)\" first name is present$")
	public void user_checks_users_first_name_is_present(String username) throws Throwable {
		String userNameActual = driver.findElement(By.xpath("//input[@id='email']")).getAttribute("value");
		Assert.assertEquals (username, userNameActual);
	
	}
	
	@Then("^User clicks on Login button$")
	public void user_clicks_on_Login_button() throws Throwable {
		driver.findElement(By.xpath("//button[@id='u_0_b']")).click();
		Thread.sleep(1000);
		
	}

//	@Then("^close browser$")
//	public void close_browser() throws Throwable {
//		driver.close();  
//	}

	@After
	public void teardown1 ()
	{
		System.out.println("1. Tear down beginning");

	}
	
	@After
	public void teardown2 ()
	{
		driver.close();  
		driver = null;
		System.out.println("2. Tear down Execution Log");

	}
	

	
}
