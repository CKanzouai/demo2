package net.chaimae;

import net.chaimae.business.BankAccountService;
import net.chaimae.business.BankAccountServiceImpl;
import net.chaimae.model.SavingAccount;

public class Application {
    public static void main(String[] args) {
        BankAccountService bankAccountService = new BankAccountServiceImpl();
        bankAccountService.addBankAccount(new SavingAccount("USD",435, 2.4));
    }
}
