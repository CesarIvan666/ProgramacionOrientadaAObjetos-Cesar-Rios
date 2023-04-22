package edu.cesarivan666.reto10;

import java.io.*;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedList;

public class Main {
    /**

El método principal de la clase Main

@param args argumentos pasados por la línea de comandos
*/
    public static void main(String[] args) {
        // Crear objetos de diferentes tipos
        JrEngineer jr = new JrEngineer();
        SrEngineer sr = new SrEngineer();
        CEO ceo = new CEO();
        Manager manager = new Manager();
        RH rh = new RH();
        jr.programar();
        sr.programar();
        System.out.println("---------------------");

        //testEmployee(new JrEngineer());
        //testEmployee(new SrEngineer());

        ArrayList<Empleado>listaIn=new ArrayList<>();


        //Crear 10 jr Engineer y agregarloso a la lista
        listaIn.add(new JrEngineer("Juanito",19));
        listaIn.add(new JrEngineer("Mauricio",18));
        listaIn.add(new JrEngineer("Antonio",20));
        listaIn.add(new JrEngineer("Geronimo",10));
        listaIn.add(new JrEngineer("Petra",21));
        listaIn.add(new JrEngineer("Voldemort",35));
        listaIn.add(new JrEngineer("Kiko",26));
        listaIn.add(new JrEngineer("Ñoño",30));
        listaIn.add(new JrEngineer("Elon Musk",50));
        listaIn.add(new JrEngineer("Andres Manuel Lopez Obrador",80));

        //Hashmap
        LinkedList<Empleado> linked = new LinkedList<>();
HashMap<Empleado,String> map = new HashMap<>();
map.put(new JrEngineer("Juanito",19),"Juanito");
        map.put(new JrEngineer("Mauricio",19),"Mauricio");
        map.put(new JrEngineer("Antonio",19),"Antonio");
        JrEngineer jr8 = new JrEngineer("Juanito",19);
        //System.out.println(map.get(jr8));

        listToFile(listaIn, "jrEngineerList.txt");

        ArrayList<Empleado>listOut =readFileList("jrEngineerList.txt");

        System.out.println("Empleados con mas de 20 años:");
        filtrarEdad(20, listOut);
        }
    /**

     Filtra los empleados que tienen una edad mayor a la edad proporcionada
     @param edad la edad a filtrar
     @param listOut la lista de empleados a filtrar
     */
    private static void filtrarEdad(int edad, ArrayList<Empleado> listOut) {
        listOut.forEach(jr -> {if(jr.edad > edad) System.out.println(jr.nombre + "\n" + jr.edad + "\n");});
    }


    /**
     * Prueba a un empleado
     * @params Empleado provee el empleado que se va a probar
     * * */
    static void testEmployee(Empleado e) {
        e.trabajar();
        System.out.println("Test employee: " + e.getClass().getSimpleName());
    }

    /**
     * Prueba a un programador
     * @params Programer provee el programador que se va a probar
     * * */
    public static void testProgrammer(Programer p) {
        p.programar();
        System.out.println("Test programmer: " + p.getClass().getSimpleName());
    }

    /**
     * Prueba a un entrevistador
     * @params Entrevistador provee el entrevistador que se va a probar
     * * */
    static void testInterviewer(Entrevistador i) {
        i.entrevistar();
        System.out.println("Test interviewer: " + i.getClass().getSimpleName());

/**

 Escribe un ArrayList de objetos de tipo Empleado en un archivo.

 @param listIn el ArrayList que se escribirá en el archivo.

 @param fileName el nombre del archivo en el que se escribirá el ArrayList.
 */
    }
    static void listToFile(ArrayList<Empleado> listIn, String fileName){


        try{
            FileOutputStream fos = new FileOutputStream(fileName);
            ObjectOutputStream oos = new ObjectOutputStream(fos);

            for(int i=0 ; i<listIn.size(); i++){
                oos.writeObject(listIn.get(i));
            }

            oos.flush();
            oos.close();

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    /**

     Lee un ArrayList de objetos de tipo Empleado de un archivo.

     @param fileName el nombre del archivo del que se leerá el ArrayList.

     @return el ArrayList de objetos de tipo Empleado leído del archivo.
     */
    static ArrayList<Empleado> readFileList(String fileName){

        ArrayList<Empleado> jrs = new ArrayList<>();
        try {
            FileInputStream fis = new FileInputStream(fileName);
            ObjectInputStream ois = new ObjectInputStream(fis);

            while(true) {
                try{
                    Empleado jr = (Empleado) ois.readObject();
                    jrs.add(jr);

                }catch(EOFException e){
                    ois.close();
                    break;
                }
            }
        }catch(Exception e){
            e.printStackTrace();
        }

        return jrs;

    }
}




