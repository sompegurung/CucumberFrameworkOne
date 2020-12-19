package StepsRunnerDataTable;

import java.util.List;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import cucumber.api.DataTable;
import cucumber.api.PendingException;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class DataTableBackground
	{

	WebDriver driver;
	
	@Given("^User need to be on Facebook login page$")
	public void user_need_to_be_on_Facebook_login_page() throws Throwable {
		
	//System.setProperty("webdriver.chrome.driver", "/Users/sompevangurung/Documents/Automation/Dependencies/BrowserDriver/chromedriver");
	//driver=new ChromeDriver();

		System.setProperty("webdriver.gecko.driver", "/Users/sompevangurung/Documents/Automation/Dependencies/BrowserDriver/geckodriver");
		driver=new FirefoxDriver();
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

//Setup Data Table 
	@When("^User enters the following data$")
	public void user_enters_the_following_data(DataTable table) throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    // For automatic transformation, change DataTable to one of
	    // List<YourType>, List<List<E>>, List<Map<K,V>> or Map<K,V>.
	    // E,K,V must be a scalar (String, Integer, Date, enum etc)

		List<List<String>> data = table.raw();
		String value1 = data.get(0).get(0);
		String value2 = data.get(0).get(1);

		String value3 = data.get(1).get(0);
		String value4 = data.get(1).get(1);

		driver.findElement(By.xpath("//input[@id='email']")).sendKeys(value3);
		driver.findElement(By.xpath("//input[@id='pass']")).sendKeys(value4);
		
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

	@Then("^close browser$")
	public void close_browser() throws Throwable {
		driver.close();  
	}



	
}
