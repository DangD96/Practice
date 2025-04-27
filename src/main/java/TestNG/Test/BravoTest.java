package TestNG.Test;

import org.testng.annotations.Test;

public class BravoTest extends AlphaTest {
    @Test
    @Override
    public void myTest(){
        System.out.println("I am the child class");
        // Thanks to inheritance, the testng annotations from the parent class will also run
        String test = this.name;
    }
}
