package basic.c08oop.abstraction;

import basic.c08oop.abstraction.classes.animal.Animal;
import basic.c08oop.abstraction.classes.animal.Cat;
import basic.c08oop.abstraction.classes.animal.Dog;
import basic.c08oop.abstraction.classes.animal.Duck;
import basic.c08oop.abstraction.classes.appliance.TV;
import basic.c08oop.abstraction.classes.appliance.WashingMachine;
import basic.c08oop.abstraction.classes.document.Document;
import basic.c08oop.abstraction.classes.document.PDFDocument;
import basic.c08oop.abstraction.classes.document.WordDocument;
import basic.c08oop.abstraction.classes.employee.EmployeePayment;
import basic.c08oop.abstraction.classes.employee.FullTimeEmployee;
import basic.c08oop.abstraction.classes.employee.Invoice;
import basic.c08oop.abstraction.classes.employee.PartTimeEmployee;
import basic.c08oop.abstraction.classes.instrument.Guitar;
import basic.c08oop.abstraction.classes.instrument.Piano;
import basic.c08oop.abstraction.classes.movable.Car;
import basic.c08oop.abstraction.classes.movable.Robot;
import basic.c08oop.abstraction.classes.shape.Circle;
import basic.c08oop.abstraction.classes.shape.Rectangle;
import basic.c08oop.abstraction.classes.shape.Square;
import basic.c08oop.abstraction.classes.shape.Triangle;

import java.util.ArrayList;

public class AbstractionExercises {
    public static void main(String[] args) {

        // 1. Crea una clase abstracta Shape con el método calculateArea(). Luego implementa dos subclases: Circle y Rectangle, y haz que cada una calcule su propia área.
        var rectangle = new Rectangle(2,5);
        var circle = new Circle(3);
        System.out.println(rectangle.calculateArea());
        System.out.println(circle.calculateArea());
        // 2. Crea una interfaz Playable con el método play(). Luego implementa esa interfaz en dos clases: Guitar y Piano. Cada una debe mostrar un mensaje diferente al ejecutarse.
        var piano = new Piano();
        var guitar = new Guitar();
        piano.play();
        piano.sound();
        guitar.sound();
        guitar.play();
        // 3. Define una clase abstracta Animal con el método makeSound(). Implementa Dog y Cat para que hagan sonidos distintos. Crea un array de Animal para mostrar polimorfismo.
        Animal[] animals = {new Dog(), new Cat()};
        for (Animal animal : animals) {
            animal.makeSound();
        }
        // 4. Crea una interfaz Drawable. Implementa las clases Circle, Square, y Triangle que muestren cómo se dibuja cada figura usando draw().
        var square = new Square(4);
        var triangle = new Triangle(2,5);
        circle.draw();
        square.draw();
        triangle.draw();
        // 5. Crea una clase abstracta Employee con un método calculateSalary(). Implementa FullTimeEmployee y PartTimeEmployee con lógica diferente para calcular el salario.
        var fullTimeEmployee = new FullTimeEmployee("Marcos",18000);
        var partTimeEmployee = new PartTimeEmployee("Oscar", 11.65, 120);
        System.out.println(fullTimeEmployee.calculateSalary());
        System.out.println(partTimeEmployee.calculateSalary());
        // 6. Crea una interfaz Movable con el método move(). Haz que las clases Car y Robot implementen ese método con comportamientos diferentes.
        var car = new Car();
        var robot = new Robot();
        car.move();
        robot.move();
        // 7. Crea una clase abstracta Appliance con método turnOn() y turnOff(). Implementa TV y WashingMachine con mensajes diferentes al encender y apagar.
        var tv = new TV();
        var washingMachine = new WashingMachine();
        tv.turnOn();
        tv.turnOff();
        washingMachine.turnOn();
        washingMachine.turnOff();
        // 8. Crea dos interfaces Flyable y Swimmable. Crea una clase Duck que implemente ambas interfaces y muestre cómo puede volar y nadar.
        var duck = new Duck();
        duck.makeSound();
        duck.fly();
        duck.swim();
        // 9. Crea una clase abstracta Document con el método print(). Luego crea PDFDocument y WordDocument, cada una con su forma de imprimir.
        var documentPDF = new PDFDocument();
        var documentWord = new WordDocument();
        documentPDF.print();
        documentWord.print();
        // 10. Crea una interfaz Payable con el método pay(). Luego implementa las clases Invoice y EmployeePayment, cada una mostrando un mensaje de pago diferente.
        var invoice = new Invoice();
        var employeePayment =  new EmployeePayment();
        invoice.pay();
        employeePayment.pay();

    }
}
