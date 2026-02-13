package basic.c08oop.accesmodifiers.models;

public class BankAccount {
    private double balance;

    public BankAccount(double balance) {
        this.deposit(balance);
    }

    public double getBalance() {
        return balance;
    }

    public void deposit(double balance) {
        if (balance > 0){
            this.balance += balance;
        } else {
            System.out.println("Saldo a retirar negativo!");
        }
    }

    public void withdraw(double balance) {
        if (balance > 0){
            if (balance <= this.balance) {
                this.balance -= balance;
            } else {
                System.out.println("No es posible realizar dicha operación porque no dispone de saldo suficiente!");
            }
        } else {
            System.out.println("Saldo a retirar negativo!");
        }
    }
}
