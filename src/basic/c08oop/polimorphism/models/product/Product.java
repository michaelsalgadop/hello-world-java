package basic.c08oop.polimorphism.models.product;

public class Product {
    private double price;

    public Product(double price) {
        this.setPrice(price);
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price > 0 ? price : 0;
    }
}
