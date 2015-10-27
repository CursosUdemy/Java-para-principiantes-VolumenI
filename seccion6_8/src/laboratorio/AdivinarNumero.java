package laboratorio;

import java.util.Scanner;

/**
 * En este ejercicio final de sección se aplicaran los conocimientos adquiridos 
 * para crear un minijuego en consola de adivinar un número en un determinado número de intentos.
 * @author Franklin ROny Cortez Barrera
 * @version 1.0
 * @see <a href="http://docs.oracle.com/javase/7/docs/api/java/lang/Math.html">Clase math</a>
 */
public class AdivinarNumero {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        //Solicitamos el numero al usuario
        Scanner sc=new Scanner(System.in);
        //cantidad de intentos para adivinar el numero oculto
        int intentos=10;
        //almacena el intento actual
        int i=1;
        //Bandera.Se ha acertado el numero en los diez intentos?
        boolean exito=false;
        //Numero entre 0 y 100?
        int numero= (int)(Math.random()*100);
        //Numero ingresado por el usuario
        int supuesto;
        System.out.println("Bienvenido a el juego de adivina el numero."
                + "\nDebe ingresar un numero entre 1 y 100.\n"
                + "Tiene "+intentos +" para adivinar.");
        do{
            System.out.println("Escriba su numero");
            supuesto=sc.nextInt(); 
            if (supuesto>numero) {
                System.out.println("Muy alto!");
            }
            else if(supuesto<numero){
                System.out.println("Muy bajo!");
            }
            else{
                exito=true;
            }
            i++;
        }
        while(numero!=supuesto & i<=intentos);
        
        if (exito) {
            System.out.println("Felicidades has acertado el numero: "+numero);
        }
        else{
            System.out.println("Has fallado. El numero era: "+numero);
        }
    }    
}