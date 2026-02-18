package basic.c08oop.abstraction.classes.employee;

public abstract class Employee {
    private String name;

    public Employee(String name) {
        this.setName(name);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public abstract double calculateSalary();
}
