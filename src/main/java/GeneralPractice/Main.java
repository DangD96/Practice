package GeneralPractice;

public class Main {
    public static void main(String[] args) {
        Cat myCat = new Cat();
        myCat.animalBlood();
        myCat.animalSound();

        // Anonymous inner class so I create a single "extra" object
        // Anonymous inner class can work with interface like below, or class
        IAnimal myDog = new IAnimal() {
            @Override
            public void animalSound() {
                System.out.println("The dog goes woof");
            }
        };
        myDog.animalSound();
    }
}
