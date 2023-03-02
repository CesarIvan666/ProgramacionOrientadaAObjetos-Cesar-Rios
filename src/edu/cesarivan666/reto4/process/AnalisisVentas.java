package edu.cesarivan666.reto4.process;
import edu.cesarivan666.reto4.ui.CLI;
/**
 * La clase AnalisisVentas realiza el análisis de las ventas en un año para cuatro sabores diferentes.
 * Proporciona la cantidad máxima de ventas por sabor y el trimestre con el máximo de ventas totales.
 */
public class AnalisisVentas {
    /**
     * Método principal que ejecuta el análisis de ventas y llama a las funciones de impresión de resultados.
     */
    public static void main() {
    // Creamos un arreglo bidimensional para almacenar los datos
    int[][] ventas = {
            {111, 192, 289, 415},
            {483, 500, 470, 114},
            {471, 355, 474, 161},
            {427, 158, 160, 308}
    };

    int[] maxVentasPorSabor = obtenerMaxVentasPorSabor(ventas);
    String[] sabores = {"chocolate", "vainilla", "fresa", "oreo"};
    CLI.imprimirMaxVentasPorSabor(maxVentasPorSabor, sabores);

    int trimestreMaxVentasTotal = obtenerTrimestreMaxVentasTotal(ventas);
    CLI.imprimirTrimestreMaxVentasTotal(trimestreMaxVentasTotal);
}
    /**
     * Calcula la cantidad máxima de ventas por sabor.
     *
     * @param ventas Arreglo bidimensional de ventas.
     * @return Arreglo de enteros que representa la cantidad máxima de ventas por sabor.
     */

    public static int[] obtenerMaxVentasPorSabor(int[][] ventas) {
        int[] maxVentasPorSabor = new int[4];

        for (int i = 0; i < maxVentasPorSabor.length; i++) {
            int maxVentas = 0;

            for (int j = 0; j < ventas.length; j++) {
                if (ventas[j][i] > maxVentas) {
                    maxVentas = ventas[j][i];
                    maxVentasPorSabor[i] = j;
                }
            }
        }

        return maxVentasPorSabor;
    }

    /**
     * Calcula el trimestre con la cantidad máxima de ventas totales.
     *
     * @param ventas Arreglo bidimensional de ventas.
     * @return Entero que representa el trimestre con la cantidad máxima de ventas totales.
     */
    public static int obtenerTrimestreMaxVentasTotal(int[][] ventas) {
        int maxVentasTotal = 0;
        int trimestreMaxVentasTotal = 0;

        for (int i = 0; i < ventas.length; i++) {
            int totalVentas = 0;

            for (int j = 0; j < ventas[i].length; j++) {
                totalVentas += ventas[i][j];
            }

            if (totalVentas > maxVentasTotal) {
                maxVentasTotal = totalVentas;
                trimestreMaxVentasTotal = i;
            }
        }

        return trimestreMaxVentasTotal;
    }
}