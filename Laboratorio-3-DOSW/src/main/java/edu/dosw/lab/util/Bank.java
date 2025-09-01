package edu.dosw.lab.util;

public enum Bank {
    BANCOLOMBIA("01"),
    DAVIVIENDA("02");

    private final String codigo;

    Bank(String codigo) {
        this.codigo = codigo;
    }

    public String getCodigo() {
        return codigo;
    }
}
