package com.example.api.demoapi;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.Optional;

@RestController
public class Controller {

    @Autowired
    BankAccountImplementation testAccount = new BankAccountImplementation();



    //Get
    @GetMapping("/testAPI")
    public ArrayList<BankAccount> testApi (){

        return testAccount.getAccounts();
    }

    //Create
    @PostMapping("/createAccount")
    public String createAccount(@RequestBody BankAccount account){
        testAccount.createAccount(account);
        return "Account created";
    }

    @DeleteMapping("/deleteAccount/{accountId}")
    public String deleteAccount(@PathVariable("accountId") int accountId)
    {
        testAccount.deleteAccount(accountId);
        return  "Successfully deleted";
    }

    @PutMapping("/updateAccount/{accountId}/{name}")
    public String updateAccount(@RequestBody BankAccount account,
                                @PathVariable("accountId") int accountId,
                                @PathVariable("name") String name){
        testAccount.updateAccount(accountId, name);

        return "Sucessfull";
    }


}
