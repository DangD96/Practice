package UdemyPractice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class StaticDropDown {
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.google.com"); // The Get method waits until everything is loaded
        WebElement element = driver.findElement(By.id("hi"));
        Select dropdown = new Select(element);
        dropdown.selectByIndex(2);
        driver.quit();
    }
}
