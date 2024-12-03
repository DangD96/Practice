package InnerClass;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.List;

public class GuardianTwo {
    static WebDriver driver;
    static Enums.Platforms pf;

    // Approach 2: Combine locators and element getters from Approach 1
    // Elements
    public static WebElement AcceptBtn() {
        return switch (pf) {
            case Android -> driver.findElement(By.id("accept"));
            case iOS -> driver.findElement(By.id("act"));
        };
    }
    public static WebElement Card() {
        return switch (pf) {
            case Android -> driver.findElement(By.id("card")); // duplicate locator
            case iOS -> driver.findElement(By.id("hi"));
        };
    }
    public static List<WebElement> ListOfCards() {
        return switch (pf) {
            case Android -> driver.findElements(By.id("card")); // duplicate locator
            case iOS -> driver.findElements(By.id("hi"));
        };
    }

    // Getters
    public static int getNumberOfCards() {return ListOfCards().size();}

    // Performers
    public static void tapAcceptButton() {AcceptBtn().click();}
    public static void tapNthCard(int n) {ListOfCards().get(n-1).click();}
}
