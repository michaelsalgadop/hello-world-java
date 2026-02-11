package basic.c08_oop.model;

public class Car {
    private String brand;
    private String model;

    public Car(String brand, String model) {
        this.brand = brand;
        this.model = model;
    }

    public void showData() {
        System.out.println(String.format("Marca %s modelo %s", brand, model));
    }

    public String getBrand() {
        return brand;
    }

    public String getModel() {
        return model;
    }
}
