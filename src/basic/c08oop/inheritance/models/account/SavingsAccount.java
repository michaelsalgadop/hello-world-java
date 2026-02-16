package basic.c08oop.inheritance.models.account;

public class SavingsAccount extends Account{

    public SavingsAccount(double balance) {
        super(balance);
    }
    public void addInterest(double interest){
        if (interest > 0) {
            var interestGenerated = super.getBalance() * (interest / 100);
            super.setBalance(super.getBalance() + interestGenerated);
        }
    }
}
