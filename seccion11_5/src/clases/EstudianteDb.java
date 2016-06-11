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
 * @author udemy
 */
public class EstudianteDb {
    private ArrayList<Estudiante> estudiantes;
    private Conexion conexion;

    public EstudianteDb() {
        estudiantes=new ArrayList<Estudiante>();
    }
    
    public ArrayList<Estudiante> listado(){
        Statement stm=null;
        conexion=new Conexion();
        String query="SELECT * FROM estudiante";
        try {
            stm=conexion.conectar().createStatement();
            ResultSet rs=stm.executeQuery(query);
            while(rs.next()){
                Estudiante estudiante=new Estudiante();
                estudiante.setNombres(rs.getString("nombre"));
                estudiante.setApellidos(rs.getString("apellidos"));
                estudiante.setCarnet(rs.getString("carnet"));
                estudiante.setEdad(rs.getInt("edad"));
                estudiantes.add(estudiante);
            }
        } 
        catch(SQLException e){
            System.out.println("Error obteniendo el listao de estudiantes "+e);
        }
        catch (Exception e) {
            System.out.println("Ha ocurrido un error "+e);
        }
        finally{
            if(conexion!=null){
                conexion.cerrar();
            }
        }
            return estudiantes;
    }
    
    public void insertar(Estudiante estudiante){
        String query="INSERT INTO estudiante(nombre,apellidos,carnet,edad) VALUE(?,?,?,?)";
        conexion =new Conexion();
        try {
            PreparedStatement preparedStmt=conexion.conectar().prepareStatement(query);
            preparedStmt.setString(1, estudiante.getNombres());
            preparedStmt.setString(2, estudiante.getApellidos());
            preparedStmt.setString(3, estudiante.getCarnet());
            preparedStmt.setInt(4, estudiante.getEdad());
            preparedStmt.executeUpdate();
            System.out.println("Registro insertado con exito");
        } catch (Exception e) {
            System.out.println("No se pudo insertar el registro "+e);
        }
        finally{
            if (conexion!=null) {
                conexion.cerrar();
                
            }
        }
    }
    
    public void actualizar(Estudiante estudiante,int id){
        String query="UPDATE estudiante SET nombre=? ,apellidos=? ,carnet=?, edad=? WHERE idEstudiante=?";
       
        Conexion conexion=new Conexion();
        try {
            PreparedStatement preparedStm=conexion.conectar().prepareStatement(query);
            preparedStm.setString(1, estudiante.getNombres());
            preparedStm.setString(2, estudiante.getApellidos());
            preparedStm.setString(3, estudiante.getCarnet());
            preparedStm.setInt(4, estudiante.getEdad());
            preparedStm.setInt(5, id);
            preparedStm.executeUpdate();
            System.out.println("Registro actualizado con exito");
        }
        catch (Exception e) {
            System.out.println("no se pudo actualizar el registro "+e);
        }
        finally{
            if (conexion!=null) {
                conexion.cerrar();
            }
        }
    }
}
