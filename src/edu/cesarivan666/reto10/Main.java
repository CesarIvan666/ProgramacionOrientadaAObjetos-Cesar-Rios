package edu.cesarivan666.reto10;



public class Main {
    public static void main(String[] args) {
        // Crear objetos de diferentes tipos
        JrEngineer jr = new JrEngineer();
        SrEngineer sr = new SrEngineer();
        CEO ceo = new CEO();
        Manager manager = new Manager();
        RH rh = new RH();

        // Crear objetos con variables de tipo padre
        Empleados emp1 = jr;
        Programer prog1 = jr;
        Empleados emp2 = ceo;
        Empleados emp3 = rh;
        Programer prog = sr;

        Entrevistador ent1 = ceo;
        Entrevistador ent2 = rh;
        Entrevistador ent3 = sr;

        // Invocar métodos que usen polimorfismo

        testProgrammer(prog1);
        testProgrammer(prog);
        testEmployee(emp1);
        testEmployee(emp2);
        testEmployee(emp3);
        testInterviewer(ent1);
        testInterviewer(ent2);
        testInterviewer(ent3);
    }


    /**
     * Prueba a un empleado
     * @params Empleados provee el empleado que se va a probar
     * * */
    static void testEmployee(Empleados e) {
        e.trabajar();
        System.out.println("Test employee: " + e.getClass().getSimpleName());
    }

    /**
     * Prueba a un programadoe
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
    }
}


