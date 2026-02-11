package basic.c08_oop.model;

public class Student {
    private double score;

    public Student(double score) {
        this.score = score;
    }

    public boolean passed () {
        return score >= 60;
    }
}
