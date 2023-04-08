package edu.cesarivan666.reto10;

public class SrEngineer extends JrEngineer implements Entrevistador{

    public String nombreProyecto;

    /**
     * El senior ejecuta la accion de programar
     */
    @Override
    public void programar(){
        System.out.println("programa como quiere");
    }

    /**
     * El senior ejecuta la accion de entrevistar
     * */
    @Override
    public void entrevistar (){
        System.out.println("pregunta cosas tecnicas de programacion");
    }
    }
