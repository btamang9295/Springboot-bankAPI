package com.example.api.demoapi;

import java.util.ArrayList;

public interface BankAccountInterface {

    public ArrayList<BankAccount> getAccounts();
   // public BankAccount getAccount (int AccNumber);
    public void createAccount (BankAccount account);
    public void updateAccount(int accountNo, String newName);
    public void deleteAccount(int accountID);

}
