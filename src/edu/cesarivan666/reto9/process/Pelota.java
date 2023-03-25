package edu.cesarivan666.reto9.process;
/**
 * Clase que representa una pelota.
 */
public class Pelota {

    /** Color de la pelota */
    private String color;

    /** Rapidez de la pelota */
    private int rapidez;

    /** Poder de la pelota */
    private int poder;

    /**
     * Constructor de la clase Pelota.
     *
     * @param color   el color de la pelota.
     * @param rapidez la rapidez inicial de la pelota.
     * @param poder   el poder inicial de la pelota.
     */
    public Pelota(String color, int rapidez, int poder) {
        this.color = color;
        this.rapidez = rapidez;
        this.poder = poder;
    }

    /**
     * Disminuye la rapidez de la pelota en 1.
     */
    public void disminuirRapidez() {
        rapidez--;
    }

    /**
     * Aumenta el poder de la pelota en 1.
     */
    public void aumentarPoder() {
        poder++;
    }

    /**
     * Obtiene el color de la pelota.
     *
     * @return el color de la pelota.
     */
    public String getColor() {
        return color;
    }

    /**
     * Obtiene la rapidez de la pelota.
     *
     * @return la rapidez de la pelota.
     */
    public int getRapidez() {
        return rapidez;
    }

    /**
     * Obtiene el poder de la pelota.
     *
     * @return el poder de la pelota.
     */
    public int getPoder() {
        return poder;
    }
}