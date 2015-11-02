package figuras;

/**
 * Clase circulo,deriva de la clase Figura. define 1 lado.
 * @author Franklin Rony Cortez
 */
public class Circulo extends Figura{

    public Circulo(int radio) {
        super(radio);
    }

    @Override
    public double calcularArea() {
        return Math.PI*getLado1()*getLado1();
    }

    @Override
    public double calcularPerimetro() {
        return 2*Math.PI*getLado1();
    }
    
}
