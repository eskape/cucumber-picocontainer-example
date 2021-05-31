package nl.eskape.utils;

import org.openqa.selenium.WebDriver;

public class SharedDriver {

    private static WebDriver driver;

    public SharedDriver(WebDriver driver) {
        SharedDriver.driver = driver;
    }

}
