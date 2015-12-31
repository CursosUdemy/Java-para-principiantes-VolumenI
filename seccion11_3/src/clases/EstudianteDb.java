package clases;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

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
}
