package basic.c08oop.accesmodifiers.models;

public class Rectangle {
    private double width;
    private double height;

    public Rectangle(double width, double height) {
        this.setWidth(width);
        this.setHeight(height);
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        if (width > 0) {
            this.width = width;
        } else {
            System.out.println("Width negativo!");
        }
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        if (height > 0) {
            this.height = height;
        } else {
            System.out.println("Height negativo!");
        }
    }
    public double calculateArea () {
        return width * height;
    }
}
