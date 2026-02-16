package basic.c08oop.inheritance.models.vehicle;

public class Bike extends Vehicle{
    @Override
    public void describe() {
        System.out.println("Vehiculo de 2 ruedas(normalmente), adaptable a varios entornos, que transporta uno o " +
                "dos pasajeros(dependiendo del modelo y/o accesorios)");
    }
}
