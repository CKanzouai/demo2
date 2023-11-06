package net.chaimae;

import net.chaimae.business.BankAccountService;
import net.chaimae.business.BankAccountServiceImpl;
import net.chaimae.model.BankAccount;
import net.chaimae.model.CurrentAccount;
import net.chaimae.model.SavingAccount;

import java.util.List;
import java.util.function.Consumer;

public class Application {
    public static void main(String[] args) {
        BankAccountService bankAccountService = new BankAccountServiceImpl();
        bankAccountService.addBankAccount(new SavingAccount("USD",435, 2.4));
        bankAccountService.addBankAccount(new CurrentAccount("USD",435, 248));
        List<BankAccount> allAccounts = bankAccountService.getAllAccounts();
       /* for (BankAccount acc : allAccounts){
            System.out.println(acc);
        }
        for (int i =0; i<allAccounts.size(); i++){
            System.out.println(allAccounts.get(i));
        }*/
       /* allAccounts.forEach(new Consumer<BankAccount>() {
            @Override
            public void accept(BankAccount account) {
                System.out.println(account.toString());
            }
        });*/
        allAccounts.forEach(account -> //expression utilisant expression lambda
            System.out.println(account.toString()));

    }
}
