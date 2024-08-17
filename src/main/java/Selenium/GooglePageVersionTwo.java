package Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class GooglePageVersionTwo {
    public WebDriver driver;

    public GooglePageVersionTwo(WebDriver driver) {
        this.driver = driver;
    }

    // LOCATORS
    By searchBtnBy = By.cssSelector("[value='Google Search']");

    public void doBtn() {
        WebElement searchBtn = driver.findElement(searchBtnBy);
        searchBtn.click();
    }
}
