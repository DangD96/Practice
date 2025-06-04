package FunctionalProgramming;

public class Main {
    public static void main(String[] args) {
        Printer p = x -> System.out.println(x); // AKA Consumer
        p.print("Hello functional programming!");

        //Line 5 is equal to this
        Printer p2 = new Printer() {
            @Override
            public void print(String x) {System.out.println(x);}
        };
    }
}

@FunctionalInterface
interface Printer {
    void print(String message);
}
