package PageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LaunchBrowser {

	
	public static void main(String[] args) {
		WebDriver driver;
		WebDriverManager.chromedriver().setup();
		driver= new ChromeDriver();
		driver.get("https://www.facebook.com/r.php?locale=en_GB&display=page");

	}

}
