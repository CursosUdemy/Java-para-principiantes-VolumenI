/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package demo;

import clases.Libro;
import clases.LibroDb;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

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
        String opcion="";
        String salir="n";
        Scanner sc=new Scanner(System.in);
        Libro libro=new Libro();
        System.out.println("Bienvenido al menu de administracion de libros.");
        while(salir=="n"){
            System.out.println("Seleccione la opcion que desea realizar:");
            System.out.println("1-Agregar nuevo libro");
            System.out.println("2-Editar libro existente");
            System.out.println("3-Buscar un libro");
            System.out.println("4-Ver listado de libros");
            System.out.println("5-Borrar Libro");
            System.out.println("6-Salir");
            opcion=sc.nextLine();
            switch(opcion){
                case "1":
                    Scanner sclibro=new Scanner(System.in);
                    System.out.println("Introduzca el ISBN:");
                    libro.setISBN(sclibro.nextLine());
                    System.out.println("Introduzca el nombre del libro:");
                    libro.setNombre(sclibro.nextLine());
                    System.out.println("Introduzca el autor del libro:");
                    libro.setAutor(sclibro.nextLine());
                    System.out.println("Introduzca la edicion(numeros)");
                    try {
                        libro.setEdicion(sclibro.nextInt());
                    } catch (Exception e) {
                        System.out.println("Solo puede ingresar numeros");
                    }
                    System.out.println("Introduzca el año de publicacion:");
                    try {
                        libro.setAnio(sclibro.nextInt());
                    } catch (Exception e) {
                        System.out.println("Solo puede ingresar numeros");
                    }
                    LibroDb librodb=new LibroDb();
                    librodb.insertar(libro);
                    break;
                case "2":
                    Scanner sclibroe = new Scanner(System.in);
                    System.out.println("Introduzca el ISBN:");
                    libro.setISBN(sclibroe.nextLine());
                    System.out.println("Introduzca el nuevo nombre del libro:");
                    libro.setNombre(sclibroe.nextLine());
                    System.out.println("Introduzca el nuevo autor del libro:");
                    libro.setAutor(sclibroe.nextLine());
                    System.out.println("Introduzca la edicion(numeros)");
                    try {
                        libro.setEdicion(sclibroe.nextInt());
                    } catch (Exception e) {
                        System.out.println("Solo puede ingresar numeros");
                    }
                    System.out.println("Introduzca el año de publicacion:");
                    try {
                        libro.setAnio(sclibroe.nextInt());
                    } catch (Exception e) {
                        System.out.println("Solo puede ingresar numeros");
                    }
                    LibroDb librodbe = new LibroDb();
                    librodbe.actualizar(libro.getISBN(), libro);
                    break;
                case "3":
                    String isbn;
                    Scanner scb=new Scanner(System.in);
                    LibroDb porIsbn=new LibroDb();
                    Libro libroIsbn=new Libro();
                    System.out.println("Introduzca el ISBN del libro");
                    isbn=scb.nextLine();
                    libroIsbn=porIsbn.porIsbn(isbn);
                    System.out.println("ISBN: "+libroIsbn.getISBN());
                    System.out.println("Nombre: "+libroIsbn.getNombre());
                    System.out.println("Autor: "+libroIsbn.getAutor());
                    System.out.println("Edicion: "+libroIsbn.getEdicion());
                    System.out.println("Año: "+libroIsbn.getAnio());
                    break;
                case "4":
                    LibroDb todos=new LibroDb();
                    ArrayList<Libro> libros=todos.listado();
                    Iterator<Libro>it=libros.iterator();
                    while(it.hasNext()){
                        Libro libroit=it.next();
                        System.out.println("ISBN: "+libroit.getISBN());
                        System.out.println("Nombre: "+libroit.getNombre());
                        System.out.println("Autor: "+libroit.getAutor());
                        System.out.println("Edicion: "+libroit.getEdicion());
                        System.out.println("Año: "+libroit.getAnio());
                    }
                    break;
                case "5":
                    Scanner scborrar=new Scanner(System.in);
                    LibroDb borrarDb=new LibroDb();
                    System.out.println("Ingrese el ISBN del libro que desea eliminar.");
                    borrarDb.borrar(scborrar.nextLine());                    
                    break;
                case "6":
                    salir="y";
                    break;                    
            }        
        }
    }
    
}
