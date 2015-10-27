
/**
 * Clase base persona,contienen los atributos basicos para las clases derivadas
 * 
 * @author Franklin Rony Cortez
 * @version 1.0
 */
public abstract class Persona
{
   private String nombres;
   private String apellidos;

    /**
     * Constructor por defecto de la clase persona,sin parametros.
     */
    public Persona()
    {

    }

    //metodos accesores
    
    public void setNombres(String nombres){
        this.nombres=nombres;
    }
    
    public String getNombres(){
        return nombres;
    }
    
    public void setApellidos(String apellidos){
        this.apellidos=apellidos;
    }
    
    public String getApellidos(){
        return apellidos;
    }
    
    public void imprimirInformacion(){
        System.out.println("Nombres: "+nombres);
        System.out.println("Apellidos: "+apellidos);
    }
}
