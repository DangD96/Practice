package Polymorphism;

class A {
    void display() {
        System.out.println("Class A");
    }
}
class B extends A {
    void display() {
        System.out.println("Class B");
    }
}

public class Main {
    public static void main(String[] args) {
        A obj = new B();
        obj.display(); // obj is TYPED as A, but POINTS to an instance of B, so B's display() method is called
    }
}
