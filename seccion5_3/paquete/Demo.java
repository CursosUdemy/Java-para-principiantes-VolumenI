package paquete;

/**
* En esta clase se hara una demostracion del uso de paquetes externos para utilizar sus clases.
* Se utilizara la clase Math y DecimalFormat.
* @see <a href="http://docs.oracle.com/javase/7/docs/api/java/lang/Math.html">Documentacion clase math</a> 
* @see <a href="http://docs.oracle.com/javase/7/docs/api/java/text/DecimalFormat.html#DecimalFormat(java.lang.String)">Documentacion clase decimalFormat</a>
* @see <a href="https://docs.oracle.com/javase/tutorial/i18n/format/decimalFormat.html">Ejemplos uso decimalFormat</a>
*/ 
public class Demo{
	public static void main(String args[]){
		System.out.println("La raiz de 4 es:"+Math.sqrt(4));
		System.out.println("La raiz de 3 es:"+Math.sqrt(3));
	}
}