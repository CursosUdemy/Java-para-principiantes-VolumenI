package a;

import java.util.Scanner;

/**
* En esta clase se hara uso de las sentencias de control If..Else
*
* @author Franklin Rony Cortez
* @version 1.0
*/
public class UsoIf {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int edadJuan=0;
        int edadJose=0;
        Scanner sr=new Scanner(System.in);
        System.out.println("Ingrese la Edad de Jose:");
        edadJose=sr.nextInt();
        System.out.println("Ingrese la edad de Juan");
        edadJuan=sr.nextInt();
        //Comparamos las dos edad
        if(edadJuan>edadJose){
            System.out.println("Juan es mayor que Jose.");
        }
        else{
            System.out.println("Juan es menor que Jose.");
        }
        //otro ejemplo if
        if (edadJose==edadJuan) {
            System.out.println("Juan y Jose tienen la misma edad");
        } else {
            System.out.println("Juan y Jose NO tienen la misma edad");

        }
    }
    
}
