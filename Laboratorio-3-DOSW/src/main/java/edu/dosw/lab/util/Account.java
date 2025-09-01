package edu.dosw.lab.util;

import java.util.ArrayList;
import java.math.BigDecimal;

public class Account {
    private String accountNumber;
    private BigDecimal accountBalance;
    private Bank bank;
    private ArrayList<Movement> movements;
    private User user;

    public Account(User user, String accountNumber, Bank bank) {
        this.accountNumber = accountNumber;
        this.bank = bank;
        this.accountBalance = new BigDecimal(0);
        this.movements = new ArrayList<>();
        this.user = user;
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
        movements.add(new Movement(amount,accountNumber,to));
    }
}
