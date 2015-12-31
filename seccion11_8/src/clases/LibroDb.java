/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clases;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

/**
 *
 * @author ASUS
 */
public class LibroDb {
    private Conexion conexion;
    private ArrayList<Libro> libros;
    
    public LibroDb() {
        libros=new ArrayList<>();
    }
    
    public void insertar(Libro libro) {
        String query = "INSERT INTO libro(isbn,nombre,autor,edicion,anio) VALUES(?,?,?,?,?)";
        conexion = new Conexion();
        try {
            PreparedStatement preparedStmt = conexion.conectar().prepareStatement(query);
            preparedStmt.setString(1, libro.getISBN());
            preparedStmt.setString(2, libro.getNombre());
            preparedStmt.setString(3, libro.getAutor());
            preparedStmt.setInt(4, libro.getEdicion());
            preparedStmt.setInt(5, libro.getAnio());
            //Insertamos el registro
            preparedStmt.executeUpdate();
            System.out.println("Registro insertado con exito");
        } catch (Exception e) {
            System.out.println("No se pudo insertar el registro: " + e);
        } finally {
            if (conexion != null) {
                conexion.cerrar();
            }
        }
    }
    //Editar libro
    public void actualizar(String isbn, Libro libro ){
        String query = "UPDATE libro "
                + "SET nombre=?,autor=?,edicion=?,anio=?" + " "
                + "WHERE isbn=?;";
        conexion = new Conexion();
        try {
            PreparedStatement preparedStmt = conexion.conectar().prepareStatement(query);
            preparedStmt.setString(1, libro.getNombre());
            preparedStmt.setString(2, libro.getAutor());
            preparedStmt.setInt(3, libro.getEdicion());
            preparedStmt.setInt(4, libro.getAnio());
            preparedStmt.setString(5, isbn);
            //Insertamos el registro
            preparedStmt.executeUpdate();
            System.out.println("Registro actualizado con exito");
        } catch (Exception e) {
            System.out.println("No se pudo actualizar el registro: " + e);
        } finally {
            if (conexion != null) {
                conexion.cerrar();
            }
        }
    }
    //Buscar por isbn
    public Libro porIsbn(String isbn){
        String query="SELECT * FROM libro WHERE isbn=?";
        Libro libro=new Libro();
        conexion = new Conexion();
        try {
            PreparedStatement preparedStm=conexion.conectar().prepareStatement(query);
            preparedStm.setString(1, isbn);
            ResultSet rs=preparedStm.executeQuery();
            
            while (rs.next()) {
                libro.setISBN(rs.getString(1));
                libro.setNombre(rs.getString(2));
                libro.setAutor(rs.getString(3));
                libro.setEdicion(rs.getInt(4));
                libro.setAnio(rs.getInt(5));
            }
        } catch (Exception e) {
            System.out.println("No se pudo mostrar el registro: " + e);

        }
        finally {
            if (conexion != null) {
                conexion.cerrar();
            }
    }
        return libro;
}
    //listado libros
    public ArrayList<Libro> listado() {
        Statement stmt = null;
        conexion = new Conexion();
        String query = "SELECT * FROM libro";
        try {
            stmt = conexion.conectar().createStatement();
            ResultSet rs = stmt.executeQuery(query);
            while (rs.next()) {
               Libro libro = new Libro();
               libro.setISBN(rs.getString(1));
               libro.setNombre(rs.getString(2));
               libro.setAutor(rs.getString(3));
               libro.setEdicion(rs.getInt(4));
               libro.setAnio(rs.getInt(5));
               libros.add(libro);
            }

        } catch (SQLException e) {
            System.out.println("Error obteniendo listado de libros: " + e);
        } finally {
            if (conexion != null) {
                conexion.cerrar();
            }
        }
        return libros;
    }
    //borrar libro
    public void borrar(String isbn){
        PreparedStatement preparedStm = null;
        conexion = new Conexion();
        String query = "DELETE FROM libro WHERE isbn=?";
        try {
            preparedStm = conexion.conectar().prepareStatement(query);
            preparedStm.setString(1, isbn);
            preparedStm.executeUpdate();        
            System.out.println("Libro borrado con exito!");
        } catch (SQLException e) {
            System.out.println("Error borrando el registro: " + e);
        } finally {
            if (conexion != null) {
                conexion.cerrar();
            }
        }
    }
}