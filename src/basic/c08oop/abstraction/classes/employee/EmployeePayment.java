package basic.c08oop.abstraction.classes.employee;

import basic.c08oop.abstraction.interfaces.Payable;

public class EmployeePayment implements Payable {
    @Override
    public void pay() {
        System.out.println("Nómina pagada mediante transferencia.");
    }
}
