/**
* En est aclase se hara una demostracion de como esta estruturada una clase en Java.
* para ello se hara uso de la clase ArrayList
* ademas se declarara una clase Demo para probar su funcionamiento
*/
package a;

//Importar la clase ArrayList del paquete util
import java.util.ArrayList;

//Nombre de la clase
class ClaseJava{
	//atributo 
	ArrayList<Integer> lista=new ArrayList<Integer>();;
	//constructor por defecto
	ClaseJava(){
		
	}
	
	//metodo agregar valor
	public void agregar(int numero){
		lista.add(numero);
	}
	//listar los numeros agregados
	public void listar(){
		for(int numero:lista){
			System.out.println(numero);
		}
	}
}

//Otra clase para probar el funcionamiento d la clase ClaseJava
class Demo{
	//metodo principal
	public static void main(String args[]){
		ClaseJava prueba=new ClaseJava();
		prueba.agregar(2);
		prueba.agregar(22);
		prueba.agregar(15);
		prueba.listar();
	}
}