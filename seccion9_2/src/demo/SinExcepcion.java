package demo;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


import java.util.Scanner;

/**
 *
 * @author ASUS
 */
public class SinExcepcion {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner leer=new Scanner(System.in);
        int n1,n2;
        boolean continuar=true;
        String continuar2;
        while (continuar) {
            System.out.println("Ingrese el numerador:");
            n1=leer.nextInt();
            System.out.println("Ingrese el denominador:");
            n2=leer.nextInt();
            System.out.println("El resultado de la division es: "+n1/n2);
            //para que lea la siguiente linea
            continuar2 = leer.nextLine();
            System.out.println("Desea Continuar:s/n");
            continuar2=leer.nextLine();
            if (continuar2.equals("n")) {
                continuar=false;
            }
        }
    }
    
}
