package demo;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


import java.util.InputMismatchException;
import java.util.Scanner;

/**
 *
 * @author ASUS
 */
public class ConExcepcion {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner leer=new Scanner(System.in);
        int n1,n2;
        boolean continuar=true;
        String continuar2;
        //Iniciamos el ciclo
            while (continuar) {
                try{
                System.out.println("Ingrese el numerador:");
                n1 = leer.nextInt();
                System.out.println("Ingrese el denominador:");
                n2 = leer.nextInt();
                System.out.println("El resultado de la division es: " + n1 / n2);
                //para que lea la siguiente linea
                continuar2 = leer.nextLine();
                System.out.println("Desea Continuar:s/n");
                continuar2 = leer.nextLine();
                if (continuar2.equals("n")) {
                    continuar = false;
                }
                }
                //division´por cero
                catch (ArithmeticException e) {
                    System.out.println("El denominador no puede ser cero: "+e);
                }
                //no se ingreso un entero
                catch(InputMismatchException e){
                    //para que lea la siguiente linea
                    System.out.println("Debe ingresar un numero entero: "+e);
                    leer.nextLine();
                }
                //fin try catch
            }
            //fin while
    }
    
}
