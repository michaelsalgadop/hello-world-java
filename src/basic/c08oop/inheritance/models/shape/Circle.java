package basic.c08oop.inheritance.models.shape;

public class Circle extends Shape{
    private double radio;

    public Circle(double radio) {
        this.setRadio(radio);
    }

    public double getRadio() {
        return radio;
    }

    public void setRadio(double radio) {
        if (radio > 0) {
            this.radio = radio;
        }
    }

    @Override
    public double calculateArea() {
        return Math.PI * (radio * radio);
    }
}
