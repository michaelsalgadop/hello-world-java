package basic.c08oop.polimorphism.models.character;

public class Archer extends Character{
    @Override
    public void attack() {
        System.out.println("Arrow");
    }
}
