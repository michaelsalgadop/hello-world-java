package basic.c08oop.inheritance.models.vehicle;

public class Car extends Vehicle{
    public void honk () {
        System.out.println("Piiiiiiiiip");
    }

    @Override
    public void describe() {
        System.out.println("Vehiculo de 4 ruedas que funciona o con Gasoil o gasolina, que sirve " +
                "principalmente de transporte de pasajeros.");
    }
}
