package edu.dosw.lab.util;

public class AccountValidator {
    public boolean validateAccountNumber(String number, Bank bank) {
        if (number == null || bank == null) {
            return false;
        }
        if (!number.matches("^[0-9]{10}$")) {
            return false;
        }
        return number.startsWith(bank.getCodigo());
    }


}
