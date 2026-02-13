package basic.c08oop.accesmodifiers.models;

public class Temperature {
    private double celsius;

    public Temperature(double celsius) {
        this.setCelsius(celsius);
    }

    public double getCelsius() {
        return celsius;
    }

    public void setCelsius(double celsius) {
        if (celsius >= -100 && celsius <= 100) {
            this.celsius = celsius;
        } else {
            System.out.println("ERROR: celsius fuera de rango.");
        }
    }
}
