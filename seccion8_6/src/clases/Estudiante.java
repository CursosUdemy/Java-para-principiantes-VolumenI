package clases;


/**
 * Esta clase contendra los atributos de cad estudiante
 * @author Franklin Rony Cortez
 */
public class Estudiante {
    private String nombres;
    private String apellidos;
    private int edad;
    private String carnet;
    private String carrera;

    public Estudiante(String nombres, String apellidos, int edad, String carrera) {
        this.nombres = nombres;
        this.apellidos = apellidos;
        this.edad = edad;
        this.carrera = carrera;
        this.carnet=nombres.substring(0, 1)+apellidos.substring(0, 1)+"2015";
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

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getCarnet() {
        return carnet;
    }

    public void setCarnet(String carnet) {
        this.carnet = carnet;
    }

    public String getCarrera() {
        return carrera;
    }

    public void setCarrera(String carrera) {
        this.carrera = carrera;
    }   
    
}
