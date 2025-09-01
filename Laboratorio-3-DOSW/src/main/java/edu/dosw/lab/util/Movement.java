package edu.dosw.lab.util;

import java.math.BigDecimal;

public class Movement {
    private BigDecimal amount;
    private String from;
    private String to;

    public Movement (BigDecimal amount, String from, String to) {
        this.amount = amount;
        this.from = from;
        this.to = to;
    }

    public String getAccountFrom(){
        return from;
    }

    public String getAccountTo(){
        return to;
    }

    public BigDecimal getAmount() {
        return amount;
    }

}
