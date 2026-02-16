package basic.c08oop.inheritance.models.shape;

public class Rectangle extends Shape{
    private double base;
    private double height;

    public Rectangle(double base, double height) {
        this.setBase(base);
        this.setHeight(height);
    }

    public double getBase() {
        return base;
    }

    public void setBase(double base) {
        if (base > 0) {
           this.base = base;
        }
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        if (height > 0) {
            this.height = height;
        }
    }

    @Override
    public double calculateArea() {
        return base * height;
    }
}
