package figuras;

/**
 * Clase rectanglo,deriva de la clase Figura. define 4 lados,,iguales pro pares.
 * @author Franklin Rony Cortez
 */
public class Rectangulo extends Figura{
    private int lado2;
    private int lado3;
    private int lado4;

    public Rectangulo(int largo,int ancho) {
        super(largo);
        lado2=largo;
        lado3=lado4=ancho;
    }

    @Override
    public double calcularArea() {
        return lado2*lado4;
    }

    @Override
    public double calcularPerimetro() {
        return 2*getLado1()+2*lado3;
    }
    
    
}
