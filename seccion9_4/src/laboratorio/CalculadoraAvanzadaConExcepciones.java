package laboratorio;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


import java.util.InputMismatchException;
import java.util.Scanner;

/**
 * En esta clase se hara una calculadora que pueda efectuar las cuatro operaciones basicas:suma,resta,multiplicacion
 * y division con el manejo de excepciones.
 * nextDouble(): Returns the next token as a long. 
 * If the next token is not a float or is out of range, InputMismatchException is thrown.
 * @author ASUS
 */
public class CalculadoraAvanzadaConExcepciones {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        double n1,n2;
        Scanner leer=new Scanner(System.in);
        String sContinuar;
        boolean continuar=true;
        
        while (continuar) {   
            try {
                System.out.println("Ingrese el primer numero:");
                n1=leer.nextDouble();
                System.out.println("Ingrese el segundo numero:");               
                n2=leer.nextDouble();
                System.out.println("Suma: "+suma(n1, n2));
                System.out.println("Resta: "+resta(n1, n2));
                System.out.println("Multiplicacion: "+multiplicacion(n1, n2));
                System.out.println("Division: "+division(n1, n2));
            }
            catch(ArithmeticException e){
                System.out.println("Division entre cero: "+e);
            }
            catch(InputMismatchException e){
                System.out.println("No ha ingresado un numero: "+e );
            }
            catch(Exception e){
                System.out.println("Houston tenemos un problema: "+e);
            }
            //Este bloque siempre se ejecutara
            finally{
                leer.nextLine();
                System.out.println("Desea Continuar:s/n");
                sContinuar = leer.nextLine();
                if (sContinuar.equals("n")) {
                    continuar = false;
                }
            }            
        }
    }
    
    /**
     * Retorna la suma de dos numeros
     * @param n1 double primer numero
     * @param n2 double segundo numero
     * @return double el resultado de sumar n1+n2
     */
    public static double suma(double n1,double n2){
        return n1+n2;
    }
    /**
     * Retorna la resta de dos numeros
     * @param n1 double representa el primer numero
     * @param n2 double representa el segundo numero
     * @return double retorna la resta de n1-n2
     */
    public static double resta(double n1,double n2){
        return n1-n2;
    }
    /**
     * Retorna el producto de dos numeros
     * @param n1 double representa el primer numero
     * @param n2 double representa el segundo numero
     * @return  double retorna el producto de n1*n2
     */
    public static double multiplicacion(double n1,double n2){
        return n1*n2;
    }
    public static double division(double n1,double n2){
        //Evita la division por cero
        if (n2==0.0) {
            //envia una excepcion si el numero dos es cero
            throw new ArithmeticException("El numero dos no puede ser cero");
        }
        return n1/n2;
    }
}
