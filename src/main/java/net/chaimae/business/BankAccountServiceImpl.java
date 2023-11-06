package net.chaimae.business;

import net.chaimae.model.BankAccount;

import java.util.ArrayList;
import java.util.List;

public class BankAccountServiceImpl implements BankAccountService {// on peut heriter dune seule classe et de plusieurs interfaces ou on utilise implements
   //on dit on cree une implementation de linterface
    private List<BankAccount> bankAccountList = new ArrayList<>();
    @Override
    public BankAccount addBankAccount(BankAccount account) {

        bankAccountList.add(account);
        return null;
    }

    @Override
    public List<BankAccount> getAllAccounts() {
        return bankAccountList;
    }

    @Override
    public BankAccount getAccountById(String id){
        for (BankAccount bankAccount:bankAccountList){
            if (bankAccount.getAccountId().equals(id)){
                return bankAccount;
            }
        }
        throw new RuntimeException("Bank Account not found");
    }

    @Override
    public void addRandomData(int size) {

    }

    @Override
    public void credit(String accountId, double amount) {

    }

    @Override
    public void debit(String accountId, double amount) {

    }

    @Override
    public void transfer(String accountSource, String accountDestination, double amount) {

    }
}
