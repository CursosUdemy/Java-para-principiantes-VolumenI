package a;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 * En esta clase se hara una mejora a nuestra calculadora basica,para manejar
 * errores en tiempo de ejecucion utilizando excepciones.
 * @author Franklin Rony Cortez
 */
public class Calculadora {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        //Iniciamos el objeto para capturar los datos
        Scanner sc = new Scanner(System.in);
        System.out.println("Ejemplo calculadora basica");
        try {
            System.out.println("Ingrese el primer numero:");
            int num1 = sc.nextInt();
            System.out.println("Ingrese el segundo numero:");
            int num2 = sc.nextInt();
            //Se muestran el resultado
            System.out.println("La suma es: " + (num1 + num2));
            System.out.println("La resta es: " + (num1 - num2));
            System.out.println("La multiplicacion es " + num1 * num2);
            System.out.println("la division es: " + num1 / num2);
        } catch (ArithmeticException e) {
            System.out.println("division por cero  no es permitida");
        }
        catch(InputMismatchException e){
            System.out.println("Solamente se aceptan valores enteros.");
        }
        catch(Exception e){
            System.out.println("Ha ocurrido un error "+e);
        }
                
    }
    
}
