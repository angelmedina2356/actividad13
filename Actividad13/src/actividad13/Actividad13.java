package actividad13;
import java.util.*;

public class Actividad13 {

    public static void main(String[] args) {
     
        List <String> cadena = new ArrayList();
        cadena.add("cadenauno");
        cadena.add("cadenados");
        cadena.add("cadenatres");
        cadena.add("cadenacuatro");
        cadena.add("cadenacinco");
        cadena.add("cadenaseis");
        cadena.add("cadenasiete");
        cadena.add("cadenaocho");
        cadena.add("cadenanueve");
        cadena.add("cadenadiez");
        
        System.out.println("Acomodando alfabeticamente");
        Collections.sort(cadena);
        System.out.println(cadena);
        
        System.out.println("Acomodando por longitud");
        Collections.sort(cadena, Comparator.comparing(String :: length));
        cadena.forEach(System.out::println);
        
      
        
        
        

        
    }
    
}
