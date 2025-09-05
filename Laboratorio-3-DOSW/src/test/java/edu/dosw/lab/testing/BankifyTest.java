package edu.dosw.lab.testing;

import edu.dosw.lab.util.*;
import org.junit.jupiter.api.*;
import static org.junit.jupiter.api.Assertions.*;

public class BankifyTest {
    private Bankify bankify;
    private User user;

    @BeforeEach
    void setUp() {
        bankify = new Bankify();
        user = new User();
    }

    @Test
    void shouldNotCreateBankifyWithEmptyAccounts() {
        assertFalse(bankify.doesTheAccountExist("1234567890"));
        assertNull(bankify.getAccount("1234567890"));
    }

    @Test
    void shouldCreateAccountSuccessfully() {
        String validAccountNumber = "0123456789";
        bankify.createAccount(user, Bank.BANCOLOMBIA, validAccountNumber);

        assertTrue(bankify.doesTheAccountExist(validAccountNumber));
        assertNotNull(bankify.getAccount(validAccountNumber));
        assertEquals(validAccountNumber, bankify.getAccount(validAccountNumber).getAccountNumber());
    }

    @Test
    void shouldNotCreateAccountWithInvalidNumber() {
        String invalidAccountNumber = "123";
        bankify.createAccount(user, Bank.BANCOLOMBIA, invalidAccountNumber);

        assertFalse(bankify.doesTheAccountExist(invalidAccountNumber));
        assertNull(bankify.getAccount(invalidAccountNumber));
    }

    @Test
    void shouldNotCreateAccountWithWrongBankPrefix() {
        String wrongPrefixAccount = "0312543210";

        bankify.createAccount(user, Bank.BANCOLOMBIA, wrongPrefixAccount);

        assertFalse(bankify.doesTheAccountExist(wrongPrefixAccount));
        assertNull(bankify.getAccount(wrongPrefixAccount));
    }

    @Test
    void shouldHandleMultipleAccounts() {
        String account1 = "0123456789";
        String account2 = "0134567890";

        bankify.createAccount(user, Bank.BANCOLOMBIA, account1);
        bankify.createAccount(user, Bank.BANCOLOMBIA, account2);

        assertTrue(bankify.doesTheAccountExist(account1));
        assertTrue(bankify.doesTheAccountExist(account2));
        assertNotNull(bankify.getAccount(account1));
        assertNotNull(bankify.getAccount(account2));

        assertNotSame(bankify.getAccount(account1), bankify.getAccount(account2));
    }

    @Test
    void shouldReturnCorrectAccountExists() {
        String existingAccount = "0123456789";
        String nonExistingAccount = "9999999999";

        bankify.createAccount(user, Bank.BANCOLOMBIA, existingAccount);

        assertTrue(bankify.doesTheAccountExist(existingAccount));
        assertFalse(bankify.doesTheAccountExist(nonExistingAccount));
    }

    @Test
    void shouldReturnNullForNoExistentAccount() {
        String nonExistentAccount = "9999999999";

        assertNull(bankify.getAccount(nonExistentAccount));
        assertFalse(bankify.doesTheAccountExist(nonExistentAccount));
    }
}