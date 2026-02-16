package basic.c08oop.inheritance.models.employee;

public class Manager extends Employee{
    private String department;

    public Manager(double salary, String name, String department) {
        super(salary, name);
        this.department = department;
    }

    public String getDepartment() {
        return department;
    }
}
