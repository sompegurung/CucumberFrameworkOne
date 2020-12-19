package StepsUsingTags;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(
		monochrome = true,
		dryRun = true,
//		tags = {"@important"},
//		tags = {"@smoke"},			
//		tags = {"@regression"},
// 		AND Condition
//		tags = {"@smoke", "@regression"}, 

//		OR Condition
		tags = {"@smoke, @regression"},	
		
		
		features={"src/test/resources/features/feature7_Tags/"},
//		glue= {"src/test/java/StepsRunner/"},

		/*
		plugin = {"pretty", 
				"html:target/cucumber-testhtml",
				"json:target/cucumber-report.json",
				"com.cucumber.listener.ExtentCucumberFormatter:target//extentreport.html"				
*/
				plugin = {"pretty", "com.cucumber.listener.ExtentCucumberFormatter:target/extentreport10.html"	
		
		}
		) 

public class TestRunnerWithTags {

} 
