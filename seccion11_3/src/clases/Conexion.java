/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clases;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author udemy
 */
public class Conexion {
    private Connection con;
    private final String usuario="root";
    private final String password="root";
    private final String url="jdbc:mysql://localhost/estudiantes";

    public Conexion() {
        try {
            Class.forName("com.mysql.jdbc.Driver");
            con=DriverManager.getConnection(url, usuario, password);
            System.out.println("Conexion realizada con exito");
        } 
        catch(ClassNotFoundException e){
            System.out.println("No se encontro el controlador "+e);
        }
        catch(SQLException e){
            System.out.println("No se pudo hacer la conexion a la bd "+e);
        }
        catch (Exception e) {
            System.out.println("Ha ocurrido un error "+e);
        }
    }
    
    public Connection conectar(){
        return con;
    }
    
    public void cerrar(){
        try {
            if (con!=null) {
                con.close();
                System.out.println("Conexion cerrada con exito");
            }
        }
        catch(SQLException e){
            System.out.println("No se pudo cerrar la conexion "+e);
        }
        catch (Exception e) {
            System.out.println("Ha ocurrido un error "+e);
        }
    }
}
