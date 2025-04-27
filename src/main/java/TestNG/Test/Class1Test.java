package TestNG.Test;

import org.testng.Assert;
import org.testng.annotations.*;

public class Class1Test {

    @BeforeSuite
    public static void BeforeSuite() {System.out.println("This executes before the entire test suite (defined in XML file)");}

    @BeforeTest
    public static void Setup() {System.out.println("This executes before the tests run in THIS class");}

    @BeforeMethod
    public static void BeforeMethod() {System.out.println("This executes BEFORE every method in this class");}

    @Test
    public static void Test1() {
        System.out.println("I am test method test1");
        Assert.assertTrue(true);
    }

    @AfterMethod
    public static void AfterMethod() {System.out.println("This executes AFTER every method in this class");}

    @Test
    public static void Test2() {System.out.println("I am test method test2");}

    // Can set up parameters in xml file or in intellij config
    @Parameters({"message"})
    @Test(groups = {"djd"}, enabled = true)
    public static void DJDTest1(String shout) {
        System.out.println("I am test method djdtest1");
        System.out.println(shout);
    }

    @Test(groups = {"djd"})
    public static void DJDTest2() {System.out.println("I am test method djdtest2");}

    @AfterTest
    public static void Teardown() {System.out.println("This executes after all the tests in THIS class are done");}

    @AfterSuite
    public static void AfterSuite() {System.out.println("This executes after the entire test suite (defined in XML file)");}

    @BeforeGroups({"djd"}) // These Group annotations seem to ignore other annotations
    public static void BeforeGroup() {System.out.println("Executes before certain test groups");}

    @AfterGroups({"djd"})
    public static void AfterGroup() {System.out.println("Executes after certain test groups");}
}

