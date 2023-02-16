package edu.cesarivan666.reto4.ui;
import edu.cesarivan666.reto4.process.AnalisisVentas;

public class CLI {

    public static void showmenu() {
        /**
         * Creamos un arreglo bidimensional para almacenar los datos
         */
        int[][] ventas = {
                {111, 192, 289, 415},
                {483, 500, 470, 114},
                {471, 355, 474, 161},
                {427, 158, 160, 308}
        };
        /**
         * Trimestre que más se vende por cada sabor de café frío
         */
        int[] maxVentasPorSabor = new int[4];
        String[] sabores = {"chocolate", "vainilla", "fresa", "oreo"};
        for (int i = 0; i < sabores.length; i++) {
            int maxVentas = 0;
            for (int j = 0; j < 4; j++) {
                if (ventas[j][i] > maxVentas) {
                    maxVentas = ventas[j][i];
                    maxVentasPorSabor[i] = j;
                }
            }
            System.out.println("El trimestre que más se vende de " + sabores[i] + " es: "
                    + AnalisisVentas.obtenerTrimestre(maxVentasPorSabor[i]) + ".");
        }
        /**
         * Trimestre que más producto vende en general
         */
        int maxVentasTotal = 0;
        int trimestreMaxVentasTotal = 0;
        for (int i = 0; i < 4; i++) {
            int totalVentas = 0;
            for (int j = 0; j < 4; j++) {
                totalVentas += ventas[i][j];
            }
            if (totalVentas > maxVentasTotal) {
                maxVentasTotal = totalVentas;
                trimestreMaxVentasTotal = i;
            }
        }
        System.out.println("El trimestre que más producto vende en general es: "
                + AnalisisVentas.obtenerTrimestre(trimestreMaxVentasTotal) + ".");
    }


}
