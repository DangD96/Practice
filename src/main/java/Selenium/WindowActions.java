package Selenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WindowActions {
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.google.com"); // The Get method waits until everything is loaded
        driver.navigate().to("https://www.youtube.com");
        driver.navigate().back();
        driver.quit();
    }

}
