package basic.c08oop.abstraction.classes.movable;

import basic.c08oop.abstraction.interfaces.Movable;

public class Car implements Movable {
    @Override
    public void move() {
        System.out.println("Se ha acelerado el coche y se ha movido.");
    }
}
