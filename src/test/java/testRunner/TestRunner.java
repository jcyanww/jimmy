package testRunner;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

		@RunWith(Cucumber.class)
		@CucumberOptions(

	features = {"C:/Users/jcruk/eclipse-workspace/com.my.automation/src/test/resources/feature/test.feature"},
				
		glue = {"stepDefinition"},
		plugin = {"pretty", "html:target/cucumber-reports"},
		

				dryRun = false,
				monochrome = true
		
		)



public class TestRunner {

}
