package org.bansena.cgmlti.java.pruebas;

import java.util.ArrayList;
import java.util.List;

public class PruebaListas {
    public static void main(String[] args) {
        
        List<Integer> LEnteros = new ArrayList<>();

        //metodo add de la lista raw
        LEnteros.add(2);
        LEnteros.add(5);
        LEnteros.add(50);
        LEnteros.add(45);
        LEnteros.add(4);
     
        //metodo get (indice): saca un elemento de la lista
        // System.out.println(LEnteros.get(0));

        //recorrer la lista
        for ( Integer n : LEnteros  ){
            System.out.println(n);
        }
    }
}
