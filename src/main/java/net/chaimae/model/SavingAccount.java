package net.chaimae.model;

public class SavingAccount extends BankAccount{
    private double interestRate;

    @Override
    public String getType() {
        return "Saving account";
    }

    public SavingAccount() {
        super();
    }

    public SavingAccount(String currency, double initialBalance, double interestRate) {
        super(currency, initialBalance);
        this.interestRate = interestRate;
    }

    public void setInterestRate(double interestRate) {
        this.interestRate = interestRate;
    }

    public double getInterestRate() {
        return interestRate;
    }

    @Override
    public String toString() {
        return "Interest rate in saving account is : " + interestRate + super.toString();
    }
}
