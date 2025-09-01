package edu.dosw.lab.testing;

import edu.dosw.lab.util.AccountValidator;
import edu.dosw.lab.util.Bank;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class AccountValidatorTest {

    private AccountValidator validator;

    @BeforeEach
    void setUp() {
        validator = new AccountValidator();
    }

    @Test
    void testValidateAccountNumber_NullNumber_ReturnsFalse() {
        assertFalse(validator.validateAccountNumber(null, Bank.BANCOLOMBIA));
    }

    @Test
    void testValidateAccountNumber_NullBank_ReturnsFalse() {
        assertFalse(validator.validateAccountNumber("0123456789", null));
    }

    @ParameterizedTest
    @MethodSource("invalidNumberProvider")
    void testValidateAccountNumber_InvalidNumberFormat_ReturnsFalse(String invalidNumber, Bank bank) {
        assertFalse(validator.validateAccountNumber(invalidNumber, bank));
    }

    static Stream<Arguments> invalidNumberProvider() {
        return Stream.of(
                Arguments.of("123456789", Bank.BANCOLOMBIA),
                Arguments.of("01234567890", Bank.BANCOLOMBIA),
                Arguments.of("01abc45678", Bank.BANCOLOMBIA),
                Arguments.of("01-2345678", Bank.BANCOLOMBIA),
                Arguments.of("", Bank.BANCOLOMBIA),
                Arguments.of(" 0123456789 ", Bank.BANCOLOMBIA)
        );
    }

    @Test
    void testValidateAccountNumber_ValidNumberWrongPrefix_ReturnsFalse() {
        assertFalse(validator.validateAccountNumber("0223456789", Bank.BANCOLOMBIA));
    }

    @ParameterizedTest
    @MethodSource("validNumberProvider")
    void testValidateAccountNumber_ValidNumberCorrectPrefix_ReturnsTrue(String validNumber, Bank bank) {
        assertTrue(validator.validateAccountNumber(validNumber, bank));
    }

    static Stream<Arguments> validNumberProvider() {
        return Stream.of(
                Arguments.of("0123456789", Bank.BANCOLOMBIA),
                Arguments.of("0234567890", Bank.DAVIVIENDA)
        );
    }
}