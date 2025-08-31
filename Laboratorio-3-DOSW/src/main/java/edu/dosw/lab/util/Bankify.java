package edu.dosw.lab.util;

import java.util.Hashtable;

public class Bankify {
    private Hashtable<String,Account>userAccounts;
    private AccountValidator accountValidator;
    private AccountManagement accountManagement;

    public boolean doesTheAccountExist(String account){
        return userAccounts.get(account)!= null;
    }

    public void createAccount(User user,Bank bank){
        Account accountCreated = accountManagement.createAccount();
        if ( accountValidator.validateAccountNumber(accountCreated.getAccountNumber(),bank) ){
            userAccounts.put(accountCreated.getAccountNumber(),accountCreated);
        }
    }
}
