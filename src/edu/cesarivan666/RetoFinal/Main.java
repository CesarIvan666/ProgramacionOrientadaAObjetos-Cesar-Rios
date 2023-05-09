package edu.cesarivan666.RetoFinal;

import edu.cesarivan666.RetoFinal.ui.Juego;
import edu.cesarivan666.RetoFinal.ui.Logger;
import java.io.IOException;
/**
 Clase que contiene el método principal para iniciar el juego de "Rescate de hadas: La maldición del mago".
 */
public class Main {

    /**
     Método principal que inicia el juego.

     @param args Los argumentos de la línea de comandos. No se utilizan en este programa.
     */
    public static void main(String args[]){

// Mensajes de bienvenida y espera para comenzar el juego.
        Logger.log("Rescate de hadas: La maldición del mago.");
        Logger.log("Hay un pueblo virtual que ha sido hechizado por un poderoso mago. Este mago obtiene su poder del polvo de hadas que mantiene cautivas y necesitan ayuda, ¡tenemos que salvarlas!");
        Logger.log("Presione Enter para continuar.");

        try {
            System.in.read();
        } catch (IOException e) {
            Logger.log(e.getMessage());
        }

// Creación del juego con los parámetros iniciales.
// Parámetros del juego: vida inicial del héroe, vida inicial del mago, dificultad
// (1-10) donde 10 es la más difícil, límite del mago es la cantidad de hadas que el mago debe capturar para aumentar su poder, límite del héroe es la cantidad de hadas que el héroe debe rescatar para dañar al mago,
        Juego juego = new Juego(10, 5, 5, 10, 10);
        juego.comenzar();
    }

}

