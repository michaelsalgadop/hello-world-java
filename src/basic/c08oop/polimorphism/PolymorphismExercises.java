package basic.c08oop.polimorphism;

import basic.c08oop.polimorphism.models.animal.*;
import basic.c08oop.polimorphism.models.character.Archer;
import basic.c08oop.polimorphism.models.character.Character;
import basic.c08oop.polimorphism.models.character.Mage;
import basic.c08oop.polimorphism.models.character.Warrior;
import basic.c08oop.polimorphism.models.converter.Converter;
import basic.c08oop.polimorphism.models.greeter.Greeter;
import basic.c08oop.polimorphism.models.notification.EmailNotification;
import basic.c08oop.polimorphism.models.notification.Notification;
import basic.c08oop.polimorphism.models.notification.SMSNotification;
import basic.c08oop.polimorphism.models.printer.Printer;
import basic.c08oop.polimorphism.models.product.Book;
import basic.c08oop.polimorphism.models.product.Electronic;
import basic.c08oop.polimorphism.models.product.Product;
import basic.c08oop.polimorphism.models.shape.Circle;
import basic.c08oop.polimorphism.models.shape.Rectangle;
import basic.c08oop.polimorphism.models.shape.Shape;
import basic.c08oop.polimorphism.models.vehicle.Bike;
import basic.c08oop.polimorphism.models.vehicle.Car;
import basic.c08oop.polimorphism.models.vehicle.Truck;
import basic.c08oop.polimorphism.models.vehicle.Vehicle;

import java.util.ArrayList;
import java.util.Arrays;

public class PolymorphismExercises {
    public static void main(String[] args) {

        // 1. Crea una clase Animal con el método makeSound(). Luego crea subclases Dog, Cat y Cow que sobrescriban ese método con sonidos diferentes. Llama al método desde una lista de Animal.
        var animals = new ArrayList<Animal>();
        animals.add(new Dog());
        animals.add(new Cat());
        animals.add(new Cow());
        for (Animal animal : animals) {
            animal.makeSound();
        }
        // 2. Crea una clase Shape con el método calculateArea(). Luego implementa subclases Circle y Rectangle con sus propias fórmulas. Usa una lista de Shape para recorrer e imprimir el área de varias figuras.
        var shapes = new ArrayList<Shape>();
        shapes.add(new Rectangle(2,5));
        shapes.add(new Circle(2));
        shapes.add(new Rectangle(6,5));
        shapes.add(new Circle(3));
        for (Shape shape : shapes){
            System.out.println(shape);
        }
        // 3. Crea una clase Printer con varios métodos print() sobrecargados que acepten diferentes tipos de parámetros (String, int, double). Llama a cada uno desde main.
        var printer = new Printer();
        printer.print("hola");
        printer.print(1);
        printer.print(2.5);
        // 4. Crea una clase Greeter con dos métodos greet(): uno que salude con “Hello”, y otro que reciba un nombre y salude con “Hello, [nombre]”.
        var greeter = new Greeter();
        greeter.greet();
        greeter.greet("Nichol");
        // 5. Crea una clase Vehicle con un método start(). Luego crea Car, Bike y Truck que sobrescriban ese método. Recorre una lista ArrayList<Vehicle> para llamar a start() en cada uno.
        var vehicles = new ArrayList<Vehicle>();
        vehicles.add(new Truck());
        vehicles.add(new Car());
        vehicles.add(new Bike());
        for (Vehicle vehicle : vehicles) {
            vehicle.start();
        }
        // 6. Crea una clase Notification con método send(), y subclases EmailNotification, SMSNotification. Luego crea una función sendNotification(Notification n) que reciba cualquier tipo y lo ejecute.
        var smsNotification = new SMSNotification();
        var emailNotification = new EmailNotification();
        sendNotification(smsNotification);
        sendNotification(emailNotification);
        // 7. Crea una función showAnimalType(Animal animal) que imprima el tipo de animal. Pasa diferentes subclases (Dog, Cat, Horse) para que cada una imprima su tipo con su propio getType() sobrescrito.
        showAnimalType(new Horse());
        showAnimalType(new Dog());
        showAnimalType(new Cat());
        // 8. Crea una clase Converter con métodos convert(int), convert(double), y convert(String) que devuelvan diferentes formatos de texto.
        var converter = new Converter();
        System.out.println(converter.convert(1));
        System.out.println(converter.convert(1.2));
        System.out.println(converter.convert("Hola"));
        // 9. Crea una clase Product con el método getPrice(). Luego, Book y Electronic deben sobrescribirlo con su propia lógica de descuento. Recorre una lista de Product e imprime el precio final de cada uno.
        var products = new ArrayList<Product>();
        products.add(new Book(3));
        products.add(new Electronic(32));
        products.add(new Electronic(200));
        products.add(new Book(12));
        for (Product product : products) {
            System.out.println(product.getPrice());
        }
        // 10. Crea una clase Character con método attack(). Luego crea subclases Warrior, Archer, Mage con ataques diferentes. En main, crea un array de Character y llama a attack() para cada uno.
        var characters = new Character[] {new Warrior(),new Archer(),new Mage()};
        for (Character character: characters){
            character.attack();
        }
    }
    public static void sendNotification (Notification n) {
        n.send();
    }
    public static void showAnimalType (Animal animal) {
        System.out.println(animal.getType());
    }
}
