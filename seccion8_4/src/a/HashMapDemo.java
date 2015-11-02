package a;
import java.util.HashMap;


/**
 * Ejemplo clase HashMapDemo
 * @author Franklin Rony Cortez
 */
public class HashMapDemo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        HashMap <String,Integer>meses=new HashMap<String,Integer>();
        meses.put("Enero", 31);
        meses.put("Febrero", 28);
        meses.put("Marzo", 31);
        meses.put("Abril",30);
        meses.put("Mayo", 31);
        meses.put("Junio",30);
        meses.put("Julio",31);
        meses.put("Agosto", 31);
        meses.put("Septiembre",30);
        meses.put("Octubre",31);
        meses.put("Noviembre",30);
        meses.put("Diciembre", 31);
        
        System.out.println("Enero tiene: "+meses.get("Enero")+" dias");
        System.out.println("Hay un mes con 28 dias? "+meses.containsValue(28));
        System.out.println("Hay un mes con 32 dias? "+meses.containsValue(32));
        meses.remove("Febrero");
        System.out.println("Hay un mes con 28 dias? " + meses.containsValue(28));

    }
    
}
