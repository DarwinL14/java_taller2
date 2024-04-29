package org.bansena.cgmlti.java.entidades;
import java.util.ArrayList;
import java.util.List;

public class Titular {
    private String nombre;
    private Long numeroIdentificacion;

    //atributo de relacion
    private List<CuentaBancaria> cuentasBancarias = 
        new ArrayList<CuentaBancaria>();
    
    
        public Titular(String nombre, Long numeroIdentificacion, List<CuentaBancaria> cuentasBancarias) {
        this.nombre = nombre;
        this.numeroIdentificacion = numeroIdentificacion;
        this.cuentasBancarias = cuentasBancarias;

    }

        public String getNombre() {
        return this.nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Long getNumeroIdentificacion() {
        return this.numeroIdentificacion;
    }

    public void setNumeroIdentificacion(Long numeroIdentificacion) {
        this.numeroIdentificacion = numeroIdentificacion;
    }

    public List<CuentaBancaria> getCuentasBancarias() {
        return this.cuentasBancarias;
    }

    public void setCuentasBancarias(List<CuentaBancaria> cuentasBancarias) {
        this.cuentasBancarias = cuentasBancarias;
    }
    
    
    
}
