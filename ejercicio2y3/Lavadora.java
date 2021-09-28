
package ejercicio2y3;

import java.util.Scanner;


public class Lavadora extends Electrodomestico {
    
    static Scanner leer = new Scanner(System.in);
    
    private Integer carga;

    public Lavadora() {
        super();
    }

    public Lavadora(Integer carga, Integer precio, String color, char consumo, Integer peso) {
        super(precio, color, consumo, peso);
        this.carga = carga;
    }

    public Integer getCarga() {
        return carga;
    }

    public void setCarga(Integer carga) {
        this.carga = carga;
    }
    
    public void crearLavadora(){
        super.crearElectrodomestico();
        System.out.println("Ingrese la carga");
        setCarga(leer.nextInt());
    }
    
    @Override
    public void precioFinal(){
        super.precioFinal();
        if(getCarga()>30){
            setPrecio(getPrecio()+500);
        }
        
    }
    
    
}
