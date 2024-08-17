package Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class GooglePage {
    public WebDriver driver;

    public GooglePage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    @FindBy(css = "[value='Google Search']")
    WebElement SEARCH_BTN;

    public WebElement getBtn(){
        return driver.findElement(By.cssSelector("[value='Google Search']"));
    }
}
