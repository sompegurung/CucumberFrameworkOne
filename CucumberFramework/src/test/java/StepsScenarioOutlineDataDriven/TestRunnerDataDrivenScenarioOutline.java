package StepsScenarioOutlineDataDriven;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(

		monochrome = true,
		dryRun = false,
		features={"src/test/resources/features/feature6_ScenarioOutline/"},
//		glue= {"src/test/java/StepsRunner/"},
		plugin = {"pretty", 
				"html:target/cucumber-testhtml",
				"json:target/cucumber-report7.json"
		}
		) 

public class TestRunnerDataDrivenScenarioOutline {

} 
