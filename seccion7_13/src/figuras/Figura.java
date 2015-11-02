package figuras;

/**
 * Esta clase define las caracteristicas comunes de todas las figuras geometricas.
 * asi como los metodos para calcular el perimetro y area.
 * @author Franklin Rony Cortez
 */
public abstract class Figura {
    //Todas las figuras tienen como minimo un lado.
    private int lado1;

    public Figura(int lado1) {
        this.lado1 = lado1;
    }

    public int getLado1() {
        return lado1;
    }

    public void setLado1(int lado1) {
        this.lado1 = lado1;
    }
    
    //Calcular el area. Metodo abstracto,solo define la firma del metodo
    public abstract double calcularArea();
    //Calcular el perimetro. Metodo abstracto,solo define la firma del metodo.
    public abstract double calcularPerimetro();
}
