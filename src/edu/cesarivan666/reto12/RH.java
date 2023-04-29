package edu.cesarivan666.reto12;
/**

 La clase RH es una subclase de Empleado e implementa la interfaz Entrevistador.

 Representa a un empleado del departamento de Recursos Humanos.
 */
public class RH extends Empleado implements Entrevistador{

    /**

     El correo electrónico del empleado de RH.
     */
    public String correo;
    /**

     Constructor de la clase RH que recibe el nombre y edad del empleado.
     @param nombre El nombre del empleado de RH.
     @param edad La edad del empleado de RH.
     */
    public RH (String nombre, int edad, String RFC) {
        super(nombre, edad, RFC);
    }
    /**

     Constructor por defecto de la clase RH.
     */
    public RH() {
    }
    /**

     Implementación del método entrevistar de la interfaz Entrevistador.
     El empleado de RH ejecuta la acción de entrevistar.
     */
    @Override
    public void entrevistar(){
        System.out.println("preguntar el background");
    }
    /**

     Implementación del método cobrarSueldo de la clase Empleado.
     El empleado de RH ejecuta la acción de cobrar un sueldo bajo.
     */
    @Override
    public void cobrarSueldo() {
        System.out.println("RH cobra sueldo bajo");
    }
}