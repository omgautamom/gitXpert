/**
 * 
 */
package StepDefination;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

/**
 * @author Om Prakash Gautam
 *
 */

@RunWith(Cucumber.class)
@CucumberOptions(
		
		features=".//resources/facebook.feature",
		glue="StepDefination/MyFirstStepDef.java",
		//dryRun=true,
		monochrome=true,
		plugin= {"pretty",
				"html:test-output"}
		
		)

public class MyFirstRunner {
	
	

}
