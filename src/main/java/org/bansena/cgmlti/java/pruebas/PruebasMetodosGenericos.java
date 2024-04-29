package org.bansena.cgmlti.java.pruebas;

public class PruebasMetodosGenericos {
    
    //metodo generico:
    //metodo que acepta parametros 
    //ajustables a cualquier tipo de dato
    static <T> T mostrarElemento(T item){
        return item;
    }

    public static void main(String[] args) {
        //invocar el metodo mostrarElemento
        System.out.println(
             mostrarElemento("Hola")
        );        
    }
}
