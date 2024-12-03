package InnerClass;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.List;

public class Guardian {
    static WebDriver driver;
    static Enums.Platforms pf;

    // Approach 1
    // region Locators
    public static class AcceptBtn {
        static final By Android = By.id("accept");
        static final By iOS = By.id("act");
    }
    public static class Card {
        static final By Android = By.id("card");
        static final By iOS = By.xpath("//XCUIElementTypeOther");
    }
    public static class SharedBtn {
        static final By Shared = By.id("shared");
    }
    // endregion

    // region Performers
    public static void tapAcceptBtn() {getAcceptBtn().click();}
    public static void tapNthCard(int n) {getListOfCards().get(n-1).click();}
    // endregion

    // region Getters
    public static WebElement getAcceptBtn() {
        return switch (pf) {
            case Android -> driver.findElement(AcceptBtn.Android);
            case iOS -> driver.findElement(AcceptBtn.iOS);
        };
    }
    public static List<WebElement> getListOfCards() {
        return switch (pf) {
            case Android -> driver.findElements(Card.Android);
            case iOS -> driver.findElements(Card.iOS);
        };
    }
    public static int getNumberOfCards() {return getListOfCards().size();}
    // endregion
}
