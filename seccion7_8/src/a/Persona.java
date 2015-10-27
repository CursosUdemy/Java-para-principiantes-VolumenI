package a;

/**
 * Clase base persona.
 * @author Franklin Rony Cortez
 * @version 1.0
 */
public class Persona {
    private String nombres;
    private String apellidos;
    int edad;
    
    /**
     * Constructor por defecto,sin parametros.
     */
    public Persona(){
    }
    
    /**
     * Sobrecarga Constructor persona,recibe parametros.
     * @param nombres Cadena. Nombre de la persona.
     * @param  apellidos Cadena. Apellidos de la persona.
     * @param  edad Entero. Edad de la persona.
     */
    public Persona(String nombres,String apellidos,int edad){
        this.nombres=nombres;
        this.apellidos=apellidos;
        this.edad=edad;
    }
    
    //Metodos accesores
    
    /**
     * 
     * @param nombres Cadena. El nombre de la persona
     */
    public void  setNombres(String nombres){
        this.nombres=nombres;
    }
    
    /**
     * 
     * @return Cadena. El nombre de la persona
     */
    public String getNombres(){
        return nombres;
    }
    /**
     * 
     * @param apellidos Cadena. El apellido de la persona.
     */
    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }
    /**
     * 
     * @return Cadena. El apellido de la persona
     */
    public String getApellidos() {
        return apellidos;
    }
    /**
     * 
     * @param edad ntero. la edad de la persona
     */
    public void setEdad(int edad) {
        this.edad = edad;
    }
    /**
     * 
     * @return Entero. La edad de la persona
     */
    public int getEdad() {
        return edad;
    }   
    
    public void imprimirInformacion(){
        System.out.println("Nombres: "+nombres);
        System.out.println("Apellidos: "+apellidos);
        System.out.println("Edad: "+edad);
    }
    
    public String correr(int velocidad){
       return "Corriendo a:"+velocidad+"km/h";
    }
}
