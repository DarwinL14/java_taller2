package org.bansena.cgmlti.java.entidades;

import java.time.LocalDate;

import org.bansena.cgmlti.java.pruebas.IComportamientoAnimal;

public class CuotaManejo <E extends Habilitante>{
    private LocalDate fechaInicio;
    private LocalDate fechaFinal;
    private Double valor;
    private E habilitante;


    
    public CuotaManejo(LocalDate fechaInicio, LocalDate fechaFinal, Double valor, E habilitante) {
        this.fechaInicio = habilitante.fechaInicio;
        this.fechaFinal = habilitante.fechaFinal;
        this.valor = habilitante.valor;
        this.habilitante = habilitante;
    }


    public CuotaManejo(E habilitante) {
        this.valor = habilitante.getValor();
        this.habilitante = habilitante;
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


    public Double getValor() {
        return valor;
    }


    public void setValor(Double valor) {
        this.valor = valor;
    }


    public E getHabilitante() {
        return habilitante;
    }


    public void setHabilitante(E habilitante) {
        this.habilitante = habilitante;
    }


    @Override
    public String toString() {
        return "CuotaManejo [ valor=" + valor
                + ", habilitante=" + habilitante + "]";
    }

    



    
    
}
