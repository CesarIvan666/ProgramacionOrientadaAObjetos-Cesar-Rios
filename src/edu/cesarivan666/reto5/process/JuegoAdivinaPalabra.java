package edu.cesarivan666.reto5.process;

import java.util.Scanner;
/**
 * Clase que representa el proceso del juego de adivinar palabras, que contiene la lógica y los datos del juego
 */
public class JuegoAdivinaPalabra {

    private String palabraBase;
    private String palabraAdivinada;
    private int intentos;

    /**
     * Constructor que inicializa el juego con la palabra base correspondiente al nivel especificado.
     * @param nivel El nivel del juego (1=fácil, 2=intermedio, 3=avanzado)
     */
    public JuegoAdivinaPalabra (int nivel) {
        switch (nivel) {
            case 1:
                palabraBase = "tina";
                break;
            case 2:
                palabraBase = "cangrejo";
                break;
            case 3:
                palabraBase = "extraordinario";
                break;
        }

        // Inicializar palabra adivinada con guiones bajos
        palabraAdivinada = "";
        for (int i = 0; i < palabraBase.length(); i++) {
            palabraAdivinada += "_";
        }
        intentos = 0;
    }
    /**
     * Método que maneja la lógica del juego y la interacción con el usuario
     * @param scanner El objeto Scanner que se utilizará para leer la entrada del usuario
     */
    public void jugar(Scanner scanner) {
        // Comenzar adivinanza
        while (!palabraAdivinada.equals(palabraBase)) {
            System.out.println("Palabra a adivinar: " + palabraAdivinada);
            System.out.println("Introduzca una letra (o 0 para salir):");
            String letra = scanner.next();

            if (letra.equals("0")) {
                break;
            }

            if (letra.length() != 1) {
                System.out.println("Introduzca solo una letra.");
                continue;
            }

            boolean letraAdivinada = false;
            for (int i = 0; i < palabraBase.length(); i++) {
                if (palabraBase.charAt(i) == letra.charAt(0)) {
                    // La letra está en la palabra base
                    letraAdivinada = true;
                    // Reemplazar guión bajo por la letra en la palabra adivinada
                    palabraAdivinada = palabraAdivinada.substring(0, i) + letra + palabraAdivinada.substring(i+1);
                }
            }

            if (!letraAdivinada) {
                System.out.println("Letra incorrecta, intente de nuevo.");
                intentos++;
            }
        }

        if (intentos > 0) {
            System.out.println("¡Felicidades, has adivinado la palabra en " + intentos + " intentos!");
        } else {
            System.out.println("¡Felicidades, has adivinado la palabra a la primera!");

}
    }

}

