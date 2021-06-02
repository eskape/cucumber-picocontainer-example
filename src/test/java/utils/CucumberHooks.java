package utils;

import org.openqa.selenium.WebDriver;
import io.cucumber.java.After;

public class CucumberHooks {
	
	private WebDriver driver;
	
	public CucumberHooks(WebDriverManager driverManager) {
		driver = driverManager.getDriver();
	}

	@After
	public void closeBrowser() {
		driver.close();
	}
}
