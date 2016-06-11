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
 * @author udemy
 */
public class Demo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        EstudianteDb estudiantes=new EstudianteDb();
        Estudiante estudiante2=new Estudiante();
        
        ArrayList<Estudiante> listado=estudiantes.listado();
        for(Estudiante estudiante:listado){
            System.out.println("-------");
            System.out.println("Nombres: "+estudiante.getNombres());
            System.out.println("Apellidos: "+estudiante.getApellidos());
            System.out.println("Carnet "+estudiante.getCarnet());
            System.out.println("Edad "+estudiante.getEdad());
        }
    }
    
}
