package net.chaimae.model;

public class CurrentAccount extends BankAccount{
    private double overDraft;

    @Override
    public String getType() {
        return "Current account";
    }

    public CurrentAccount() {
        super();
        this.overDraft = overDraft;
    }

    public CurrentAccount(String currency, double initialBalance, double overDraft) {
        super(currency, initialBalance);
        this.overDraft = overDraft;
    }

    @Override
    public String toString() {
        return "Current Account, overDraft : " + overDraft + super.toString();
    }

    public void setOverDraft(double overDraft) {
        this.overDraft = overDraft;
    }

    public double getOverDraft() {
        return overDraft;
    }
}
