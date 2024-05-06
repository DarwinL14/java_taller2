package org.bansena.cgmlti.java.entidades;

import java.time.LocalDate;

public class TarjetaDebito <T extends Habilitante> {

    private Long numeroTarjeta;
    private LocalDate fechaVencimiento;
    private double tope;

    private CuotaManejo<T> CuotaManejo;


    public TarjetaDebito(long numeroTarjeta, LocalDate fechaVencimiento, double tope,
            org.bansena.cgmlti.java.entidades.CuotaManejo<T> cuotaManejo) {
        this.numeroTarjeta = numeroTarjeta;
        this.fechaVencimiento = fechaVencimiento;
        this.tope = tope;
        CuotaManejo = cuotaManejo;
    }


    public long getNumeroTarjeta() {
        return numeroTarjeta;
    }


    public void setNumeroTarjeta(long numeroTarjeta) {
        this.numeroTarjeta = numeroTarjeta;
    }


    public LocalDate getFechaVencimiento() {
        return fechaVencimiento;
    }


    public void setFechaVencimiento(LocalDate fechaVencimiento) {
        this.fechaVencimiento = fechaVencimiento;
    }


    public double getTope() {
        return tope;
    }


    public void setTope(double tope) {
        this.tope = tope;
    }


    public void setCuotaManejo(CuotaManejo<T> cuotaManejo) {
        CuotaManejo = cuotaManejo;
    }


    public void add(TarjetaDebito<Habilitante1> t1) {
       System.out.println();
    }


    @Override
    public String toString() {
        return "TarjetaDebito [numeroTarjeta=" + numeroTarjeta + ", fechaVencimiento=" + fechaVencimiento + ", tope="
                + tope + ", CuotaManejo=" + CuotaManejo + "]";
    }

    
}
