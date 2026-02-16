package basic.c08oop.inheritance.models.account;

public class Account {
    private double balance;

    public Account(double balance) {
        this.setBalance(balance);
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance >= 0 ? balance : 0;
    }
    public void deposit(double balance) {
        if (balance > 0){
            this.balance += balance;
        } else {
            System.out.println("Saldo a introducir negativo!");
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
