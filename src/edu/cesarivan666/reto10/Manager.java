package edu.cesarivan666.reto10;

public class Manager extends Empleados implements Entrevistador {

    public String nombreDivision;

    /**
     * El manager ejecuta la accion de entrevistar
     * */
    @Override
    public void entrevistar(){
        System.out.println("si fueses un ani");
    }

    /**
     * El manager ejecuta la accion de cobrar sueldo
     */
    @Override
    public void cobrarSueldo() {
        System.out.println("Managers cobrar sueldo alto");
    }
}
