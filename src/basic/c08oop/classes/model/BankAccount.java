package basic.c08oop.classes.model;

public class BankAccount {
    private double balance;

    public BankAccount(double balance) {
        this.balance = balance;
    }
    public void deposit (double plus){
        if (plus > 0){
            balance += plus;
        }
    }

    public double getBalance() {
        return balance;
    }
}
