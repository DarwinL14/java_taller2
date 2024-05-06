package org.bansena.cgmlti.java.entidades;

import java.time.LocalDate;

public class Habilitante2 extends Habilitante {

    private String descripcion;

    

    public Habilitante2(Double valor, LocalDate fechaInicio, LocalDate fechaFinal, String descripcion) {
        super(valor, fechaInicio, fechaFinal);
        this.descripcion = descripcion;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    
    

}
