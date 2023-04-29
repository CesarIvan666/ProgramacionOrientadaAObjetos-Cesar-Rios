package edu.cesarivan666.reto12;
/**

 Esta clase representa a un CEO que hereda de la clase Manager e incluye

 atributos adicionales para el nombre, valor y porcentaje de la corporación que dirige.
 */
public class CEO extends Manager {

    /**

     El nombre de la corporación que dirige el CEO.
     */
    public int nombreCorporacion;
    /**

     El valor de la corporación que dirige el CEO.
     */
    public int valorCorporacion;
    /**

     El porcentaje de participación que tiene el CEO en la corporación que dirige.
     */
    public int porcentajeCorporacion;
    public CEO(String nombre, int edad, String RFC) {
        super(nombre, edad, RFC);
    }

    public CEO() {

    }
}

