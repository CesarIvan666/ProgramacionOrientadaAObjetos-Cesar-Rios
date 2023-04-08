package edu.cesarivan666.reto10;

public class RH extends Empleados implements Entrevistador{

    public String correo;

    /**
     * Empleado de RH ejecuta la accion entrevistar
     */
    @Override
    public void entrevistar(){
        System.out.println("preguntar el background");
    }

    /**
    * Empleado de RH ejecuta la accion de cobrar sueldo
    * */
    @Override
    public void cobrarSueldo() {
        System.out.println("RH cobra sueldo bajo");
    }
}
