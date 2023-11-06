package net.chaimae;

import net.chaimae.model.BankAccount;
import net.chaimae.model.CurrentAccount;
import net.chaimae.model.SavingAccount;


public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        BankAccount account1 = new SavingAccount();
        account1.setCurrency("MAD");
        account1.setBalance(65489);
        printAccount(account1);
        BankAccount account2 = new CurrentAccount("MAD",1200,2345);
        printAccount(account2);
        System.out.println(account2.toString());
        BankAccount account3 = new SavingAccount("MAD", 1200,2.8);
        account3.setAccountId(account2.getAccountId());
        System.out.println(account2.equals(account3));
        System.out.println();
        System.out.println(account2.hashCode());
        System.out.println(account3.hashCode());
        if (account2.hashCode()==account1.hashCode()){
            System.out.println("yay");
        }else {
            System.out.println("nay");
        }
    }
    public static void printAccount(BankAccount account){
        System.out.println(account.getAccountId());
        System.out.println(account.getCurrency());
        System.out.println(account.getStatus());
        System.out.println(account.getBalance());

    }
}