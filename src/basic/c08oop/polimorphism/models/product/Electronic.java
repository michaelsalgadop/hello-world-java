package basic.c08oop.polimorphism.models.product;

public class Electronic extends Product{

    public Electronic(double price) {
        super(price);
    }
    @Override
    public double getPrice() {
        return super.getPrice() * (1 - 5.0 / 100);
    }
}
