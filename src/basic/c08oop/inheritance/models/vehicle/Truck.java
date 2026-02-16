package basic.c08oop.inheritance.models.vehicle;

public class Truck extends Vehicle{
    @Override
    public void describe() {
        System.out.println("Vehiculo de varias ruedas, normalmente muy pesado y robusto, " +
                "que sirve principalmente para el transporte de mercancías.");
    }
}
