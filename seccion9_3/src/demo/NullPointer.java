/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package demo;

/**
 * Demostracion de la unchecked exception nullpointer
 * @author ASUS
 */
public class NullPointer {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int[] arreglo=null;
       // int[] arreglo={1,2,3,4,5};
        recorrerArreglo(arreglo);
    }
    
    public static void recorrerArreglo(int[]arreglo){
        try {
            if (arreglo == null) {
                throw new NullPointerException("Esta recorriendo un array nulo");
            } else {
                for (int numero : arreglo) {
                    System.out.println(numero);
                }
            }
        } catch (NullPointerException e) {
            System.out.println("El arreglo debe existir antes de recorrerlo: "+e);
        }

    }
    
 }

