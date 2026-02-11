package basic.c08_oop.model;

public class Product {
    private double price;

    public Product(double price) {
        this.price = price;
    }
    public void applyDiscount(double discount){
        price = price - (price * discount / 100);
    }
    public double getPrice() {
        return price;
    }
}
