package a;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/**
 * En esta clase se hara una demostracion de como recorrer los arreglos y
 * colecciones en Java,usando tres formas diferentes.
 *
 * @author Franklin Rony Cortez
 */
public class RecorrerAreglos {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here

        int[] arreglo = {4, 8, 7, 45, 45};
        ArrayList<Integer> arraylist = new ArrayList<>();
        arraylist.add(45);
        arraylist.add(78);
        arraylist.add(451);
        arraylist.add(96);
        HashMap<String, Integer> diccionario = new HashMap<>();
        diccionario.put("uno", 1);
        diccionario.put("dos", 2);
        diccionario.put("tres", 3);

        //Recorrer usando for
        System.out.println("Recorrer arreglo");
        for (int i = 0; i < arreglo.length; i++) {
            System.out.println(arreglo[i]);
        }
        System.out.println("----------");
        System.out.println("Recorrer arraylist");
        for (int i = 0; i < arraylist.size(); i++) {
            System.out.println(arraylist.get(i));
        }
        System.out.println("-----");
        //Usando foreach
        System.out.println("Recorrer arreglo usando foreach");
        for (int i : arreglo) {
            System.out.println(i);
        }
        System.out.println("-----");
        System.out.println("Recorrer arraylist usando foreach");
        for (int i : arraylist) {
            System.out.println(i);
        }
        System.out.println("---");
        //Recorrer usando Iterator
        System.out.println("Recorrer arrylist usando iterator");
        Iterator it = arraylist.iterator();
        while (it.hasNext()) {
            System.out.println(it.next());
        }
        System.out.println("----");
        System.out.println("Recorrer diccionario usando iterator");
        for (Map.Entry<String, Integer> entry : diccionario.entrySet()) {
            System.out.printf("Clave : %s y Valor: %s %n", entry.getKey(), entry.getValue());

        }
    }

}
