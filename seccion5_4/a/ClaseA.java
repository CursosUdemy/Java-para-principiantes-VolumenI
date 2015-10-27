package a;
/**
* Esta clase declara dos metodos estaticos con modificador de acceso publico.
* La clase es declarada sin modificador de acceso,siendo publico solo en el paquete que se declara.
*/
class ClaseA{
	public static void mensaje1(){
		System.out.println("Soy un metodo estatico con modificador publico del paquete a");
	}
	
	public static String mensaje2(){
		return "Soy un metodo estatico que retorna un String en el paquete a";
	}
}