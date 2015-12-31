package clases;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 * Realiza las consultas a la tabla estudiantes
 * @author Franklin Rony Cortez
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
        String query="INSERT INTO estudiante(nombre,apellidos,carnet,edad) VALUES(?,?,?,?)";
        conexion = new Conexion();
        try {
            PreparedStatement preparedStmt = conexion.conectar().prepareStatement(query);
            preparedStmt.setString(1, estudiante.getNombres());
            preparedStmt.setString(2, estudiante.getApellidos());
            preparedStmt.setString(3, estudiante.getCarnet());
            preparedStmt.setInt(4, estudiante.getEdad());
            //Insertamos el registro
            preparedStmt.executeUpdate();
            System.out.println("Registro insertado con exito");
        } catch (Exception e) {
            System.out.println("No se pudo insertar el registro: "+e);
        }
        finally{
            if (conexion!=null) {
                conexion.cerrar();
            }
        }
    }
    //Actualizar un registro
    public void actualizar(Estudiante estudiante,int id){
        String query = "UPDATE estudiante " +
            "SET nombre=?,apellidos=?,carnet=?,edad=?" +" "+
            "WHERE id=?;";
        conexion = new Conexion();
        try {
            PreparedStatement preparedStmt = conexion.conectar().prepareStatement(query);
            preparedStmt.setString(1, estudiante.getNombres());
            preparedStmt.setString(2, estudiante.getApellidos());
            preparedStmt.setString(3, estudiante.getCarnet());
            preparedStmt.setInt(4, estudiante.getEdad());
            preparedStmt.setInt(5, id);
            //Insertamos el registro
            preparedStmt.executeUpdate();
            System.out.println("Registro actualizado con exito");
        } catch (Exception e) {
            System.out.println("No se pudo actualizar el registro: "+e);
        }
        finally{
            if(conexion!=null){
                conexion.cerrar();
            }
        }
    }
    //borrar un registro
    public void borrar(int id){
        String query = "DELETE FROM estudiante WHERE id=?";
        conexion = new Conexion();
        try {
            PreparedStatement preparedStmt = conexion.conectar().prepareStatement(query);
            preparedStmt.setInt(1, id);
            //Insertamos el registro
            preparedStmt.executeUpdate();
            System.out.println("Registro borrado con exito");
        } catch (Exception e) {
            System.out.println("No se pudo borrar el registro: " + e);
        } finally {
            if (conexion != null) {
                conexion.cerrar();
            }
        }
    }
}
