package UdemyPractice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

import java.time.Duration;

public class Main {
    public static void main(String[] args) throws InterruptedException {
        /* ChromeDriver driver = new ChromeDriver();
         WebDriver is an interface that ChromeDriver, FirefoxDriver, etc implement
         Have to implement the methods defined in WebDriver at minimum
         ChromeDriver also has its own specific methods on top of that, probably. But we don't need those */
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://phptravels.com/");
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3)); // Driver waits for X sec for objects to exist on page
        WebElement logo = driver.findElement(By.cssSelector("img[alt='Google']"));
        logo.click();
        Thread.sleep(1000); // One time wait for page state to stabilize
        System.out.println(driver.getTitle());
        Assert.assertEquals("Goog", driver.getTitle());
        driver.quit();


    }
}