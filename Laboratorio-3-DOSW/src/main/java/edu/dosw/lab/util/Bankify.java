package edu.dosw.lab.util;

import java.util.Hashtable;

public class Bankify {
    private Hashtable<String,Account>userAccounts;
    private AccountValidator accountValidator;
    private AccountManagement accountManagement;

    public Bankify() {
        accountValidator = new AccountValidator();
        accountManagement = new AccountManagement();
    }

    public boolean doesTheAccountExist(String account){
        return userAccounts.get(account)!= null;
    }

    public void createAccount(User user,Bank bank, String accountNumber){
        if ( accountValidator.validateAccountNumber(accountNumber,bank) ){
            userAccounts.put(accountNumber, accountManagement.createAccount(user, accountNumber,bank));
        }
    }
}
