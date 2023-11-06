package net.chaimae.model;

import java.util.Objects;
import java.util.UUID;

public abstract class  BankAccount {
    private String accountId;
    private double balance;
    private String currency;
    private AccountStatus status;
    public abstract String getType();

    public BankAccount() {
        this.accountId = UUID.randomUUID().toString();
        this.status = AccountStatus.CREATED;
    }

    public BankAccount(String currency, double initialBalance){
        this();
        this.currency = currency;
        this.balance = initialBalance;

    }

    @Override
    public String toString() {
        return "BankAccount{" +
                "accountId='" + accountId + '\'' +
                ", balance=" + balance +
                ", currency='" + currency + '\'' +
                ", status=" + status +
                '}';
    }

    @Override
    public boolean equals(Object acc) {
        BankAccount account= (BankAccount) acc;//casting pour moi object acc est Bankaccount
        if (this.accountId.equals(account.accountId)){
            return true;
        }else {
            return false;
        }
    }

    @Override
    public int hashCode() {
        //pour comparer seulemnt letat des 2 objets BankAccount
        return Objects.hashCode(this.accountId)+
                Objects.hashCode(this.balance)+
                Objects.hashCode(this.status)+
                Objects.hashCode(this.currency);
    }

    public void setAccountId(String accountId) {

        this.accountId = accountId;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public void setCurrency(String currency) {
        this.currency = currency;
    }

    public void setStatus(AccountStatus status) {
        this.status = status;
    }

    public String getAccountId() {
        return accountId;
    }

    public double getBalance() {
        return balance;
    }

    public String getCurrency() {
        return currency;
    }

    public AccountStatus getStatus() {
        return status;
    }
}
