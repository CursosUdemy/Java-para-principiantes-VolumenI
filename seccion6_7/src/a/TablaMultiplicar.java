package a;

/**
 * En este ejemplo Se hara uan demsotracion de ciclos for anidados.
 * Se haran las tablas del 1 al 10
 * @author Franklin Rony Cortez
 * @version 1.0
 */
public class TablaMultiplicar {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        for (int i = 1; i <= 10; i++) {
            System.out.println("Tabla del "+i);
            for (int j = 1; j <= 10; j++) {
                System.out.println(i+"x"+j+"="+i*j);
            }
            System.out.println("");
        }
    }
    
}
