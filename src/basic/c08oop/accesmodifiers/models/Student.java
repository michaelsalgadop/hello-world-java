package basic.c08oop.accesmodifiers.models;

public class Student {
    private int grade;

    public Student(int grade) {
        this.setGrade(grade);
    }

    public void setGrade(int grade) {
        if (grade > 0 && grade <= 100){
            this.grade = grade;
        } else {
            System.out.println("Numero menor o igual a 0");
        }
    }
    public boolean isPassed () {
        return grade >= 60;
    }
}
