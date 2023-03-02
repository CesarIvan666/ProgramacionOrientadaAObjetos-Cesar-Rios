package edu.cesarivan666.reto2.piramide.process;

import java.util.Scanner;

/**
 *Su finalidad es que cuando tu pongas un numero aleatorio imprima una piramide de asteriscos y el tamaño
 *dependera en lineas del numero seleccionado.
 **/
public class PiramideDeAsteriscos {

    public static Object showmenu;

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Tamaño de la piramide que desea:");
        int numeroDeFilas = sc.nextInt();
        sc.close();

        System.out.println();

        for(int height = 1; height<=numeroDeFilas; height++){

            /**
             *En el siguiente apartado se denominan los espacios en blanco que se quieren tener.
             **/

            for(int whites = 1;
                whites<=numeroDeFilas-height;
                whites++){
                System.out.print(" ");
            }
            /**
             *En el siguiente apartado se denominan los asteriscos que se quieren tener.
             **/

            for(int asteriscos=1; asteriscos<=(height*2)-1; asteriscos++){

                System.out.print("*");
            }
            System.out.println();
        }
        System.out.println("¡Muy bonita tu piramide!");
    }
}

