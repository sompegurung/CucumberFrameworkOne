package StepsSharingDataHooks;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(
		monochrome = true,
		dryRun = false ,

//		tags = {"@important"},
//		tags = {"@smoke"},			
//		tags = {"@regression"},
// 		AND Condition
//		tags = {"@smoke", "@regression"}, 
//		OR Condition
//		tags = {"@smoke, @regression"},	
			
		features={"src/test/resources/features/feature10_ShareData/"},
//		glue= {"src/test/java/StepsRunner/"},
		plugin = {"pretty", 
				"html:target/cucumber-testhtml",
				"json:target/cucumber-report8.json"
		}
		) 

public class TestRunnerWithSharedData {

} 
