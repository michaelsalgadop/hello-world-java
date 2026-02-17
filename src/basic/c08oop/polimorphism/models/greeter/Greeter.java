package basic.c08oop.polimorphism.models.greeter;

public class Greeter {
    public void greet () {
        System.out.println("Hello");
    }
    public void greet (String name) {
        System.out.println("Hello, " + name);
    }
}
