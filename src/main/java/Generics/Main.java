package Generics;

public class Main {
    public static void main(String[] args) {
        String alfa = "Hi";
        int bravo = 5;
        Cat cat = new Cat("Charlie");

        Printer<String> p1 = new Printer<>(alfa);
        Printer<Integer> p2 = new Printer<>(bravo);
        Printer<Cat> p3 = new Printer<>(cat);

    }
}

class Printer<T> {
    T thing;

    Printer(T thing) {
        this.thing = thing;
        System.out.println("HERE'S THE THING: " + thing);
    }
}

class Cat {
    String name;

    Cat(String name) {
        this.name = name;
    }

    void meow() {
        System.out.println("MEOW");
    }
}