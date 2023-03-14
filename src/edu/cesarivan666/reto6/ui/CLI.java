package edu.cesarivan666.reto6.ui;

import edu.cesarivan666.reto6.process.JuegoAdivinaPalabraActualizado;

import java.util.Scanner;
/**
 * Clase que representa la interfaz de usuario del juego de adivinar palabras
 */
public class CLI {
    /**
     * Método principal que se encarga de la ejecución del juego
     */
    public static void main() {
        Scanner scanner = new Scanner(System.in);
        int option = 0;

        do {
            try {
                System.out.println("Bienvenido al juego de adivinar palabras");
                System.out.println("Seleccione el nivel que desea jugar: ");
                System.out.println("1. Fácil (4 letras)");
                System.out.println("2. Intermedio (8 letras)");
                System.out.println("3. Avanzado (12 letras)");
                System.out.println("0. Salir del juego");

                option = scanner.nextInt();

                if (option == 0) {
                    System.out.println("¡Gracias por jugar!");
                    break;
                } else if (option < 1 || option > 3) {
                    throw new Exception("Opción inválida. Seleccione un nivel del 1 al 3.");
                }

                JuegoAdivinaPalabraActualizado game = new JuegoAdivinaPalabraActualizado(option);
                game.play();
                break;
            } catch (Exception e) {
                System.out.println("Ha ocurrido un error: " + e.getMessage());
                scanner.nextLine();
            }
        } while (true);
    }
}