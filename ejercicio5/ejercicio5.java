
package ejercicio5;


public class ejercicio5 {

    public static void main(String[] args) {
        
        Circulo c = new Circulo(10.0,5.0);
        Rectangulo r = new Rectangulo(6.0,3.0);
        
        
        System.out.println("El area del circulo es: "+c.calcularArea());
        System.out.println("El perimetro del circulo es: "+c.calcularPerimentro());
        System.out.println("El area del rectangulo es: "+r.calcularArea());
        System.out.println("El perimetro del rectangulo es: "+r.calcularPerimentro());
    }
    
}
