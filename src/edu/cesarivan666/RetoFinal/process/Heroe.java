package edu.cesarivan666.RetoFinal.process;
import java.util.function.Predicate;
/**
 * Clase que representa a un héroe en el juego.
 * Hereda de la clase Personaje.
 */
public class Heroe extends Personaje {

    /**
     * Constructor de la clase Heroe.
     *
     * @param vida la cantidad de vida del héroe
     * @param habilidad la habilidad del héroe
     * @param esModulo el predicado para determinar si un número es un módulo
     */
    public Heroe(int vida, double habilidad, Predicate<Integer> esModulo) {
        super(vida, habilidad, esModulo);
    }


}