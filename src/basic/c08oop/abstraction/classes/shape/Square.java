package basic.c08oop.abstraction.classes.shape;

import basic.c08oop.abstraction.interfaces.Drawable;

public class Square extends Shape implements Drawable {
    private double side;

    public Square(double side) {
        this.setSide(side);
    }

    public double getSide() {
        return side;
    }

    public void setSide(double side) {
        this.side = side > 0 ? side : 0;
    }

    @Override
    public double calculateArea() {
        return side * side;
    }

    @Override
    public void draw() {
        System.out.println("Se pintan 4 lineas iguales unidas por los picos");
    }
}
