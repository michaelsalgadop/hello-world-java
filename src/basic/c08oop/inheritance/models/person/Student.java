package basic.c08oop.inheritance.models.person;

public class Student extends Person{
    private int grade;

    public Student(String name, int age, int grade) {
        super(name, age);
        this.grade = grade;
    }
    public void study(){
        System.out.println(String.format(
                "El estudiante %s el cual tiene %d años ha sacado un: %d",
                super.getName(),
                super.getAge(),
                grade));
    }
}
