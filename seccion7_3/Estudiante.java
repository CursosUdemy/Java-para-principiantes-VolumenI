
/**
 * Clase Estudiante. Hereda los atributos y metodos de la clase base Persona
 * 
 * @author Franklin Rony Cortez
 * @version 1.0
 */

public class Estudiante extends Persona
{

    //Atributos propios de Estudiante
    private String carnet;
    private String carrera;
    
    /**
     * Constructor por defecto clase Estudiante.
     */
    public Estudiante()
    {
        
    }

    //metodos accesores
    public void setCarnet(String carnet){
        this.carnet=carnet;
    }
    
    public String getCarnet(){
        return carnet;
    }
    
    public void setCarrera(String carrera){
        this.carrera=carrera;
    }
    
    public String getCarrera(){
        return carrera;
    }
    
    @Override
    public void imprimirInformacion(){
        super.imprimirInformacion();
        System.out.println("Carnet: "+carnet);
        System.out.println("Carrera: "+carrera);
        System.out.println("----------------");
    }
}
