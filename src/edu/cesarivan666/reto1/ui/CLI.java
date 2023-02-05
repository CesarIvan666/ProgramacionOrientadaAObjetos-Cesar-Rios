package edu.cesarivan666.reto1.ui;
import edu.cesarivan666.reto1.process.Calculadora;

import javax.swing.*;
import java.util.Scanner;
public class CLI {
    public static void MostrarMenu(){
        System.out.println("Selecciona una de las siguientes opciones en contenido numerico");
        System.out.println("1 es suma");
        System.out.println("2 es resta");
        System.out.println("3 es multiplicacion");
        System.out.println("4 es Division");

        Scanner scanner = new Scanner (System.in);

        int option = scanner.nextInt();
        scanner.nextLine();

        System.out.println("introduce el primer valor en tipo entero");
        int operando1 = scanner.nextInt();scanner.nextLine();
        System.out.println("introduce el segundo valor en tipo entero");
        int operando2 = scanner.nextInt();scanner.nextLine();
        int resultado=-1;
        String operacion ="";

        switch (option){
            case 1:
                resultado = Calculadora.sumarNumeros(operando1, operando2);
                System.out.printf("El resultado de la operacion de %d+%d = %d", operando1,operando2, resultado);
                break;
            case 2:
                resultado = Calculadora.restarNumeros(operando1, operando2);
                System.out.printf("El resultado de la operacion de %d-%d = %d", operando1,operando2, resultado);
                break;
            case 3:
                resultado = Calculadora.multiplicarNumeros(operando1, operando2);
                System.out.printf("El resultado de la operacion de %d*%d = %d", operando1,operando2, resultado);
                break;
            case 4:
                resultado = Calculadora.dividirNumeros(operando1, operando2);
                System.out.printf("El resultado de la operacion de %d/%d = %d", operando1,operando2, resultado);
                break;
        }
    }
}

