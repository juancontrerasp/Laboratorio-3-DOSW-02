package edu.dosw.lab.util;

import java.math.BigDecimal;

public class Movement {
    private BigDecimal amount;
    private String from;
    private String to;

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
