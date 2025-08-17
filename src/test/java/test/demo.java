package test;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class demo {

    @Test
    public void launchFlipkart() {
        // Setup ChromeDriver automatically
        WebDriverManager.chromedriver().setup();

        // Create Chrome browser instance
        WebDriver driver = new ChromeDriver();

        // Open Flipkart
        driver.get("https://www.flipkart.com");

        // Print page title
        System.out.println("Page title is: " + driver.getTitle());

        // Close browser
        driver.quit();
    }
}
