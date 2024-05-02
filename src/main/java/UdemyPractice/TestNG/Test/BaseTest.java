package UdemyPractice.TestNG.Test;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class BaseTest {
    public String name = "base";

    @BeforeMethod
    public void beforeMethod() {
        System.out.println("I'm from the parent class. I execute before every test method");
    }

    @AfterMethod
    public void afterMethod() {
        System.out.println("I'm from the parent class. I execute after every test method");
    }
}
