package figuras;

/**
 * Clase cuadrado,deriva de la clase Figura. define 4 lados
 * @author Franklin Rony Cortez
 */
public class Cuadrado extends Figura{
    private int lado2;
    private int lado3;
    private int lado4;

    public Cuadrado(int lado) {
        //tomando el atributo lado1 de la clase base.
        super(lado);
        //asignacion multiple
        lado2=lado3=lado4=lado;
    }
    
    @Override
    public double calcularArea(){
        return getLado1()*lado2;
    }

    @Override
    public double calcularPerimetro() {
        return getLado1()+lado2+lado3+lado4;
    }
  
}
