package basic.c08oop.inheritance;

import basic.c08oop.inheritance.models.account.SavingsAccount;
import basic.c08oop.inheritance.models.animal.Animal;
import basic.c08oop.inheritance.models.animal.Cat;
import basic.c08oop.inheritance.models.animal.Dog;
import basic.c08oop.inheritance.models.animal.Eagle;
import basic.c08oop.inheritance.models.device.Phone;
import basic.c08oop.inheritance.models.employee.Manager;
import basic.c08oop.inheritance.models.person.Student;
import basic.c08oop.inheritance.models.shape.Circle;
import basic.c08oop.inheritance.models.shape.Rectangle;
import basic.c08oop.inheritance.models.vehicle.Bike;
import basic.c08oop.inheritance.models.vehicle.Car;
import basic.c08oop.inheritance.models.vehicle.Truck;

import java.util.ArrayList;
import java.util.Arrays;

public class InheritanceExercises {
    public static void main(String[] args) {

        // 1. Crea una clase Vehicle con un método move(). Luego crea una subclase Car que herede de Vehicle y agrega el método honk().
        var car = new Car();
        car.move();
        car.honk();
        // 2. Define una clase Person con los atributos name y age. Luego crea una clase Student que agregue el atributo grade y un método study().
        var student = new Student("Jose", 21, 68);
        student.study();
        // 3. Crea una clase Animal con el método makeSound(). Haz que Dog diga “Woof” y Cat diga “Meow” sobrescribiendo ese método.
        var cat = new Cat();
        var dog = new Dog();
        cat.makeSound();
        dog.makeSound();
        // 4. La clase Employee tiene los atributos name y salary. Manager hereda de Employee y agrega el atributo department.
        var manager = new Manager(1200, "Rogelio", "Sales");

        // 5. Crea una clase abstracta Shape con un método calculateArea(). Luego implementa ese método en Circle y Rectangle.
        var circle = new Circle(9.5);
        var rectangle = new Rectangle(2.5,5);
        System.out.println(circle.calculateArea());
        System.out.println(rectangle.calculateArea());
        // 6. Crea una clase Bird con el método fly(). Luego crea Eagle que sobrescriba fly() pero también llame al método original con super.fly().
        var eagle = new Eagle();
        eagle.fly();
        // 7. Haz una clase Device con un constructor que imprima “Device created”. Luego crea Phone que herede de Device y en su constructor imprima “Phone ready”.
        var phone = new Phone();
        // 8. Account tiene un saldo y métodos para deposit() y withdraw(). SavingsAccount hereda y agrega un método addInterest().
        var savingsAccount = new SavingsAccount(1000);
        savingsAccount.deposit(100);
        System.out.println(savingsAccount.getBalance());
        savingsAccount.withdraw(100);
        System.out.println(savingsAccount.getBalance());
        savingsAccount.addInterest(5);
        System.out.println(savingsAccount.getBalance());
        // 9. Crea una clase Vehicle y tres subclases: Car, Bike y Truck, cada una con un método describe() sobrescrito.
        var bike = new Bike();
        var truck = new Truck();
        car.describe();
        bike.describe();
        truck.describe();
        // 10. Crea un ArrayList<Animal> que contenga instancias de Dog, Cat y Bird. Recorre la lista y llama a makeSound().
        var animalList = new ArrayList<Animal>();
        animalList.add(cat);
        animalList.add(dog);
        animalList.add(eagle);
        for (Animal animal : animalList) {
            animal.makeSound();
        }
    }
}
