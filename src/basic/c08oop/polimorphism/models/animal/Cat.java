package basic.c08oop.polimorphism.models.animal;

public class Cat extends Animal{
    @Override
    public void makeSound() {
        System.out.println("Miau");
    }

    @Override
    public String getType(){
        return "Gato";
    }
}
