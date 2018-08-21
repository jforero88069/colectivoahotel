
import java.util.*;
import java.lang.Math.*;
/** import java.util.* permite solucionar el problema del conductor del colectivo 3 del taller 2 franja indivudual. 
 * 
 * 
 */
public class datos 
{
    
 public static void main(String[] args)
    {
        //
        Scanner teclado = new Scanner(System.in);
        
        int n;
        int preciopasaje;
        int costopasaje;
        int turistas;
        int cantidaddeviajes;
        int preciorecaudado;
        int costopagado;
        
        System.out.print("Entre la capacidad de pasajeros que caben en el bus n");
        n=teclado.nextInt();
        System.out.print("Entre la cantidad de turistas a transportar");
        turistas=teclado.nextInt();
        preciopasaje=10000;
        costopasaje=2000;
        cantidaddeviajes=turistas/n;
        preciorecaudado=preciopasaje*turistas;
        costopagado=turistas*costopasaje;
        System.out.println("la cantidad de viajes a realizar es "+cantidaddeviajes);
        System.out.println("el total de dinero recaudado por el conductor es "+preciorecaudado);
        System.out.println("el valor pagado por el conductor al dueño del bus es "+costopagado);
        
    }
}