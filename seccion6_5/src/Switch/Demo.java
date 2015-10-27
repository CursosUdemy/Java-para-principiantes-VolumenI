package Switch;

import java.util.Scanner;

/**
 * En esta clase el estudiante aprenderá como utilizar las estructuras de selección multiple en Java,
 * @author  Franklin Rony Cortez
 * @version 1.0
 */
public class Demo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        String color;
        Scanner sr=new Scanner(System.in);
        System.out.println("Cual es su color favorito?");
        color=sr.next();
        switch(color){
            case "rojo":
                System.out.println("Su color favorito es "+color);
                break;
            case "azul":
                System.out.println("Su color favorito es "+color);
                break;
            case "negro":
                System.out.println("Su color favorito es: "+color);
                break;
            default:
                System.out.println("No hay ningun color con ese nombre "+color);
                break;
        }
    }
    
}
