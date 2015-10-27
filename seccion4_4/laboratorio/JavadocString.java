package laboratorio;
/**
* En esta clase se hara una demostracion del uso de los metodos de la clase String,utilizando la documentacion provista en Oracle.
* Se necesita que la clase haga lo siguiente:
* Retorne el caracter que este en la posicion dada de una cadena.
* Unir dos cadenas de caracteres.
* Comprar si dos cadenas de caracteres son exactamente iguales.
* @see <a href="http://docs.oracle.com/javase/7/docs/api/java/lang/String.html" target="_blank">Documentacion oficial clase String Oracle</a>
* 
*/
public class JavadocString{

	public static void main(String args[]){
		//definir la primer cadena
		String cadena1="Programando en Java";
		//definir la segunda cadena
		String cadena2="programando en PHP";
		
		System.out.println("Este es el primer caracter: ");
		System.out.println(cadena1.charAt(0));
		
		System.out.println("Unir cadena1 y cadena2: ");
		System.out.println(cadena1.concat(cadena2));
		
		System.out.println("Comparar si cadena1 es igual a cadena2");
		System.out.println(cadena1.equals(cadena2));
	}
	
	
}