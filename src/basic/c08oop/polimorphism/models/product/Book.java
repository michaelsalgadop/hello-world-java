package basic.c08oop.polimorphism.models.product;

public class Book extends Product{
    public Book(double price) {
        super(price);
    }

    @Override
    public double getPrice() {
        return super.getPrice() * (1 - 10.0 / 100);
    }
}
