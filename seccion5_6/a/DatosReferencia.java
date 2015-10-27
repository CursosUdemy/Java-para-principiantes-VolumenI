package a;

/**
* En esta clase se hara una demostracion de los tipos de datos por referencia.
* @author Franklin Rony Cortez
* @version 1.0
* 
*/

public class DatosReferencia{
	public static void main(String args[]){
		Punto punto1=new Punto();
		Punto punto2=punto1;
		punto1.x=3;
		punto1.y=4;
		System.out.println("coordenadas punto 1: "+punto1.coordenadas());
		System.out.println("coordenadas punto 2: "+punto2.coordenadas());
		//Cambiar coordenadas punto2
		punto2.x=9;
		punto2.y=10;
		//Imprimir de nuevo las coordenadas de cada punto. mantendra punto1 las coordenadas (3,4)
		System.out.println("coordenadas punto 1: "+punto1.coordenadas());
		System.out.println("coordenadas punto 2: "+punto2.coordenadas());
		//pero..es punto1 igual a punto2?
		System.out.println("Es punto 1 igual a punto 2: "+(punto1==punto2));

	}
}