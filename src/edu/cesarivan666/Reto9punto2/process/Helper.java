package edu.cesarivan666.Reto9punto2.process;

import java.util.Random;

/**
 * La clase Helper representa a un ayudante con características aleatorias.
 * Las características incluyen número de ojos, color de piel, altura, nivel de creación, nivel de reparación y nivel destructivo.
 */
public class Helper {

    private int numOjos;
    private String colorPiel;
    private String altura;
    private int nivelCreacion;
    private int nivelReparacion;
    private int nivelDestructivo;

    /**
     * Crea una instancia de Helper con características aleatorias.
     */
    public Helper() {
        Random random = new Random();
        this.numOjos = random.nextInt(2) + 1; // Genera un número aleatorio entre 1 y 2.
        this.colorPiel = (random.nextBoolean()) ? "amarilla" : "morada"; // Genera aleatoriamente un color de piel.
        this.altura = (random.nextBoolean()) ? "alto" : "mediano"; // Genera aleatoriamente una altura.
        this.nivelCreacion = random.nextInt(5) + 1; // Genera un número aleatorio entre 1 y 5.
        this.nivelReparacion = random.nextInt(5) + 1; // Genera un número aleatorio entre 1 y 5.
        this.nivelDestructivo = random.nextInt(5) + 1; // Genera un número aleatorio entre 1 y 5.
    }

    // Getters y setters

    public int getNumOjos() {
        return numOjos;
    }

    public void setNumOjos(int numOjos) {
        this.numOjos = numOjos;
    }

    public String getColorPiel() {
        return colorPiel;
    }

    public void setColorPiel(String colorPiel) {
        this.colorPiel = colorPiel;
    }

    public String getAltura() {
        return altura;
    }

    public void setAltura(String altura) {
        this.altura = altura;
    }

    public int getNivelCreacion() {
        return nivelCreacion;
    }

    public void setNivelCreacion(int nivelCreacion) {
        this.nivelCreacion = nivelCreacion;
    }

    public int getNivelReparacion() {
        return nivelReparacion;
    }

    public void setNivelReparacion(int nivelReparacion) {
        this.nivelReparacion = nivelReparacion;
    }

    public int getNivelDestructivo() {
        return nivelDestructivo;
    }

    public void setNivelDestructivo(int nivelDestructivo) {
        this.nivelDestructivo = nivelDestructivo;
    }

    // Método toString para imprimir las características del ayudante.

    @Override
    public String toString() {
        return "Helper{" +
                "numOjos=" + numOjos +
                ", colorPiel='" + colorPiel + '\'' +
                ", altura='" + altura + '\'' +
                ", nivelCreacion=" + nivelCreacion +
                ", nivelReparacion=" + nivelReparacion +
                ", nivelDestructivo=" + nivelDestructivo +
                '}';
    }
}