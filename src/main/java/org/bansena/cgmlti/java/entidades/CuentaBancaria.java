package org.bansena.cgmlti.java.entidades;

import java.util.ArrayList;
import java.util.List;

public class CuentaBancaria {
    private Integer numero;
    private double saldo;
    private String divisa;

    List<CuotaManejo> LManejos = new ArrayList<>();

    private List<CuotaManejo> Cuotas  = new ArrayList<CuotaManejo>();
    
    public CuentaBancaria(Integer numero, double saldo, String divisa) {
        this.numero = numero;
        this.saldo = saldo;
        this.divisa = divisa;
        this.Cuotas = Cuotas;
    }

    public Integer getNumero() {
        return numero;
    }

    public void setNumero(Integer numero) {
        this.numero = numero;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public String getDivisa() {
        return divisa;
    }

    public void setDivisa(String divisa) {
        this.divisa = divisa;
    }

    public List<CuotaManejo> getCuotas() {
        return this.Cuotas;
    }

    public void setCuotas(List<CuotaManejo> cuotas) {
        Cuotas = cuotas;
    }

    
}
