package FunctionalProgramming;

public class Main {
    public static void main(String[] args) {
        Printer p = message -> System.out.println(message); // AKA Consumer

        //Line 5 is equal to this
        Printer p2 = new Printer() {
            @Override
            public void print(String message) {
                System.out.println(message);
            }
        };

        p.print("Hello functional programming!");
    }
}

@FunctionalInterface
interface Printer {
    void print(String message);
}
