package basic.c08oop.inheritance.models.employee;

public class Employee {
    private double salary;
    private String name;

    public Employee(double salary, String name) {
        this.setSalary(salary);
        this.setName(name);
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary < 0 ? 0 : salary;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
