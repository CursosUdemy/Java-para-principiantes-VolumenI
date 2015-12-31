
package a;

import clases.Estudiante;
import clases.EstudianteDb;
import java.util.ArrayList;
import java.util.Scanner;

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
        String nombres,apellidos,carnet;
        int edad;
        EstudianteDb estudiantes=new EstudianteDb();
        Estudiante estudiante2=new Estudiante();        
        Scanner sc=new Scanner(System.in);
        System.out.println("Nombre del estudiante:");
        estudiante2.setNombres(sc.nextLine());
        System.out.println("Apellidos del estudiante:");
        estudiante2.setApellidos(sc.nextLine());
        System.out.println("Carnet:");
        estudiante2.setCarnet(sc.nextLine());
        System.out.println("Edad:");
        estudiante2.setEdad(sc.nextInt());
        
        estudiantes.insertar(estudiante2);
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
