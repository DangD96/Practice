package UdemyPractice.TestNG.Test;

import org.testng.annotations.Test;

public class Test1 extends BaseTest {
    @Test
    public void myTest(){
        System.out.println("I am the child class");
        // Thanks to inheritance, the testng annotations from the parent class will also run
    }
}
