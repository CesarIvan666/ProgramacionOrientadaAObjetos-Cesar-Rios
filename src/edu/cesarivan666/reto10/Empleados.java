package edu.cesarivan666.reto10;

public abstract class Empleados {
    public int edad;
    public int sueldo;
    public int registro;
    public int telefono;
    public String nombre;


    /**
     * Los empleados ejecutan la accion de trabajar
     * */
    public void trabajar(){
        System.out.println("Empleado trabaja");
    }

    abstract public void cobrarSueldo();
}
