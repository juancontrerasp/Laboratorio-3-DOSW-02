package edu.dosw.lab.util;

import java.util.Hashtable;

public class Bankify {
    private Hashtable<String,Account> userAccounts;
    private AccountValidator accountValidator;
    private AccountManagement accountManagement;
    private AccountMovementManagement amm;

    public Bankify() {
        userAccounts = new Hashtable<>();
        accountValidator = new AccountValidator();
        accountManagement = new AccountManagement();
        amm = new AccountMovementManagement(this);
    }

    public boolean doesTheAccountExist(String account){
        return userAccounts.get(account)!= null;
    }

    public void createAccount(User user,Bank bank, String accountNumber){
        if ( accountValidator.validateAccountNumber(accountNumber,bank) ){
            userAccounts.put(accountNumber, accountManagement.createAccount(user, accountNumber,bank));
            userAccounts.get(accountNumber).setAmm(amm);
        }
    }

    public Account getAccount(String acc){
        return userAccounts.get(acc);
    }


}
