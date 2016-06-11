/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clases;

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
}
