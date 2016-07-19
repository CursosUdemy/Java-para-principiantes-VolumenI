/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package demo;

/**
 * Esta clase demuestra el uso de  IndexOutOfBoundsException y de
 * las unchecked exceptions
 * @author ASUS
 */
public class FueraDeRango {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        //Definimos el arreglo
        int[]numeros={4,5,6,7,2};
        System.out.println("Valor: "+obtenerNumero(numeros, (numeros.length+1)));
    }
    /**
     * Retorna el valor indicado de un arreglo
     * @param numeros Arreglo-Representa los numeros
     * @param posicion Entero que representa la posicion del valor a obtener
     * @return
     * @throws IndexOutOfBoundsException 
     */
    public static int obtenerNumero(int[] numeros,int posicion)throws IndexOutOfBoundsException{
        System.out.println("Se ejecutara?");
        return numeros[posicion];
    }
    
    //Metodo mejorado
    /*public static int obtenerNumero(int[] numeros, int posicion)  {
        try {
            if (posicion > numeros.length) {
                throw new IndexOutOfBoundsException("El valor introducido esta fuera de rango");
            } 
        } catch (IndexOutOfBoundsException ex) {
            System.out.println("Ha ocurrido una IndexOutOfBoundsException: "+ex);
        }
        System.out.println("Se ejecutara?");
        return numeros[posicion];
    }*/
}
