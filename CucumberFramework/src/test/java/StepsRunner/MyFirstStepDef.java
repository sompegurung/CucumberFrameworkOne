package StepsRunner;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import cucumber.api.PendingException;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class MyFirstStepDef 
	{

	WebDriver driver;
	
	@Given("^User need to be on Facebook login page$")
	public void user_need_to_be_on_Facebook_login_page() throws Throwable {
		
	//System.setProperty("webdriver.chrome.driver", "/Users/sompevangurung/Documents/Automation/Dependencies/BrowserDriver/chromedriver");
	//driver=new ChromeDriver();

		System.setProperty("webdriver.gecko.driver", "/Users/sompevangurung/Documents/Automation/Dependencies/BrowserDriver/geckodriver");
		driver=new FirefoxDriver();
		driver.get("https://www.facebook.com");	
	}

	@When("^User enters user first name$")
	public void user_enters_user_first_name() throws Throwable {

		
		driver.findElement(By.xpath("//input[@id='email']")).sendKeys("Hero");
//		  throw new PendingException();
	}

	@Then("^User checks users first name is present$")
	public void user_checks_users_first_name_is_present() throws Throwable {

		String userNameActual = driver.findElement(By.xpath("//input[@id='email']")).getAttribute("value");
		Assert.assertEquals ("Hero", userNameActual);
		driver.close();
	}
	
	}
