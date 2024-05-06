package org.bansena.cgmlti.java.entidades;

import java.util.ArrayList;
import java.util.List;

public class CuentaBancaria {
    private Integer numero;
    private double saldo;
    private String divisa;
    TarjetaDebito TarjetaDebito;

    List<CuotaManejo> LManejos = new ArrayList<>();

    private List<CuotaManejo> Cuotas  = new ArrayList<CuotaManejo>();
    public Object Habilitante1;
    
    public CuentaBancaria(Integer numero, double saldo, String divisa) {
        this.numero = numero;
        this.saldo = saldo;
        this.divisa = divisa;
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

    public TarjetaDebito getTarjetaDebito() {
        return this.TarjetaDebito;
    }

    public void setTarjetaDebito(TarjetaDebito tarjetaDebito) {
        TarjetaDebito = tarjetaDebito;
    } 

    public List<CuotaManejo> getLManejos() {
        return LManejos;
    }

    public void setLManejos(List<CuotaManejo> lManejos) {
        LManejos = lManejos;
    }

    @Override
    public String toString() {
        return "CuentaBancaria [numero=" + numero + ", saldo=" + saldo + ", divisa=" + divisa + ", TarjetaDebito="
                + TarjetaDebito + ", LManejos=" + LManejos + ", Cuotas=" + Cuotas + ", getNumero()=" + getNumero()
                + ", getSaldo()=" + getSaldo() + ", getDivisa()=" + getDivisa() + ", getCuotas()=" + getCuotas()
                + ", getTarjetaDebito()=" + getTarjetaDebito() + "]";
    }

    

    
}
