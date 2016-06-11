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
import java.util.Scanner;

/**
 *
 * @author udemy
 */
public class Demo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String nombres,apellidos,carnet;
        int id,edad;
        EstudianteDb estudiantes=new EstudianteDb();
        Estudiante estudiante2=new Estudiante();
        Scanner sc=new Scanner(System.in);
        System.out.println("Introduza el id del estudiante a borrar,Debe ser un entero");
        id=sc.nextInt();
        /*sc.nextLine();
        System.out.println("Inroduzca los nuevos datos");
        System.out.println("Nombre del estudiante:");
        estudiante2.setNombres(sc.nextLine());
        System.out.println("Apellidos del estudiante");
        estudiante2.setApellidos(sc.nextLine());
        System.out.println("Carnet");
        estudiante2.setCarnet(sc.nextLine());
        System.out.println("Edad");
        estudiante2.setEdad(sc.nextInt());
        estudiantes.actualizar(estudiante2, id);*/
        estudiantes.borrar(id);
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
