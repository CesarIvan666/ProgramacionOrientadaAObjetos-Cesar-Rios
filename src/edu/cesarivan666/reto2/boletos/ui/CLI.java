package edu.cesarivan666.reto2.boletos.ui;
import edu.cesarivan666.reto2.boletos.process.CalculadorCostos;

import java.util.Scanner;
/**
 *Su función es mostrar un menu de opciones en las cuales se denominan distintos tipos de boletos y sus costos,
 * con la finalidad de que el usuario compre el tipo de boletos que desee segun su estatus.
 **/
public class CLI {
    public static void showMenu(){
        Scanner entrada = new Scanner(System.in);
        int child = 0;
        int adult = 0;
        int senor = 0;
        int senorsin = 0;
        Scanner scanner = new Scanner(System.in);
        char opt;
        do{
        System.out.println("Escoja el boleto que desea adquirir segun el tipo " +
                "\n A) Adulto = $100 " +
                "\n N) Niño = $70 " +
                "\n I) abuelo con clave INAPAM = $50 " + " " +
                "\n " + "B) abuelo sin clave INAPAM = $70 " +
                "\n n) salir");
        System.out.println("");
            String escogerBoletos = scanner.nextLine();
            switch(escogerBoletos){
                case "A":
                    System.out.println("El boleto cuesta? $100");
                    adult++;
                    break;
                case "N":
                    System.out.println("El boleto cuesta? $70");
                    child++;
                    break;
                case "I":
                    System.out.println("El boleto cuesta? $50");
                    senor++;
                    break;
                case "B":
                    System.out.println("El boleto cuesta? $70");
                    senorsin++;
                    break;
            }
            System.out.println("¿Desea adquirir otro boleto? presiona (s) para Si, o (n) para salir.");
            opt = entrada.next().charAt(0);
        }while(!(opt !='s'));
        CalculadorCostos.calcularCostos(child, adult, senor, senorsin);
        System.out.println(" Adulto: " + adult + "\n Niño: " + child + "\n Abuelo con INAPAM: " + senor + "\n Abuelo sin INAPAM: " + senorsin);
        System.out.println("¡Gracias por su compra!");
    }
    }




