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

    public static String decimalToBinary(int decimal) {
        String binario = "";
        while (decimal > 0) {
            int resto = decimal % 2;
            binario = resto + binario;
            decimal = decimal / 2;
        }
        return binario;
    }

    public static String decimalToOctal(int decimal) {
        String octal = "";
        while (decimal > 0) {
            int resto = decimal % 8;
            octal = resto + octal;
            decimal = decimal / 8;
        }
        return octal;
    }

    public static String decimalToHexadecimal(int decimal) {
        String hexadecimal = "";
        while (decimal > 0) {
            int resto = decimal % 16;
            if (resto < 10) {
                hexadecimal = resto + hexadecimal;
            } else {
                char c = (char) ('A' + (resto - 10));
                hexadecimal = c + hexadecimal;
            }
            decimal = decimal / 16;
        }
        return hexadecimal;
    }
    public static int binaryToDecimal(String binario) {
        int decimal = 0;
        int longitud = binario.length();
        for (int i = 0; i < longitud; i++) {
            int digito = Character.getNumericValue(binario.charAt(i));
            decimal += digito * Math.pow(2, longitud - i - 1);
        }
        return decimal;
    }

    public static int octalToDecimal(String octal) {
        int decimal = 0;
        int longitud = octal.length();
        for (int i = 0; i < longitud; i++) {
            int digito = Character.getNumericValue(octal.charAt(i));
            decimal += digito * Math.pow(8, longitud - i - 1);
        }
        return decimal;
    }
    public static int hexadecimalToDecimal(String hexadecimal) {
        int decimal = 0;
        int longitud = hexadecimal.length();
        for (int i = 0; i < longitud; i++) {
            char c = hexadecimal.charAt(i);
            int digito;
            if (c >= '0' && c <= '9') {
                digito = Character.getNumericValue(c);
            } else {
                digito = 10 + (c - 'A');
            }
            decimal += digito * Math.pow(16, longitud - i - 1);
        }
        return decimal;
    }
}

