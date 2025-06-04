package Repeatable;

import java.util.Objects;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;

public class RepeatMethod {
    public static void main(String[] args) {
        System.out.println("Repeating Supplier");
        repeat(() -> mySupplier());

        System.out.println("\nRepeating Function");
        repeat((Function<Integer, Integer>) x -> myFunction(x), 5);

        System.out.println("\nRepeating Consumer");
        repeat((Consumer<String>) x -> myConsumer(x), "Bob");

        System.out.println("\nRepeating Predicate");
        repeat((Predicate<String>) x -> myPredicate(x), "a");
    }

    public static <T> void repeat(Supplier<T> supplier) {
        for (int i = 0; i < 5; i++) {System.out.println(supplier.get());}
    }

    public static <T, R> void repeat(Function<T, R> function, T input) {
        for (int i = 0; i < 5; i++) {System.out.println(function.apply(input));}
    }

    public static <T> void repeat(Consumer<T> consumer, T input) {
        for (int i = 0; i < 5; i++) {consumer.accept(input);}
    }

    public static <T> void repeat(Predicate<T> predicate, T input) {
        for (int i = 0; i < 5; i++) {System.out.println(predicate.test(input));}
    }

    // Supplier (takes nothing, returns something)
    public static String mySupplier() {return "METHOD1";}

    // Function (takes something, returns something)
    public static int myFunction(int a) {return a + 10;}

    // Consumer (takes something, returns nothing)
    public static void myConsumer(String name) {System.out.println("HELLO " + name);}

    // Predicate (takes something, always returns Boolean)
    public static Boolean myPredicate(String x) {return Objects.equals(x, "a");}
}
