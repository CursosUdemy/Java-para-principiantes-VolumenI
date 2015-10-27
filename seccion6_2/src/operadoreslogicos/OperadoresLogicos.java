package operadoreslogicos;

/**
* En esta clase el estudiante aprenderá  como utilizar los principales operadores lógicos en Java,
* cual es la diferencia entre ambos 
* y cuando utilizar cada uno, además como combinarlos al momento de hacer validaciones
* @author Franklin Rony Cortez
* @version 1.0
*/
public class OperadoresLogicos {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println("7<4): "+(7<4));
        System.out.println("7!=7: "+(7!=7));
        System.out.println("4==4: "+(4==4));
        System.out.println("10==20|15>12: "+(10==20|15>12));
        System.out.println("7>4&4>5: "+(7>4&4>5));
        //Operador or "cortocircuitado"
        System.out.println("(20>3) || (20/0)>4: "+((20>3) || (20/0)>4));
        System.out.println("(20<3) && (20/0)>4: "+((20<3) && (20/0)>4));
        
    }
    
}
