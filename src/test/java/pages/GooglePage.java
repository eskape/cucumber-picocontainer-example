package pages;

import org.openqa.selenium.WebDriver;
import utils.WebDriverManager;

public class GooglePage {
	
	private WebDriver driver;

	public GooglePage(WebDriverManager driverManager) {	        
		driver = driverManager.getDriver();
		driver.get("https://www.google.nl");
	}
	
}
