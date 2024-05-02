package GeneralPractice;

public class Cat implements IAnimal{

    @Override
    public void animalSound() {
        System.out.println("The cat says meow");
    }

    public void animalBlood() {
        System.out.println("The cat's blood is " + bloodColor);
    }
}
