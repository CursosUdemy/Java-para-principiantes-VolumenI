
package a;

import clases.Estudiante;
import clases.EstudianteDb;
import java.util.ArrayList;

/**
 * Demostracion de la conexion a la bd utiliando driver MySQL
 * @author Franklin Rony cortez
 */
public class Demo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        EstudianteDb estudiantes=new EstudianteDb();
        Estudiante estudiante2=new Estudiante();
        ArrayList<Estudiante> listado=estudiantes.listado();        
        
        for(Estudiante estudiante:listado){
            System.out.println("---------");
            System.out.println("Nombres: "+estudiante.getNombres());
            System.out.println("Apellidos: "+estudiante.getApellidos());
            System.out.println("Carnet: "+estudiante.getCarnet());
            System.out.println("Edad: "+estudiante.getEdad());
            System.out.println("---------");
        }
    }
    
}
