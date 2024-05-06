package org.bansena.cgmlti.java.entidades;

import java.time.LocalDate;

public class Prueba {
    public static void main(String[] args) {
        
        //Crear una campaña:
        Habilitante1 ca = new Habilitante1(500.0, 
        LocalDate.now(), 
        LocalDate.of(2024, 9, 6), 
        "ADSO");

        //Crear una cuota de manejo 
        //Especifica para Campaña
        CuotaManejo<Habilitante1> cm1 = new CuotaManejo<Habilitante1>(
        ca.getFechaInicio(),
        ca.getFechaFinal(),
        ca.getValor(),
        ca);

        //Crear cuenta Bancaria
        CuentaBancaria cuentica = new CuentaBancaria(
        123,
        2000.0,
        "COP");

        //Vincular la cuota de manejo a
        //la cuenta bancaria
        cuentica.LManejos.add(cm1);
        
System.out.println(cuentica);

    //     Habilitante2 rn= new Habilitante2(1000.0, 
    //     LocalDate.now(), 
    //     LocalDate.of(2024, 10, 20), 
    //     "HOLA");

     }
}
