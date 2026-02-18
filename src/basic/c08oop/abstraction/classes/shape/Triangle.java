package basic.c08oop.abstraction.classes.shape;

import basic.c08oop.abstraction.interfaces.Drawable;

public class Triangle extends Shape implements Drawable {
    private double base;
    private double height;

    public Triangle(double base, double height) {
        this.setBase(base);
        this.setHeight(height);
    }
    public double getBase() {
        return base;
    }

    public void setBase(double base) {
        this.base = base > 0 ? base : 0;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height > 0 ? height : 0;
    }
    @Override
    public double calculateArea() {
        return (base * height) / 2;
    }

    @Override
    public void draw() {
        System.out.println("Se unen tres lineas iguales por cada pico.");
    }
}
