package basic.c08oop.inheritance.models.animal;

public class Dog extends Animal{
    @Override
    public void makeSound(){
        System.out.println("Woof");
    }
}
