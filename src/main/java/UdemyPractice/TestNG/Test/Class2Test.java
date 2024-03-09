package UdemyPractice.TestNG.Test;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class Class2Test {
    @Test
    public static void Test1() {
        System.out.println("alpha");
    }

    @Test(dataProvider = "getData") // For every row in the data object array, this test will run once
    public static void Test2(String dataFirst, String dataSecond) {
        System.out.println("bananas");
        System.out.println(dataFirst);
        System.out.println(dataSecond);
    }

    @DataProvider // lets you parameterize your tests
    public Object[][] getData() {
        Object[][] data = new Object[3][2];
        data[0][0] = "first";
        data[0][1] = "firstsecond";
        data[1][0] = "second";
        data[1][1] = "secondsecond";
        data[2][0] = "third";
        data[2][1] = "thirdsecond";
        return data;
    }
}
