package edu.dosw.lab.util;

import java.math.BigDecimal;

public class AccountManagement {

    public Account createAccount(User user, String accountNumber, Bank bank) {
        return new Account(user, accountNumber, bank);
    }

    public BigDecimal checkBalance(Account account) {return account.getAccountBalance();}

}
