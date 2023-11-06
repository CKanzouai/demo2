package net.chaimae.business;

import net.chaimae.model.BankAccount;

import java.util.List;

public interface BankAccountService {

    //quand je fait une interface je joue le role dun concepteur linteret de linterface et la conception
    BankAccount addBankAccount(BankAccount account);
    List<BankAccount> getAllAccounts();
    BankAccount getAccountById(String id);
    void addRandomData(int size);
    void credit(String accountId, double amount);
    void debit(String accountId, double amount);

    void transfer(String accountSource, String accountDestination, double amount);


}
