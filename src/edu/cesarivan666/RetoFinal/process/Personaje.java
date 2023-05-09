package edu.cesarivan666.RetoFinal.process;
import java.util.function.Predicate;
/**
 * Clase que representa a un personaje en el juego.
 */
public class Personaje {

    int vida;
    int hadas;
    Predicate<Integer> esModulo;
    private double habilidad;

    /**
     * Constructor de la clase Personaje.
     *
     * @param vida la cantidad de vida del personaje
     * @param habilidad la habilidad del personaje
     * @param esModulo el predicado para determinar si un número es un módulo
     */
    public Personaje(int vida, double habilidad, Predicate<Integer> esModulo) {
        this.hadas = 0;
        this.vida = vida;
        this.habilidad = habilidad;
        this.esModulo = esModulo;
    }

    /**
     * Método que aumenta la cantidad de hadas del personaje y su vida si es un múltiplo del número de hadas.
     */
    public void ganarHadas() {
        vida = esModulo.test(++this.hadas) ? vida+1 : vida;
    }

    /**
     * Método que cura al personaje, aumentando su vida en 1.
     */
    public void curarse() {
        this.vida++;
    }

    /**
     * Método que hace daño al personaje, reduciendo su vida en 1.
     */
    public void recibirDaño() {
        this.vida--;
    }

    /**
     * Método que determina si el personaje está muerto.
     *
     * @return true si la vida del personaje es 0, false de lo contrario
     */
    public boolean estaMuerto() {
        return vida == 0;
    }

    /**
     * Método que obtiene la cantidad de vida del personaje.
     *
     * @return la cantidad de vida del personaje
     */
    public int obtenerVida() {
        return vida;
    }

    /**
     * Método que obtiene la cantidad de hadas del personaje.
     *
     * @return la cantidad de hadas del personaje
     */
    public int obtenerHadas() {
        return hadas;
    }

    /**
     * Método que obtiene la habilidad del personaje.
     *
     * @return la habilidad del personaje
     */
    public double obtenerHabilidad() {
        return habilidad;
    }
}
