package org.bansena.cgmlti.java.entidades;

import java.time.LocalDate;

public class PruebaTarjetaDebito {
    
    @SuppressWarnings("unchecked")
    public static void main(String[] args) {
        
        Habilitante1 c = new Habilitante1(500.0, 
        LocalDate.now(), 
        LocalDate.of(2024, 9, 6), 
        "ADSO");

        CuotaManejo<Habilitante1> cm = new CuotaManejo<Habilitante1>(c);

        TarjetaDebito<Habilitante1> t1 = new TarjetaDebito<>(121233L, 
        LocalDate.now(), 
        10000000.0, 
        cm);

        t1.setCuotaManejo(cm);
        
        CuentaBancaria cuenta = new CuentaBancaria(2131, 
        2000.0, 
        "COP");


        cuenta.setTarjetaDebito(t1);
        cuenta.TarjetaDebito.add(t1);
        System.out.println("Numero: "+ cuenta.getNumero() + ", Saldo: " + cuenta.getSaldo() +
        ", Divisa: " + cuenta.getDivisa()+ ", Datos tarjeta y cuota: " + cuenta.TarjetaDebito);

      

    }
}
