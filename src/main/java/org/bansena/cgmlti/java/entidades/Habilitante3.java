package org.bansena.cgmlti.java.entidades;

import java.time.LocalDate;

public class Habilitante3 extends Habilitante{
    private Integer numero;
    private LocalDate año;

    public Habilitante3(Double valor, Integer numero, LocalDate año) {
        super(valor);
        this.numero = numero;
        this.año = año;
    }

    public Integer getNumero() {
        return numero;
    }

    public void setNumero(Integer numero) {
        this.numero = numero;
    }

    public LocalDate getAño() {
        return año;
    }

    public void setAño(LocalDate año) {
        this.año = año;
    }

    
    
    
}
