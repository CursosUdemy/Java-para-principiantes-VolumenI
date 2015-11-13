/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clases;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

/**
 *
 * @author ASUS
 */
public class EstudianteDb {
    private ArrayList<Estudiante> estudiantes;
    private Conexion conexion;

    public EstudianteDb() {
        estudiantes=new ArrayList<Estudiante>();
    }

    //obtener todos los estudiantes;
    public ArrayList<Estudiante> listado() {
        Statement stmt = null;
        conexion = new Conexion();
        String query="SELECT * FROM estudiante";       
        try {
            stmt = conexion.conectar().createStatement();
            ResultSet rs = stmt.executeQuery(query);
            while (rs.next()) {
                Estudiante estudiante=new Estudiante();
                estudiante.setNombres(rs.getString("nombre"));
                estudiante.setApellidos(rs.getString("apellidos"));
                estudiante.setCarnet(rs.getString("carnet"));
                estudiante.setEdad(rs.getInt("edad")); 
                estudiantes.add(estudiante);
            }
            
        } 
        catch (SQLException e) {
                System.out.println("Error obteniendo listado de estudiantes: "+e);
        } finally {
            if (conexion != null) {
                conexion.cerrar();
            }
        }
        return estudiantes;
    }
    
    //insertar un nuevo registro
    public void insertar(Estudiante estudiante){
        String query="INSERT INTO estudiante(nombres,apellidos,carnet,edad) VALUES(?,?,?,?)";
        conexion = new Conexion();

        try {
            PreparedStatement preparedStmt = conexion.conectar().prepareStatement(query);
            preparedStmt.setString(1, estudiante.getNombres());
            preparedStmt.setString(2, estudiante.getApellidos());
            preparedStmt.setString(3, estudiante.getCarnet());
            preparedStmt.setInt(4, estudiante.getEdad());
        } catch (Exception e) {
            System.out.println("No se pudo insertar el registro: "+e);
        }
        finally{
            if (conexion!=null) {
                conexion.cerrar();
            }
        }
    }
    
}
