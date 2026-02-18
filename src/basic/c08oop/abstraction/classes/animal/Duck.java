package basic.c08oop.abstraction.classes.animal;

import basic.c08oop.abstraction.interfaces.Flyable;
import basic.c08oop.abstraction.interfaces.Swimmable;

public class Duck extends Animal implements Flyable, Swimmable {
    @Override
    public void makeSound() {
        System.out.println("Cuac");
    }

    @Override
    public void fly() {
        System.out.println("Pato volador");
    }

    @Override
    public void swim() {
        System.out.println("Pato nadador");
    }
}
