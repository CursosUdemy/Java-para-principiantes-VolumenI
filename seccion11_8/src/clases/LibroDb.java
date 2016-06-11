/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clases;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;

/**
 *
 * @author udemy
 */
public class LibroDb {
    private Conexion conexion;
    private ArrayList<Libro>libros;

    public LibroDb() {
        libros=new ArrayList<Libro>();
    }
    
    public void insertar(Libro libro){
        String query="INSERT INTO libro (isbn,nombre,autor,edicion,anio) VALUES(?,?,?,?,?)";
        conexion=new Conexion();
        try {
            PreparedStatement preparedStm=conexion.conectar().prepareStatement(query);
            preparedStm.setString(1, libro.getISBN());
            preparedStm.setString(2, libro.getNombre());
            preparedStm.setString(3, libro.getAutor());
            preparedStm.setInt(4, libro.getEdicion());
            preparedStm.setInt(5, libro.getAnio());
            preparedStm.executeUpdate();
            System.out.println("Libro insertado con exito");
        } catch (Exception e) {
            System.out.println("No se pudo insertar el registro "+e);
        }
        finally{
            if (conexion!=null) {
                conexion.cerrar();
            }
        }
    }
    
    public void actualizar(String isbn,Libro libro) {
        String query = "UPDATE libro  SET nombre=?,autor=?, edicion=?, anio=? WhERE isbn=? ";
        conexion = new Conexion();
        try {
            PreparedStatement preparedStm = conexion.conectar().prepareStatement(query);
            preparedStm.setString(1, libro.getNombre());
            preparedStm.setString(2, libro.getAutor());
            preparedStm.setInt(3, libro.getEdicion());
            preparedStm.setInt(4, libro.getAnio());
            preparedStm.setString(5, libro.getISBN());

            preparedStm.executeUpdate();
            System.out.println("Libro actualizado con exito");
        } catch (Exception e) {
            System.out.println("No se pudo actualizar el registro " + e);
        } finally {
            if (conexion != null) {
                conexion.cerrar();
            }
        }
    }
    
    public void borrar(String isbn) {
        String query = "DELETE FROM libro  WHERE isbn=? ";
        conexion = new Conexion();
        try {
            PreparedStatement preparedStm = conexion.conectar().prepareStatement(query);
            preparedStm.setString(1,isbn);
            preparedStm.executeUpdate();
            System.out.println("Libro borrado con exito");
        } catch (Exception e) {
            System.out.println("No se pudo actualizar el registro " + e);
        } finally {
            if (conexion != null) {
                conexion.cerrar();
            }
        }
    } 
    
    public ArrayList<Libro> listado(){
        Statement stmt=null;
        conexion=new Conexion();
        String query="SELECT * FROM libro";
        try {
            stmt=conexion.conectar().createStatement();
            ResultSet rs=stmt.executeQuery(query);
            while(rs.next()){
                Libro libro =new Libro();
                libro.setISBN(rs.getString(1));
                libro.setNombre(rs.getString(2));
                libro.setAutor(rs.getString(3));
                libro.setEdicion(rs.getInt(4));
                libro.setAnio(rs.getInt(5));
                libros.add(libro);
            }
        } catch (Exception e) {
            System.out.println("Error obteniendo listado de libros "+e);
        }
        finally{
            if (conexion!=null) {
                conexion.cerrar();
            }
            return libros;
        }
    }
    
    public Libro porIsbn(String isbn){
        String query="SELECT * FROM libro WHERE isbn=?";
        Libro libro=new Libro();
        conexion=new Conexion();
        try {
            PreparedStatement preparedStm=conexion.conectar().prepareStatement(query);
            preparedStm.setString(1, isbn);
            ResultSet rs=preparedStm.executeQuery();
            while(rs.next()){
                libro.setISBN(rs.getString(1));
                libro.setNombre(rs.getString(2));
                libro.setAutor(rs.getString(3));
                libro.setEdicion(rs.getInt(4));
                libro.setAnio(rs.getInt(5));
            }
        } catch (Exception e) {
            System.out.println("No se pudo mostrar el registro "+e);
        }
        finally{
            if (conexion!=null) {
                conexion.cerrar();
            }
        }
        return libro;
    }
}
