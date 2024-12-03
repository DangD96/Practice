package InnerClass;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Main {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver =  new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.google.com");
        WebElement e = getElement(driver);
        System.out.println("e is: " + e);
        driver.quit();
    }

    public static WebElement getElement(WebDriver driver) {
        try {
            return driver.findElement(By.id("fake"));
        } catch (Exception e) {
            return null;
        }
    }
}
