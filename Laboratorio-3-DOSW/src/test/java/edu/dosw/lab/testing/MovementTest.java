package edu.dosw.lab.testing;

import edu.dosw.lab.util.Movement;
import org.junit.jupiter.api.*;
import static org.junit.jupiter.api.Assertions.*;

import java.math.BigDecimal;

public class MovementTest {
    private BigDecimal amount;
    private String fromAccount;
    private String toAccount;
    private Movement movement;

    @BeforeEach
    void setUp() {
        amount = new BigDecimal("1500.75");
        fromAccount = "0123456789";
        toAccount = "9876543210";
        movement = new Movement(amount, fromAccount, toAccount);
    }

    @Test
    void shouldCreateMovementWithValidParameters() {
        Movement newMovement = new Movement(new BigDecimal("2500.50"), fromAccount, toAccount);

        assertNotNull(newMovement);
        assertEquals(new BigDecimal("2500.50"), newMovement.getAmount());
        assertEquals("0123456789", newMovement.getAccountFrom());
        assertEquals("9876543210", newMovement.getAccountTo());
    }

    @Test
    void shouldGetAmountCorrectly() {
        BigDecimal recoveredAmount = movement.getAmount();

        assertEquals(amount, recoveredAmount);
        assertEquals(new BigDecimal("1500.75"), recoveredAmount);
    }

    @Test
    void shouldGetAccountFromCorrectly() {
        String recoveredFromAccount = movement.getAccountFrom();

        assertEquals(fromAccount, recoveredFromAccount);
        assertEquals("0123456789", recoveredFromAccount);
    }

    @Test
    void shouldGetAccountToCorrectly() {
        String recoveredToAccount = movement.getAccountTo();

        assertEquals(toAccount, recoveredToAccount);
        assertEquals("9876543210", recoveredToAccount);
    }

    @Test
    void shouldHandleZeroAmount() {
        Movement zeroMovement = new Movement(BigDecimal.ZERO, fromAccount, toAccount);

        assertEquals(BigDecimal.ZERO, zeroMovement.getAmount());
        assertEquals("0123456789", zeroMovement.getAccountFrom());
        assertEquals("9876543210", zeroMovement.getAccountTo());
    }

    @Test
    void shouldHandleBigAmount() {
        BigDecimal bigAmount = new BigDecimal("999999999.99");
        Movement largeMovement = new Movement(bigAmount, fromAccount, toAccount);
        assertEquals(bigAmount, largeMovement.getAmount());
    }

    @Test
    void shouldMaintainBigDecimalPrecision() {
        BigDecimal preciseAmount = new BigDecimal("123.456789012345");
        Movement preciseMovement = new Movement(preciseAmount, fromAccount, toAccount);

        assertEquals(preciseAmount, preciseMovement.getAmount());
        assertEquals(0, preciseAmount.compareTo(preciseMovement.getAmount()));
    }

    @Test
    void shouldThrowExceptionWhenAmountIsNull() {
        IllegalArgumentException exception = assertThrows(IllegalArgumentException.class, () -> {
            new Movement(null, fromAccount, toAccount);
        });
        assertEquals("El monto no puede ser nulo", exception.getMessage());
    }

    @Test
    void shouldThrowExceptionWhenAmountIsNegative() {
        IllegalArgumentException exception = assertThrows(IllegalArgumentException.class, () -> {
            new Movement(new BigDecimal("-500.25"), fromAccount, toAccount);
        });
        assertEquals("El monto no puede ser negativo", exception.getMessage());
    }

    @Test
    void shouldThrowExceptionWhenFromAccountIsNull() {
        IllegalArgumentException exception = assertThrows(IllegalArgumentException.class, () -> {
            new Movement(new BigDecimal("1000.00"), null, toAccount);
        });
        assertEquals("Cuenta de la que sale el dinero no puede ser nula o vacía", exception.getMessage());
    }

    @Test
    void shouldThrowExceptionWhenFromAccountIsEmpty() {
        IllegalArgumentException exception = assertThrows(IllegalArgumentException.class, () -> {
            new Movement(new BigDecimal("1000.00"), "", toAccount);
        });
        assertEquals("Cuenta de la que sale el dinero no puede ser nula o vacía", exception.getMessage());
    }

    @Test
    void shouldThrowExceptionWhenFromAccountIsOnlySpaces() {
        IllegalArgumentException exception = assertThrows(IllegalArgumentException.class, () -> {
            new Movement(new BigDecimal("1000.00"), "   ", toAccount);
        });
        assertEquals("Cuenta de la que sale el dinero no puede ser nula o vacía", exception.getMessage());
    }

    @Test
    void shouldThrowExceptionWhenToAccountIsNull() {
        IllegalArgumentException exception = assertThrows(IllegalArgumentException.class, () -> {
            new Movement(new BigDecimal("1000.00"), fromAccount, null);
        });
        assertEquals("Cuenta a la que llega el dinero no puede ser nula o vacía", exception.getMessage());
    }

    @Test
    void shouldThrowExceptionWhenToAccountIsEmpty() {
        IllegalArgumentException exception = assertThrows(IllegalArgumentException.class, () -> {
            new Movement(new BigDecimal("1000.00"), fromAccount, "");
        });
        assertEquals("Cuenta a la que llega el dinero no puede ser nula o vacía", exception.getMessage());
    }

    @Test
    void shouldThrowExceptionWhenToAccountIsOnlySpaces() {
        IllegalArgumentException exception = assertThrows(IllegalArgumentException.class, () -> {
            new Movement(new BigDecimal("1000.00"), fromAccount, "   ");
        });
        assertEquals("Cuenta a la que llega el dinero no puede ser nula o vacía", exception.getMessage());
    }
}