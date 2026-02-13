package basic.c08oop.model;

public class Rectangle {
    private double height;
    private double base;

    public Rectangle(double height, double base) {
        this.height = height;
        this.base = base;
    }
    public double getArea (){
        return base * height;
    }
    public double perimeter(){
        return (base * 2) + (height * 2);
    }
}
