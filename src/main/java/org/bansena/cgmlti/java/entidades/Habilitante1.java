package org.bansena.cgmlti.java.entidades;

import java.time.LocalDate;

public class Habilitante1 extends Habilitante{

    private String nombre;
  

    public Habilitante1(Double valor, LocalDate fechaInicio, LocalDate fechaFinal, String nombre) {
        super(valor, fechaInicio, fechaFinal);
        this.nombre = nombre;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    @Override
    public String toString() {
        return "Habilitante1 [nombre=" + nombre + ", fechaInicio=" + fechaInicio + ", fechaFinal=" + fechaFinal + "]";
    }

    

    
   

}
