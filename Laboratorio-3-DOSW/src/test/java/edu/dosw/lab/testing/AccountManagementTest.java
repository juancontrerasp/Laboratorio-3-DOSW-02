package edu.dosw.lab.testing;

import edu.dosw.lab.util.*;
import org.junit.jupiter.api.*;
import static org.junit.jupiter.api.Assertions.*;
import java.math.BigDecimal;

public class AccountManagementTest {
    private AccountManagement accountManagement;
    private User user;

    @BeforeEach
    void setUp() {
        accountManagement = new AccountManagement();
        user = new User();
    }

    @Test
    void shouldCreateBancolombiaAccountSuccessfully() {
        String accountNumber = "0123456789";
        Bank bank = Bank.BANCOLOMBIA;
        Account account = accountManagement.createAccount(user, accountNumber, bank);

        assertNotNull(account);
        assertEquals(accountNumber, account.getAccountNumber());
        assertEquals(BigDecimal.ZERO, account.getAccountBalance());
    }

    @Test
    void shouldCreateDaviviendaAccountSuccessfully() {
        String accountNumber = "0298765432";
        Bank bank = Bank.DAVIVIENDA;
        Account account = accountManagement.createAccount(user, accountNumber, bank);

        assertNotNull(account);
        assertEquals(accountNumber, account.getAccountNumber());
        assertEquals(BigDecimal.ZERO, account.getAccountBalance());
    }

    @Test
    void shouldMakeDepositSuccessfully() {
        Account account = accountManagement.createAccount(user, "0123456789", Bank.BANCOLOMBIA);
        BigDecimal depositAmount = new BigDecimal("1000.50");
        accountManagement.makeDeposit(account, depositAmount);

        assertEquals(depositAmount, account.getAccountBalance());
    }

    @Test
    void shouldMakeMultipleDepositsSuccessfully() {
        Account account = accountManagement.createAccount(user, "0298765432", Bank.DAVIVIENDA);
        BigDecimal firstDeposit = new BigDecimal("500.00");
        BigDecimal secondDeposit = new BigDecimal("300.25");
        BigDecimal expectedTotal = new BigDecimal("800.25");

        accountManagement.makeDeposit(account, firstDeposit);
        accountManagement.makeDeposit(account, secondDeposit);

        assertEquals(expectedTotal, account.getAccountBalance());
    }

    @Test
    void shouldCheckBalanceCorrectly() {
        Account account = accountManagement.createAccount(user, "0112345678", Bank.BANCOLOMBIA);
        BigDecimal depositAmount = new BigDecimal("2500.75");
        accountManagement.makeDeposit(account, depositAmount);

        BigDecimal balance = accountManagement.checkBalance(account);

        assertEquals(depositAmount, balance);
        assertEquals(account.getAccountBalance(), balance);
    }

    @Test
    void shouldHandleZeroDeposit() {
        Account account = accountManagement.createAccount(user, "0211122233", Bank.DAVIVIENDA);
        BigDecimal zeroAmount = BigDecimal.ZERO;

        accountManagement.makeDeposit(account, zeroAmount);

        assertEquals(BigDecimal.ZERO, account.getAccountBalance());
    }

    @Test
    void shouldCreateAccountsInDifferentBanks() {
        String bancolombiaNumber = "0155555855";
        String daviviendaNumber = "0244464444";

        Account bancolombia = accountManagement.createAccount(user, bancolombiaNumber, Bank.BANCOLOMBIA);
        Account davivienda = accountManagement.createAccount(user, daviviendaNumber, Bank.DAVIVIENDA);

        assertNotNull(bancolombia);
        assertNotNull(davivienda);
        assertEquals(bancolombiaNumber, bancolombia.getAccountNumber());
        assertEquals(daviviendaNumber, davivienda.getAccountNumber());
        assertNotEquals(bancolombia, davivienda);
    }
}