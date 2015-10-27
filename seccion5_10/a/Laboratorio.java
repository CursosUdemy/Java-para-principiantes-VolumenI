package a;
import java.util.Scanner;
import java.text.NumberFormat;
import java.util.Locale;
/**
* En esta clase se aplicaran los conceptos estudiados en esta lección 
* y se creara una aplicación para calcular el sueldo a final de mes de un empleado.
* Se utilizara la clase NumberFormat y Scanner para formatear los numeros y capturar datos del teclado. 
* @see <a href="http://docs.oracle.com/javase/7/docs/api/java/text/NumberFormat.html">Documentacion clase NumberFormat</a>
* @see <a href="http://docs.oracle.com/javase/7/docs/api/java/util/Locale.html">Documentacion Clase Locale</a>
*/
public class Laboratorio{
	public static void main(String args[]){
		//El empleado tendra los siguientes descuentos
		// 10% de impuesto de renta.
		// 2% de seguro social.
		final double renta=0.1;
		final double seguro=0.02;
		//representar numeros como moneda
		NumberFormat formato=NumberFormat.getCurrencyInstance(Locale.US);
		Scanner sr=new Scanner(System.in);
		System.out.println("Ingrese su sueldo mensual: ");
		double sueldo=sr.nextDouble();
		System.out.println("Ud tiene los siguientes descuentos:");
		System.out.println("Renta: "+formato.format(sueldo*renta));
		System.out.println("Seguro: "+formato.format(sueldo*seguro));
		System.out.println("Su sueldo a fin de mes sera: "+formato.format((sueldo-(sueldo*renta)-(sueldo*seguro))));
	}
}