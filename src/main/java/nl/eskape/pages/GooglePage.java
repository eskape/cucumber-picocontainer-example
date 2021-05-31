package nl.eskape.pages;

import org.openqa.selenium.WebDriver;

public class GooglePage {
    private WebDriver driver;

    public GooglePage(WebDriver driver) {
        this.driver = driver;
    }
 
    public void goToGoogle(){
        driver.get("https://www.google.nl/");
    }    
}
