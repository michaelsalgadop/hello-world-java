package basic.c08oop.abstraction.classes.appliance;

public class TV extends Appliance{
    @Override
    public void turnOn() {
        System.out.println("Visualizando imagen en la pantalla");
    }

    @Override
    public void turnOff() {
        System.out.println("Encendido botón de Stand By, ya no se reproduce imagen.");
    }
}
