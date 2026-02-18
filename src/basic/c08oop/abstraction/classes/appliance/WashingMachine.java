package basic.c08oop.abstraction.classes.appliance;

public class WashingMachine extends Appliance{
    @Override
    public void turnOn() {
        System.out.println("Lavando la ropa");
    }

    @Override
    public void turnOff() {
        System.out.println("Terminó de lavar la ropa");
    }
}
