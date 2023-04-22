package edu.cesarivan666.reto10;
/**

 La clase SrEngineer es una subclase de JrEngineer e implementa la interfaz Entrevistador.

 Representa a un ingeniero senior que puede programar y entrevistar.
 */
public class SrEngineer extends JrEngineer implements Entrevistador{

    /**

     El nombre del proyecto en el que está trabajando el ingeniero senior.
     */
    public String nombreProyecto;
    /**

     Constructor por defecto de la clase SrEngineer.
     */
    public SrEngineer() {
    }
    /**

     Implementación del método programar de la superclase JrEngineer.
     El ingeniero senior ejecuta la acción de programar como quiere.
     */
    @Override
    public void programar(){
        System.out.println("programa como quiere");
    }
    /**

     Implementación del método entrevistar de la interfaz Entrevistador.
     El ingeniero senior ejecuta la acción de preguntar cosas técnicas de programación.
     */
    @Override
    public void entrevistar (){
        System.out.println("pregunta cosas tecnicas de programacion");
    }
    /**

     Constructor de la clase SrEngineer que recibe el nombre y edad del ingeniero.
     @param nombre El nombre del ingeniero senior.
     @param edad La edad del ingeniero senior.
     */
    public SrEngineer(String nombre, int edad) {
        super(nombre,edad);
    }
}