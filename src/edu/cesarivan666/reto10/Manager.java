package edu.cesarivan666.reto10;

/**

 La clase Manager es una subclase de Empleado e implementa la interfaz Entrevistador.

 Representa a un empleado con capacidad para realizar entrevistas y con un nivel jerárquico superior.
 */
public class Manager extends Empleado implements Entrevistador {

    /**

     El nombre de la división a la que pertenece el manager.
     */
    public String nombreDivision;
    /**

     Constructor por defecto de la clase Manager.
     */
    public Manager() {
    }
    /**

     Implementación del método entrevistar de la interfaz Entrevistador.
     El manager ejecuta la acción de entrevistar.
     */
    @Override
    public void entrevistar(){
        System.out.println("Entrevistador entrevista");
    }
    /**

     Implementación del método cobrarSueldo de la clase Empleado.
     El manager ejecuta la acción de cobrar un sueldo alto.
     */
    @Override
    public void cobrarSueldo() {
        System.out.println("Managers cobrar sueldo alto");
    }
    /**

     Constructor de la clase Manager que recibe el nombre y edad del empleado.
     @param nombre El nombre del manager.
     @param edad La edad del manager.
     */
    public Manager(String nombre, int edad) {
        super(nombre, edad);
    }
}