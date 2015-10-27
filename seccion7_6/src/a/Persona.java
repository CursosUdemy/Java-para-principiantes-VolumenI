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
}
