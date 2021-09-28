
package ejercicio4;

public class Ejercicio4 {

    
    public static void main(String[] args) {
        
       
        Alquiler alq = new Alquiler();
        
        alq=alq.crearAlquiler();
        
        System.out.println("El precio por "+alq.diasAlquiler(alq)+" dias es "+alq.precioFinal(alq, alq.diasAlquiler(alq)));
        
        
        
    }
    
}
