package basic.c08oop.polimorphism.models.shape;

public class Circle extends Shape{
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
    double calculateArea() {
        return Math.PI * (radio * radio);
    }
}
