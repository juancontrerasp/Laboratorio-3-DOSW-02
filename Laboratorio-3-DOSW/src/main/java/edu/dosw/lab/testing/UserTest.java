package edu.dosw.lab.testing;

import edu.dosw.lab.util.*;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

import java.math.BigDecimal;

public class UserTest {

    private User user;
    private Account bancolombiaAccount;

    @BeforeEach
    void setUp() {
        user = new User();
        bancolombiaAccount = new Account(user, "0123456789", Bank.BANCOLOMBIA);
    }

    @Test
    void shouldGetAccountBalanceCorrectly() {
        BigDecimal depositAmount = new BigDecimal("1500.75");
        bancolombiaAccount.addBalance(depositAmount);

        BigDecimal balance = user.getAccountBalance(bancolombiaAccount);

        assertEquals(depositAmount, balance);
        assertEquals(bancolombiaAccount.getAccountBalance(), balance);
    }

    @Test
    void shouldCalculateTotalBalanceWithNoAccounts() {

        assertThrows(NullPointerException.class, () -> {
            user.getTotalBalance();
        });
    }

    @Test
    void shouldGetZeroBalanceFromNewAccount() {

        Account newAccount = new Account(user, "0187654321", Bank.BANCOLOMBIA);

        BigDecimal balance = user.getAccountBalance(newAccount);

        assertEquals(BigDecimal.ZERO, balance);
    }
}