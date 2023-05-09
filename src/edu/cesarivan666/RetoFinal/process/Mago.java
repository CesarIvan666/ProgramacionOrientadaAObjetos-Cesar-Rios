package edu.cesarivan666.RetoFinal.process;
import java.util.function.Predicate;
/**
 * Clase que representa a un mago en el juego.
 * Hereda de la clase Personaje.
 */
public class Mago extends Personaje{

    /**
     * Constructor de la clase Mago.
     *
     * @param vida la cantidad de vida del mago
     * @param habilidad la habilidad del mago
     * @param esModulo el predicado para determinar si un número es un módulo
     */
    public Mago(int vida, double habilidad, Predicate<Integer> esModulo){
        super(vida, habilidad, esModulo);
    }

    /**
     * Método que reduce la cantidad de hadas del mago y su vida si es un múltiplo del número dado.
     *
     * @param capHadas la capacidad máxima de hadas del mago
     */
    public void pierdeHadas(int capHadas){
        if(this.hadas !=0){
            this.hadas --;
            vida = esModulo.test(capHadas) ? vida-1 : vida;
        }
    }
}