package basic.c08oop.abstraction.classes.employee;

public class FullTimeEmployee extends Employee{
    private double annualSalary;
    public FullTimeEmployee(String name, double annualSalary) {
        super(name);
        this.setAnnualSalary(annualSalary);
    }

    public double getAnnualSalary() {
        return annualSalary;
    }

    public void setAnnualSalary(double annualSalary) {
        this.annualSalary = annualSalary > 0 ? annualSalary : 0;
    }

    @Override
    public double calculateSalary() {
        return annualSalary / 12;
    }
}
