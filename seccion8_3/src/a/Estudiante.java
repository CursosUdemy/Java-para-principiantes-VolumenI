
package a;

/**
 * Clase Estudiante,para crear instancias que se agregaran en el Arraylist
 * @author Franklin Rony Cortez
 */
public class Estudiante {
    String nombre;
    int edad;
    
    public Estudiante(){
    }
    
    public Estudiante(String nombre, int edad) {
        this.nombre = nombre;
        this.edad = edad;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }
    
}
