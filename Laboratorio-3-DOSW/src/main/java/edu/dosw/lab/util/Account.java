package edu.dosw.lab.util;

import java.math.BigDecimal;

public class Account {
    private String accountNumber;
    private BigDecimal accountBalance;
    private Bank bank;

    public String getAccountNumber() {
        return accountNumber;
    }

    public BigDecimal getAccountBalance() {
        return accountBalance;
    }

    public void setAccountBalance(BigDecimal accountBalanceToAdd) {
        accountBalance = accountBalance.add(accountBalanceToAdd);
    }

    public void addMovement(Movement movement){
        
    }
}
