package a;
/**
* Se aprenderan a realizar conversiones de cadenas a números, 
* y como utilizarlos para hacer operaciones. 
* @author Franklin Romny Cortez Barrera
* @version 1.0
* @see <a href="http://sharkysoft.com/archive/printf/docs/javadocs/lava/clib/stdio/doc-files/specification.htm">banderas printf</a>
*/

public class ConversionCadena{
	public static void main(String args[]){
	// entero como cadena
	String cad1="4";
	//double como cadena
	String cad2="5.0";
	//float como cadena
	String cad3="8f";
	//boolean como cadena
	String cad4="true";
	//un iphone?
	//String cad4="4s";
	String cad5="4f";
	//Mostramos las cadenas en pantalla
	System.out.printf("cadena1: %s \ncadena2: %s \ncadena3: %s \ncadena4: %s \ncadena5: %s",cad1,cad2,cad3,cad4,cad5);
	//Convertiremos cada cadena cad1...cad5 en numeros, y verificar sino hay errores.
	//Usamos el metodo parse,para convertir una cadena a numero
	int num1=Integer.parseInt(cad1);
	double num2=Double.parseDouble(cad2);
	float num3=Float.parseFloat(cad3);
	boolean num4=Boolean.parseBoolean(cad4);
	//double num5=Float.parseFloat(cad5);
	float num5=Float.parseFloat(cad5);
	System.out.printf("\nnumero1: %d \nnumero2: %f \nnumero3: %f \nnumero4: %s \nnumero5:%f",num1,num2,num3,num4,num5);
	//Realizando  operaciones basica con los 4 y 5.0,repasando casting de datos y jerarquia operadores.
	System.out.println("\nnum1*num2="+num1*num2);
	//4+5.=45?
	System.out.println("num1+num2="+num1+num2);

	}
}

