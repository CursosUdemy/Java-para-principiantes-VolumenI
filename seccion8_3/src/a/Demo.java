package a;

import java.util.ArrayList;

/**
 * En esta clase se hara una demostracion de la clase de java Arraylist.
 * y como utilizarla con objetos pro referencia
 * @author Franklin Rony Cortez
 * @see <a href="http://docs.oracle.com/javase/7/docs/api/java/util/ArrayList.html">Documentacion clase ArrayList</a>
 */
public class Demo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //creando objetos estudiante
        Estudiante estudiante1=new Estudiante("Jose", 22);
        Estudiante estudiante2=new Estudiante("Juan", 36);
        Estudiante estudiante3=new Estudiante("Rony", 29);
        //Creando un arreglo del tipo estudiantes
        ArrayList<Estudiante> estudiantes=new ArrayList<>();
        estudiantes.add(estudiante1);
        estudiantes.add(estudiante2);
        estudiantes.add(estudiante3);
        //Mostrando infomacion Estudiantes
        for (int i = 0; i < estudiantes.size(); i++) {
            System.out.println("Posicion: "+estudiantes.indexOf(estudiantes.get(i)));
            System.out.println("Nombre: "+estudiantes.get(i).getNombre());
            System.out.println("Edad: "+estudiantes.get(i).getEdad());
            System.out.println("----");
        }
        //agregar otro estudiante
       estudiantes.add(new Estudiante("Nuevo", 96));
        //Mostrando infomacion Estudiantes
        for (int i = 0; i < estudiantes.size(); i++) {
            System.out.println("Posicion: " + estudiantes.indexOf(estudiantes.get(i)));
            System.out.println("Nombre: " + estudiantes.get(i).getNombre());
            System.out.println("Edad: " + estudiantes.get(i).getEdad());
            System.out.println("----");
        }
        //creando arreglo enteros
        ArrayList<Integer> arreglo=new ArrayList<>();
        arreglo.add(4);
        arreglo.add(8);
        System.out.println(arreglo.get(0));
        System.out.println(arreglo.get(1));
    }
    
}
