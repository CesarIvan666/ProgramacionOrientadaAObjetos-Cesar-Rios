package edu.cesarivan666.reto10;

public class JrEngineer extends Empleados implements Programer{

    public String stack;
    public String nombreSupervisor;


    /**
     * El programador jr ejecuta la accion de programar
     * */
    @Override
    public void programar(){
        System.out.println("programa como puede");
    }

    /**El programador jr ejecuta la accion de cobrar el sueldo*/
    @Override
    public void cobrarSueldo(){
        System.out.println("Jrs cobran sueldo medio");
    }
}
