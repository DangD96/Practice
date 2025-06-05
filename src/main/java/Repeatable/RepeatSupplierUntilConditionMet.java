package Repeatable;

import java.util.function.Predicate;
import java.util.function.Supplier;

public class RepeatSupplierUntilConditionMet {
    public static void main(String[] args) {
        System.out.println("V1: Repeat until condition met");
        repeatUntil(() -> mySupplier(), Conditions.LessThan30());

        System.out.println("\nV2: Repeat until condition met");
        Predicate<Integer> inputLessThan30 = x -> x < 30;
        repeatUntil(() -> mySupplier(), inputLessThan30);

        System.out.println("\nV3: Explicit Repeat");
        repeatUntilLowerThan30(() -> mySupplier());
    }

    // Supplier (takes nothing, returns something)
    public static int mySupplier() {
        int randInt = (int)(Math.random() * 100); // 0 to 99
        System.out.println("Random number: " + randInt);
        return randInt;
    }

    public static <T> void repeatUntil(Supplier<T> supplier, Predicate<T> condition) {
        final int MAX_RETRIES = 10;
        for (int i = 0; i < MAX_RETRIES; i++) {
            T value = supplier.get();
            boolean result = condition.test(value);
            if (result) {
                System.out.println("CONDITION MET!");
                break;
            }
        }
    }

    public static <T> void repeatUntilLowerThan30(Supplier<T> supplier) {
        final int MAX_RETRIES = 10;
        for (int i = 0; i < MAX_RETRIES; i++) {
            T result = supplier.get();
            if (Integer.parseInt(result.toString()) < 30) {
                System.out.println("CONDITION MET!");
                break;
            }
        }
    }

    public static class Conditions {
        public static Predicate<Integer> LessThan30() {
            return x -> x < 30;
        }

        public static Predicate<Integer> GreaterThan30() {
            return x -> x > 30;
        }
    }
}
