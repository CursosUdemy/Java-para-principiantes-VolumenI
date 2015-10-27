package a;

/**
 * En esta clase se hara un ejemplo de uso for.
 * 
 * @author Franklin Rony Cortez
 * @version 1.0
 */
public class EjemploFor {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println("Imprimiendo en forma ascendente:");
        for (int i = 0; i < 100; i++) {            
            System.out.println("Imprimiendo numero: "+i);            
        }
        System.out.println("Imprimiendo de forma Descendente");
        for (int i = 100; i > 0; i--) {
            System.out.println("Imprimiendo: "+i);
        }
    }
    
}
