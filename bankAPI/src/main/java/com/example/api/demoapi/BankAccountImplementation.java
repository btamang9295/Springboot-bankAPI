package com.example.api.demoapi;

import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.Scanner;

@Component
public class BankAccountImplementation implements BankAccountInterface{

    ArrayList <BankAccount> bankAccount = new ArrayList();


    BankAccountImplementation(){
        BankAccount testAccount = new BankAccount("Bikram", 1233.00, "221122",
                "biki@chiki.com");
        this.createAccount(testAccount);
    }


    @Override
    public ArrayList<BankAccount> getAccounts() {
        return bankAccount;
    }


    @Override
    public void createAccount(BankAccount account) {
        bankAccount.add(account);
    }

    @Override
    public void updateAccount(int accountNo, String newName) {
        for ( BankAccount account : bankAccount)
        {
            System.out.println("Please enter your account number to change your information: ");
            if (account.getAccountNumber() == accountNo)
            {


                account.setName(newName);
                System.out.println("Your new name has been saved.");

            }

            else {
                System.out.println("Error, please check your account number and try again");
            }
        }

    }

    @Override
    public void deleteAccount(int accountID) {
        Scanner in = new Scanner(System.in);
        System.out.println("please enter your account number to delete the account");
        int accountNo = in.nextInt();
        for ( BankAccount accounts : bankAccount)
        {
            if (accounts.getAccountNumber() == accountNo)
            {
                bankAccount.remove(accounts);
                System.out.println("Account " + accountNo + "has been successfully removed" );
            }
            else {
                System.out.println("account does not exist");
            }
        }
    }
}
