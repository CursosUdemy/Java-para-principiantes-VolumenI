package a;
//Se debe importar este paquete antes de empezar xd
 import java.util.Scanner;
/**
* Se hara una demostracion de como capturar datos del teclado, para poder hacer programas que interactuen con el usuario.
* Se hara una calculadora basica,sin validaciones, que realize las cuatro operaciones,con dos numeros ingresados por el usuario.
* @author Franklin Rony Cortez
* @version 1.0
* @see <a href="http://docs.oracle.com/javase/7/docs/api/java/util/Scanner.html">Documentacion Clase Scanner</a>
*/

public class CapturarDatos{
	public static void main(String args[]){
		//Iniciamos el objeto para capturar los datos
		Scanner sc = new Scanner(System.in);
		System.out.println("Ejemplo calculadora basica");
		System.out.println("Ingrese el primer numero:");
		int num1=sc.nextInt();
		System.out.println("Ingrese el segundo numero:");
		int num2=sc.nextInt();
		//Se muestran el resultado
		System.out.println("La suma es: "+(num1+num2));
		System.out.println("La resta es: "+(num1-num2));
		System.out.println("La multiplicacion es "+num1*num2);
		System.out.println("la division es: "+num1/num2);
	}
}