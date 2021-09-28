package ejercicio2y3;

import java.util.ArrayList;
import java.util.List;

public class Ejercicio2y3 {

    public static void main(String[] args) {

        Lavadora lav = new Lavadora();
        Televisor tv = new Televisor();
        int sumaLav=0;
        int sumaTv=0;
        int total=0;
        
        List<Electrodomestico> listaElectro = new ArrayList();
        Lavadora lav1 = new Lavadora(35, 2500, "blanco", 'A',45);
        Lavadora lav2 = new Lavadora(45,3500,"azul",'A',45);
        Televisor tv1 = new Televisor(30, true, 3000, "gris", 'A', 45);
        Televisor tv2 = new Televisor(20, true, 4000, "rojo", 'A', 45);

        lav.crearLavadora();
        lav.precioFinal();
        tv.crearTelevisor();
        tv.precioFinal();
        System.out.println("El precio final de la Lavadora es: " + lav.getPrecio());
        System.out.println("El precio final del Televisor es: " + tv.getPrecio());
        
        listaElectro.add(lav1);
        listaElectro.add(lav2);
        listaElectro.add(tv1);
        listaElectro.add(tv2);
        
        for (Electrodomestico elementos : listaElectro) {
            if(elementos instanceof Lavadora){
                elementos.precioFinal();
                sumaLav+=elementos.getPrecio();
                
            }
            if(elementos instanceof Televisor){
                elementos.precioFinal();
                sumaTv+=elementos.getPrecio();
                
            }
            
        }
        total=sumaLav+sumaTv;
        System.out.println("El precio de las Lavadoras es: "+sumaLav);
        System.out.println("El precio de los Televisores es: "+sumaTv);
        System.out.println("El precio total de la compra es: "+total);

    }

}
