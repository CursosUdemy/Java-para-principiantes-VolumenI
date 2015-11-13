package a;
import clases.*;
/**
 * en este laboratorio se aplicaran los conceptos estudiandos en la seccion de arreglos y colecciones.
 * @author Franklin Rony Cortez
 */
public class Demo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Laboratorio matematica=new Laboratorio(5);
        matematica.setAsignatura("Matematica");
        matematica.setInstructor("Rony");
        matematica.setSalon("5A");
        Laboratorio poo=new Laboratorio(2);
        poo.setAsignatura("Programacion Orientada a Objetos");
        poo.setInstructor("Guillermo");
        poo.setSalon("5B");
        Estudiante est1=new Estudiante("Juan", "Perez", 22, "Computacion");
        Estudiante est2=new Estudiante("Pedro", "Vasquez", 21, "Computacion");
        Estudiante est3=new Estudiante("Julio", "Villanueva", 18, "Lic sistemnas");
        Estudiante est4=new Estudiante("Eduardo", "Bonilla", 25, "Ing Electrica");
        Estudiante est5=new Estudiante("Franklin", "Cortez", 29, "ing. Civil");
        
        matematica.inscribirEstudiante(est1);
        matematica.inscribirEstudiante(est2);
        matematica.inscribirEstudiante(est3);
        matematica.inscribirEstudiante(est4);
        matematica.inscribirEstudiante(est5);
        matematica.imprimirListado();
        
        poo.setCapacidad(5);
        poo.inscribirEstudiante(est1);
        poo.inscribirEstudiante(est2);
        poo.inscribirEstudiante(est3);
        poo.inscribirEstudiante(est4);
        poo.imprimirListado();
    }
    
}
