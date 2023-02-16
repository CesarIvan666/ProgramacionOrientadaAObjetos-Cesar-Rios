package edu.cesarivan666.reto4.process;


public class AnalisisVentas {
        public static String obtenerTrimestre(int trimestre) {
            switch (trimestre) {
                case 0:
                    return "ene-feb-mar";
                case 1:
                    return "abr-may-jun";
                case 2:
                    return "jul-agos-sep";
                case 3:
                    return "oct-nov-dic";
                default:
                    return "trimestre no válido";
            }
        }
    }

