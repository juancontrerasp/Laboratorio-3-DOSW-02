package edu.dosw.lab.util;

import java.math.BigDecimal;

public class Movement {
    private BigDecimal amount;
    private String from;
    private String to;

    public Movement(BigDecimal amount, String from, String to) {
        if (amount == null) {
            throw new IllegalArgumentException("El monto no puede ser nulo");
        }
        if (amount.compareTo(BigDecimal.ZERO) < 0) {
            throw new IllegalArgumentException("El monto no puede ser negativo");
        }
        if (from == null || from.trim().isEmpty()) {
            throw new IllegalArgumentException("Cuenta de la que sale el dinero no puede ser nula o vacía");
        }
        if (to == null || to.trim().isEmpty()) {
            throw new IllegalArgumentException("Cuenta a la que llega el dinero no puede ser nula o vacía");
        }

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
