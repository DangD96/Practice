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

        // With By
        By googleSearch = By.cssSelector("[value='Google Search']");
        WebElement googleSearchBtn = driver.findElement(googleSearch);
        System.out.println(VM.current().addressOf(googleSearch));
        googleSearchBtn = driver.findElement(googleSearch);
        System.out.println(VM.current().addressOf(googleSearchBtn)); // different address as previous

        System.out.println("----------");

        // With page factory
        GooglePage g = new GooglePage(driver);
        System.out.println(VM.current().addressOf(g.SEARCH_BTN));
        System.out.println(VM.current().addressOf(g.SEARCH_BTN)); // same address as previous

        System.out.println("----------");

        // With By v2
        System.out.println(VM.current().addressOf(g.getBtn()));
        System.out.println(VM.current().addressOf(g.getBtn())); // different address as previous

        driver.quit();
    }
}
