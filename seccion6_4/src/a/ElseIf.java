package a;

import java.util.Scanner;

/**
 * En esta clase se hara una demostracion del uso de la sentencia
 * If..ElseIf..Else
 * @author ASUS
 */
public class ElseIf {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int edadJuan;
        int edadJose;
        Scanner sr=new Scanner(System.in);
        System.out.println("Introduzca la edad de Juan");
        edadJuan=sr.nextInt();
        System.out.println("Introduzca la edad de Jose");
        edadJose=sr.nextInt();
        //comparando edades
        if (edadJose>edadJuan) {
            System.out.println("Jose es mayor que Juan");
        }
        else if(edadJose<edadJuan){
            System.out.println("Jose es menor que Juan");
        }
        else{
            System.out.println("Juan y Jose tienen la misma edad");
        }
    }
    
}
