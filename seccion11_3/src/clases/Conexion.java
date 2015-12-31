package clases;

import java.sql.Connection;
import java.sql.*;

/**
 * Se hara un ejemplo de conexion a bd con Java
 * @author Franklin Rony Cortez
 */
public class Conexion {
    private Connection con;
    private final  String usuario="root";
    private final String password="CXT982mw";
    private final String url="jdbc:mysql://localhost/estudiantes";
    //Intentar la conexion a la bd
    public Conexion(){
        try {
            //carga la clase controlador
            Class.forName("com.mysql.jdbc.Driver");
            con=DriverManager.getConnection(url,usuario,password);
            System.out.println("Conexion realizada con exito!");
        } 
        catch(ClassNotFoundException e){
            System.out.println("No se encontro el controlador: "+e);
        }
        catch(SQLException e){
            System.out.println("No se pudo hacer conexion a la bd: "+e);
        }
        catch (Exception e) {
            System.out.println("Ha ocurrido un error: "+e);
        }
    }
    /**
     * Devuelve un objeto conexion
     * @return con Conexion a la bd
     */
    public Connection conectar(){
        return con;
    }
    /**
     * Cierra la conexion a la bd. 
     */
    public void cerrar(){
        try {
            if (con!=null) {
                con.close();
                System.out.println("Conexion cerrada con exito!");
            }
        } catch (SQLException e) {
            System.out.println("No se pudo cerrar la conexion: "+e);
        }
        catch(Exception e){
            System.out.println("Ha ocurrido un error: "+e);
        }
    }
}
