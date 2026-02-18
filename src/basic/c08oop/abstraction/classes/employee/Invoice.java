package basic.c08oop.abstraction.classes.employee;

import basic.c08oop.abstraction.interfaces.Payable;

public class Invoice implements Payable {

    @Override
    public void pay() {
        System.out.println("Factura pagada mediante checke.");
    }
}
