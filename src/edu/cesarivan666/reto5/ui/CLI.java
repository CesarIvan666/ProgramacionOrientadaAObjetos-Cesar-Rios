package edu.cesarivan666.reto5.ui;

import edu.cesarivan666.reto5.process.JuegoAdivinaPalabra;

import java.util.Scanner;
/**
 * Clase que representa la interfaz de usuario del juego de adivinar palabras
 */
public class CLI {
    /**
     * Método principal que se encarga de la ejecución del juego
     * @param args Argumentos de la línea de comandos (no se utilizan en este caso)
     */
    public static void main() {
        Scanner scanner = new Scanner(System.in);
        int option = 0;

        do {
            System.out.println("Bienvenido al juego de adivinar palabras");
            System.out.println("Seleccione el nivel que desea jugar: ");
            System.out.println("1. = Fácil (4 letras)");
            System.out.println("2. = Intermedio (8 letras)");
            System.out.println("3. = Avanzado (12 letras)");
            System.out.println("0. = Salir del juego");

            option = scanner.nextInt();

            if (option != 0) {
                JuegoAdivinaPalabra game = new JuegoAdivinaPalabra(option);
                game.play();
            }
        } while (option != 0);
        System.out.println("¡Gracias por jugar!");
    }
}