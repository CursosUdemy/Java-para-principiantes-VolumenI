/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package demo;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 * esta clase muestr el funcionamiento de la clausula throw y throws
 * y de las checked exception
 * @author ASUS
 */
public class AbrirArchivo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        try {
            // TODO code application logic here
            //Probar el metodo abrir archivo
            abrirArchivo("");
        } catch (FileNotFoundException ex) {
            System.out.println("error: "+ex);
        }
    }
    
    /**
     * Este metodo simula la aperura de un archivo
     * @param nombre
     * @return
     * @throws FileNotFoundException 
     */
    public static File abrirArchivo(String nombre) throws FileNotFoundException{
        if (nombre.equals("")){
            throw  new FileNotFoundException("Archivo no encontrado");}
        return null;
    }
}
