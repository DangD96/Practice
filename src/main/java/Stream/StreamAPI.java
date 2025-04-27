package Stream;

import java.util.ArrayList;
import java.util.List;

public class StreamAPI {
    public static void main(String[] args) {
        ArrayList<String> myAryList = new ArrayList<>();
        myAryList.add("Saitama");
        myAryList.add("Fubuki");
        myAryList.add("Genos");
        myAryList.add("Bang");
        myAryList.add("Garou");

        // Print out every name that starts with "G"
        myAryList.stream().filter(str -> str.startsWith("G")).forEach(str -> System.out.printf("Name: %s\n", str));
        System.out.println();

        // Convert every name to uppercase and print them out
        myAryList.forEach(str -> System.out.printf("Name: %s\n", str.toUpperCase()));
        System.out.println();

        // Convert every name to uppercase, sort them, and print them out
        myAryList.stream().sorted().forEach(str -> System.out.printf("Name: %s\n", str.toUpperCase()));
        System.out.println();

        // Convert every name to uppercase, sort them, convert back to a list, and print out the 2nd name
        List<String> myList = myAryList.stream().sorted().map(str -> str.toUpperCase()).toList();
        System.out.printf("2nd Name: %s\n", myList.get(1));
    }
}
