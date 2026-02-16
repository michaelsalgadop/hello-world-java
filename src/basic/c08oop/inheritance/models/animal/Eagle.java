package basic.c08oop.inheritance.models.animal;

public class Eagle extends Bird{
    @Override
    public void fly() {
        super.fly();
        System.out.println("Vuela eagle!");
    }
}
