package edu.dosw.lab.util;

import java.math.BigDecimal;
import java.util.ArrayList;

public class User {
    private  ArrayList<Account> cuentas;
    private String nombre;

    public BigDecimal getBalance(){
        return cuentas.stream()
                .map(Account::getAccountBalance)
                .reduce(BigDecimal.ZERO, BigDecimal::add);
    }

    public void makeMovement(String toAccount,BigDecimal amount){

    }

}
