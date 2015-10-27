package b;
/**
* Esta clase declara dos metodos estaticos con modificador de acceso publico.
* La clase es declarada con modificador de acceso publico
*/
public class ClaseB{
	public static void mensaje1(){
		System.out.println("Soy un metodo estatico con modificador publico del paquete b");
	}
	
	public static String mensaje2(){
		return "Soy un metodo estatico que retorna un String en el paquete b";
	}
}