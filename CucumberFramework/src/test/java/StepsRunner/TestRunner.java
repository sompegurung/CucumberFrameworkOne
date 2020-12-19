package StepsRunner;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(

		monochrome = true,
//		dryRun = true,
		features={"src/test/resources/features/feature1/"},
//		glue= {"src/test/java/StepsRunner/"},
		plugin = {"pretty", 
				"html:target/cucumber-testhtml",
				"json:target/cucumber-report5.json"
		}
		) 

public class TestRunner {

} 
