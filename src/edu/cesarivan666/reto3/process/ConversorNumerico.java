package edu.cesarivan666.reto3.process;
/**
 * Esta clase contiene metodos para convertir numeros de una base numerica a otra
 *
 *//**
     * Este metodo recibe un string que representa un numero base decimal y regresa
     * el mismo numero en su representacion de base binaria
     *
     * Qparam decimal numero a convertir
     * @return numero a binario
     */

public class ConversorNumerico {

    public static String decimalToBinary(String decimal) {
        int decimalNumber = Integer.parseInt(decimal);
        String binary = Integer.toBinaryString(decimalNumber);
        return binary;
    }

    public static String decimalToOctal(String decimal) {
        int decimalNumber = Integer.parseInt(decimal);
        String octal = Integer.toOctalString(decimalNumber);
        return octal;
    }

    public static String decimalToHexadecimal(String decimal) {
        int decimalNumber = Integer.parseInt(decimal);
        String hexadecimal = Integer.toHexString(decimalNumber);
        return hexadecimal;
    }

    public static int binaryToDecimal(String binary) {
        int decimal = Integer.parseInt(binary, 2);
        return decimal;
    }

    public static int octalToDecimal(String octal) {
        int decimal = Integer.parseInt(octal, 8);
        return decimal;
    }

    public static int hexadecimalToDecimal(String hexadecimal) {
        int decimal = Integer.parseInt(hexadecimal, 16);
        return decimal;
    }
}
