package estatico;
/**
* @author Franklin Rony Cortez
* @version 1.0
* Esta clase es uan demostracion del uso de metodos estaticos. 
*/
public class DemoEstatico{
	static int contador;
	/**
	* Metodo principal
	* @param args la cadena que ingresa el usuario
	*/
	public static void main (String args[]){
		//DemoEstatico.imprimirMensaje();
		//System.out.println("El contador vale: "+DemoEstatico.incrementarContador());
		//System.out.println("El contador ahora vale: "+DemoEstatico.incrementarContador());
	}
	/**
	* Imprime en pantalla una cadena de texto
	*/
	public static void imprimirMensaje(){
		System.out.println("Llamada desde un metodo estatico");
	}
	/**
	* Retorna la variable contador incrementada en uno cada vez que es llamada.
	* @return entero que incrementa la variable contador.
	*/
	public static int incrementarContador(){
		return contador++;
	}
}