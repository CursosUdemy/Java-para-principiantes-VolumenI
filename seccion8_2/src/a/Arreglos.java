package a;

/**
 * En esta clase se hara una demostracion del los arreglos de tipos primitivos en Java.
 * @author Franklin Rony Cortez
 */
public class Arreglos {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       //formas declarar un arreglo
        
        //crear arreglo como objeto,definiendo el tamaño en el constructor
        int[] arreglo1=new int[4];
        arreglo1[0]=12;
        arreglo1[1]=15;
        arreglo1[2]=100;
        arreglo1[3]=25;
        
        //Definiendolo e inicializandolo
        int[] arreglo2={12,15,100,25};
        
        System.out.println("posicion 3 arreglo1: "+arreglo1[2]);
        System.out.println("Posicion 3 arreglo2: "+arreglo2[2]);
        //Cambiar valores de las posiciones.
        arreglo1[2]=150;
        System.out.println("Nueva posicion 3: arreglo1 "+arreglo1[2]);
        //agregar mas elementos a un arreglo?
        //arreglo1[4]=5;
        int[] arreglo3=arreglo2;
        //imprimir todos los elementos de arreglo 3 y arreglo2
        for (int i = 0; i < arreglo2.length; i++) {
            System.out.println("posicion "+(i+1)+" arreglo2: "+arreglo2[i]);
        }
        System.out.println("----");
        for (int i = 0; i < arreglo3.length; i++) {
            System.out.println("Posicion "+(i+1)+" arreglo3: "+arreglo3[i]);
        }
        System.out.println("-----");
        //cambiando posicion 1 arreglo3
        arreglo3[0]=2;
        //imprimiendo de nuevo los arreglos
        for (int i = 0; i < arreglo2.length; i++) {
            System.out.println("posicion " + (i + 1) + " arreglo2: " + arreglo2[i]);
        }
        System.out.println("----");
        for (int i = 0; i < arreglo3.length; i++) {
            System.out.println("Posicion " + (i + 1) + " arreglo3: " + arreglo3[i]);
        }
        System.out.println("----");
        String cadenas[]=new String[2];
        cadenas[0]="Hola";
        System.out.println(cadenas[0]);
    }
    
}
