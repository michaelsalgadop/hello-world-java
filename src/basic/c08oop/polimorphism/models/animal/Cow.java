package basic.c08oop.polimorphism.models.animal;

public class Cow extends Animal{
    @Override
    public void makeSound() {
        System.out.println("Muuuu");
    }
    @Override
    public String getType(){
        return "Vaca";
    }
}
