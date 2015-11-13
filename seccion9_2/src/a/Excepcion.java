package a;

/**
 * En esta clase se hara una demostracion del uso de Excepciones en Java.
 * @author Franklin Rony Cortez
 */
public class Excepcion {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int numerador=48;
        int denominador=0;
        try {
            System.out.printf("%s/%s=%d",numerador,denominador,(numerador/denominador));
            System.out.println("");
        } catch (Exception e) {
            System.out.println("La division entre cero no es posible:");
            System.out.println("El error es: "+e);
        }
        //sin uso de Excepciones
        if (denominador==0) {
            System.out.println("La division entre cero no es posible:");
        }
        else{
            System.out.printf("%s/%s=%d", numerador, denominador, (numerador / denominador));
        }
    }
    
}
