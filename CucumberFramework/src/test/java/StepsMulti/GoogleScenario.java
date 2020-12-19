package StepsMulti;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import cucumber.api.PendingException;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class GoogleScenario
	{

	WebDriver driver = null;
	
	@Given("^User is on google page$")
	public void User_is_on_google_page() throws Throwable {
		
		System.setProperty("webdriver.gecko.driver", "/Users/sompevangurung/Documents/Automation/Dependencies/BrowserDriver/geckodriver");
		driver=new FirefoxDriver();
		driver.get("https://www.google.com");	
		Thread.sleep(1000);
	}


	@When("^User enters search string on google$")
	public void User_enters_search_string_on_google() throws Throwable {	
		driver.findElement(By.xpath("//input[@type='text']")).sendKeys("search medicine");
		Thread.sleep(1000);
	}

}
