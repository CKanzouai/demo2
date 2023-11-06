package net.chaimae;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import net.chaimae.model.BankAccount;
import net.chaimae.model.CurrentAccount;
import net.chaimae.model.SavingAccount;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class App2 {

    public static void main(String[] args) throws JsonProcessingException {
        BankAccount[] accounts = new BankAccount[4];
        accounts[0] = new CurrentAccount("USD",1230, 4455);
        accounts[1] = new SavingAccount("MAD",5230,3.4);
        accounts[2] = new CurrentAccount("USD",1630,5640);
        accounts[3] = new SavingAccount("MAD",7830,4.1);

        for (BankAccount acc : accounts){

           /* if (acc instanceof CurrentAccount){ // Sans polymorphisme
                System.out.println(((CurrentAccount)acc).getType());
            }
            else if (acc instanceof SavingAccount){
                System.out.println(((SavingAccount)acc).getType());
            }*/
            System.out.println(acc.getType()); // polymorphisme
            if (acc instanceof CurrentAccount){
                System.out.println(((CurrentAccount)acc).getOverDraft());
            }
            else if (acc instanceof SavingAccount){
                System.out.println(((SavingAccount)acc).getInterestRate());
            }

        }
        System.out.println();

        for (int i =0; i<accounts.length; i++){
            System.out.println(accounts[i]);
        }
        System.out.println();
        List<BankAccount> bankAccountList = new ArrayList<>();
        bankAccountList.add(new SavingAccount("USD",1230,4.2));
        bankAccountList.add(new CurrentAccount("USD",7230,2345));
        bankAccountList.add(new SavingAccount("USD",8230,5.4));
        bankAccountList.add(new SavingAccount("USD",9230,3.2));
        bankAccountList.add(new CurrentAccount("USD",9930,1234));
        bankAccountList.add(new SavingAccount("USD",5430,2.1));

        for (BankAccount acc2: bankAccountList ){
            System.out.println(acc2.getBalance());
        }
        //Map : tableau a 2 dimensien de types cles value
        Map<String, BankAccount> bankAccountMap = new HashMap<>();

        bankAccountMap.put("cc1", new CurrentAccount("USD",430,234));
        bankAccountMap.put("cc2", new SavingAccount("USD",230,2.3));
        bankAccountMap.put("cc3", new CurrentAccount("USD",530,4567));
        bankAccountMap.put("cc4", new SavingAccount("USD",430,2.6));
        bankAccountMap.put("cc5", new CurrentAccount("USD",530,5670));

        for (BankAccount acc3 : bankAccountMap.values()){
            System.out.println(toJson(acc3));
        }
        System.out.println();
        for (String key : bankAccountMap.keySet()){
            System.out.println(bankAccountMap.get(key));
        }}

        public static String toJson(Object o) throws JsonProcessingException {
            ObjectMapper objectMapper = new ObjectMapper();
            return objectMapper.writerWithDefaultPrettyPrinter().writeValueAsString(o);

        }




}
