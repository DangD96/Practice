package Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.List;

public class MyPage {
    private WebDriver driver;

    public MyPage(WebDriver driver) {this.driver = driver;}

    // Locators
    public By Product() {return By.id("product");}

    // Getters
    public List<WebElement> getListOfProducts() {return driver.findElements(Product());}

    // Performers
    public void clickNthProduct(int n) {getListOfProducts().get(n-1).click();}
}
