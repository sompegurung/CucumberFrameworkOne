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

public class SharedDataFormultipleScenarios_02
	{

	WebDriver driver;
	// Create a constructor to get the "Shared Info from new class SharedClass

		public SharedDataFormultipleScenarios_02 (SharedClass share) 
		{
		driver = share.setup();
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
	
 	
}
