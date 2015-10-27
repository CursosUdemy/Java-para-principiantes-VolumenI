package a;

/**
 * En esta clase se hara una aplicacion de herencia de la clase Persona
 * @author Franklin Rony Cortez
 * @version 1.0
 */
public class Estudiante extends Persona{
    String carnet;
    String carrera;
    //Constructor por defecto
    public Estudiante() {
    }
    /**
     * 
     * @return Cadena. El carnet del estudiante
     */
    public String getCarnet() {
        return carnet;
    }
    /**
     * 
     * @param carnet Cadena. El carnet del estudiante
     */
    public void setCarnet(String carnet) {
        this.carnet = carnet;
    }
    /**
     * 
     * @return Cadena. La carrera del estudiante
     */
    public String getCarrera() {
        return carrera;
    }
    /**
     * 
     * @param carrera Cadena. La carrera del estudiante.
     */
    public void setCarrera(String carrera) {
        this.carrera = carrera;
    }    
    /**
     * Imprime un saludo con el nombre dele studiante y su carrera.
     */
    public void saludo(){
        System.out.println("Hola soy "+getNombres()+" y estudio "+getCarrera());
    }

}
