package nl.eskape;

import org.picocontainer.annotations.Inject;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import nl.eskape.pages.GooglePage;
import nl.eskape.utils.SharedDriver;

public class StepDefinitions {


    @Inject private SharedDriver driver;
    @Inject private GooglePage googlePage;
    
    @Given("I am on the Google page")
    public void i_am_on_the_Google_page() {
       googlePage.goToGoogle();
    }

    @When("I search {string} in the search box")
    public void i_search_in_the_search_box(String string) {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }

    @Then("{string} should be mentioned in the results")
    public void should_be_mentioned_in_the_results(String string) {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }

}
