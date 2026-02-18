package basic.c08oop.abstraction.classes.movable;

import basic.c08oop.abstraction.interfaces.Movable;

public class Robot implements Movable {
    @Override
    public void move() {
        System.out.println("El robot movió el brazo.");
    }
}
