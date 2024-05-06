package org.bansena.cgmlti.java.entidades;

import java.time.LocalDate;

public abstract class Habilitante {
    protected Double valor;
    protected LocalDate fechaInicio;
    protected LocalDate fechaFinal;

    public Habilitante(Double valor, LocalDate fechaInicio, LocalDate fechaFinal) {
        this.valor = valor;
        this.fechaInicio = fechaInicio;
        this.fechaFinal = fechaFinal;
    }

    public Double getValor() {
        return valor;
    }

    public void setValor(Double valor) {
        this.valor = valor;
    }

    public LocalDate getFechaInicio() {
        return fechaInicio;
    }

    public void setFechaInicio(LocalDate fechaInicio) {
        this.fechaInicio = fechaInicio;
    }

    public LocalDate getFechaFinal() {
        return fechaFinal;
    }

    public void setFechaFinal(LocalDate fechaFinal) {
        this.fechaFinal = fechaFinal;
    }

    @Override
    public String toString() {
        return "Habilitante [valor=" + valor + "]";
    }

    
}
