package basic.c08_oop;

import basic.c08_oop.model.*;

import java.util.ArrayList;
import java.util.Arrays;

public class ClassesExercises {
    public static void main(String[] args) {

        // 1. Crea una clase Book con atributos title y author. Crea un objeto y muestra sus datos.
        var book = new Book("El rey Leon","Kiko Rivera");
        System.out.println(String.format("Libro con título %s escrito por %s", book.getTitle(), book.getAuthor()));
        // 2. Crea una clase Dog con un método bark() que imprima su sonido.
        var dog = new Dog();
        dog.bark();
        // 3. Añade un constructor a la clase Book que reciba title y author.

        // 4. Crea una clase Car con atributos brand y model y un método showData().
        Car car = new Car("Audi","Q5");
        car.showData();
        // 5. Crea una clase Student con atributo score y un método que diga si aprobó (mayor o igual a 60).
        var student = new Student(60);
        System.out.println(student.passed() ? "Aprobó" : "Suspendió");
        // 6. Crea una clase BankAccount con atributo balance y un método deposit() que sume el saldo.
        var bankAccount = new BankAccount(60);
        bankAccount.deposit(50);
        // 7. Crea una clase Rectangle con métodos para calcular el área y el perímetro.
        var rectangle = new Rectangle(10,20);
        System.out.println("Area del rectangulo: " + rectangle.getArea());
        System.out.println("Perimetro del rectangulo: " + rectangle.perimeter());
        // 8. Crea una clase Worker que reciba nombre y salario, y un método para mostrar su salario.
        var worker = new Worker("Alfredo", 1200.85);
        System.out.println(worker.getSalary());
        // 9. Crea varios objetos Person y guárdalos en un ArrayList.
        var persons = new ArrayList<Person>(Arrays.asList(
                new Person("Ruben", 28),
                new Person("Alberto", 18),
                new Person("Gines", 37),
                new Person("Gonzalo", 21)
        ));
        for (Person person: persons){
            System.out.println(String.format("Soy %s y tengo %d años.",person.getName(),person.getAge()));
        }
        // 10. Crea una clase Product y un método que aplique un descuento sobre su precio.
        var product = new Product(2.5);
        product.applyDiscount(10);
        System.out.println(product.getPrice());
    }
}
