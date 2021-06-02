package stepdefinitions;

import pages.GooglePage;
import utils.WebDriverManager;
import io.cucumber.java.en.Given;

public class GoogleStepDefinitions {
	
	private WebDriverManager driverManager;
	
	public GoogleStepDefinitions(WebDriverManager driverManager) {
		this.driverManager = driverManager;
	}
	
	@Given("I am on the Google page")
    public void i_am_on_the_Google_page() {
		new GooglePage(driverManager);
    }
	
}
