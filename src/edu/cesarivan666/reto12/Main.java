package edu.cesarivan666.reto12;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.List;

/**
 * La clase Main es la clase principal de la aplicación.
 * En esta clase se realizan diversas operaciones con una lista de empleados.
 */
public class Main {

    /**
     * Método principal que inicia la aplicación.
     *
     * @param args argumentos de línea de comandos (no se utilizan en este caso)
     */
    public static void main(String[] args) {

        // Lista de empleados
        List<Empleado> Empleado = new ArrayList<Empleado>();

        // Se lee el archivo de texto que contiene los datos de los empleados y se convierte en un String
        String data = readTextFileAsString("temp.txt");

        // Se dividen los datos por cada línea y se convierten en objetos Empleado
        String[] objs = data.split("\n");
        for(var obj: objs)
            Empleado.add(parseStringAsEmployee(obj));

        // Se filtran los empleados por edad
        filterByAge(19, 26, "\nEmpleados con edad entre 20 y 25 años", Empleado);

        // Se ordenan alfabéticamente los empleados y se muestra una cantidad determinada
        orderAlphabetically(Empleado, 10);

        // Se obtiene el último empleado de la lista ordenada por edad y luego por nombre
        getLastOrderByAgeThenAlph(Empleado);

        // Se calcula el promedio de las edades de los empleados
        averageAge(Empleado);
    }

    /**
     * Lee un archivo de texto y lo retorna como un String.
     *
     * @param fileName nombre del archivo a leer
     * @return el contenido del archivo como un String
     */
    static String readTextFileAsString(String fileName){
        Path p  = Path.of("src\\edu\\cesarivan666\\reto12\\temp.txt").toAbsolutePath();
        String data = "";
        try{
            data = new String(Files.readAllBytes(p));
        }catch(Exception e){
            System.out.println("Error: " + e);
        }
        return data;
    }

    /**
     * Convierte un objeto String en un objeto Empleado.
     * El objeto String debe tener la siguiente estructura:
     * nombre;edad;posición
     *
     * @param object objeto String a convertir
     * @return objeto Empleado correspondiente al objeto String
     */
    static Empleado parseStringAsEmployee(String object){
        String[] props = object.split(";");
        Empleado emp = null;
        try{
            emp = new JrEngineer(props[0], Integer.parseInt(props[1]),props[2]);
        }catch(Exception e){
            try{

                emp = new JrEngineer(props[0], Integer.parseInt(props[2]), props[1]);
            }catch(Throwable e2){
                System.out.println("No fue posible parsear texto a objeto: " + object);
            }
        }
        return emp;
    }


    /**
     * Filtra una lista de empleados según un rango de edad dado y muestra los resultados en consola.
     *
     * @param minAge edad mínima del rango
     * @param maxAge edad máxima del rango
     * @param message mensaje a mostrar antes de imprimir los resultados
     * @param progs lista de empleados a filtrar
     */
    private static void filterByAge(int minAge, int maxAge, String message, List<Empleado> progs) {

        System.out.println("Filtro - " + message + ":\n");

        progs.stream().filter(prog -> prog.edad > minAge && prog.edad < maxAge).forEach(System.out::println);
    }
    /**

     Ordena alfabéticamente los nombres de los primeros empleados en la lista.
     @param progs la lista de empleados a ordenar
     @param limit el número de nombres que se deben imprimir después de la ordenación
     */
    private static void orderAlphabetically(List<Empleado> progs, int limit){
        System.out.println("\nNombre de los primeros " + limit + " empleados ordenados alfabeticamente: \n" );
        progs.stream().map(prog -> prog.nombre).sorted().limit(limit).forEach(System.out::println);
    }
    /**

     Obtiene el último elemento de la lista ordenada primero por edad y luego por nombre.
     @param progs la lista de empleados a ordenar y obtener el último elemento
     */
    private static void getLastOrderByAgeThenAlph(List<Empleado> progs){
        System.out.println("\nUltimo elemento usando orden por edad y por nombre: \n" );
        var lastEl = progs.stream().sorted().reduce((f,s) -> s).orElse(null);
        System.out.println(lastEl);
    }
    /**

     Calcula el promedio de las edades de los empleados en la lista.
     @param progs la lista de empleados cuyas edades se promediarán
     */
    private static void averageAge(List<Empleado> progs){
        System.out.println("\nEl promedio de todas las edades es: \n" );
        float avgAge = (float) progs.stream().map(prog -> prog.edad).reduce((f,s) -> f+s).orElse(0);
        avgAge =  avgAge/progs.size();
        System.out.println(avgAge);
    }

}
