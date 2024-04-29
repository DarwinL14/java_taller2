package org.bansena.cgmlti.java.pruebas;

//<E>: un tipo de dato generico
//puede ser cualquier tipo de objeto
public class Cage<E extends IComportamientoAnimal> {

    //una jaula solo puede tener dos animales
    //las mascotas pueden ser del tipo que sean
    //pero ambas deben ser del mismo tipo
    //por que si no
    private E mascota1;
    private E mascota2;

    
    public E getMascota1() {
        return this.mascota1;
    }
    public void setMascota1(E mascota1) {
        this.mascota1 = mascota1;
    }
    public E getMascota2() {
        return this.mascota2;
    }
    public void setMascota2(E mascota2) {
        this.mascota2 = mascota2;
    }
    public Cage(E mascota1, E mascota2) {
        this.mascota1 = mascota1;
        this.mascota2 = mascota2;
    }

    public Cage() {
        
    }
    //comportamiento para alimentar animales
    public void alimentarMascotas(){
        this.mascota1.alimentarse("Purina");;
    }
}
