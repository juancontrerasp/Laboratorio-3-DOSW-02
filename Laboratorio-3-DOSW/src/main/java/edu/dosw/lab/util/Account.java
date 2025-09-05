package edu.dosw.lab.util;

import java.util.ArrayList;
import java.math.BigDecimal;

public class Account {
    private String accountNumber;
    private BigDecimal accountBalance;
    private Bank bank;
    private ArrayList<Movement> movements;
    private User user;
    private AccountMovementManagement amm;

    public Account(User user, String accountNumber, Bank bank) {
        this.accountNumber = accountNumber;
        this.bank = bank;
        this.accountBalance = new BigDecimal(0);
        this.movements = new ArrayList<>();
        this.user = user;
    }

    public void setAmm(AccountMovementManagement amm) {
        this.amm = amm;
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public BigDecimal getAccountBalance() {
        return accountBalance;
    }

    public void addBalance(BigDecimal accountBalanceToAdd) {
        accountBalance = accountBalance.add(accountBalanceToAdd);
    }

    public void makeMovement(BigDecimal amount, String to){
        amm.realizeMovement(this,to,amount);
    }
    public void addMovement(Movement movement){
        movements.add(movement);
    }

}
