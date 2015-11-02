package demo;
import figuras.*;
/**
 * Demostracion del proyecto Figuras Geometricas
 * @author Franklin Rony Cortez
 */
public class Demostracion {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Cuadrado cuadrado=new Cuadrado(3);
        Circulo circulo=new Circulo(2);
        Rectangulo rectangulo=new Rectangulo(2, 4);
        System.out.println("El area del cuadrado es:"+cuadrado.calcularArea());
        System.out.println("El perimetro del cuadrado es: "+cuadrado.calcularPerimetro());
        System.out.println("El Area del circulo es: "+circulo.calcularArea());
        System.out.println("El perimetro del circulo es "+circulo.calcularPerimetro());
        System.out.println("El area del rectangulo es: "+rectangulo.calcularArea());
        System.out.println("El perimetro del rectangulo es "+rectangulo.calcularPerimetro());
    }
    
}
