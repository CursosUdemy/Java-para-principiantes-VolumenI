package clases;

import java.util.ArrayList;

/**
 * Clase que contiene los atributos de los estudiantes.
 * @author Franklin Rony Cortez Barrera
 * @see <a href="https://docs.oracle.com/javase/tutorial/jdbc/basics/retrieving.html">Resultset</a>
 */
public class Estudiante{
    private String nombres;
    private String apellidos;
    private String carnet;
    private int edad;

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }
    
    public Estudiante() {
    }

    public String getNombres() {
        return nombres;
    }

    public void setNombres(String nombres) {
        this.nombres = nombres;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public String getCarnet() {
        return carnet;
    }

    public void setCarnet(String carnet) {
        this.carnet = carnet;
    }
}
