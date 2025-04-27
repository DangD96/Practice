package TestNG.Test;

import org.testng.ITestListener;
import org.testng.ITestResult;

public class Listeners implements ITestListener {
    public void onTestFailure(ITestResult result) {
        System.out.println("FAILURE!");
        System.out.println(result);
        System.out.println(result.getName());
        System.out.println(result.getTestClass());
        System.out.println(result.getMethod());
    }

}
