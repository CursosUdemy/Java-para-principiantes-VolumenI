package a;
/**
* En esta clase se hara una demostracion de las conversiones de datos: Ascendente y descendente, 
* que se pueden hacer en Java.
* @author Franklin Rony Cortez
* @version 1.0
*/
public class Conversion{
	//metodo principal
	public static void main (String args[]){
		int num1=20;
		int num2=4;
		int num3=3;
		int res=0;		
		double num4=20.0;
		double num5=4.0;
		double num6=3.0;
		//Conversion ascendente
		System.out.println("20/4="+num1/num2);
		System.out.println("20/3="+num1/num3);
		System.out.println("20/4.0="+num1/num5);
		System.out.println("20/3.0="+num1/num6);
		//conversion descendente
		res=(int)(num1/num6);
		System.out.println("20/3.0="+res);
	}
}