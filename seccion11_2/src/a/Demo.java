/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package a;

import clases.Conexion;
import clases.Estudiante;
import clases.EstudianteDb;
import java.util.ArrayList;

/**
 *
 * @author ASUS
 */
public class Demo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        EstudianteDb estudiantes=new EstudianteDb();
        Estudiante estudiante2=new Estudiante();
        estudiante2.setNombres("Jorge");
        estudiante2.setApellidos("Lopez");
        estudiante2.setCarnet("mm201501");
        estudiante2.setEdad(36);
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
