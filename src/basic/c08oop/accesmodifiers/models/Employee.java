package basic.c08oop.accesmodifiers.models;

public class Employee {
    private double salary;

    public Employee(double salary) {
        this.setSalary(salary);
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        if (salary > 0){
            this.salary = salary;
        } else {
            System.out.println("Salario negativo!");
        }
    }
    public void raiseSalary(double percent){
        if (percent > 0){
            this.salary *= 1 + percent / 100;
        } else {
            System.out.println("Porcentaje negativo!");
        }
    }
}
