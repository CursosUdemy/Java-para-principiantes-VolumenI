/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package a;

import java.util.Scanner;

/**
 *
 * @author ASUS
 */
public class Edad {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int edad;
        Scanner sr=new Scanner(System.in);
        //Esat sentencia se ejecutara al menos una vez
        do{
            System.out.println("Cual es su edad:");
            edad=sr.nextInt();
        }
        while(edad<55);
    }
    
}
