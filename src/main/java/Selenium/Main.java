package Selenium;

import org.openjdk.jol.vm.VM;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


public class Main {
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.google.com");
        By googleSearch = By.cssSelector("[value='Google Search']");
        WebElement googleSearchBtn = driver.findElement(googleSearch);
        System.out.println(VM.current().addressOf(googleSearch)); // same address
        System.out.println(VM.current().addressOf(googleSearch)); // same address
        googleSearchBtn = driver.findElement(googleSearch);
        System.out.println(VM.current().addressOf(googleSearchBtn)); // different address


        // With page factory
        GooglePage g = new GooglePage(driver);
        System.out.println(VM.current().addressOf(g.SEARCH_BTN)); // same address
        System.out.println(VM.current().addressOf(g.SEARCH_BTN)); // same address
        g = new GooglePage(driver);
        System.out.println(VM.current().addressOf(g.SEARCH_BTN)); // // different address
        driver.quit();
    }
}
