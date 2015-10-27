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
        //super();
    }
    
    /**
     * Constructor con parametros
     * @param nombres Cadena. Nombre del estudiante.
     * @param apellidos Cadena. El apellido del estudiantes.
     * @param edad Entero. la edad del estudiante.
     * @param carnet Cadena. El carent del estudiante.
     * @param carrera Cadena. La carrera del estudiante.
     */    
    public Estudiante(String nombres,String apellidos,int edad,String carnet,String carrera){
        super(nombres,apellidos,edad);
        this.carnet=carnet;
        this.carrera=carrera;
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
    @Override
    public void imprimirInformacion(){
        super.imprimirInformacion();
        System.out.println("Carrera: "+carrera);
        System.out.println("Canet: "+carnet);
    }
}
