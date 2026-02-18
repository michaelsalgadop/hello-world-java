package basic.c08oop.abstraction.classes.shape;


import basic.c08oop.abstraction.interfaces.Drawable;

public class Circle extends Shape implements Drawable {
    private double radio;

    public Circle(double radio) {
        this.setRadio(radio);
    }

    public double getRadio() {
        return radio;
    }

    public void setRadio(double radio) {
        this.radio = radio > 0 ? radio : 0;
    }

    @Override
    public double calculateArea() {
        return Math.PI * (radio * radio);
    }

    @Override
    public void draw() {
        System.out.println("Redonda perfecta!");
    }
}
