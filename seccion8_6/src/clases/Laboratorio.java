
package clases;

import java.util.ArrayList;
import java.util.Iterator;

/**
 * Esta clase contendra la descripcion de los laboratorios
 * @author Franklin Rony Cortez
 */
public class Laboratorio {
    private String instructor;
    private String salon;
    private String asignatura;
    private int capacidad;
    //se almacenaran todos los estudiantes que cursa un laboratorio.
    private ArrayList<Estudiante> estudiantes;

    public Laboratorio(int capacidad) {
        this.capacidad = capacidad;
        instructor = "Desconocido";
        salon = "Desconocido";
        asignatura = "desconocido";
        //Creamos la instancia,para almacenar los estudiantes.
        estudiantes = new ArrayList<>();
        //Solamente debemos estar seguros de la capacidad maxima del grupo.
        this.capacidad = capacidad;
    }

    public String getInstructor() {
        return instructor;
    }

    public void setInstructor(String instructor) {
        this.instructor = instructor;
    }

    public String getSalon() {
        return salon;
    }

    public void setSalon(String salon) {
        this.salon = salon;
    }

    public String getAsignatura() {
        return asignatura;
    }

    public void setAsignatura(String asignatura) {
        this.asignatura = asignatura;
    }

    public int getCapacidad() {
        return capacidad;
    }

    public void setCapacidad(int capacidad) {
        this.capacidad = capacidad;
    }

    public ArrayList<Estudiante> getEstudiantes() {
        return estudiantes;
    }

    public void setEstudiantes(ArrayList<Estudiante> estudiantes) {
        this.estudiantes = estudiantes;
    }
    //Agrega un estudiante al grupo de laboratorio
    public void inscribirEstudiante(Estudiante estudiante){
        if (estudiantes.size()<capacidad) {
            estudiantes.add(estudiante);
        } else {
            System.out.println("Se ha sobrepasado la capacidad maxima para este grupo.");
        }
    }
    //Mostra el listado de estudiantes inscritos
    public void imprimirListado(){
        System.out.println("----------");
        System.out.println("Asignatura: "+asignatura);
        System.out.println("Salon: "+salon);
        System.out.println("Instructor: "+instructor);
        System.out.println("Capacidad maxima: "+capacidad);
        System.out.println("inscritos:"+estudiantes.size());
        System.out.println("Listado inscritos:");
        System.out.println("Nombres\tApellidos\tEdad\tCarrera\t\tCarnet");
        //imprime el listado de estudiantes por grupo
        Iterator<Estudiante> it=estudiantes.iterator();
        while(it.hasNext()){
            Estudiante est=it.next();
            System.out.println(est.getNombres()+"\t"+est.getApellidos()+"\t"
                    +"\t"+est.getEdad()+"\t"+est.getCarrera()+"\t"+est.getCarnet());        
        }
    }
}
