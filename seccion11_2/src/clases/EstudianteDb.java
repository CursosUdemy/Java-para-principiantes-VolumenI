/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clases;

import java.sql.Connection;
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
         conexion=new Conexion();
    }

    //obtener todos los estudiantes;
    public ArrayList<Estudiante> listado() {
        Statement stmt = null;
        Connection con=conexion.conectar();
        String query
                = "select COF_NAME, SUP_ID, PRICE, "
                + "SALES, TOTAL "
                + "from " +  ".COFFEES";
        
        try {
            stmt = con.createStatement();
            ResultSet rs = stmt.executeQuery(query);
            while (rs.next()) {
                String coffeeName = rs.getString("COF_NAME");
                int supplierID = rs.getInt("SUP_ID");
                float price = rs.getFloat("PRICE");
                int sales = rs.getInt("SALES");
                int total = rs.getInt("TOTAL");
                System.out.println(coffeeName + "\t" + supplierID
                        + "\t" + price + "\t" + sales
                        + "\t" + total);
            }
        } catch (SQLException e) {
            JDBCTutorialUtilities.printSQLException(e);
        } finally {
            if (stmt != null) {
                stmt.close();
            }
        }
    }
    
}
