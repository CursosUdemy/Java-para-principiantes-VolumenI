
/**
 * Clase Profesor,derivada de la clase Persona. Hereda sus atributos.
 * 
 * @author Franklin Rony Cortez
 * @version 1.0
 */
public class Profesor extends Persona
{
    //atributos propios de la clase profesor.
    String profesion;
    String empresa;

    /**
     * Constructor por defecto clase profesor.
     */
    public Profesor()
    {

    }
    
    //Metodos accesores
    public void setProfesion(String profesion){
        this.profesion=profesion;
    }
    
    public String getProfesion(){
        return profesion;
    }
    
    public void setEmpresa(String empresa){
        this.empresa=empresa;
    }
    
    public String getEmpresa(){
        return empresa;
    }
    
    @Override
    public void imprimirInformacion(){
        super.imprimirInformacion();
        System.out.println("Profesion: "+profesion);
        System.out.println("Empresa :"+empresa);
        System.out.println("----------------");
    }
}
