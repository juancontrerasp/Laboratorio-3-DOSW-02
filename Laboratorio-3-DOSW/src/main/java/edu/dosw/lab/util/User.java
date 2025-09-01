package edu.dosw.lab.util;

import java.math.BigDecimal;
import java.util.ArrayList;

public class User {
    private  ArrayList<Account> accounts;
    private String nombre;

    public BigDecimal getTotalBalance(){
        return accounts.stream().map(Account::getAccountBalance).reduce(BigDecimal.ZERO, BigDecimal::add);
    }

    public BigDecimal getAccountBalance(Account account){
        return account.getAccountBalance();
    }

    public void makeMovement(String toAccount,BigDecimal amount){

    }

}
