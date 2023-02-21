package edu.cesarivan666.reto5.ui;
import edu.cesarivan666.reto5.process.JuegoAdivinaPalabra;

import java.util.Scanner;

/**
 * Clase principal del juego de adivinar palabras, que maneja la interacción con el usuario a través de la consola
 */
public class CLI {

    /**
     * Método principal del programa, que se encarga de mostrar el menú y controlar la ejecución del juego
     */
    public static void main() {

        Scanner scanner = new Scanner(System.in);
        boolean continuar = true;

        while (continuar) {
            System.out.println("Bienvenido al juego de adivinar palabras.");
            System.out.println("Seleccione el nivel que desea jugar:");
            System.out.println("1. Fácil (Palabra de 4 letras)");
            System.out.println("2. Intermedio (Palabra de 8 letras)");
            System.out.println("3. Avanzado (Palabra de 12 letras)");
            System.out.println("0. Salir del juego");

            int nivel = scanner.nextInt();
            if (nivel == 0) {
                continuar = false;
            } else {
                JuegoAdivinaPalabra juego = new JuegoAdivinaPalabra(nivel);
                juego.jugar(scanner);
            }
        }

        scanner.close();
        System.out.println("Gracias por jugar. Hasta pronto.");
    }
}