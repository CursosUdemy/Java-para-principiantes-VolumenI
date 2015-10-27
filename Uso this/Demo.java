/**
* Esta clase es un ejemplo del uso de this, y como utilizarlo dentro de las clases,cuando puede ocasionar ambiguedad de nombres
* entre las variables de instancia y con los parametros.
*/
public class Demo{
	//id como variable de clase
	String id;
	String nombre;
	String apellido;
	
	public Demo(String nombre,String apellido){
		//id como variable local
		String id=null;
		this.nombre=nombre;
		this.apellido=apellido;
		id=nombre.substring(0,1)+apellido.substring(0,1);
	}
}