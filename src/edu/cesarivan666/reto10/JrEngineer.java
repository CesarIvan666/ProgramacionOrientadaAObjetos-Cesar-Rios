package edu.cesarivan666.reto10;

import java.io.Serializable;

/**

 Esta clase representa a un ingeniero jr que es también un programador y se puede serializar.
 */
public class JrEngineer extends Empleado implements Programer, Serializable {

    /** El lenguaje de programación que el ingeniero jr domina. */
    public String stack;

    /** El nombre del supervisor del ingeniero jr. */
    public String nombreSupervisor;

    /** El RFC del ingeniero jr. */
    private String RFC;

    /**

     Crea un nuevo objeto JrEngineer con el nombre y edad especificados.
     @param nombre el nombre del ingeniero jr.
     @param edad la edad del ingeniero jr.
     */
    public JrEngineer(String nombre, int edad) {
        super(nombre, edad);
    }
    /**

     Crea un nuevo objeto JrEngineer sin especificar el nombre ni la edad.
     */
    public JrEngineer() {
        super();
    }
    /**

     El programador jr ejecuta la acción de programar.
     */
    @Override
    public void programar(){
        System.out.println("programa como puede");
    }
    /**

     El programador jr ejecuta la acción de cobrar el sueldo.
     */
    @Override
    public void cobrarSueldo(){
        System.out.println("Jrs cobran sueldo medio");
    }
}