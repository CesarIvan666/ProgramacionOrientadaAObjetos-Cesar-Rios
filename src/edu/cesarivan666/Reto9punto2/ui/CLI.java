package edu.cesarivan666.Reto9punto2.ui;
import edu.cesarivan666.Reto9punto2.process.Helper;
/**
 * La clase CLI genera cinco instancias de la clase Helper con características aleatorias y las imprime por consola.
 */
public class CLI {
    public static void main() {
        Helper[] helpers = new Helper[5]; // Crea un arreglo de 5 ayudantes.

        // Genera 5 ayudantes y los agrega al arreglo.
        for (int i = 0; i < 5; i++) {
            helpers[i] = new Helper();
        }

        // Imprime las características de los ayudantes.
        for (int i = 0; i < 5; i++) {
            System.out.println("Helper " + (i+1) + ": " + helpers[i].toString());
        }
    }
}