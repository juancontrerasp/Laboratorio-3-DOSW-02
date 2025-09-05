package edu.dosw.lab.util;

import java.math.BigDecimal;
import java.util.AbstractCollection;

public class AccountMovementManagement {

    public Bankify bankify;

    public AccountMovementManagement(Bankify bankify) {
        this.bankify = bankify;
    }

    public boolean validateAccountExistance(String to){
        return bankify.doesTheAccountExist(to);
    }

    public void realizeMovement(Account accfrom, String to, BigDecimal amount){
        if (validateAccountExistance(to)){
            accfrom.addBalance(amount.negate());
            bankify.getAccount(to).addBalance(amount);
            createMovement(accfrom,bankify.getAccount(to),amount);
        }
    }

    public void createMovement(Account accfrom, Account accto, BigDecimal amount){
        Movement movement = new Movement(amount,accfrom.getAccountNumber(),accto.getAccountNumber());
        accfrom.addMovement(movement);
        accto.addMovement(movement);
    }

}
