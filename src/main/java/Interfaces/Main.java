package Interfaces;

import org.openqa.selenium.By;

public class Main {
    public static void main(String[] args) {
        Cat myCat = new Cat();
        myCat.animalBlood();
        myCat.animalSound();
        myCat.animalClassSound();

        // Anonymous inner class so I create a single "extra" object
        // Anonymous inner class can work with interface like below, or class
        IAnimal myDog = new IAnimal() {
            @Override
            public void animalSound() {
                System.out.println("The dog goes woof");
            }
        };
        myDog.animalSound();

        System.out.println("System OS: " + System.getProperty("os.name"));

        System.out.println("RESULT = " + UsernameField());
    }
    // V1
    public static By UsernameField() {
        enum Platform {
            Android,
            iOS,
        }
        enum App {
            Rover,
            Canto
        }
        Platform platform = Platform.Android;
        App app = App.Rover;
        switch (platform) {
            case Android -> {
                return switch (app) {
                    case Rover -> By.id("aa");
                    case Canto -> By.id("ab");
                };
            }
            case iOS -> {
                return switch (app) {
                    case Rover -> By.id("ba");
                    case Canto -> By.id("bb");
                };
            }
        }
        return null;
    };
}
