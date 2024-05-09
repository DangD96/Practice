package GeneralPractice.Strings;

import java.util.Arrays;

public class Main {
    final static String DIR = System.getProperty("user.dir");

    public static void main(String[] args) {
        System.out.println(DIR);

        String[] results = DIR.split("\\\\"); // regex needs double escape. This is for "\"
        System.out.println(results[results.length-2]);
        String[] test = DIR.split(results[results.length-2]);
        System.out.println(Arrays.toString(test));

        Names n = new Names();
        System.out.println(n.className);




    }
}
