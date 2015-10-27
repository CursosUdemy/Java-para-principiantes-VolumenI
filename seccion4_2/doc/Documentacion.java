package doc;
/**
* Esta clase es una demostracion del uso de la documentacion en Java.
* @author Franklin Rony Cortez
* @version 1.0
* 
*/
public class Documentacion{
	/**
	* Metodo principal que carga  al ejecutar el programa.
	* @param args Cadena de caracteres ingresado por consola
	*/
	public static void main(String args[]){
		//coemntario simple,no de javadoc
		saludoDia("Rony");
		//llamada al metodo saludo tarde
		System.out.println(saludoTarde("Rony"));
	}
	/**
	* Imprime un saludo en pantalla
	* @param nombre cadena que es ingresada para enviar saludo
	*/
	public static void saludoDia(String nombre){
		System.out.println("Buenos dias "+nombre);
	}
	/**
	* Envia una cadena con el saludo y el nombre de la persona.
	* @param nombre Cadena que es ingresada para enviar saludo.
	* @return El saludo
	*/
	public static String saludoTarde(String nombre){
		return "Buenas tardes "+nombre;
	}
	
}