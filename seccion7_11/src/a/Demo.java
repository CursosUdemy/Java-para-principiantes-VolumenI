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
        
        persona1.imprimirInformacion();
        System.out.println(persona1.correr(2));
        System.out.println("--------");
        persona2.imprimirInformacion();
        System.out.println(persona2.correr(6));      
        //Instancia(Objeto) clase estudiante.        
        System.out.println("-------");
        Estudiante estudiante1=new Estudiante();
        estudiante1.setNombres("Jose");
        estudiante1.setApellidos("Lopez");
        estudiante1.setCarnet("123");
        estudiante1.setCarrera("Mercadeo");
        estudiante1.saludo();
        System.out.println("---------");
        Estudiante estudiante2=new Estudiante("Manuel", "Barrera", 31, "123", "Ing. Civil");
        estudiante2.saludo();
        estudiante2.imprimirInformacion();
        System.out.println("------------------");
        estudiante2.mostrarEstatura(1.74);
        estudiante2.mostrarEstatura(50);
        System.out.println(estudiante2.mostrarEstatura(5, "pies"));

    }    
}
