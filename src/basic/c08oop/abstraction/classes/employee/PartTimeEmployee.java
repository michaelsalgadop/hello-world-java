package basic.c08oop.abstraction.classes.employee;

public class PartTimeEmployee extends Employee{
    private double hourlyRate;
    private int hoursWorked;
    public PartTimeEmployee(String name, double hourlyRate, int hoursWorked) {
        super(name);
        this.setHourlyRate(hourlyRate);
        this.setHoursWorked(hoursWorked);
    }

    public double getHourlyRate() {
        return hourlyRate;
    }

    public void setHourlyRate(double hourlyRate) {
        this.hourlyRate = hourlyRate > 0 ? hourlyRate : 0;
    }

    public int getHoursWorked() {
        return hoursWorked;
    }

    public void setHoursWorked(int hoursWorked) {
        this.hoursWorked = Math.max(hoursWorked, 0);
    }

    @Override
    public double calculateSalary() {
        return hourlyRate * hoursWorked;
    }
}
