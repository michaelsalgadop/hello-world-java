package basic.c08oop.polimorphism.models.animal;

public class Dog extends Animal{
    @Override
    public void makeSound() {
        System.out.println("Guau");
    }
    @Override
    public String getType(){
        return "Perro";
    }
}
