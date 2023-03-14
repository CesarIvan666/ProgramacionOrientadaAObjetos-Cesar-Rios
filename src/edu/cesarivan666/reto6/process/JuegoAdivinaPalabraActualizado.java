package edu.cesarivan666.reto6.process;

import java.util.Random;
import java.util.Scanner;

/**
 * Clase que representa un juego para adivinar una palabra.
 */
public class JuegoAdivinaPalabraActualizado {
    boolean exit = false;
    private String[] NivelFacil = {"gato", "hola", "casa"};
    private String[] NivelIntermedio = {"elefante", "langosta", "telefono"};
    private String[] NivelAvanzado = {"enciclopedia", "arquitectura", "enfermedades"};
    private String[] currentWords;
    private String currentWord;
    private char[] LetrasAdivinadas;

    /**
     * Constructor de la clase JuegoAdivinaPalabra
     *
     * @param level Nivel del juego (1 para fácil, 2 para intermedio, 3 para avanzado)
     */
    public JuegoAdivinaPalabraActualizado(int level) {
        switch (level) {
            case 1:
                currentWords = NivelFacil;
                break;
            case 2:
                currentWords = NivelIntermedio;
                break;
            case 3:
                currentWords = NivelAvanzado;
                break;
            default:
                System.out.println("Opción inválida");
                break;
        }
    }

    /**
     * Método que inicia el juego
     */
    public void play() {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        boolean playing = true;

        while (playing) {
            int wordIndex = random.nextInt(currentWords.length);
            currentWord = currentWords[wordIndex];
            LetrasAdivinadas = new char[currentWord.length()];
            for (int i = 0; i < LetrasAdivinadas.length; i++) {
                LetrasAdivinadas[i] = 'X';
            }

            boolean guessed = false;
            int tries = 0;
            while (!guessed) {
                System.out.println("La palabra a adivinar es: ");
                System.out.println(LetrasAdivinadas);
                System.out.println("Introduzca una letra: ");
                try {
                    String input = scanner.next();
                    char letter = input.charAt(0);

                    if (letter == '0') {
                        playing = false;
                        break;
                    }

                    if (!Character.isLetter(letter)) {
                        System.out.println("Introduzca un carácter valido");
                        continue;
                    }

                    boolean found = false;
                    for (int i = 0; i < currentWord.length(); i++) {
                        if (Character.toLowerCase(letter) == Character.toLowerCase(currentWord.charAt(i))) {
                            found = true;
                            LetrasAdivinadas[i] = letter;
                        }
                    }

                    if (!found) {
                        tries++;
                        System.out.println("¡Intenta de nuevo!");
                    }

                    if (String.valueOf(LetrasAdivinadas).equalsIgnoreCase(currentWord)) {
                        System.out.println("Felicidades, adivinaste la palabra en " + tries + " intentos.");
                        guessed = true;
                    }
                } catch (StringIndexOutOfBoundsException e) {
                    System.out.println("Debe ingresar una letra");
                    continue;
                }
            }
        }
    }
}
