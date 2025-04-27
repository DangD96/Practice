package Interfaces;

public class Cat extends Animal implements IAnimal{

    @Override
    public void animalSound() {
        System.out.println("The cat says meow");
    }

    public void animalBlood() {
        System.out.println("The cat's blood is " + bloodColor);
    }
}
