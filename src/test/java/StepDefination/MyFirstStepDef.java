/**
 * 
 */
package StepDefination;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;
import junit.framework.Assert;

/**
 * @author Om Prakash Gautam
 *
 */
public class MyFirstStepDef {
	
	WebDriver driver;
	
	@Given("^User need to be on facebook login page$")
	public void user_need_to_be_on_facebook_login_page(){
		WebDriverManager.chromedriver().setup();
		driver= new ChromeDriver();
		driver.get("https://www.facebook.com/r.php?locale=en_GB&display=page");
	}

	@When("^User enters user first name$")
	public void user_enters_user_first_name(){
		driver.findElement(By.id("u_0_j_EW")).sendKeys("Gautam");
	}

	@Then("^User checks user first name present$")
	public void user_checks_user_first_name_present(){
		
		String actialtext = driver.findElement(By.id("u_0_l_g0")).getAttribute("value");
		Assert.assertEquals("Gautam",actialtext);
	    
	}
	

}
