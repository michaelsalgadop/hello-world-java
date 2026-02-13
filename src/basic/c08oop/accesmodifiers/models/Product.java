package basic.c08oop.accesmodifiers.models;

public class Product {
    private double price;

    public Product(double price) {
        this.setPrice(price);
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        if (price > 0) {
            this.price = price;
        } else {
            System.out.println("El precio debe de ser mayor de 0!");
        }

    }
}
