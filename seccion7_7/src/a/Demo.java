package a;

/**
 * En esta clase se hace una demostracion del proyecto, creando las instancias necesarias.
 * @author Franklin Rony Cortez
 * @version 1.0
 */
public class Demo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //objeto persona,sin parametros
        Persona persona1=new Persona();
        //objeto persona, con parametros.
        Persona persona2=new Persona("Franklin", "Cortez", 29);
        
        persona1.setNombres("Juan");
        persona1.setApellidos("Perez");
        persona1.setEdad(29);
    }
    
}
